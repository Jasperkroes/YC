package Kermis.Attracties;

import Kermis.AttractieMoetGekeurdWordenException;

public class Spin extends RisicoRijkeAttractie implements GokAttractie{

	public Spin() {
		naam = "Spin";
		prijs = 2.25;
		draailimiet = 5;
	}

	@Override
	public void draaien() {
		try {
			checkLegaalOmTeDraaien();
			draaiCount++;
			super.draaien();
			omzet += prijs;
		} catch (AttractieMoetGekeurdWordenException e) {
			System.out.println("De monteur moet komen voordat " + naam + " weer kan draaien.\ntyp (m) om de monteur zijnn rondje te laten doen.");
		}
	}

	@Override
	public double kansSpelBelastingBetalen() {
		return omzet*.3;
	}
}
