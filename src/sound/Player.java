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
		
		int PERIOD_SAMPLES3b = (int) (SAMPLE_RATE / ((200*Math.sin(2.0 * Math.PI * z)) + 400) );		
		double zb     = sampleNumber3b / (double) PERIOD_SAMPLES3b;
		
		int PERIOD_SAMPLES_noise = (int) (SAMPLE_RATE / ( (300*Math.random())+700) );
	
		double n     = sampleNumber_noise / (double) PERIOD_SAMPLES_noise;
		
		double value = Math.sin(2.0 * Math.PI * 1  ); // Original
//		double value = Math.sin(2.0 * Math.PI * x  ) * Math.sin(2.0 * Math.PI * y); //AM Modulacion de anillo
//		double value = Math.sin(2.0 * Math.PI * x  ) * Math.sin(2.0 * Math.PI * y) * Math.sin(2.0 * Math.PI * a  ) * Math.sin(2.0 * Math.PI * b) * Math.sin(2.0 * Math.PI * c  ) * Math.sin(2.0 * Math.PI * d) * Math.sin(2.0 * Math.PI * e  ) * Math.sin(2.0 * Math.PI * f) * Math.sin(2.0 * Math.PI * g  ) * Math.sin(2.0 * Math.PI * h) * Math.sin(2.0 * Math.PI * i  ); //AM 11 frecuencias
//		double value = Math.sin(2.0 * Math.PI * zb ); //FM
//		double value = Math.sin(2.0 * Math.PI * n);
		this.sampleNumber = (sampleNumber + 1) % PERIOD_SAMPLES;
		
		this.sampleNumber2 = (sampleNumber2 + 1) % PERIOD_SAMPLES2;
		
		this.sampleNumber3 = (sampleNumber3 + 1) % PERIOD_SAMPLES3;
		this.sampleNumber3b = (sampleNumber3b + 1) % PERIOD_SAMPLES3b;
		
		this.sampleNumber_noise = (sampleNumber_noise + 1) % PERIOD_SAMPLES_noise;
		
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

}
