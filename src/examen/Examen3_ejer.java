package examen;
import java.util.Collection;
import java.util.Comparator;
import java.util.Stack;

import com.iteso.model.RGBColorGrupal;

public class Examen3_ejer {
	
	public <T> int smallers(T object, Collection<T> collection){
		int counter = 0;
		for(T element : collection){
			if( element <= object) {
				counter++;
			}
		}
		return counter;
	}
	
	public <T> int smallers(Comparator<T> object, Collection<T> collection){
		int counter = 0;
//		Collection<RGBColorGrupal> values = colorMap.values();
//		Comparator<R> values. = collection.;

		for(T element : collection){
			if( -1 == object.compare(element, object)) {
				counter++;
			}
		}
		return counter;
	}
	
	public <T> void  superPush(Stack s, T ... element) {
		
	}
	
	

}
