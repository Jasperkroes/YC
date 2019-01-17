package Ganzenbord;

import Ganzenbord.Vakjes.EindVakje;
import Ganzenbord.Vakjes.StartVakje;
import Ganzenbord.Vakjes.Vakje;

import java.util.ArrayList;

public class Bord {

	//het begin en het eind tellen hier ook voor mee.
	private static final int AANTAL_VAKJES = 30;

	private ArrayList<Vakje> vakjes = new ArrayList<Vakje>(AANTAL_VAKJES);


	public Bord(){
		//initialize het bord met default vakjes
		for(int i = 0; i < AANTAL_VAKJES; i++) {
			vakjes.add(new Vakje(i));
		}

		//maak een startvakje
		vakjes.set(0, new StartVakje(0));
		//maak een eindvakje
		vakjes.set(AANTAL_VAKJES - 1, new EindVakje(AANTAL_VAKJES - 1));
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Vakje v : vakjes) {
			sb.append(v.toString()+"\n");
		}
		return sb.toString();
	}


}
