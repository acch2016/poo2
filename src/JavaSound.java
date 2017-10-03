
import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
 
public class JavaSound {
 
     public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {      
         
    	Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
 
        Instrument[] instruments = synthesizer.getDefaultSoundbank().getInstruments();
        synthesizer.loadInstrument(instruments[0]);
 
        MidiChannel[] midiChannels = synthesizer.getChannels();
        MidiChannel   midiChannel  = midiChannels[0];
       
        midiChannel.programChange(50);
        midiChannel.noteOn(60, 100);
        Thread.sleep(1000);
        midiChannel.noteOff(60, 100);
       
        Thread.sleep(1000);
       
        midiChannel.programChange(70);
        midiChannel.noteOn(60, 100);
        Thread.sleep(1000);
        midiChannel.noteOff(60, 100);
       
        Thread.sleep(1000);
        
        synthesizer.close();
     }
 
}