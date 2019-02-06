package KlasOpdrachten;

import static KlasOpdrachten.Stuknaam.Pion;

public class DogPaard extends Schaakstuk{
	public DogPaard(Kleur kleur) {
		super(Pion, kleur);
	}

	@Override
	void stap() {
		System.out.println("De kaas dogpaard laat deze instantie een lekker stappie vooruit zetten." );
	}
}
