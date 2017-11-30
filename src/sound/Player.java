package sound;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Player extends Thread {

//	A mi juicio, estas constantes deberían ser variables cuyo valor lo establece el usuario de la API
//	Pero hay que estudiar bien cuál es la consecuencia auditiva de aumentar o disminuir cada atributo
//	Con ello, hacer más atractiva la API para un programador con conocimiento de audio
    private static final int     SAMPLE_RATE 	= 22050;
    private static final int     SAMPLE_SIZE 	= 16; 		// 8
    private static final int     CHANNELS 		= 1; 		// 2
    private static final double  FREQUENCY      = 500.0;
    private static final double  FREQUENCY2     = 200.0;
    private static final double  FREQUENCY_a      = 124.0;
    private static final double  FREQUENCY_b      = 465.0;
    private static final double  FREQUENCY_c      = 867.0;
    private static final double  FREQUENCY_d     = 1647.0;
    private static final double  FREQUENCY_e     = 300.0;
    private static final double  FREQUENCY_f     = 1021.0;
    private static final double  FREQUENCY_g     = 1549.0;
    private static final double  FREQUENCY_h     = 269.0;
    private static final double  FREQUENCY_i    = 800.0;
    private static final double  FREQ_MOD       = 1.0;
    private static final boolean SIGNED 		= true;
    private static final boolean BIG_ENDIAN 	= true;
    private static final int 	 BUFFER_SIZE 	= 100;
    private static final int     PERIOD_SAMPLES = (int) (SAMPLE_RATE / FREQUENCY);
    private static final int     PERIOD_SAMPLES2 = (int) (SAMPLE_RATE / FREQUENCY2);
    private static final int     PERIOD_SAMPLES3 = (int) (SAMPLE_RATE / FREQ_MOD);
    
    private static final int     PERIOD_SAMPLES_a = (int) (SAMPLE_RATE / FREQUENCY_a);
    private static final int     PERIOD_SAMPLES_b = (int) (SAMPLE_RATE / FREQUENCY_b);
    private static final int     PERIOD_SAMPLES_c = (int) (SAMPLE_RATE / FREQUENCY_c);
    private static final int     PERIOD_SAMPLES_d = (int) (SAMPLE_RATE / FREQUENCY_d);
    private static final int     PERIOD_SAMPLES_e = (int) (SAMPLE_RATE / FREQUENCY_e);
    private static final int     PERIOD_SAMPLES_f = (int) (SAMPLE_RATE / FREQUENCY_f);
    private static final int     PERIOD_SAMPLES_g = (int) (SAMPLE_RATE / FREQUENCY_g);
    private static final int     PERIOD_SAMPLES_h = (int) (SAMPLE_RATE / FREQUENCY_h);
    private static final int     PERIOD_SAMPLES_i = (int) (SAMPLE_RATE / FREQUENCY_i);
    
 
    private int sampleNumber,sampleNumber2,sampleNumber3,sampleNumber3b,sampleNumber_noise,sampleNumber_a, sampleNumber_b, sampleNumber_c, sampleNumber_d, sampleNumber_e, sampleNumber_f, sampleNumber_g, sampleNumber_h, sampleNumber_i ;
//    double freq_portadora;
    
    @Override
//  Esto es lo que hará el hilo de ejecución mientras exista
    public void run() {
    	try {
    		play();
        } catch(LineUnavailableException e) {
            e.printStackTrace();                
        }
    }
    
    private void play() throws LineUnavailableException {
    	AudioFormat    format = new AudioFormat(SAMPLE_RATE, SAMPLE_SIZE, CHANNELS, SIGNED, BIG_ENDIAN);
    	DataLine.Info  info   = new DataLine.Info(SourceDataLine.class, format);
    	SourceDataLine line   = (SourceDataLine) AudioSystem.getLine(info);
    	line.open(format);
    	line.start();
    	byte[] sampleData = new byte[BUFFER_SIZE];
//    	Todo el tiempo se ejecutará este proceso, el cual podrá ser pausado o reanudado con métodos "no seguros" de Thread
        while(true) {
        	getSamples(sampleData);
            line.write(sampleData, 0, BUFFER_SIZE);
        }
    }
    
    private void getSamples(byte[] buffer) {
    	for(int i = 0; i < BUFFER_SIZE; i += 2) {
    		double ds = getSample() * Short.MAX_VALUE;  // Normaliza el double entregado por getSample() al rango de los Short: [0..32767]
    		short  ss = (short) Math.round(ds);     	// Redondea el resultado de la normalización al entero más cercano
    		buffer[i]     = (byte) (ss >> 8);   		// En la posición index se escriben los msb de ss
    		buffer[i + 1] = (byte) (ss & 0xFF); 		// En la posición index + 1 se escriben los lsb de ss    		
    	}
    }
    
//  En este método se debería ejecutar la función matemática elegida por el usuario de la API. 
//  Actualmente se ejecuta la función senoidal 
	private double getSample() {
		double x     = sampleNumber / (double) PERIOD_SAMPLES;
		double y     = sampleNumber2 / (double) PERIOD_SAMPLES2;
		double z     = sampleNumber3 / (double) PERIOD_SAMPLES3;
		double a     = sampleNumber_a / (double) PERIOD_SAMPLES_a;
		double b     = sampleNumber_b / (double) PERIOD_SAMPLES_b;
		double c     = sampleNumber_c / (double) PERIOD_SAMPLES_c;
		double d     = sampleNumber_d / (double) PERIOD_SAMPLES_d;
		double e     = sampleNumber_e / (double) PERIOD_SAMPLES_e;
		double f     = sampleNumber_f / (double) PERIOD_SAMPLES_f;
		double g     = sampleNumber_g / (double) PERIOD_SAMPLES_g;
		double h     = sampleNumber_h / (double) PERIOD_SAMPLES_h;
		double i     = sampleNumber_i / (double) PERIOD_SAMPLES_i;
//		double j     = sampleNumber_j / (double) PERIOD_SAMPLES_j;
		
//		int PERIOD_SAMPLES3b = (int) (SAMPLE_RATE / ((200*Math.sin(2.0 * Math.PI * z)) + 400) );		
//		double zb     = sampleNumber3b / (double) PERIOD_SAMPLES3b;
//		
//		int PERIOD_SAMPLES_noise = (int) (SAMPLE_RATE / ( (300*Math.random())+700) );
//	
//		double n     = sampleNumber_noise / (double) PERIOD_SAMPLES_noise;
		
		 

		double value;  //Triangular
		 if (sampleNumber < (PERIOD_SAMPLES / 2)) {
			value = ( (4*x)-1 );
		}else{
			value = ( (-4*x)+3 );
		}
//		double value = Math.sin(2.0 * Math.PI * x  ); // Original
//		double value = Math.sin(2.0 * Math.PI * x  ) * Math.sin(2.0 * Math.PI * y); //AM Modulacion de anillo
//		double value = Math.sin(2.0 * Math.PI * x  ) * Math.sin(2.0 * Math.PI * y) * Math.sin(2.0 * Math.PI * a  ) * Math.sin(2.0 * Math.PI * b) * Math.sin(2.0 * Math.PI * c  ) * Math.sin(2.0 * Math.PI * d) * Math.sin(2.0 * Math.PI * e  ) * Math.sin(2.0 * Math.PI * f) * Math.sin(2.0 * Math.PI * g  ) * Math.sin(2.0 * Math.PI * h) * Math.sin(2.0 * Math.PI * i  ); //AM 11 frecuencias
//		double value = Math.sin(2.0 * Math.PI * zb ); //FM
//		double value = Math.sin(2.0 * Math.PI * n);
		this.sampleNumber = (sampleNumber + 1) % PERIOD_SAMPLES;
		
		this.sampleNumber2 = (sampleNumber2 + 1) % PERIOD_SAMPLES2;
		
		this.sampleNumber3 = (sampleNumber3 + 1) % PERIOD_SAMPLES3;
//		this.sampleNumber3b = (sampleNumber3b + 1) % PERIOD_SAMPLES3b;
		
//		this.sampleNumber_noise = (sampleNumber_noise + 1) % PERIOD_SAMPLES_noise;
		
		this.sampleNumber_a = (sampleNumber_a + 1) % PERIOD_SAMPLES_a;
		this.sampleNumber_b = (sampleNumber_b + 1) % PERIOD_SAMPLES_b;
		this.sampleNumber_c = (sampleNumber_c + 1) % PERIOD_SAMPLES_c;
		this.sampleNumber_d = (sampleNumber_d + 1) % PERIOD_SAMPLES_d;
		this.sampleNumber_e = (sampleNumber_e + 1) % PERIOD_SAMPLES_e;
		this.sampleNumber_f = (sampleNumber_f + 1) % PERIOD_SAMPLES_f;
		this.sampleNumber_g = (sampleNumber_g + 1) % PERIOD_SAMPLES_g;
		this.sampleNumber_h = (sampleNumber_h + 1) % PERIOD_SAMPLES_h;
		this.sampleNumber_i = (sampleNumber_i + 1) % PERIOD_SAMPLES_i;
		return value;
	}
	
//	public double temp = 0; 
//	public double triangularFunction(double fp) {
//		double Tp = 1/fp;
//		double 
//		double Np = Tp/Ts;
		
		
		
//		double[] array= {0.000000,0.041670,0.083330,0.125000,0.166670,0.208330,0.250000,0.291670,0.333330,0.375000,0.416670,0.458330,0.500000,0.541670,0.583330,0.625000,0.666670,0.708330,0.750000,0.791670,0.833330,0.875000,0.916670,0.958330,1.000000,0.990000,0.949390,0.908780,0.868160,0.827550,0.786940,0.746330,0.705710,0.665100,0.624490,0.583880,0.543270,0.502650,0.462040,0.421430,0.380820,0.340200,0.299590,0.258980,0.218370,0.177760,0.137140,0.096530,0.055920,0.015310,-0.025310,-0.065920,-0.106530,-0.147140,-0.187760,-0.228370,-0.268980,-0.309590,-0.350200,-0.390820,-0.431430,-0.472040,-0.512650,-0.553270,-0.593880,-0.634490,-0.675100,-0.715710,-0.756330,-0.796940,-0.837550,-0.878160,-0.918780,-0.959390,-1.000000,-0.990000,-0.949170,-0.908330,-0.867500,-0.826670,-0.785830,-0.745000,-0.704170,-0.663330,-0.622500,-0.581670,-0.540830,-0.500000,-0.459170,-0.418330,-0.377500,-0.336670,-0.295830,-0.255000,-0.214170,-0.173330,-0.132500,-0.091670,-0.050830,-0.010000};
//		
//		for(double valor : array){
//			temp = valor;
//		}
//		return temp;
//	}
	

}
