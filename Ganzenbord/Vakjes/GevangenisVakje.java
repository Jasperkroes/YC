package Ganzenbord.Vakjes;

public class GevangenisVakje extends Vakje {
	public GevangenisVakje(int nummer) {
		super(nummer);
	}

	@Override
	public String toString() {
		return super.toString() + "\tGevangenis";
	}
}
