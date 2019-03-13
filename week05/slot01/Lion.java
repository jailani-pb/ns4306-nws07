package week05.slot01;

public class Lion extends Animal implements Playful, Angry {

	public Lion(String fav_food, boolean hunger) {
		super(fav_food, hunger);
	}

	public void eat() {
		if(hunger == true) {
			System.out.println("ROAR! I am eating.");
		} else {
			System.out.println("ROAR! I am full.");
		}
	}

	@Override
	public void makeNoise() {
		System.out.println("ROAR!");		
	}

	@Override
	public void angry() {
		System.out.println("ROAR! I am angry.");
	}

	@Override
	public void play() {
		System.out.println("ROAR! I am playing.");
	}
	
}
