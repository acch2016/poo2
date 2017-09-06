import javax.swing.JOptionPane;

public class Tarea1_Ej2 {
	
	public static void main(String[] args) {
		
		
		String w1 = JOptionPane.showInputDialog("Please enter a word: ");
		String w2 = JOptionPane.showInputDialog("Please enter a 2nd word: ");
		String w3 = JOptionPane.showInputDialog("Please enter a 3rd word: ");
		
		int lw1 = w1.length();
		int lw2 = w2.length();
		int lw3 = w3.length();
		
		int i = w1.length();
		int j = w2.length();
		int k = w3.length();
		System.out.printf("Length %d, %d, %d \n", lw1,lw2,lw3);
		System.out.printf("Length %s, %s, %s \n", w1,w2,w3);
		
		int s = 0;
		int m = 0;
		int b = 0;
		
		
		if( i<=j ){			
			if( i<=k ){				
				s=i;
				if( j<=k ){					
					m=j;
					b=k;					
				}else{					
					b=j;
					m=k;
				}				
			}else{				
				s=k;
				m=i;
				b=j;				
			}		
		}else{			
			if(i<=k){				
				s=j;
				m=i;
				b=k;				
			}else{				
				b=i;
				if(j<=k){					
					s=j;
					m=k;					
				}else{					
					s=k;
					m=j;
				}				
			}			
		}
		//continuar aqui con las banderas
		System.out.printf("if %d, %d, %d \n", s,m,b);
		

		
		
//		String s1;
//		String s2;
		int compare = w1.compareTo(w2);
		System.out.printf("compare %d \n", compare);
		
//		if (compare < 0)
//		{
//		    // w1 is smaller than w2
//		}
//		else if (compare > 0)
//		{
//		    // w1 is larger than w2
//		}
//		else
//		{
//		    // w1 is equal to w2
//		}
	}

}
