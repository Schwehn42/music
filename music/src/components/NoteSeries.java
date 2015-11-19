package components;

import java.util.ArrayList;

public class NoteSeries {
	private ArrayList<NoteSeriesComponent> seriesComponents = new ArrayList<NoteSeriesComponent>();
	private static final ArrayList<NoteSeriesComponent> semiToneSeriesList = buildSemiToneSeries();
	private static final ArrayList<NoteSeriesComponent> fullToneSeriesList = buildFullToneSeries();
	
	//Important
	public static final NoteSeries SEMITONESERIES = new NoteSeries(semiToneSeriesList);
	public static final NoteSeries FULLTONESERIES = new NoteSeries(fullToneSeriesList);
	
//	public static final NoteSeries wholeToneSeries;
	
	public NoteSeries(ArrayList<NoteSeriesComponent> seriesComponents) {
		this.seriesComponents = seriesComponents;
	}
	

	private static ArrayList<NoteSeriesComponent> buildSemiToneSeries() {
		/* Add all Tones from Tone.java to an array list
		 * the index is also added all together in a NoteSeriesComponent
		 */
		ArrayList<NoteSeriesComponent> retSeriesComponents = new ArrayList<NoteSeriesComponent>();
		int i = 1;
		for (Tone tone : Tone.values()) {
			retSeriesComponents.add(new NoteSeriesComponent(tone, i));
			i++;
		}
		return retSeriesComponents;
	}
	
	private static ArrayList<NoteSeriesComponent> buildFullToneSeries() {
		/* Add Tones from Tone.java to an array list
		 * Allowed Tones: C, D, E, F, G, A, H
		 * the index is also added all together in a NoteSeriesComponent
		 */
		ArrayList<NoteSeriesComponent> retSeriesComponents = new ArrayList<NoteSeriesComponent>();
		int i = 1;
		for (Tone tone : Tone.values()) {
			if (tone == Tone.C || tone == Tone.D|| tone == Tone.E || tone == Tone.F 
					|| tone == Tone.G || tone == Tone.A || tone == Tone.H) {
				retSeriesComponents.add(new NoteSeriesComponent(tone, i));
				i++;
			}
		}
		return retSeriesComponents;
	}

	public ArrayList<NoteSeriesComponent> getSeriesComponents() {
		return seriesComponents;
	}
	
}
