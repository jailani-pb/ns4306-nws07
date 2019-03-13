package week02.slot01;

import week05.slot01.Playful;

public class Cat implements Playful {
	
	int moodLevel;
	int hungerLevel;
	// This instance variable does not have any access modifier
	// that means this instance variable can only be accessed by
	// classes from the same package.
	// If you want Person class to access it, for now lets just put
	// public access modifier in front of it.
	public String name;
	
	// Constructor
	public Cat(String catName, int catHunger, int catMood) {
		name = catName;
		hungerLevel = catHunger;
		if(hungerLevel < 0) {
			hungerLevel = 0;
		}
		if(hungerLevel > 100) {
			hungerLevel = 100;
		}
		moodLevel = catMood;
		if(moodLevel < 0) {
			moodLevel = 0;
		}
		if(moodLevel > 100) {
			moodLevel = 100;
		}
	}
	
	// Methods
	public String play(int minutes) {
		hungerLevel = hungerLevel - minutes;
		moodLevel = moodLevel + minutes;
		if(hungerLevel < 0) {
			hungerLevel = 0;
		}
		if(moodLevel > 100) {
			moodLevel = 100;
		}
		return name + " is playing. Mood increases, hunger decreases.";
	}

	@Override
	public String toString() {
		return "Cat [moodLevel=" + moodLevel + ", hungerLevel=" + hungerLevel + ", name=" + name + "]";
	}

	@Override
	public void play() {
		System.out.println("MEOW! I am playing.");
	}
	
//	public String eat() {
//		
//	}
//	
//	public String jealous() {
//		
//	}
	
	// You can ask eclipse to generate a toString method for you
	// Source > Generate toString() > Make sure all fields are selected
	// > click generate
	
	
}
