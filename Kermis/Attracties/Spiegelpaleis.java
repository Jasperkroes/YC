package Kermis.Attracties;

public class Spiegelpaleis extends Attractie {
	private static double spiegelpaleisOmzet;

	public Spiegelpaleis(){
		naam = "Spiegelpaleis";
		prijs = 2.75;
	}

	public static double getSpiegelpaleisOmzet() {
		return spiegelpaleisOmzet;
	}

	@Override
	public void draaien() {
		super.draaien();
		spiegelpaleisOmzet+=prijs;
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (spiegelpaleisOmzet/prijs);
	}
}
