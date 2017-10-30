
public class Carta {
	
	private int numero;
	private Figura figura;
	
	public Carta(int n, Figura f){
		this.numero = n;
		this.figura = f;	
	}
	
	public String toString() {
		return String.format("%d de %s", this.numero,this.figura);
	}
	
	public static void main(String[] args) {
		Carta c1 = new Carta(10,Figura.CORAZON);
		System.out.println(c1);
		Figura f1 = Figura.ESPADA;
		Figura f2 = Figura.ESPADA;
		System.out.println(f1==f2);
		Carta c2 = new Carta(5,f1);
		System.out.println(c2);
		
		switch(f2){
		case ESPADA: System.out.println("Espada");break;
		case TREBOL: System.out.println("Trebol");break;
		case DIAMANTE: System.out.println("Diamante");break;
		case CORAZON: System.out.println("Corazon");
		}
		System.out.println("--------");
		Figura[] figuras = Figura.values();
		for (Figura f: figuras){
			System.out.println(f.ordinal() + ": " + f);
		}

	}
	

}
