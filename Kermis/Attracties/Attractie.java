package Kermis.Attracties;

public abstract class Attractie {
	String naam;
	double prijs;
	int oppervlakte;

	public void draaien() {
		System.out.println("De attractie "+naam+" draait!!");
	}

	@Override
	public String toString(){
		return "De attractie " + naam + " ";
	}

	public abstract int kaartjesGekocht();
}
