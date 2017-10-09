package tests;

import shapes3d.Cylinder;
import shapes3d.Shape3D;
import shapes3d.Sphere;

public class TestShape3D {

//	Algoritmo flexible al crecimiento ya que funciona correctamente
//	con figuras 3D que aún no se han creado
	public static double getVolume(Shape3D[] shapes) {
		double v = 0;
		// polimorfismo en sh porque puede ser una esfera, cilindro, ...
		for(Shape3D sh : shapes) {
			// enlace dinámico en volume() porque hasta la ejecución se conoce
			// cuál implementación de volume() se está invocando			
			v += sh.volume();
			System.out.println(sh);  // Llama a toString() de cada subclase
		}
		return v;
	}
	
	public static void main(String[] args) {
		Sphere   s1 = new Sphere  ( 0,  0,  0, 3.0);
		Sphere   s3 = new Sphere  ( 2, -1,  4, 5.6);
		Cylinder c2 = new Cylinder( 3,  2, -2, 4.2, 1.5); 
		Cylinder c4 = new Cylinder(-3, -4,  3, 3.5, 2.2);
		Shape3D[] shapes = { s1, c2, s3, c4 };
		double v = getVolume(shapes);
		System.out.println(v);
	}

}