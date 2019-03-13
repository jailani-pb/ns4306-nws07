package week05.slot02.datastructures;

import java.util.ArrayList;

import week05.slot02.encapsulation.Person;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Jailani", 50));
		personList.add(new Person("Rahman", 30));
		personList.add(new Person("Aji", 80));
		personList.add(new Person("Yusuf", 50));
		personList.add(new Person("Mohamad", 20));
		
		System.out.println(personList.get(1).getName());
		System.out.println(personList.get(4).getName());
		
		System.out.println(personList.size());
		
		personList.set(1, new Person("Abdul", 50));
		System.out.println(personList.get(1).getName());
		System.out.println(personList.size());
		
		personList.remove(0);
		System.out.println(personList.get(0).getName());
		System.out.println(personList.get(1).getName());
		System.out.println(personList.size());
	}
	
}



