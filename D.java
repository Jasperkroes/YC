class D{

	/**
	* Je mag alleen fris drinken als je jonger bent dan 16.
	* Je mag alleen fris + bier drinken als je jonger bent dan 18.
	* J emag alles drinken als je 18 of ouder bent.
	*/
	public static void main(String[] args){
		System.out.println("Joe");
		int age = 23;
		if(age < 16){
			System.out.println("je alleen fris drinken");			
		} else if (age < 18){
			System.out.println("je mag alleen bier en fris drinken");
		} else {
			System.out.println("je mag alles drinken");
		}
	}

}