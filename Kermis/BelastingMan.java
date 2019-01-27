package Kermis;

import Kermis.Attracties.Attractie;
import Kermis.Attracties.GokAttractie;

public class BelastingMan {
	Kermis kermis;
	Kassa kassa;
	private static double belasting;

	public BelastingMan(Kermis kermisMan) {
		this.kermis = kermisMan;
		this.kassa = kermis.getKassa();
	}

	public void graaien(){

		double kansSpelOmzet = 0.0;
		for (Attractie ga : kassa.getGokAttracties()) {
			kansSpelOmzet += ((GokAttractie ) ga).kansSpelBelastingBetalen();
		}
		belasting = kansSpelOmzet;
		kassa.setBelastingManIsGewwest(this);

	}

	public static double getBelasting() {
		return belasting;
	}
}
