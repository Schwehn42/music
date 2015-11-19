package transformations;

import components.Interval;
import components.Mode;
import components.Note;

public class Triad {
	private Note[] notes = new Note[3];
	private String position = "BASE"; //BASE; 6; 6/4
	public Triad(Note n1, Note n2, Note n3) {
		this.notes[0] = n1;
		this.notes[1] = n2;
		this.notes[2] = n3;
	}
	
	public Triad(Note n1, Mode mode) {
		this.notes[0] = n1;
		if (mode == Mode.MAJOR) {
			this.notes[1] = n1.shift(Interval.THIRD_MAJOR, false);
			this.notes[2] = this.notes[1].shift(Interval.THIRD_MINOR, false);
		}
		else {
			this.notes[1] = n1.shift(Interval.THIRD_MINOR, false);
			this.notes[2] = this.notes[1].shift(Interval.THIRD_MAJOR, false);

		}
	}
	
	public Triad transform(String transformTo) {
		Note tempNote1 = this.notes[0];
		Note tempNote2 = this.notes[1];
		Note tempNote3 = this.notes[2];
		
		if (transformTo.equals("6") && this.position.equals("BASE")) {
			return new Triad(tempNote2, 
							 tempNote3,
							 tempNote1.shift(Interval.OCTAVE_PERFECT, false));
		}
		else {
			// other transformation
		}
		return null;
	}
	
	public Note[] getNotes() {
		return this.notes;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	@Override
	public String toString() {
		return this.notes[0].toString() + " " + this.notes[1].toString() + " " + this.notes[2].toString();
	}
}
