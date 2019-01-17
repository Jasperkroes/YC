package Garage;

public class Vrachtauto extends Auto {
	private static int totaalGewichtVrachtautos;
	private boolean heeftLaadruimte;
	public static final int GEWICHT = 2500;

	Vrachtauto(String merk, String kenteken, boolean heeftLaadruimte) {
		super(merk, kenteken);
		this.setHeeftLaadruimte(heeftLaadruimte);
	}

	public static int getTotaalGewichtVrachtautos() {
		return totaalGewichtVrachtautos;
	}

	public static void setTotaalGewichtVrachtautos(int totaalGewichtVrachtautos) {
		Vrachtauto.totaalGewichtVrachtautos = totaalGewichtVrachtautos;
	}

	public boolean isHeeftLaadruimte() {
		return heeftLaadruimte;
	}

	public void setHeeftLaadruimte(boolean heeftLaadruimte) {
		this.heeftLaadruimte = heeftLaadruimte;
	}

	public String toString() {
		if (isHeeftLaadruimte()) {
			return super.toString() + "\nDeze vrachtwagen heeft wel een laadruimte.\n";
		} else {
			return super.toString() + "\nDeze vrachtwagen heeft geen laadruimte.\n";
		}
	}
}
