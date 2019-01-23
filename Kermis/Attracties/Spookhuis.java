package Kermis.Attracties;

public class Spookhuis extends Attractie {

	public Spookhuis(){
		naam = "Spookhuis";
		prijs = 3.20;
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
