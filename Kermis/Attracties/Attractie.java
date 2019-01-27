package Kermis.Attracties;

public abstract class Attractie {
	String naam;
	double prijs, omzet;
	int oppervlakte;


	public void draaien() {
		System.out.println("De attractie "+naam+" draait!!");
	}

	@Override
	public String toString(){
		return "De attractie " + naam + " ";
	}

	public double getOmzet() {
		return omzet;
	}

	public int kaartjesGekocht() {
		return (int) Math.round(omzet/prijs);
	}
}
