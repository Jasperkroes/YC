package Kermis.Attracties;

public class Spin extends Attractie {
	private static double spinOmzet;

	public Spin() {
		naam = "Spin";
		prijs = 2.25;
	}

	public static double getSpinOmzet() {
		return spinOmzet;
	}

	@Override
	public void draaien() {
		super.draaien();
		spinOmzet+=prijs;
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (spinOmzet/prijs);
	}
}
