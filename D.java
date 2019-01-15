class D{

	public static void main(String[] args){
		Persoon persoona = new Persoon("man","Jasper");
		System.out.println("Persoon a heet: " + persoona.getNaam());
		Persoon persoonb = new Persoon("man","Peter");
		System.out.println("Persoon b heet " + persoonb.getNaam() + " en is een " + persoonb.getGeslacht());

	}

}

class Persoon{
	private String geslacht;
	private String naam;

	Persoon(String ges, String n){
		geslacht = ges;
		naam = n;
	}

	String getNaam() {
		return this.naam;
	}

	String getGeslacht() {
		return this.geslacht;
	}

}
