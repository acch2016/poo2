import javax.swing.JOptionPane;

public class Sesion3Grupal {

	public static void main(String[] args) {
//		byte b1 = (byte) 256;  // 16ceros 0000 0001 0000 0000
//		System.out.println(b1);
//		
//		System.out.println("hola");
//		System.out.println(2 * b1);
//		System.out.println(1234_341);
//		System.out.println(0xAB_3104);
//		
//		int edad = 25;
//		float peso = 72.34f;
//		String nombre = "Juan";
//		
//		System.out.printf("Me llamo %s. Tengo %d años. Peso %.1f kg\n", nombre, edad, peso);  // varargs
//		
//		JOptionPane.showMessageDialog(null, "Hola cuadro de diálogo!");
//		JOptionPane.showMessageDialog(null, 
//				                      "¡Hola! me llamo " + nombre + "\n Tengo " + edad + " años", 
//				                      "Hola título",
//				                      JOptionPane.ERROR_MESSAGE
//				);
//		
//		String msg = String.format("Me llamo %s. Tengo %d años. Peso %.1f kg\n", nombre, edad, peso);
//		JOptionPane.showMessageDialog(null, msg, "Mis datos", JOptionPane.WARNING_MESSAGE);
//		
//		
//		nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
//		String edadStr  = JOptionPane.showInputDialog("¿Cuántos años tienes?");
//		String pesoStr  = JOptionPane.showInputDialog("¿Cuánto pesas?");
//		String edadHStr = JOptionPane.showInputDialog("¿Cuál es tu edad en hexadecimal");
//		
//		edad = Integer.parseInt(edadStr);
//		System.out.printf("El próximo año tendrás %d años\n", edad + 1);
//		peso = Float.parseFloat(pesoStr);
//		System.out.printf("Después de 5 tamales pesarás %.1f kg\n", peso * 1.02);
//		
//		edad = Integer.parseInt(edadHStr, 16);
//		System.out.printf("Tu edad en decimal: %d y en hexadecimal: %X\n", edad, edad);	
//		
//		double rnd = Math.random();
//		System.out.println(rnd);
//		
		
		
		String str1 = "hola";  // Se va al String pool
		String str2 = "hola";  // Se va al String pool
		String str3 = new String("hola");  // No se va al String pool
		String str4 = "Hola";
		String str5 = "Hola";
//		El código hash de un String está en función de los caracteres contenidos
		System.out.printf("Hash(str1) = %X\n", str1.hashCode());
		System.out.printf("Hash(str2) = %X\n", str2.hashCode());
		System.out.printf("Hash(str3) = %X\n", str3.hashCode());
		System.out.printf("Hash(str4) = %X\n", str4.hashCode());
		System.out.printf("Hash(str5) = %X\n", str5.hashCode());
//		Te da una idea de dónde están almacenados las cadenas de texto
		System.out.printf("Identity Hash(str1) = %X\n", System.identityHashCode(str1));
		System.out.printf("Identity Hash(str2) = %X\n", System.identityHashCode(str2));
		System.out.printf("Identity Hash(str3) = %X\n", System.identityHashCode(str3));
		System.out.printf("Identity Hash(str4) = %X\n", System.identityHashCode(str4));
		System.out.printf("Identity Hash(str5) = %X\n", System.identityHashCode(str5));
//		Compara las referencias: ¿apuntan al mismo lugar?
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str4 == str5);
//		Compara el contenido de las cadenas de texto
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
//		¿str1 va antes que str2 en el diccionario? negativo (SÍ), 0 (iguales), positivo (NO) 
		System.out.println(str1.compareTo(str2));  // 0 
		System.out.println(str1.compareTo(str3));  // 0
		System.out.println(str1.compareTo(str4));  //  32 : hola no va antes que Hola
		System.out.println(str4.compareTo(str1));  // -32 : Hola sí va antes que hola
		
		String str6 = "1";
		str6 = "2";
		str6 = "3";
		str6 = "1";
		str5 = "2";
		
//		Solicitedeformaseparadanombre,apellidospaternoymaterno.
//		Despliegueelnombrecompletoenmayúsculascomenzandoporlosapellidos,separándolosdelnombreconunacoma.
		
		String name = JOptionPane.showInputDialog("Nombre");
		String ap1 = JOptionPane.showInputDialog("Primer apellido");
		String ap2 = JOptionPane.showInputDialog("Segundo apellido");
		String msj = String.format("%s %s, %s",ap1.toUpperCase(), ap2.toUpperCase(), name.toUpperCase());
		JOptionPane.showMessageDialog(null, msj, "Nombre Completo", JOptionPane.INFORMATION_MESSAGE);
		
		int aPasar = 1 + (int) (32 * Math.random());
		System.out.println("A pasar: " + aPasar);
		
		
		//Ejercicio 3:
		String seleccion=JOptionPane.showInputDialog("Ingresa tu lenguaje de programación favorito:");
		if(seleccion.compareToIgnoreCase("java")==0){
			JOptionPane.showMessageDialog(null, "Su lenguaje es el más popular.");
		}
		else if(seleccion.compareToIgnoreCase("c")==0){
			JOptionPane.showMessageDialog(null, "Su lenguaje es el segundo más popular.");
		}
		else if(seleccion.compareToIgnoreCase("c++")==0){
			JOptionPane.showMessageDialog(null, "Su lenguaje es el tercero más popular.");
		}
		else{
			JOptionPane.showMessageDialog(null, "Su lenguaje no es popular o no existe.");
		}
		

	}

}
