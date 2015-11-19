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
//		int i = 1;
//		for (Tone tone : Tone.values()) {
//			retSeriesComponents.add(new NoteSeriesComponent(tone, i));
//			i++;
//		}
		retSeriesComponents.add(new NoteSeriesComponent(Tone.C, 1));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Cis, 2));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Des, 2));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.D, 3));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Dis, 4));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Es, 4));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.E, 5));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.F, 6));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Fis, 7));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Ges, 7));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.G, 8));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Gis, 9));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Ases, 9));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.A, 10));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.Ais, 11));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.B, 11));
		retSeriesComponents.add(new NoteSeriesComponent(Tone.H, 12));
		
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
	
	public NoteSeriesComponent getASeriesComponentByIndex(int index) {
		/*
		 * returns the component which has the given index
		 * for components with the same index, e.g. Fis and Ges with 7, it'll return the one
		 * it finds first (Fis)
		 * TODO maybe change so it return the right note with same index intelligently?
		 */
		for (NoteSeriesComponent nsc : this.getSeriesComponents()) {
			if (nsc.getIndex() == index)
				return nsc;
		}
		return null;
	}
	
}
