package Garage;

public class Personenauto extends Auto {
	private static int totaalGewichtAutos;
	private int aantalZitplaatsen;
	public static final int GEWICHT = 1300;

	Personenauto(String merk, String kenteken, int aantalZitplaatsen) {
		super(merk, kenteken);
		this.setAantalZitplaatsen(aantalZitplaatsen);
	}

	public static int getTotaalGewichtAutos() {
		return totaalGewichtAutos;
	}

	public static void setTotaalGewichtAutos(int totaalGewichtAutos) {
		Personenauto.totaalGewichtAutos = totaalGewichtAutos;
	}

	public int getAantalZitplaatsen() {
		return aantalZitplaatsen;
	}

	public void setAantalZitplaatsen(int aantalZitplaatsen) {
		this.aantalZitplaatsen = aantalZitplaatsen;
	}

	public String toString() {
		return super.toString() + "\nDeze Personenauto heeft " + getAantalZitplaatsen() + " zitplaatsen\n";
	}
}
