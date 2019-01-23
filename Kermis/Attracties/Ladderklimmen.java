package Kermis.Attracties;

import Kermis.Kassa;
import Kermis.Kermis;

public class Ladderklimmen extends Attractie implements GokAttractie {
	public Ladderklimmen() {
		naam = "Ladderklimmen";
		prijs = 5.0;
	}

	@Override
	public void draaien(){
		super.draaien();
		omzet+=prijs;
	}
	@Override
	public int kaartjesGekocht() {
		return (int) (omzet/prijs);
	}

	@Override
	public double kansSpelBelastingBetalen() {
		return omzet * .3;
	}
}
