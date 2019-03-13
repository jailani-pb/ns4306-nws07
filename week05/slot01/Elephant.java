package week05.slot01;

public class Elephant extends Animal implements Angry {

	public Elephant(String fav_food, boolean hunger) {
		super(fav_food, hunger);
	}

	@Override
	public void eat() {
		if(fav_food.equalsIgnoreCase("Banana")) {
			System.out.println("PAWOO! I am eating.");
		} else {
			System.out.println("Apa ni?");
		}
	}

	@Override
	public void makeNoise() {
		System.out.println("PAWOO!");
	}

	@Override
	public void angry() {
		System.out.println("PAWOO! I am angry.");
	}
	
}
