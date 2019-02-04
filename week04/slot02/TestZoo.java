package week04.slot02;

import week04.slot01.*;

public class TestZoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		System.out.println(zoo);
		zoo.adopt(new Lion("Steak", false));
		zoo.adopt(new Elephant("Banana", true));
		zoo.adopt(new Giraffe("Leaf", false));
		System.out.println(zoo);
		
		zoo.animals[0].eat();
		zoo.animals[1].eat();
		zoo.animals[2].eat();
		
//		((Giraffe) zoo.animals[2]).play();
//		Giraffe giraffe1 = (Giraffe) zoo.animals[2];
//		giraffe1.play();
		
//		((Giraffe) zoo.animals[1]).play();
		zoo.letsPlay(0);
		zoo.letsPlay(1);
		zoo.letsPlay(2);
		zoo.letsPlay(3);
		
		zoo.letsPlayOtherSolution(0);
		zoo.letsPlayOtherSolution(1);
		zoo.letsPlayOtherSolution(2);
		zoo.letsPlayOtherSolution(3);
	}
	
}
