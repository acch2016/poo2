package windows;

public class ExtendedWindow extends BasicWindow {
	
	public static final int MAX_X = 1200;
	public static final int MAX_Y = 1080;
	
	protected String title;

	public ExtendedWindow(String title) {
		
		//si no se llama a super, el compilador añade la linea super();
		super();//llama al 1er constr de BasicWindow
		this.title = title;
	}

	public ExtendedWindow(int x, int y, int width, int heigth, String title) {
		
		//variables de metodo son los argumentos del construcot super
		super(x, y, width, heigth);// llama al 2do constructor de BasicWindow	
		this.title = title;
	}
	
	@Override
	
//	Con @Override, le damos permiso al compilador que genere un error
//	de sintaxis si el metodo no se esta sobreescribiendo bien
	public void display(){
		System.out.printf("%s. ",this.title);
		super.display();
	}
	
	public void move(int dx, int dy) {
		this.x += dx;
		if(super.x < 0) super.x = 0;
		else if(super.x > MAX_X) super.x = MAX_X;

		y += dy;
		if(super.y < 0) super.y = 0;
		else if(super.y > MAX_Y) super.y = MAX_Y;
	}

}
