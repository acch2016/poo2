package tests;

import com.iteso.calendar.Date;
import com.iteso.world.Animal;
import com.iteso.world.Bird;
import com.iteso.world.Flyable;
import com.iteso.world.Jet;
import com.iteso.world.Man;
import com.iteso.world.Superman;
import com.iteso.world.Vehicle;

public class TestWorld {
	
	public static void land(Flyable f){ // polimorfismo en f
		while(f.getHeight() > 0) {
			f.descend();  // enlace dinámico en descend()
			System.out.println(f.getHeight());
		}
	}
	
	public static void flyToTop(Flyable f){
		System.out.println(f.getClass());
		while(f.getHeight() < Flyable.MAX_HEIGHT) {
			f.rise();
			System.out.println(f.getHeight());
		}
	}
	
	public static void stop(Vehicle v) {
		while (v.getSpeed() > 0){
			v.slowDown();
			System.out.println(v.getSpeed());
		}
	}
	public static void reachSpeed(Vehicle v, double speed){
		while (v.getSpeed() < speed){
			v.speedUp();
			System.out.println(v.getSpeed());
		}
	}

	public static void main(String[] args) {
		int[] losQueNoHanPasado = {2, 5, 9, 13, 17, 19, 22, 32};
		int indiceDeLosQueNoHanPasado = (int) (losQueNoHanPasado.length * Math.random());
		System.out.println(losQueNoHanPasado[indiceDeLosQueNoHanPasado]);
		Man      jorge   = new Man();
		Superman kalEl   = new Superman();
		Bird     piolín  = new Bird();
		Jet      boeing  = new Jet();
		Vehicle  mcQueen = new Vehicle();	
		
		Flyable gatoVolador = new Flyable() {
			private double height = 0;
//			constructor de una clase anónima
			{
				System.out.println("Ya llegué");
				meow();
				meow();
			}
			
			public void rise() {
				System.out.println("Cuidado con el gato volador");
				this.height = 3;
			}
			public void descend() {
				System.out.println("Vamos de regreso");
				this.height = 0;
				meow();
			}
			public double getHeight() {
				return this.height;
			}
			private void meow() {
				System.out.println("Miau, miau. ");
			}
		};
		
		Bird laGaviota = new Bird() {
			double height = 1;
			public void rise() {
				System.out.println("Comprar casa blanca");
				height *= 2;
			}
			public void descend() {
				System.out.println("Termina el sexenio");
				height = 0;
			}
			public double getHeight() {
				return height;
			}
		};
		flyToTop(laGaviota);
		land(laGaviota);
		
		Date fecha = new Date(25, 12, 2017) {
			public String toString() {
				setFormat(2);
				return "[" + super.toString() + "]";
			}
		};
		System.out.println(fecha);
		fecha.next();
		fecha.setFormat(0);
		System.out.println(fecha);
		
		Animal krypto = new Animal() {
			public void move() {  // override obligatorio
				System.out.println("Krypto está volando");
				bark();
			}
			public void die() {   // override opcional
				System.out.println("No moriré");
				bark();
			}
			public void bark() {  // método interno
				System.out.println("No pos guau.");
			}
		};
		
//		gatoVolador.meow();  // Inalcanzable porque no existe en Flyable
		gatoVolador.rise();
		System.out.println(gatoVolador.getHeight());
		land(gatoVolador);
		System.out.println("*************");
		
		Animal[] animals = { jorge, kalEl, piolín, krypto };
		for(Animal a : animals) {  // polimorfismo con a
			a.move();   // Man,    Man,    Bird  // Enlace dinámico
			a.sleep();  // Animal, Animal, Animal
			a.die();    // Animal, Animal, Animal
		}
		System.out.println("-------------");
		
		reachSpeed(boeing, 40);
		System.out.println("-------------");
		reachSpeed(mcQueen,60);
		System.out.println("-------------");
		flyToTop(kalEl);
		System.out.println("-------------");
		flyToTop(piolín);
		System.out.println("-------------");
		flyToTop(boeing);
		System.out.println("-------------");
		land(boeing);
		System.out.println("-------------");
		
		jorge.sleep(); // Animal
		jorge.move();  // Animal (Man)
		jorge.think(); // Man 
		jorge.die();   // Animal
		
		kalEl.rise();    	 // Flyable
		System.out.println(kalEl.getHeight());  // Flyable
		kalEl.descend(); 	 // Flyable
		System.out.println(kalEl.getHeight());  // Flyable
		kalEl.losePower(40); // Superman
		kalEl.runFast();  	 // Superman
		kalEl.sleep(); 		 // Animal
		kalEl.move();  		 // Animal (Man)
		kalEl.think(); 		 // Man 
		kalEl.die();    	 // Animal
		
	}

}
