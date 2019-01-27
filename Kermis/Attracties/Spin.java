package Kermis.Attracties;

public class Spin extends RisicoRijkeAttractie implements GokAttractie{

	public Spin() {
		naam = "Spin";
		prijs = 2.25;
		draailimiet = 5;
	}

	@Override
	public void draaien() {
		if(draaiCount<draailimiet) {
			draaiCount++;
			super.draaien();
			omzet += prijs;
		} else {
			System.out.println("De monteur moet komen voordat " + naam + " weer kan draaien.\ntyp (m) om de monteur zijnn rondje te laten doen.");
		}
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (omzet/prijs);
	}

	@Override
	public double kansSpelBelastingBetalen() {
		return omzet*.3;
	}
}
