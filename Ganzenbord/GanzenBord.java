package Ganzenbord;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GanzenBord{

	private LinkedList<Speler> spelers = new LinkedList<>();
	private static final int MAX_SPELERS = 8;
	private Bord bord;
	private static Random rand = new Random();
	private boolean gefinisht;
	private int currentPlayerIndex = 0;

	public static void main(String[] args){
		new GanzenBord().play();
	}

	private void play(){
		//Vraag hoeveel spelers er meedoen
		initSpelers();

		//Laat alle spelers zien
		showPlayers();

		//Maak een bord
		bord = new Bord();

		//geef aan alle spelers door op welk bord ze spelen
		Speler.setSpeelveld(bord);

		//Laat het bord zien
		System.out.println(bord.toString());

		//start het spel met de eerste speler.
		beginnenMaar();

		//kijk wie de ultieme gans is
		showWinnaar();
	}

	private void showWinnaar() {
		for (Speler sp : spelers) {
			if(sp.isGefinisht()) {
				System.out.println("\n" +
					"\n" +
					"                                                        _...--.\n" +
					"                                        _____......----'     .'\n" +
					"                                  _..-''                   .'\n" +
					"                                .'                       ./\n" +
					"                        _.--._.'                       .' |\n" +
					"                     .-'          "+sp.getNaam()+"          .-.'  /\n" +
					"                   .'   _.-.                     .  \\   '\n" +
					"                 .'  .'   .'    _    .-.        / `./  :\n" +
					"               .'  .'   .'  .--' `.  |  \\  |`. |     .'\n" +
					"            _.'  .'   .' `.'       `-'   \\ / |.'   .'\n" +
					"         _.'  .-'   .'     `-.            `      .'\n" +
					"       .'   .'    .'          `-.._ _ _ _ .-.    :\n" +
					"      /    /o _.-'               .--'   .'   \\   |\n" +
					"    .'-.__..-'                  /..    .`    / .'\n" +
					"  .'   . '                       /.'/.'     /  |\n" +
					" `---'                                   _.'   '\n" +
					"                                       /.'    .'\n" +
					"                                        /.'/.'\n" +
					"Dit is de Ultieme gans!!!"
				);
			}
		}
	}

	private void beginnenMaar() {
		currentPlayerIndex = 0;
		Speler speler;
		while(!gefinisht) {
			//pak de volgende speler
			speler = spelers.get(currentPlayerIndex);
			//kijk of de speler mag werpen
			if(!speler.moetWachten()) {
				//TODO: zorg ervoor dat mensen input moeten geven voordat er gegooid wordt
				//zet de speler op een nieuwe positie
				speler.loopNaar(werp());

				//kijk of de speler gefinisht is
				gefinisht = speler.isGefinisht();
			}
			//verander de currentPlayerIndex naar de volgende speler
			currentPlayerIndex = (currentPlayerIndex + 1) % spelers.size();
		}

	}

	private void showPlayers() {
		for(Speler s : spelers) {
			System.out.println(s.toString());
		}
	}

	private void initSpelers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoeveel spelers doen er mee? (max "+MAX_SPELERS+")");
		int noOfSpelers = 0;
		if(sc.hasNextInt()) {
			noOfSpelers = sc.nextInt();
			//sc.close();
		} else if(sc.hasNext()){
			System.out.println("Voer een getal in.");
		}
		if(noOfSpelers > 0) {
			for(int i = 0; i < Math.min(MAX_SPELERS, noOfSpelers); i++) {
				spelers.add(new Speler("Speler "+(i+1)));
			}
		} else {
			System.out.println("Voer een getal groter dan 0 in.");
		}
	}

	private int werp(){
		System.out.println("Typ g om te gooien "+ spelers.get(currentPlayerIndex).getNaam()+".");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			String s = sc.next();
			if(s.equals("g")) {
				return rand.nextInt(6)+1;
			} else {
				System.out.println("voer een \"g\" in om te gooien");
			}
		}
		return werp();
	}

}
