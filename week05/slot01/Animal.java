package week05.slot01;

abstract public class Animal {

	String fav_food;
	boolean hunger;
	
	public Animal(String fav_food, boolean hunger) {
		this.fav_food = fav_food;
		this.hunger = hunger;
	}
	
	public abstract void makeNoise();
	
	public abstract void eat();
	
	public void standUp() {
		System.out.println("I am standing up.");
	}
}
