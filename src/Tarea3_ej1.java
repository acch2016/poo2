import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tarea3_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		int word_num = Integer.parseInt(JOptionPane.showInputDialog("How many words are you going to enter?: \n"));		
		char[][]text = new char[word_num][]; 
		int n = 0;
		
		/** This control structure */
		do{
			n = n + 1;
			/** The next line of code will be displayed asking for the different words the user is going to enter. 
			 *   A String word will be pointing to the words entered by the user 
			 */
			String word = JOptionPane.showInputDialog("Word "+ n +": \n");
			
			/** The next line of code creates a new char Array object 
			 * and the nth row of text matrix will be pointing to a new char object */
			text[n-1] = new char[word.length()];
			
			/** The next line of code makes a cast of the String word to a char Array 
			 * and the nth row of text matrix will be pointing to the words the user entered */
			text[n-1] = word.toCharArray();
//			Arrays.fill(text, 18);
//			System.out.println(text[n-1]);
		}while(word_num != n);
		
		/** Print matrix */
		for(int r = 0; r < text.length; r ++)
			System.out.println(Arrays.toString(text[r]));
		

	}

}
