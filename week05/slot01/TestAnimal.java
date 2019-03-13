package week05.slot01;

import week02.slot01.Cat;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Lion("Kuih", false);
		animal.eat();
		animal.makeNoise();
		animal.standUp();
		animal = new Elephant("Banana", true);
		animal.eat();
		animal.makeNoise();
		animal.standUp();
		animal = new Giraffe("Leaf", false);
		animal.eat();
		animal.makeNoise();
		animal.standUp();
		
		letsPlayful(new Giraffe("Leaf", false));
		letsPlayful(new Lion("Steak", true));
		letsPlayful(new Cat("ABC", 50, 50));
	}
	
	public static void letsPlay(Animal animal) {
		if(animal != null && animal instanceof Playful) {
			((Playful) animal).play();
		} else {
			System.out.println("Unable to play.");
		}
	}
	
	public static void letsPlayful(Playful playful) {
		if(playful != null) {
			playful.play();
		} else {
			System.out.println("Unable to play.");
		}
	}
	
}



