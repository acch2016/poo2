package tests;

import com.craigl.softsynth.consumer.SamplePlayer;
import com.craigl.softsynth.basicoscillator.BasicOscillator;
import com.craigl.softsynth.basicoscillator.BasicOscillator.WAVESHAPE;

public class TestBasicOscillator {
	
	public static void main(String[] args) throws InterruptedException {
		// Create an oscillator sample producer
		BasicOscillator osc = new BasicOscillator();
		 
		// Set the frequency
		osc.setFrequency(300);
		 
		// Set the waveashape
		osc.setOscWaveshape(WAVESHAPE.SQU);
		   
		// Create a sample player
		SamplePlayer player = new SamplePlayer();
		 
		// Sets the player's sample provider
		player.setSampleProvider(osc);
		 
		// Start the player
		player.startPlayer();
		 
		// Delay so oscillator can be heard
		
		Thread.sleep(1000*1);
//		delay(1000 * 4);  
		 
		// Stop the player
		player.stopPlayer();

	}

}
