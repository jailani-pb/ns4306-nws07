package week02.slot02;

import week02.slot01.Cat;

public class TestPerson {

	// We create an Application specifically to test Person class.
	public static void main(String[] args) {
		// Lets create a Person object
		// This will create a person object with name "Jailani"
		// and cats array of size 5.
		Person person1 = new Person("Jailani");
		// Lets adopt three cats using the adopt method.
		// There are two ways to add cat object to person object (cats array)
		
		// 1: We create a cat object without assigning to any variable
		// and add it to cats array in person1 object.
		person1.adopt(new Cat("ABC", 50, 50));
		
		// 2: We create a cat object and assigned it to a variable
		Cat cat2 = new Cat("DEF", 20, 20);
		// Add the cat object using the cat2 identifier.
		person1.adopt(cat2);
		
		person1.adopt(new Cat("GHI", 30, 30));
		
		// Lets print all cats from person1
		for(Cat cat : person1.cats) {
			// If you print the object itself
			// it will by default print the reference id of the object
			// in the computer memory
			System.out.println(cat);
			// You can print a more readable output for cat object.
			// But you need to implement a toString() method in Cat class.
		}
		
		// Lets test the disown method for person1 object
		person1.disown("ABC");
		
		// Lets print all cats from person1
		for(Cat cat : person1.cats) {
			System.out.println(cat);
		}
	}
	
}





