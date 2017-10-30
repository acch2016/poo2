package sesion20_enum_ejercicio;

public enum Dia {

	LUNES("Lunes", "Monday", "Lundi", "Понедельник"), 
	MARTES("Martes", "Tuesday", "Mardi", "вторник"),
	MIERCOLES("Miércoles", "Wednesday", "Mercredi", "среда"),
	JUEVES("Jueves", "Thursday", "Jeudi", "четверг"),
	VIERNES("Viernes", "Friday", "Vendredi", "Пятница"),
	SÁBADO("Sábado", "Saturday", "Samedi", "суббота"),
	DOMINGO("Domingo", "Sunday", "Dimanche", "воскресенье");
	
	private String español, inglés, francés, ruso;
	
	private Idioma idioma = Idioma.ESPAÑOL;
	
	private Dia (String e, String i, String f, String r) {
		this.español = e;
		this.inglés = i;
		this.francés = f;
		this.ruso = r;
	}
	
	public String toString(){
		switch(this.idioma)
		{
			case ESPAÑOL: return this.español;
			case INGLES: return this.inglés;
			case FRANCES: return this.francés;
			default: return this.ruso;
		}
	}
	
	public void cambiarIdioma (Idioma i) {
		this.idioma = i;
	}

	
	public static void main(String[] args) {
//		Dia d1 = Dia.MIERCOLES;
//		d1.cambiarIdioma(Idioma.INGLES);
//		System.out.println(d1);
		
//		Dia[] dias = Dia.values();
//		Idioma[] idiomas = Idioma.values();
		for(Dia d : Dia.values()) {
			for(Idioma i : Idioma.values()) {
				d.cambiarIdioma(i);
				System.out.println(d);
			}
			System.out.println("-------");
		}
//		Dia.JUEVES se imprimé en el idioma en el que se quedó (Ruso)
		System.out.println(Dia.JUEVES);
	}
	
	
	
}



