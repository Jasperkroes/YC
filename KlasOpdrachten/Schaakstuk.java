package KlasOpdrachten;


public abstract class Schaakstuk {
	Stuknaam stuk;
	Kleur kleur;

	public Schaakstuk(Stuknaam stuk, Kleur kleur) {
		this.stuk = stuk;
		this.kleur = kleur;
	}

	abstract void stap();

	@Override
	public String toString() {
		return this.kleur + " " + this.stuk;
	}

	public static void main(String[] args) {
		new DogPaard(Kleur.Zwart).stap();
		int a = 0____________________________0;
		System.out.println(a);
	}
}

enum Kleur {
	Wit,
	Zwart;
}

enum Stuknaam {
	Koning,
	Koningin,
	Toren,
	Paard,
	Loper,
	Pion;
}
