package transformations;

import components.Interval;
import components.Mode;
import components.Note;

public class Triad {
	private Note[] notes = new Note[3];
	private String position = "BASE"; // BASE; 6; 6/4

	public Triad(Note n1, Note n2, Note n3) {
		this.notes[0] = n1;
		this.notes[1] = n2;
		this.notes[2] = n3;
	}
	
	public Triad(Note n1, Note n2, Note n3, String position) {
		this.notes[0] = n1;
		this.notes[1] = n2;
		this.notes[2] = n3;
		
		this.position = position;
	}

	public Triad(Note n1, Mode mode) {
		this.notes[0] = n1;
		if (mode == Mode.MAJOR) { // Major triad
			this.notes[1] = n1.shift(Interval.THIRD_MAJOR, false);
			this.notes[2] = this.notes[1].shift(Interval.THIRD_MINOR, false);
		} else { // Minor triad
			this.notes[1] = n1.shift(Interval.THIRD_MINOR, false);
			this.notes[2] = this.notes[1].shift(Interval.THIRD_MAJOR, false);

		}
	}

	public Triad transform(String transformTo, boolean rewritePosition) {
		/*
		 * transformTo: 6 or 6/4;
		 * rewritePosition: If you want to assign the return to a var (inc. itself) this HAS to be true!!!
		 */
		Note tempNote1 = this.notes[0];
		Note tempNote2 = this.notes[1];
		Note tempNote3 = this.notes[2];

		if (transformTo.equals("6") && this.position.equals("BASE")) {
			if (rewritePosition)
				return new Triad(tempNote2, tempNote3, tempNote1.shift(Interval.OCTAVE_PERFECT, false), "6");
			return new Triad(tempNote2, tempNote3, tempNote1.shift(Interval.OCTAVE_PERFECT, false)); //else
		} else if (transformTo.equals("6/4") && this.position.equals("6")) {
			if (rewritePosition)
				return new Triad(tempNote2, tempNote3, tempNote1.shift(Interval.OCTAVE_PERFECT, false), "6/4");
			return new Triad(tempNote2, tempNote3, tempNote1.shift(Interval.OCTAVE_PERFECT, false));
		} else {
			// other transformations ..
		}
		return null;
	}

	public Note[] getNotes() {
		return this.notes;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) { // BASE, 6, or 6/4
		this.position = position;
	}

	@Override
	public String toString() {
		return this.notes[0].toString() + " " + this.notes[1].toString() + " " + this.notes[2].toString() + " ["
				+ this.position + "]";
	}
}
