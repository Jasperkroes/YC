package Garage;

import java.util.LinkedList;
import java.util.Random;

public class Garage {
	private static final int MAX_GEWICHT = 500000;
	LinkedList<Auto> autos = new LinkedList<>();
	Random rand = new Random();

	public static void main(String[] args){
		new Garage().run();
	}

	void run(){
		System.out.println("De deuren zijn geopend");
		while (currentGewicht() < MAX_GEWICHT - Math.max(Vrachtauto.GEWICHT, Personenauto.GEWICHT)) {
			if (rand.nextInt(2) == 0){
				maakVrachtwagen();
			} else {
				maakPersonenauto();
			}
		}
		int noOfVrachtwagens = Vrachtauto.getTotaalGewichtVrachtautos()/Vrachtauto.GEWICHT;
		int noOfPersonenautos = Personenauto.getTotaalGewichtAutos()/Personenauto.GEWICHT;

		for(Auto a : autos) {
			System.out.println(a.toString());
		}

		System.out.println("Er zijn " + noOfVrachtwagens + " vrachtwagens binnen met een totaal gewicht van: " + Vrachtauto.getTotaalGewichtVrachtautos());
		System.out.println("Er zijn " + noOfPersonenautos + " Personenautos binnen met een totaal gewicht van: " + Personenauto.getTotaalGewichtAutos());
		System.out.println("Het totale gewicht in fe garage is: " + currentGewicht());
	}

	private void maakPersonenauto() {
		String kenteken = randomKenteken();
		autos.add(new Personenauto("Opel", kenteken, rand.nextInt(8) + 1));
		Personenauto.setTotaalGewichtAutos(Personenauto.getTotaalGewichtAutos() + Personenauto.GEWICHT);
	}

	private String randomKenteken() {

		return "BB-BB-11";
	}

	private void maakVrachtwagen() {
		autos.add(new Vrachtauto("Generic_merk", "AA-12-34", true));
		Vrachtauto.setTotaalGewichtVrachtautos(Vrachtauto.getTotaalGewichtVrachtautos()+Vrachtauto.GEWICHT);
	}

	int currentGewicht() {
		return Vrachtauto.getTotaalGewichtVrachtautos() + Personenauto.getTotaalGewichtAutos();
	}
}
