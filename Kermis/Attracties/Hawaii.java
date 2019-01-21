package Kermis.Attracties;

public class Hawaii extends RisicoRijkeAttractie{
	private static double hawaiiOmzet;

	public Hawaii() {
		naam = "Hawaii";
		prijs = 2.90;
	}

	public static double getHawaiiOmzet() {
		return hawaiiOmzet;
	}

	@Override
	public void draaien(){
		super.draaien();
		hawaiiOmzet+=prijs;
	}

	@Override
	public int kaartjesGekocht() {
		return (int) (hawaiiOmzet/prijs);
	}
}
