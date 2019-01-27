package Kermis.Attracties;

import Kermis.AttractieMoetGekeurdWordenException;

public abstract class RisicoRijkeAttractie extends Attractie{
	int draailimiet;
	int draaiCount;

	public void opstellingsKeuring() {
		System.out.println("De monteur heeft " + naam + " weer helemaal op en top gemaakt.");
		draaiCount = 0;
	}

	public void checkLegaalOmTeDraaien() throws AttractieMoetGekeurdWordenException {
		if (draaiCount >= draailimiet) {
			throw new AttractieMoetGekeurdWordenException();
		}
	}
}
