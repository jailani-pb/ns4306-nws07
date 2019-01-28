package week03.slot03;

import java.util.Arrays;

import week02.slot01.Cat;

public class Person {

	Cat[] cats;
	String name;
	
	public Person(String name) {
		this(name, 5);
	}
	
	public Person(int maxCat) {
		this("DEFAULTNAME", maxCat);
	}
	
	public Person(String name, int maxCat) {
		this.name = name;
		if(maxCat < 0 && maxCat >= 10) {
			maxCat = 5;
		}
		cats = new Cat[maxCat];
	}
	
	public boolean adopt(String catName, int catHunger, int catMood) {
		return this.adopt(new Cat(catName, catHunger, catMood));
	}
	
	public boolean adopt(Cat cat) {
		// Go through each slot in the array cats
		for(int i = 0; i < cats.length; i++) {
			// If the slot is null, that means that slot is empty
			if(cats[i] == null) {
				// We add cat object to this slot
				cats[i] = cat;
				// return true to say that adopting is successful
				return true;
			}
		}
		// If the loop cannot find an empty slot
		// return false to say that adopting failed
		return false;
	}
	
	// To disown a cat, we can just use the name of the cat to disown
	public boolean disown(String catName) {
		// Search each cat in cats array
		for(int i = 0; i < cats.length; i++) {
			if(cats[i].name.equals(catName)) {
				// We remove cat object with the stated name in catName
				// from the cats array by assigning it with null.
				cats[i] = null;
				// Disown successful
				return true;
			}
		}
		// Disown failed
		return false;
	}

	@Override
	public String toString() {
		return "Person [cats=" + Arrays.toString(cats) + ", name=" + name + "]";
	}
	
}








