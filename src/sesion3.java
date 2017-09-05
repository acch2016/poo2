
import javax.swing.JOptionPane;

public class sesion3 {

	public static void main(String[] args) {
		byte b1 = (byte) 256; //quedate con los menos significativos
		System.out.println(b1);
		
		System.out.println("hola");
		System.out.println(2 * b1);
		System.out.println("hola");
		System.out.println("hola");
		
		int edad = 25;
		float peso = 72;
		String nombre = "Juan";
				
		System.out.printf("Me llamo %s. Tengo %d años. Peso %.1f kg\n", nombre, edad, peso); //lista variable de argumentos - en Java varargs
				
		JOptionPane.showMessageDialog(null,"Hola cuadro de dualogo!");
		JOptionPane.showMessageDialog(null,
											"Hola me llamo" + nombre + "y tengo" + edad + "años",
											"Hola Titulo",
											JOptionPane.ERROR_MESSAGE);
		
		String msg = String.format("Me llamo %s. Tengo %d años. Peso %.1f kg\n", nombre, edad, peso);
		JOptionPane.showMessageDialog( null,msg,"Mis datos", JOptionPane.WARNING_MESSAGE);
		
		nombre = JOptionPane.showInputDialog("¿Como te llamas?");
		String edadStr = JOptionPane.showInputDialog("¿Cuantos años tienes?");
		String pesoStr = JOptionPane.showInputDialog("¿Cuanto pesas?");
		String edadHStr = JOptionPane.showInputDialog("¿Cual es tu edad en hexa?");
		
		edad = Integer.parseInt(edadStr);
		Math.random();
		
		String str1 = "hola";
		String str2 = "hola";
	
		String str3 = new String("hola"); 
		
		nombre = JOptionPane.showInputDialog("¿Nombre?");
		String apellido_m = JOptionPane.showInputDialog("¿Apellido Materno?");
		String apellido_p = JOptionPane.showInputDialog("¿Apellido Paterno?");
		
		msg = String.format("%s, %s, %s" , nombre.toUpperCase(), apellido_p.toUpperCase(), apellido_m.toUpperCase());
		JOptionPane.showMessageDialog(null, msg, "nombre", JOptionPane.INFORMATION_MESSAGE);
	}
}
