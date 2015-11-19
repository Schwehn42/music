package components;

public class Note {
	//vars
	private Tone tone; //general note: C, D, E ...
	private Mode mode; // Major or Minor
	private int octave = 3; //Which octave on the piano keyboard
	
	//constructors
	public Note(Tone tone, Mode mode) {
		this.tone = tone;
		this.mode = mode;
	}
	
	public Note(Tone tone, Mode mode, int octave) {
		this.tone = tone;
		this.mode = mode;
		this.octave = octave;
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
}
