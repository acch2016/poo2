import javax.sound.midi.*;

public class Note
{
    public static void main(String[] args)
    {
//        try
//        {
//// Locate the default synthesizer
//            Synthesizer synth = MidiSystem.getSynthesizer();
//
//// Open the synthesizer
//            synth.open();
//
//// Get the available Midi channels - there are usually 16
//            MidiChannel channels[] = synth.getChannels();
//
//// Get the synth's soundbank where all the sounds are stored
//            Soundbank bank = synth.getDefaultSoundbank();
//
//// Load all the available instruments
//            synth.loadAllInstruments(bank);
//
//// Get a list of the available instruments
//            Instrument instrs[] = synth.getLoadedInstruments();
//
//            Instrument seashore = null;
//
//// Loop through the instruments
//            for (int i=0; i < instrs.length; i++)
//            {
//
//// Stop when you find the seashore
//                if (instrs[i].getName().equals("Seashore"))
//                {
//                    seashore = instrs[i];
//                    break;
//                }
//            }
//
//            if (seashore == null)
//            {
//                System.out.println("Can't find the beach");
//                System.exit(0);
//            }
//
//// Get the information describing the Seashore instrument - the
//// patch contains the soundbank and program number
//            Patch seashorePatch = seashore.getPatch();
//
//// Set 5 channels to use the Seashore instrument
//            channels[1].programChange(seashorePatch.getBank(),
//                seashorePatch.getProgram());
//            channels[2].programChange(seashorePatch.getBank(),
//                seashorePatch.getProgram());
//            channels[3].programChange(seashorePatch.getBank(),
//                seashorePatch.getProgram());
//
//// Start the Seashore note on 3 different channels. By waiting a short
//// time before starting the next note, you get a much more continuous sound
//            channels[1].noteOn(32, 127);
//            Thread.sleep(3500);
//            channels[2].noteOn(32, 127);
//            Thread.sleep(1500);
//            channels[3].noteOn(32, 127);
//
//// Wait forever
//            for (;;)
//            {
//                try { Thread.sleep(999999999); } catch (Exception ignore) {}
//            }
//        }
//        catch (Exception exc)
//        {
//            exc.printStackTrace();
//        }
    }
}