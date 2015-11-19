package components;

public enum Mode {
	MAJOR, MINOR;
	
	@Override
	public String toString() {
		switch(this) {
		case MAJOR: return "major";
		case MINOR: return "minor";
		default: throw new IllegalArgumentException();
		}
	}
}
