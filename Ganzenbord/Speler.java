package Ganzenbord;

public class Speler {
	private String naam;

	Speler(String spelerNaam) {
		this.setNaam(spelerNaam);
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
}
