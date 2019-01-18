package Ganzenbord;

import Ganzenbord.Vakjes.*;

import java.util.ArrayList;

public class Bord {

	//het begin en het eind tellen hier ook voor mee.
	public static final int AANTAL_VAKJES = 64;

	public ArrayList<Vakje> vakjes = new ArrayList<Vakje>(AANTAL_VAKJES);


	public Bord(){
		//initialize het bord met default vakjes
		for(int i = 0; i < AANTAL_VAKJES; i++) {
			vakjes.add(new Vakje(i));
		}

		//maak een startvakje (0)
		vakjes.set(0, new StartVakje(0));

		//maak een eindvakje (64)
		vakjes.set(AANTAL_VAKJES - 1, new EindVakje(AANTAL_VAKJES - 1));

		//maak bruggen
		//brug (6) - van 6 naar 12
		vakjes.set(6, new BrugVakje(6,12));
		//doolhof (42) - van 42 naar 39
		vakjes.set(42, new BrugVakje(42, 39));
		//dood (58) - van 58 naar start
		vakjes.set(58, new BrugVakje(58, 0));

		//maak put (31)
		vakjes.set(31, new PutVakje(31));

		//maak herberg (19)
		vakjes.set(19, new HerbergVakje(19));

		//maak gevangenis (52)
		vakjes.set(52, new GevangenisVakje(52));

	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Vakje v : vakjes) {
			sb.append(v.toString()).append("\n");
		}
		return sb.toString();
	}


}
