package Kermis.Attracties;

public class Spookhuis extends Attractie {
	private static double spookhuisOmzet;

	public Spookhuis(){
		naam = "Spookhuis";
		prijs = 3.20;
	}

	public static double getSpookhuisOmzet() {
		return spookhuisOmzet;
	}

	@Override
	public void draaien() {
		super.draaien();
		spookhuisOmzet+=prijs;
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (spookhuisOmzet/prijs);
	}
}
