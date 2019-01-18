package Ganzenbord;

import Ganzenbord.Vakjes.Vakje;

public class Speler {
	public static Bord speelveld;
	private String naam;
	private int staatStilVoorBeurten, staatOpVakje;
	private boolean inDePut;
	private boolean isGefinisht;

	Speler(String spelerNaam) {
		this.setNaam(spelerNaam);
	}

	public static void setSpeelveld(Bord speelveld) {
		Speler.speelveld = speelveld;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString(){
		return this.getNaam();
	}

	public boolean moetWachten() {
		if (staatStilVoorBeurten > 0) {

			staatStilVoorBeurten--;
			if (staatStilVoorBeurten == 0) {
				System.out.println(getNaam() + " mag volgende beurt weer lopen.");
			} else {
				System.out.println(getNaam() + " moet nog " + staatStilVoorBeurten + " beurten overslaan.");
			}
			return true;
		} else
		return isInDePut();
	}

	public boolean isInDePut() {
		return inDePut;
	}

	public void setInDePut(boolean inDePut) {
		this.inDePut = inDePut;
	}

	public void loopNaar(int worp) {
		staatOpVakje += worp;
		Vakje volgendVakje;
		//true iff de speler voorbij finish loopt
		if(Bord.AANTAL_VAKJES <= staatOpVakje) {
//			loopTerug(staatOpVakje);
			setGefinisht(true);
			staatOpVakje = Bord.AANTAL_VAKJES - 1;
			return;
		}
		volgendVakje = speelveld.vakjes.get(staatOpVakje);
		volgendVakje.actieOpSpeler(this);
	}


	/**
	 * Pas de staatOpVakje aan naar een legale positie
	 * @param positie
	 */
	private void loopTerug(int positie) {

	}

	public void setGefinisht(boolean gefinishet) {
		isGefinisht = gefinishet;
	}

	public boolean isGefinisht() {
		return isGefinisht;
	}

	public void setStaatOpVakje(int dest){
		this.staatOpVakje = dest;
	}

	public void setStaatStilVoorBeurten(int beurtenWachten) {
		if (staatStilVoorBeurten == 0) {
			this.staatStilVoorBeurten = beurtenWachten;
		}
	}
}
