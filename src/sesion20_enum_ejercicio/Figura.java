package sesion20_enum_ejercicio;


public enum Figura {

	CORAZON("Corazón"), DIAMANTE("Diamante"),
	ESPADA("Espada"),  TREBOL("Trébol");
	
	private String nombre;
	
	private Figura(String n) {
		this.nombre = n;
	}
	
	public String toString() {
		return this.nombre;
	}
	
}
