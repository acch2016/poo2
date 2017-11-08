package tests;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Vector;


public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Crear una lista dinaamica sincronizada que almacene cadenas de texto
		Vector<String> vector = new Vector<String>();
//		2. Añadir los elementos: "uno", "dos", ... "seis"
		vector.add("uno");
		vector.add("dos");
		vector.add("tres");
		vector.add("cuatro");
		vector.add("cinco");
		vector.add("seis");
//		3. Imprimir todos los elementos añadidos con un ciclo for e indice
		for(int x=0; x < vector.size(); x++){
			String s = vector.get(x);
			System.out.println(s);
		}
//		4. Reemplazar el elemento "cuatro" por "dos"
//		5. Imprimir la posición de los elementos "dos" y "cuatro"
		
		
		int i = vector.indexOf("cuatro");
		vector.set(i, "dos");
		System.out.println(vector.indexOf("cuatro"));
		System.out.println(vector.indexOf("dos"));
		
//		6. Reemplazar todos los elementos por su mayúscula.
		for (int x=0; x < vector.size(); x++){
			vector.set(x, vector.get(x).toUpperCase());
		}
		for (int x=0; x < vector.size(); x++){
			String s = vector.get(x);
			System.out.println(s);
		}
		
//		7. Vaciar la lista con llamadas sucesivas a remove.
		 while(vector.size() != 0){
			 System.out.println(vector);
			 vector.remove(0);
		 }
		 
		 for(int x = 0; x < vector.size(); x ++) {
			 String s = vector.get(x);
			 System.out.println(s);
		 }
		 
//		1. Crear un conjunto que conserve el orden natural de los elementos capaz de
//		almacenar numeros enteros.
		TreeSet<Integer> ts = new TreeSet<Integer>();
//		2. Añadir los elementos: 100, 150, 120, 100, 180, 200, 120, 180, 100.
		Integer[] arrayInteger = {100, 150, 120, 100, 180, 200, 120, 180, 100};
		for(Integer e: arrayInteger) {
			if(ts.add(e)) System.out.println(e + " was added");
			else System.out.println(e + " was not added");
		}
//		3. Imprime el tamaño del conjunto.
		System.out.println(ts.size());
//		4. Imprimir todos los elementos del conjunto. Como no contamos con indice, nos
//		conviene utilizar el ciclo for-each.
		for(Integer e: ts) System.out.println(e);
		
//		5. Crea un mapa que utilice codigo hash y no admita nulos, que asocie numero
//		con su nombre, tal que el nombre es la clave.
		HashMap<String, Integer> hm = new HashMap<>();
//		6. Insertar los primeros 5 pares: <"uno", 1>, <"dos", 2>, ….
		hm.put("uno",    1);
		hm.put("dos",    2);
		hm.put("tres",   3);
		hm.put("cuatro", 4);
		hm.put("cinco",  5);
//		7. Imprime los valores de "tres" y "siete".
		System.out.println(hm.get("tres"));
		System.out.println(hm.get("siete"));
		
//		HashMap permite null en clave y en valor
		hm.put("null", null);
		hm.put(null, 5);
		System.out.println(hm.get(null));	
		
		
	}
}
