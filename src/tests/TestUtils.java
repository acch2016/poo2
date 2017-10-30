package tests;

import com.iteso.math.NegativeNumberFoundException;
import com.iteso.math.Utils;
import com.iteso.model.RGBColorGrupal;

public class TestUtils {

	public static void main(String[] args) throws NegativeNumberFoundException {
		double a = 1, b = 6, c = 3, y = 0;
		y = Utils.solve(a, b, c);
		System.out.println("Solución: " + y);
		
		System.out.println(Utils.magnitude( 0, 1));
		System.out.println(Utils.magnitude(-3, 4));
		
		RGBColorGrupal ambar = null;
		try {
			ambar = new RGBColorGrupal(150, 350, 80);
		} catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("Ambar: " + ambar);		
		
//		double x = -9, y = 0;
//		try {
//			y = 4 * Utils.squareRoot(x);
//			System.out.println(y);
//		} catch (NegativeNumberFoundException e) {
//			System.out.println(e);
//			System.out.println("-----------");
//			e.printStackTrace();
//			System.out.println(y);
//		}
	}

}
