package Kermis.Attracties;

public class Hawaii extends RisicoRijkeAttractie{
	private static double hawaiiOmzet;

	public Hawaii() {
		naam = "Hawaii";
		prijs = 2.90;
		draailimiet = 10;
	}

	public static double getHawaiiOmzet() {
		return hawaiiOmzet;
	}

	@Override
	public void draaien(){
		if(draaiCount<draailimiet) {
			draaiCount++;
			super.draaien();
			hawaiiOmzet += prijs;
		} else {
			System.out.println("De monteur moet komen voordat " + naam + " weer kan draaien.\ntyp (m) om de monteur zijnn rondje te laten doen.");
		}
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (hawaiiOmzet/prijs);
	}
}
