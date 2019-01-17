package Ganzenbord;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GanzenBord{

	private LinkedList<Speler> spelers = new LinkedList<>();
	private static final int MAX_SPELERS = 8;
	private Bord bord;
	private static Random rand = new Random();

	public static void main(String[] args){
		new GanzenBord().play();
	}

	private void play(){
		//Vraag hoeveel spelers er meedoen
		initSpelers();

		//Laat alle spelers zien
		showPlayers();

		bord = new Bord();

		System.out.println(bord.toString());
	}

	private void showPlayers() {
		for(Speler s : spelers) {
			System.out.println(s.toString());
		}
	}

	private void initSpelers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoeveel spelers doen er mee (max "+MAX_SPELERS+")");
		int noOfSpelers = 0;
		if(sc.hasNextInt()) {
			noOfSpelers = sc.nextInt();
			sc.close();
		} else {
			System.out.println("Voer een getal in");
			sc.close();
			initSpelers();
		}
		if(noOfSpelers > 0) {
			for(int i = 0; i < Math.min(MAX_SPELERS, noOfSpelers); i++) {
				spelers.add(new Speler("Speler "+(i+1)));
			}
		}
	}

	private static int werp(){
		return rand.nextInt(6)+1;
	}

}
