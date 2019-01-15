import java.util.*;
/*
OPDRACHT:
winkel met menu van 3 items

item 1 is €1
item 2 is €2
item 3 is €3

door winkelen totdat ze niet meer willen
*/

public class Winkel{

	private static LinkedList<Product> items = new LinkedList<Product>();

	public static void main(String[] args){

		Product p1 = new Product("brood",1);
		Product p2 = new Product("melk", 2);
		Product p3 = new Product("vlees", 3);
		items.add(p1);
		items.add(p2);
		items.add(p3);

		Scanner sc = new Scanner(System.in);
		int totaal = 0;

		doorwinkelen(sc, totaal);
		sc.close();
	}

	private static void showItems() {
		int itemnumber = 1;
		for(Product p : items) {
			System.out.println(itemnumber + ". " + p.toString());
			itemnumber++;
		}
	}

	private static void doorwinkelen(Scanner sc, int totaal){
		System.out.println("Wilt u (nog) wat kopen? (typ 1 voor ja)");
		if(sc.nextInt() == 1) {
			showItems();
			System.out.println("Wat wilt u kopen?");
			int keuze = sc.nextInt();
			totaal += items.get(keuze - 1).price;
			doorwinkelen(sc,totaal);

		} else {
			showtotal(totaal);
		}
	}

	private static void showtotal(int totaal){
		System.out.println("Uw totaal is: " + totaal + " euro.");
	}

}

class Product{

	private String name;
	int price;

	Product(String naam, int prijs){
		this.name = naam;
		this.price = prijs;
	}

	public String toString(){
		return name + "\t" + price + " euro";
	}
}
