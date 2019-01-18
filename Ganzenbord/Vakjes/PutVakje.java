package Ganzenbord.Vakjes;

import Ganzenbord.Speler;

public class PutVakje extends Vakje {
	private static Speler sp = new Speler("putgans");

	public PutVakje(int nummer) {
		super(nummer);
	}

	@Override
	public String toString() {
		return super.toString() + "\tPut";
	}

	@Override
	public void actieOpSpeler(Speler speler) {
		if (!speler.getNaam().equals(sp.getNaam())) {
			sp.setInDePut(false);
			if (!sp.getNaam().equals("putgans")) {
				System.out.println(sp.getNaam() + " is uit de put geklommen door " + speler.getNaam() + " de put in te trekken.");
			}

			sp = speler;
			speler.setInDePut(true);
			System.out.println(speler.getNaam() + " is in de put gevallen.");
		}
	}
}
