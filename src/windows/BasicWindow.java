package windows;
//y crece hacia abajo
//x crece a la derecha
public class BasicWindow {
		
		public static final int MIN_WIDTH = 10;
		public static final int MIN_HEIGTH = 15;
		
		protected int x,y, width, heigth;
		
		public BasicWindow(){
			
			this(0,0,MIN_WIDTH,MIN_HEIGTH);
		}
		
		public BasicWindow( int x, int y, int width, int heigth){
			this.x      =     x >= 0? x : 0;
			this.y      =     y >= 0? y : 0;
			this.width  = width >= MIN_WIDTH? width : MIN_WIDTH;
			this.heigth = heigth >= MIN_HEIGTH? heigth : MIN_HEIGTH;
		}
		
		public void display(){
			System.out.printf("Position: <%d, %d>. Size: %d x %d.\n",
					this.x,this.y,this.width,this.heigth);
		}
		
		public void resize(int dw, int dh) {
			this.width += dw;
			this.heigth += dh;
			if(this.width < MIN_WIDTH) this.width = MIN_WIDTH;
			if(this.heigth< MIN_HEIGTH) this.heigth = MIN_HEIGTH;
		}

	

}
