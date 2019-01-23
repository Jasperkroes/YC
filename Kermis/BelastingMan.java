package Kermis;

import Kermis.Attracties.Attractie;
import Kermis.Attracties.GokAttractie;

public class BelastingMan {
	Kermis kermis;
	static double belasting;

	public BelastingMan(Kermis kermisMan) {
		this.kermis = kermisMan;
	}

	public void graaien(){

		double kansSpelOmzet = 0.0;
		for (Attractie ga : kermis.getKassa().getGokAttracties()) {
			kansSpelOmzet += ((GokAttractie ) ga).kansSpelBelastingBetalen();
		}
		belasting = kansSpelOmzet;

	}

}
