
public class Sesion2 {

	public static void main(String[] args) {
		long l1 = 2_147_483_648L; // 3_000_000_000L; //con L indicas usar 64 bits
		long l2 = 0x7FFF_FFFFl; // 0xCD_1234_5678L;
		long l3;
//		System.out.println(l3); no se puede leer una variable no inicializada
	// objetos seran los ejemplares
		
//		Cada tipo primitivo tiene su clase "wrapper"
//		int    --> Integer
//		double --> Double
//		float  --> Float
//		char   --> Character
		double max = Double.MAX_VALUE;
		System.out.println(max);
		System.out.println(Float.MIN_VALUE);
		
//		En Java no podemos guardar un dato grande en una variable pequeña
//		A menos que apliquemos un "cast"
		float f = 1.2f;  //1.2f para menos almacenamiento
		
		char c = 960; //'π' - 5; // 960 es PI, 955 es Lambda
		System.out.println(c);
		

	//alcance de un objeto
//		String es una clase inmutable
		String s1 = " hoja ";
		char c1 = s1.charAt(3);
		System.out.println(c1);//metodos, servicios, comportamientos
		int l = s1.length();
		System.out.println(l);
		String s2 = s1.toUpperCase();//copia el string anterior en una nueva caja y las mone en mayus
		System.out.println(s2);
		s2 = s2.trim();//quita espacios
		System.out.println(s2);
		s1 = s2;
	}
}
