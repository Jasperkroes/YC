package Ganzenbord.Vakjes;

import Ganzenbord.Speler;

public class PutVakje extends Vakje {
	private static Speler sp;

	public PutVakje(int nummer) {
		super(nummer);
	}

	@Override
	public String toString() {
		return super.toString() + "\tPut";
	}
}
