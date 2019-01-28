package week03.slot03;

import week02.slot01.Cat;

public class TestPerson {

	public static void main(String[] args) {
		Person person1 = new Person("Jailani");
		person1.adopt(new Cat("ABC", 50, 50));
		Cat cat2 = new Cat("DEF", 20, 20);
		person1.adopt(cat2);
		
		person1.adopt(new Cat("GHI", 30, 30));
		System.out.println(person1);
		
		person1.disown("ABC");
		System.out.println(person1);
		
		Person person2 = new Person("Rahman", 3);
		System.out.println(person2);
		person2.adopt("JKL", 30, 50);
		System.out.println(person2);
	}
	
}





