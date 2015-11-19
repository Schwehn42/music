package test;

import components.Interval;
import components.Mode;
import components.Note;
import components.Tone;
import transformations.Triad;

public class TestMain {

	public static void main(String[] args) {
		Note a = new Note(Tone.A, Mode.MAJOR); //Major A
		System.out.println(a);
		
		Note shift1 = a.shift(Interval.SECOND_MINOR, false);
		System.out.println(shift1);
		
		//---
		
		
		Note e = new Note(Tone.E, Mode.MINOR); //Minor E
		System.out.println(e);
		
		Note shift2 = e.shift(Interval.SECOND_MINOR, false);
		System.out.println(shift2);
		
		
		System.out.println(new Note(Tone.H, Mode.MAJOR).shift(Interval.SECOND_MINOR, false));
		
		System.out.println(new Note(Tone.D, Mode.MAJOR).shift(Interval.SIXTH_MAJOR, true));
		System.out.println(new Note(Tone.B, Mode.MAJOR).shift(Interval.THIRD_MAJOR, true));
		
		Triad t1 = new Triad(a, Mode.MAJOR);
		System.out.println(t1);
		
		Triad t2 = new Triad(e, Mode.MINOR);
		System.out.println(t2);
	}

}
