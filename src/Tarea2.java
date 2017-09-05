import javax.swing.JOptionPane;

public class Tarea2 {
	
	public static void main(String[] args) {
		
		String argbStr = JOptionPane.showInputDialog("Please enter a ARGB hexadecimal value: ");
			
		
		long number = Long.parseLong(argbStr, 16);
//		System.out.printf("Decimal value is: " + number + "  Hex value is: [%X]\n", number);
		
		
		long blue = number & 0xFFL;
//		System.out.printf("Decimal value is: " + blue + "  Hex value is:  [%X]\n", blue);
		
		long green = number & 0xFF00;
		green >>= 8; //green = green >> 8;
//		System.out.printf("Decimal value is: " + green + "  Hex value is:  [%X]\n", green);
		
		long red = number & 0xFF0000;
		red >>= 16;
//		System.out.printf("Decimal value is: " + red + "  Hex value is:  [%X]\n", red);
		
		long alpha = number & 0xFF000000;
		alpha >>= 24;
//		System.out.printf("Decimal value is: " + alpha + "  Hex value is:  [%X]\n", alpha);
		
		
		String mssg = String.format( "%-7s %3d [%02X]\n%-7s %3d [%02X]\n%-7s %3d [%02X]\n%-7s %3d [%02X]","Alpha:",alpha,alpha,"Red:",red,red,"Green:",green,green,"Blue:",blue,blue);

		
//		String mssg = String.format( "Alpha:  %3d [%02X]\nRed:    %$3d [%02X]\nGreen:  %3d [%02X]\nBlue:   %3d [%02X]\n",alpha,alpha,red,red,green,green,blue,blue);
		JOptionPane.showMessageDialog(null, mssg, "Message", JOptionPane.INFORMATION_MESSAGE);
		

			//https://www.tutorialspoint.com/java/java_characters.htm
	}

}







