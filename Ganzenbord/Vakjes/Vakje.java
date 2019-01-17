package Ganzenbord.Vakjes;

public class Vakje {
	int vaknummer;

	public Vakje(int nummer){
		this.vaknummer = nummer;
	}

	@Override
	public String toString() {
		return "("+vaknummer+")";
	}
}
