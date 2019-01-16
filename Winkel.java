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

	private static LinkedList<Product> items = new LinkedList<>();

	public static void main(String[] args){

		Product p1 = new Product("brood",1);
		Product p2 = new Product("melk", 2);
		Product p3 = new Product("vlees", 3);
		items.add(p1);
		items.add(p2);
		items.add(p3);

		Scanner sc = new Scanner(System.in);

		doorwinkelen(sc);
		sc.close();
	}

	private static void showItems() {
		int itemNumber = 1;
		for(Product p : items) {
			System.out.println(itemNumber + ". " + p.toString());
			itemNumber++;
		}
	}

	private static void doorwinkelen(Scanner sc){
		System.out.println("Wilt u (nog) wat kopen? (typ 1 voor ja, typ een ander getal voor nee)");
		if(sc.nextInt() == 1) {
			koopProduct(sc);
		} else {
			System.out.println("Wilt u (nog) een item retourneren? (typ 1 voor ja, typ een ander getal voor nee)");
			if(sc.nextInt() == 1) {
				retourneerProduct(sc);
			} else {
				showtotal();
			}
		}
	}

	private static void retourneerProduct(Scanner sc) {
		showItemsSold();
		System.out.println("Wat wilt u retourneren?");
		int keuze = sc.nextInt();
		Product p = items.get(keuze-1);
		if(p.amountSold>0) {
			p.amountSold--;
			Product.totaleOmzet -= p.price;
			doorwinkelen(sc);
		} else {
			System.out.println("U heeft geen " + p.name + " in uw mandje.");
			doorwinkelen(sc);
		}
	}

	private static void koopProduct(Scanner sc) {
		showItems();
		System.out.println("Wat wilt u kopen?");
		int keuze = sc.nextInt();
		Product p = items.get(keuze - 1);
		p.amountSold++;
		Product.totaleOmzet += p.price;
		doorwinkelen(sc);
	}

	private static void showtotal(){
		showItemsSold();
		System.out.println("Uw totaal is: €" + Product.totaleOmzet);
	}

	private static void showItemsSold(){
		int itemNumber = 1;
		for (Product p: items) {
			System.out.println("U heeft " + p.amountSold + " " + itemNumber + ". " + p.name+ " in uw mandje. Dit kost €" + (p.amountSold*p.price));
			itemNumber++;
		}
	}

}

class Product{
	static int totaleOmzet;
	String name;
	int price, amountSold;

	Product(String naam, int prijs){
		this.name = naam;
		this.price = prijs;
	}

	public String toString(){
		return name + "\t\t" + price + " euro";
	}
}
