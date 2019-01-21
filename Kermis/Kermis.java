package Kermis;

import Kermis.Attracties.*;

import java.util.Scanner;

public class Kermis {
	public static void main(String args[]) {
		new Kermis().run();
	}

	private void run() {
		showAttracties();
		laatMaarDraaienDieEneAttractie();
	}

	private void showAttracties() {

		String sb = "Kies een attractie om te laten draaien:\n" +
			"(1) Botsautos\n" +
			"(2) Spin\n" +
			"(3) Spiegelpaleis\n" +
			"(4) Spookhuis\n" +
			"(5) Hawaii\n" +
			"(6) Ladderklimmen";

		System.out.println(sb);

	}

	private void laatMaarDraaienDieEneAttractie() {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			if(sc.hasNextInt()) {
				int keuze = sc.nextInt();
				switch (keuze) {
					case 1: {
						new Botsauto().draaien();
						break;
					}
					case 2: {
						new Spin().draaien();
						break;
					}
					case 3: {
						new Spiegelpaleis().draaien();
						break;
					}
					case 4: {
						new Spookhuis().draaien();
						break;
					}
					case 5: {
						new Hawaii().draaien();
						break;
					}
					case 6: {
						new Ladderklimmen().draaien();
						break;
					}
					default: {
						System.out.println("Geef een getal tussen de 1 en 6 op om een attractie te selecteren.");
						laatMaarDraaienDieEneAttractie();
					}
				}
			} else {
				laatMaarDraaienDieEneAttractie();
			}
		}
	}
}
