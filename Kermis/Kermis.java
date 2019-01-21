package Kermis;

import Kermis.Attracties.*;

import java.util.LinkedList;
import java.util.Scanner;

public class Kermis {
	private static LinkedList<Attractie> attracties = new LinkedList<>();
	private Kassa kassa = new Kassa();

	public static void main(String args[]) {
		new Kermis().run();
	}

	private void run() {
		initAttracties();
		showAttracties();
		laatMaarDraaienDieEneAttractie();
	}

	private void initAttracties() {
		attracties.add(new Botsauto());
		attracties.add(new Spin());
		attracties.add(new Spiegelpaleis());
		attracties.add(new Spookhuis());
		attracties.add(new Hawaii());
		attracties.add(new Ladderklimmen());
	}

	private void showAttracties() {

		String sb = "Kies een attractie om te laten draaien:\n" +
			"(1) Botsautos\n" +
			"(2) Spin\n" +
			"(3) Spiegelpaleis\n" +
			"(4) Spookhuis\n" +
			"(5) Hawaii\n" +
			"(6) Ladderklimmen\n" +
			"typ (k) om het aantal kaartjes te showen\n" +
			"typ (o) om de totale omzet te tonen";

		System.out.println(sb);

	}

	private void laatMaarDraaienDieEneAttractie() {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			if(sc.hasNextInt()) {
				int keuze = sc.nextInt();
				if (keuze <= attracties.size() && keuze > 0) {
					attracties.get(keuze - 1).draaien();
				} else {
					System.out.println("Geef een getal tussen de 1 en 6 op om een attractie te selecteren.");
					laatMaarDraaienDieEneAttractie();
				}
			} else {
				String keuze = sc.next();
				if (keuze.equals("k")) {
					kassa.kaartjesPerAttractie();
				} else if (keuze.equals("o")) {
					kassa.totaleOmzet();
				} else {
					laatMaarDraaienDieEneAttractie();
				}
			}
		}
	}

	public static LinkedList<Attractie> getAttracties() {
		return attracties;
	}
}
