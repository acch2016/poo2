package examen;
import java.util.Collection;
import java.util.Comparator;
import java.util.Stack;

import com.iteso.model.RGBColorGrupal;

public class Examen3_ejer {
	
	public static <T extends Comparable<? super T>> int smallers(T object, Collection<T> collection){
		int counter = 0;
		for(T element : collection){
			if( -1==element.compareTo(object)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static <T> void  superPush(Stack s, T ... element) {
		
	}
	
	

}
