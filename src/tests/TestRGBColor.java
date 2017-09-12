package tests;

import com.iteso.model.RGBColor; 
public class TestRGBColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		c1 es el color predeterminado
		RGBColor c1 = new RGBColor();
		c1.print();
		c1.printRGB();
		
//		c2 es el color Esmeralda  < 80, 200, 120 >
		RGBColor Esmeralda = new RGBColor(80,200,120, "Esmeralda");
		Esmeralda.print();
		Esmeralda.printRGB();
		
//		c3 es el color Carmesí  < 220, 20, 60 >
		RGBColor Carmesi = new RGBColor(220, 20, 60, "Carmesí");
		Carmesi.print();
		
//		c4 es el color Azul marino < 18, 10, 143 >
		RGBColor Azulmarino = new RGBColor(18, 10, 143, "Azul marino");
		Azulmarino.print();
		Azulmarino.printRGB();
		
//		c5 es el color Esmeralda impreso -> valores CMY de c2
		RGBColor Esmeraldaimpreso = new RGBColor(Esmeralda.getCyan(),Esmeralda.getMagenta(),Esmeralda.getYellow(),"Esmeralda impreso");
		Esmeraldaimpreso.print();
		Esmeraldaimpreso.printRGB();
		
//		Imprima en hexadecimal el valor RGB de c3
		Carmesi.printRGB();
		
		RGBColor c6 = new RGBColor(0xFF5601);
		c6.print();
		c6.printRGB();
		
		RGBColor c7 = new RGBColor();
		System.out.println(c7);
		
		c7.setCMY(0xFF0077); //ya funciona
		System.out.println(c7);
		
		c7.setRGB(0xFF0077);
		System.out.println(c7);
		
		
//		Deben dar el complemento de lo que le envíe
		c7.setCyan(64);
		System.out.println(c7);
		
		c7.setMagenta(100);  //ya funciona
		System.out.println(c7);
		
		c7.setYellow(200);//ya funciona
		System.out.println(c7);
		
		System.out.printf("%x, %x\n", c7.getRGB(), c7.getCMY());
		
		c7.printCMY();
		

	}

}
