package tests;

import com.iteso.model.Drawer;
import com.iteso.model.GDrawer;
import com.iteso.model.RGBColor;

public class TestDrawer {

	public static void main(String[] args) {
		GDrawer<String> stringDrawer = new GDrawer<String>();
		stringDrawer.put("Calcetín aromático");  // String -> String
//		gd1.put(3.1416);  Error de sintaxis: se esperaba String
		String s = stringDrawer.peek(); // Ya no necesita cast
		System.out.println(s);
//		Double D = gd1.remove();  Error de sintaxis: devuelve String
//		GDrawer es Type Safety
		
		GDrawer<Number> numberDrawer = new GDrawer<>();
		numberDrawer.put(16749.516);    // double -> Double -> Number
		numberDrawer.put(50_000_000L);  // long   -> Long   -> Number
		numberDrawer.put((byte) 500);   // int -> byte -> Byte -> Number
		
		Number numberInDrawer = numberDrawer.peek();
		double doubleInDrawer = numberInDrawer.doubleValue();
		System.out.println(2 * doubleInDrawer);
		System.out.println(numberDrawer);
		System.out.println(stringDrawer);
		stringDrawer.remove();
		System.out.println(stringDrawer);
		
		GDrawer<RGBColor> colorDrawer = new GDrawer<>();
		colorDrawer.put(new RGBColor(122,23,54));
		System.out.println(colorDrawer);
		GDrawer<GDrawer<RGBColor>> colorDrawerDrawer = new GDrawer<>();
		colorDrawerDrawer.put(colorDrawer);
		System.out.println(colorDrawerDrawer);
		GDrawer<Object> ownGDrawer = new GDrawer<>();
		ownGDrawer.put(ownGDrawer);
		System.out.println(ownGDrawer);
	}
	
	public static void main1(String[] args) {
		Drawer d1 = new Drawer();
		d1.put("Calcetín aromático");  // String -> Object //Le mandamos algo particular y lo recibe como algo general
		d1.put(3.1416);  // double -> Double -> Object
		
		Object o1 = d1.peek();
		System.out.println(o1);
		
		String s1 = (String) d1.peek();
		System.out.println(s1.toUpperCase());
		
//		s1 = d1.peek(); Error de sintaxis: peek devuelve Object, no String
		
//		Excepción: String no se puede tratar como Double (CAST)
		Double D = (Double) d1.remove();  // Inseguridad de tipos
		
		
	}

}
