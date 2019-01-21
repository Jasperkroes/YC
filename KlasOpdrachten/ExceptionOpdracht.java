package KlasOpdrachten;

public class ExceptionOpdracht {

	public static void main(String... args) {
		HonderdMeterAtletiekWedstrijd hmw = new HonderdMeterAtletiekWedstrijd();
		VijftienhonderdMeterSchaatsWedstrijd vmw = new VijftienhonderdMeterSchaatsWedstrijd();
		hmw.af();
		hmw.af();
		hmw.af();
		vmw.af();
		vmw.af();
	}
}

class ValseStartException extends Exception {

}

class BuitenJeBaanException extends RuntimeException {

}

class HonderdMeterAtletiekWedstrijd{
	int aantalAtleten = 8;
	Starter starter = new Starter();

	void af() {
		try {
			starter.losHetStartschot();
		}catch(ValseStartException e) {
			System.out.println("Knal...Knal. Baan "+aantalAtleten+" valse start.");
			aantalAtleten--;
			herstart();
		}
	}

	void herstart() {

	}


}

class VijftienhonderdMeterSchaatsWedstrijd{
	int aantalAtleten = 2;
	boolean tweedestart;
	Starter starter = new Starter();

	void af() {
		try{
			starter.losHetStartschot();
		}catch(ValseStartException e) {
			if(!tweedestart) {
				System.out.println("Knal, Knal");
				tweedestart = true;
				herstart();
			} else {
				System.out.println("Knal, Knal. Binnenbaan wordt gediskwalificeerd");
				aantalAtleten--;
				herstart();
			}
		}
	}

	void herstart(){

	}
}

class Starter {
	void losHetStartschot() throws ValseStartException{
		boolean iemandTeVroegWeg = true;
		if(iemandTeVroegWeg) {
			throw new ValseStartException();
		}
	}
}
