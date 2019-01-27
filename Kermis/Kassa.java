package Kermis;

import Kermis.Attracties.*;

import java.util.LinkedList;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Kassa {
	private static double belastingBetaald;

	public static double getBelastingBetaald() {
		return belastingBetaald;
	}


	void totaleOmzet() {
		double omzet = 0.0;
		for (Attractie a: Kermis.getAttracties()) {
			omzet += a.getOmzet();
		}

		System.out.println("De gehele kermis heeft een totale omzet van: €" + omzet);
	}

	void kaartjesPerAttractie() {
		for(Attractie a : Kermis.getAttracties()) {
			System.out.println(a + "heeft " + a.kaartjesGekocht() + " kaartjes verkocht.");
		}
	}

	public LinkedList<Attractie> getGokAttracties() {
		LinkedList<Attractie> ll = new LinkedList<>();
		for (Attractie a:Kermis.getAttracties()) {
			if ( a instanceof  GokAttractie) {
				ll.add(a);
			}
		}
		return ll;
	}

	public void setBelastingManIsGewwest(BelastingMan b) {
		belastingBetaald = b.getBelasting();
	}
}
