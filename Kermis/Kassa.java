package Kermis;

import Kermis.Attracties.*;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Kassa {
	private static double totaalBelastBedrag;
	private static double belastingBetaald;


	void totaleOmzet() {
		double omzet = Spin.getSpinOmzet() +
		Botsauto.getBotsautoOmzet() +
		Spiegelpaleis.getSpiegelpaleisOmzet() +
		Spookhuis.getSpookhuisOmzet() +
		Hawaii.getHawaiiOmzet() +
		Ladderklimmen.getLadderOmzet() -
		belastingBetaald;

		System.out.println("De gehele kermis heeft een totale omzet van: " + omzet);
	}

	void kaartjesPerAttractie() {
		for(Attractie a : Kermis.getAttracties()) {
			System.out.println(a + "heeft " + a.kaartjesGekocht() + " kaartjes verkocht.");
		}
	}
}
