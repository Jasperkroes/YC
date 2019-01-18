package Ganzenbord.Vakjes;

import Ganzenbord.Speler;

public class GevangenisVakje extends Vakje {
	private static final int GEVANGENIS_DURATION = 3;

	public GevangenisVakje(int nummer) {
		super(nummer);
	}

	@Override
	public String toString() {
		return super.toString() + "\tGevangenis";
	}

	@Override
	public void actieOpSpeler(Speler speler) {
		speler.setStaatStilVoorBeurten(GEVANGENIS_DURATION);
		System.out.println(speler.getNaam() + " zit in de gevangenis en moet " + GEVANGENIS_DURATION + " beurten wachten.");
	}
}
