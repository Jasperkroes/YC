package Ganzenbord.Vakjes;

public class Vakje {
	private int vakNummer;

	Vakje(int nummer) {
		this.vakNummer = nummer;
	}

	Vakje() {

	}

	public int getVakNummer() {
		return vakNummer;
	}

	public void setVakNummer(int vakNummer) {
		this.vakNummer = vakNummer;
	}
}
