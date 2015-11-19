package components;

public class NoteSeriesComponent {
	private Tone tone;
	private int index;
	
	public NoteSeriesComponent(Tone tone, int index) {
		this.tone = tone;
		this.index = index;
	}

	public Tone getTone() {
		return tone;
	}

	public int getIndex() {
		return index;
	}
	
	
}
