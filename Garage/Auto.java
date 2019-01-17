package Garage;

public abstract class Auto {
	private String merk;
	private String kenteken;

	Auto(String merk, String kenteken) {
		this.setMerk(merk);
		this.setKenteken(kenteken);
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getKenteken() {
		return kenteken;
	}

	public void setKenteken(String kenteken) {
		this.kenteken = kenteken;
	}

	public String toString() {
		return "Er staat een auto met het merk " + this.getMerk() + " en het kenteken " + this.getKenteken() + " binnen.";
	}
}
