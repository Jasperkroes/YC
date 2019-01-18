package Ganzenbord.Vakjes;

import Ganzenbord.Speler;

public class HerbergVakje extends Vakje {

	private static final int HERBERG_NACHTJES_SLAPEN = 1;
	public HerbergVakje(int nummer) {
		super(nummer);
	}

	@Override
	public String toString() {
		return super.toString() + "\tHerberg";
	}

	@Override
	public void actieOpSpeler(Speler speler) {
		speler.setStaatStilVoorBeurten(HERBERG_NACHTJES_SLAPEN);
		System.out.println(speler.getNaam() + " zal " + HERBERG_NACHTJES_SLAPEN + " nachten blijven slapen in de herberg.");
	}
}
