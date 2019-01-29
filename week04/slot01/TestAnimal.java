package week04.slot01;

public class TestAnimal {

	public static void main(String[] args) {
		Lion lion1 = new Lion("Steak", false);
		lion1.eat();
		lion1.makeNoise();
		Elephant elephant1 = new Elephant("Banana", true);
		elephant1.eat();
		elephant1.makeNoise();
	}
	
}
