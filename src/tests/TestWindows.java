package tests;

import windows.BasicWindow;
import windows.ExtendedWindow;

public class TestWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicWindow bw1 = new BasicWindow();
		bw1.resize(10,5);
		bw1.display();
		
		BasicWindow bw2 = new BasicWindow(25,-8,650,10);
		bw2.resize(-50, 85);
		bw2.display();
		
		ExtendedWindow ew3 = new ExtendedWindow("Ventanita");
		ew3.display();
		
		ExtendedWindow ew4 = new ExtendedWindow(200,150,400,300,"Ventanota");
		ew4.move(-100,100);//method added by ExtendedWindow
		ew4.resize(200, 150);//inherited method from BasicWindow
		ew4.display();//method modified by ExtendedWindow

	}

}
