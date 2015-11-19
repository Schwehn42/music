package test;

import components.Interval;
import components.Mode;
import components.Note;
import components.Tone;

public class TestMain {

	public static void main(String[] args) {
		Note a = new Note(Tone.A, Mode.MAJOR); //Major A
		System.out.println(a);
		
		Note shift1 = a.shift(Interval.SECOND_MINOR, false);
		System.out.println(shift1);
		
		//---
		
		
		Note e = new Note(Tone.E, Mode.MAJOR); //Major E
		System.out.println(e);
		
		Note shift2 = e.shift(Interval.SECOND_MINOR, false);
		System.out.println(shift2);
		
		
		System.out.println(new Note(Tone.Cis, Mode.MAJOR).shift(Interval.FIFTH_PERFECT, false));
	}

}
