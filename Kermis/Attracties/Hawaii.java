package Kermis.Attracties;

import Kermis.AttractieMoetGekeurdWordenException;

public class Hawaii extends RisicoRijkeAttractie{

	public Hawaii() {
		naam = "Hawaii";
		prijs = 2.90;
		draailimiet = 10;
	}

	public double getOmzet() {
		return omzet;
	}

	@Override
	public void draaien(){
		try{
			checkLegaalOmTeDraaien();
			draaiCount++;
			super.draaien();
			omzet += prijs;
		}catch (AttractieMoetGekeurdWordenException e){
			System.out.println("De monteur moet komen voordat " + naam + " weer kan draaien.\ntyp (m) om de monteur zijn rondje te laten doen.");
		}
	}
}
