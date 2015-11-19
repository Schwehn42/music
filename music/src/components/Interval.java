package components;

public class Interval {
	private int step;
	private String type;
	public Interval(int step, String type) {
		this.step = step;
		this.type = type;
	}
	
	public static final Interval UNISON_PERFECT = new Interval(0, "perfect");
	public static final Interval SECOND_MINOR = new Interval(1, "minor");
	public static final Interval SECOND_MAJOR = new Interval(2, "major");
	public static final Interval THIRD_MINOR = new Interval(3, "minor");
	public static final Interval THIRD_MAJOR = new Interval(4, "major");
	public static final Interval FOURTH_PERFECT = new Interval(5, "perfect");
	//6 exists twice
	public static final Interval FOURTH_AUGMENTED = new Interval(6, "augmented");
	public static final Interval FIFTH_DIMISHED = new Interval(6, "dimished");
	public static final Interval FIFTH_PERFECT = new Interval(7, "perfect");
	public static final Interval SIXTH_MINOR = new Interval(8, "minor");
	public static final Interval SIXTH_MAJOR = new Interval(9, "major");
	public static final Interval SEVENTH_MINOR = new Interval(10, "minor");
	public static final Interval SEVENTH_MAJOR = new Interval(11, "major");
	public static final Interval OCTAVE_PERFECT = new Interval(12, "perfect");
	
	public int getStep() {
		return this.step;
	}
	public String getType() {
		return this.type;
	}
}
