package test;

import components.Interval;
import components.Mode;
import components.Note;
import components.Tone;
import transformations.Triad;

public class TestMain {

	public static void main(String[] args) {
//		Note a = new Note(Tone.A, Mode.MAJOR); //Major A
//		System.out.println(a);
//		
//		Note shift1 = a.shift(Interval.SECOND_MINOR, false);
//		System.out.println(shift1);
//		
//		//---
//		
//		
		Note e = new Note(Tone.E, Mode.MINOR); //Minor E
//		System.out.println(e + " " + e.shift(Interval.OCTAVE_PERFECT, false));
		
		Triad t1 = new Triad(e, Mode.MAJOR);
		Triad t2 = t1.transform("6", true);
		Triad t3 = t2.transform("6/4", true);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
