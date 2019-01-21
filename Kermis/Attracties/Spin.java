package Kermis.Attracties;

public class Spin extends RisicoRijkeAttractie {
	private static double spinOmzet;

	public Spin() {
		naam = "Spin";
		prijs = 2.25;
		draailimiet = 5;
	}

	public static double getSpinOmzet() {
		return spinOmzet;
	}

	@Override
	public void draaien() {
		if(draaiCount<draailimiet) {
			draaiCount++;
			super.draaien();
			spinOmzet += prijs;
		} else {
			System.out.println("De monteur moet komen voordat " + naam + " weer kan draaien.\ntyp (m) om de monteur zijnn rondje te laten doen.");
		}
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (spinOmzet/prijs);
	}
}
