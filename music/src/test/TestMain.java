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
		System.out.println(e + " " + e.shift(Interval.OCTAVE_PERFECT, false));
	}

}
