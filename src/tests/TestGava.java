package tests;

import java.util.List;

import org.gava.BitDoubleIndividualFactory;
import org.gava.BitFlipMutator;
import org.gava.Crossover;
import org.gava.BitUniformCrossover;
import org.gava.GeneticAlgorithm;
import org.gava.ObjectiveFunction;
import org.gava.IndividualFactory;
import org.gava.Mutator;
import org.gava.RastriginFunction;
import org.gava.RouletteSelector;
import org.gava.Selector;

public class TestGava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneticAlgorithm<Boolean, Double> ga = new GeneticAlgorithm<>();
		ObjectiveFunction<Double> function = RastriginFunction.getInstance();
		
		IndividualFactory<Boolean, Double> factory = new BitDoubleIndividualFactory (64, function.length(), -5, 5);
		Selector<Boolean, Double> selector = new RouletteSelector<Boolean, Double>();
		Crossover<Boolean> crossover = BitUniformCrossover.getInstance();
		Mutator<Boolean> mutator = BitFlipMutator.getInstance();
		
		ga.setGenerations(1000);
		ga.setPopulationSize(200);
		ga.setObjectiveFunction(function);  
		ga.setIndividualFactory(factory); 
		ga.setSelector(selector);
		ga.setCrossover(crossover);
		ga.setMutator(mutator);
		ga.run();
		List<Double> best = ga.getBest();  
		double fx = function.f(best);
		
		System.out.printf("f(%.6f, %.6f) = %.7f\n",best.get(0),best.get(1),fx);

	}

}
