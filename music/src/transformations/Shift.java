package transformations;

import components.Interval;
import components.Note;

public interface Shift {
	/*
	 * Shift a note by a certain interval up or down
	 */

	public Note shift(Interval interval, boolean shiftDown);
	
}
