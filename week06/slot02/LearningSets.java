package week06.slot02;

import java.util.*;

public class LearningSets {

	public static void main(String[] args) {
//		HashSet<String> icNumbers = new HashSet<String>();
//		LinkedHashSet<String> icNumbers = new LinkedHashSet<String>();
		TreeSet<String> icNumbers = new TreeSet<String>();
		icNumbers.add("00-123456");
		icNumbers.add("00-000256");
		icNumbers.add("01-093456");
		icNumbers.add("01-092314");
		
		System.out.println(icNumbers);
		
		icNumbers.add("00-000256");
		System.out.println(icNumbers);
		
		System.out.println(icNumbers.contains("00-123456"));
		System.out.println(icNumbers.contains("01-987654"));
		
		icNumbers.remove("00-123456");
		System.out.println(icNumbers);
		
		for(String ic : icNumbers) {
			System.out.println(ic);
		}
	}
	
}



