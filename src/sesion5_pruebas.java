import javax.swing.JOptionPane;
public class sesion5_pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVel = JOptionPane.showInputDialog("¿Cuál es tu velocidad actual?");
		try {
		double vel = Double.parseDouble(strVel);
		if(vel >= 90) JOptionPane.showMessageDialog(null, "Foto infracción");
		else JOptionPane.showMessageDialog(null, "Todo bien");
		
	} catch(NumberFormatException exc) {
		JOptionPane.showMessageDialog(null, "Velocidad no válida\n" + exc);
	}
	JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
	}

}
