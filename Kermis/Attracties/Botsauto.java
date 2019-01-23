package Kermis.Attracties;

public class Botsauto extends Attractie {

	public Botsauto(){
		naam = "Botsautos";
		prijs = 2.50;
	}

	@Override
	public void draaien() {
		super.draaien();
		omzet+=prijs;
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (omzet/prijs);
	}
}
