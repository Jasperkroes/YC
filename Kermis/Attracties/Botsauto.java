package Kermis.Attracties;

public class Botsauto extends Attractie {
	private static double botsautoOmzet;

	public Botsauto(){
		naam = "Botsautos";
		prijs = 2.50;
	}

	public static double getBotsautoOmzet() {
		return botsautoOmzet;
	}

	@Override
	public void draaien() {
		super.draaien();
		botsautoOmzet+=prijs;
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (botsautoOmzet/prijs);
	}
}
