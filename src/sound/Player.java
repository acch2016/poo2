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
    private static final double  FREQUENCY      = 500.0;	// 200.0 
    private static final boolean SIGNED 		= true;
    private static final boolean BIG_ENDIAN 	= true;
    private static final int 	 BUFFER_SIZE 	= 100;
    private static final int     PERIOD_SAMPLES = (int) (SAMPLE_RATE / FREQUENCY);
 
    private int sampleNumber;
    
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
		double value = Math.sin(2.0 * Math.PI * x);
		this.sampleNumber = (sampleNumber + 1) % PERIOD_SAMPLES;
		return value;
	}

}
