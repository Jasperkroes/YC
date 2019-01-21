package Kermis.Attracties;

public class Ladderklimmen extends Attractie {
	private static double ladderOmzet;

	public Ladderklimmen() {
		naam = "Ladderklimmen";
		prijs = 5.0;
	}

	public static double getLadderOmzet() {
		return ladderOmzet;
	}

	@Override
	public void draaien(){
		super.draaien();
		ladderOmzet+=prijs;
	}
	@Override
	public int kaartjesGekocht() {
		return (int) (ladderOmzet/prijs);
	}
}
