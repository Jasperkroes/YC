package Kermis;

import Kermis.Attracties.*;

public class Kassa {
	private static double totaalBelastBedrag;

	void totaleOmzet() {
		double omzet = Spin.getSpinOmzet() +
		Botsauto.getBotsautoOmzet() +
		Spiegelpaleis.getSpiegelpaleisOmzet() +
		Spookhuis.getSpookhuisOmzet() +
		Hawaii.getHawaiiOmzet() +
		Ladderklimmen.getLadderOmzet();

		System.out.println(omzet);
	}
}
