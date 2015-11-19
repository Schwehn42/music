package test;

import components.Mode;
import components.Note;
import components.Tone;
import components.NoteSeries;

public class TestMain {

	public static void main(String[] args) {
		Note a = new Note(Tone.A, Mode.MAJOR); //Major A
		System.out.println(a);
		
		for (int i = 0; i < NoteSeries.FULLTONESERIES.getSeriesComponents().size(); i++) {
			System.out.println(NoteSeries.FULLTONESERIES.getSeriesComponents().get(i).getTone());
		}
		
	}

}
