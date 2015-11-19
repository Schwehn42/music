package components;

import transformations.Shift;

public class Note implements Shift{
	//vars
	private Tone tone; //general note: C, D, E ...
	private Mode mode; // Major or Minor
	private int octave = 3; //Which octave on the piano keyboard
	private int posInSemiToneSeries;
	
	//constructors
	public Note(Tone tone, Mode mode) {
		this.tone = tone;
		this.mode = mode;
		
		this.posInSemiToneSeries = setPosInSemiToneSeries(tone);
	}
	
	public Note(Tone tone, Mode mode, int octave) {
		this.tone = tone;
		this.mode = mode;
		this.octave = octave;
		
		this.posInSemiToneSeries = setPosInSemiToneSeries(tone);
	}
	
	//setters/getters
	public Tone getTone() {
		return this.tone;
	}
	public Mode getMode() {
		return this.mode;
	}
	public int getOctave() {
		return this.octave;
	}
	public int getPosInToneSeries() {
		return this.posInSemiToneSeries;
	}
	
	//other methods
	@Override
	public String toString() {
		return this.mode + " " + this.tone + "(" + this.octave + ")";
	}
	
	private static int setPosInSemiToneSeries(Tone tone) {
		for (NoteSeriesComponent nsc : NoteSeries.SEMITONESERIES.getSeriesComponents()) {
			if (nsc.getTone() == tone)
				return nsc.getIndex();
		}
		return -1;
	}

	public Note shift(Interval interval, boolean shiftDown) {

		if (!shiftDown) { //Shift up
			int notePos = this.getPosInToneSeries();
			int intervalStep = interval.getStep();
//			System.out.println(notePos + " + " + intervalStep + " --> " + (notePos + intervalStep));
//			System.out.println(NoteSeries.SEMITONESERIES.getSeriesComponents().get(notePos + intervalStep).getIndex());
			Tone shiftedTone = NoteSeries.SEMITONESERIES.getASeriesComponentByIndex(notePos + intervalStep).getTone();
			Note retNote = new Note(shiftedTone, this.getMode());
			
			return retNote;
		}
		else { //Shift down
			
		}
		return null;
	}
}
