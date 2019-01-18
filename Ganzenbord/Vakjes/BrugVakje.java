package Ganzenbord.Vakjes;

import Ganzenbord.Speler;

public class BrugVakje extends Vakje{
	int brugDestination;

	public BrugVakje(int nummer, int brugNaar) {
		super(nummer);
		this.brugDestination = brugNaar;
	}

	@Override
	public String toString() {
		if(brugDestination == 0) {
			return super.toString() + "\tDood (ga terug naar start)";
		}
		if(this.brugDestination < this.vaknummer) {
			return super.toString() + "\tDoolhof (ga naar " + brugDestination + ")";
		}
		return super.toString() + "\tBrug (ga naar " + brugDestination + ")";
	}

	@Override
	public void actieOpSpeler(Speler sp) {
		sp.setStaatOpVakje(brugDestination);
		System.out.println("Lekker over dat bruggetje naar "+brugDestination+" lopen");
	}
}
