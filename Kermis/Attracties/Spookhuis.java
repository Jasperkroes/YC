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
}
