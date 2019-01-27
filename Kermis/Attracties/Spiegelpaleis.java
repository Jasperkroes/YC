package Kermis.Attracties;

public class Spiegelpaleis extends Attractie {

	public Spiegelpaleis(){
		naam = "Spiegelpaleis";
		prijs = 2.75;
	}

	@Override
	public void draaien() {
		super.draaien();
		omzet+=prijs;
	}
}
