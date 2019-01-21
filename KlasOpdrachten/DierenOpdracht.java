package KlasOpdrachten;

import java.util.LinkedList;

public class DierenOpdracht {

	static private LinkedList<Animal> animals = new LinkedList<>();

	public static void main(String[] args) {
		animals.add(new Dog("Bob", "Jip"));
		animals.add(new Cat("Nino", "Woezie"));
		animals.add(new Bee(12));
		animals.add(new Mosquito(26));

		animals.stream().filter(x -> x instanceof ZoemendeDieren).forEach(x -> System.out.println(x.name));
	}
}

interface ZoemendeDieren {
}

abstract class Animal{
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void makeNoise();
}

abstract class Pet extends Animal {
	String ownerName;
	String givenName;

	public Pet(String name, String ownerName, String givenName) {
		super(name);
		this.ownerName = ownerName;
		this.givenName = givenName;
	}

	public abstract void makeNoise();
}

class Dog extends Pet {
	public Dog(String ownerName, String givenName) { super("Dog", ownerName, givenName); }

	public void makeNoise() {
		System.out.println("Woof");
	}
}

class Cat extends Pet {
	public Cat(String ownerName, String givenName) { super("Cat", ownerName, givenName); }

	public void makeNoise() {
		System.out.println("Meow");
	}
}


abstract class Insect extends Animal {
	public Insect(String name) { super(name); }

	public abstract void makeNoise();
}

class Mosquito extends Insect implements ZoemendeDieren {
	int bloodPerDay;

	public Mosquito (int bloodPerDay ) {
		super("Mosquito");
		this.bloodPerDay = bloodPerDay;
	}

	public void makeNoise() {
		System.out.println("Bzzz (extremely annoying)");
	}
}

class Bee extends Insect implements ZoemendeDieren {
	int honeyPerDay;

	public Bee(int honeyPerDay) {
		super("Bee");
		this.honeyPerDay = honeyPerDay;
	}

	public void makeNoise() {
		System.out.println("Bzzz");
	}
}
