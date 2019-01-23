package Kermis.Attracties;

public class Hawaii extends RisicoRijkeAttractie{

	public Hawaii() {
		naam = "Hawaii";
		prijs = 2.90;
		draailimiet = 10;
	}

	public double getOmzet() {
		return omzet;
	}

	@Override
	public void draaien(){
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
}
