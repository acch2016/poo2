import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.iteso.calendar.DateGrupal;
import com.iteso.calendar.DateTime;
import com.iteso.model.RGBColor;

public class Sesion26 {

	static class StringComparator implements Comparator<String> {
		public int compare(String s1, String s2) {
			if(s1.length() < s2.length()) return -1;
			if(s1.length() > s2.length()) return  1;
			return s1.toUpperCase().compareTo(s2.toUpperCase());
		}
	}
	
	public static void main(String[] args) {
		HashSet<DateGrupal> dateSet = new HashSet<DateGrupal>();
		final int N = 100_000;
		for(int i = 0; i < N; i ++) {
			dateSet.add(DateGrupal.randomDate());
		}
		System.out.println("Tamaño: " + dateSet.size());
		System.out.println("Hash calls: "   + DateGrupal.hashCalls);
		System.out.println("Equals calls: " + DateGrupal.equalsCalls);
		
		ArrayList<String> stupidList = new ArrayList<String>();
		Collections.addAll(stupidList, "párro", "hola", "yoghurt", "mundo", "sacapuntas", "yuxtapuesto", "Perro", "gato", "panda", "nuño");
		System.out.println(stupidList);
		StringComparator stringComparator = new StringComparator();
		Collections.sort(stupidList, stringComparator);
		System.out.println(stupidList);
		
		ArrayList<DateGrupal> dateList = new ArrayList<>();
		  dateList.add(new DateGrupal(18,  7, 2003));
		  dateList.add(new DateGrupal(25, 12, 2017));
		  dateList.add(new DateGrupal(24, 11, 2007));
		LinkedList<DateTime> timeList = new LinkedList<>();
		  timeList.add(new DateTime());
		  timeList.add(new DateTime(21, 56, 35, 28, 5, 2016));
		System.out.println(dateList);
		System.out.println(timeList);
		System.out.println("-----------");
		
//		<T> void copy(List<? super T> dest, List <? extends T> src)
		Collections.copy(dateList, timeList);
		System.out.println(dateList);
		System.out.println(timeList);
//		Error de sintaxis: porque el 2o argumento debe ser igual o más específico al primero
//		Collections.copy(timeList, dateList);
		
//		<T> List<T> nCopies(int n, T o)
		List<String> strList = Collections.nCopies(6, "Hola");
		System.out.println(strList);
		System.out.println(strList.getClass());
		System.out.println("-----------");
//		strList pertenece a la clase Collections.CopiesList
		
		Collections.sort(dateList);
		System.out.println(dateList);
		
		Vector<RGBColor> colorVector = new Vector<RGBColor>();
		  colorVector.add(new RGBColor());
		  colorVector.add(new RGBColor(100, 90, 250));
//		Collections.sort(colorVector);
		
		DateGrupal maxDate = Collections.max(dateList);
		System.out.println("Max date: " + maxDate);
		
//		La variable receptora (tipo T) debe ser del mismo tipo que la  
//		lista o más general
		DateTime minTime = Collections.min(timeList);
		System.out.println("Min time: " + minTime);
		DateGrupal   minDate = Collections.min(timeList);
		System.out.println("Min date: " + minDate);
		
	}

}
