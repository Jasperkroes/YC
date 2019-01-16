package Ganzenbord;

import java.util.LinkedList;
import java.util.Random;

public class GanzenBord{

	LinkedList<Speler> spelers = new LinkedList<>();
	Bord bord = new Bord();
	private static Random rand = new Random();

	public static void main(String[] args){
		System.out.println(werp());
	}

	private strictfp static int werp(){
		return rand.nextInt(6)+1;
	}

}
