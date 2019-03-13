package week07.slot01;

import java.util.*;

public class LearningMaps {

	public static void main(String[] args) {
		// <KeyDataType, ValueDataType>
//		HashMap<String, String> countryCapital = new HashMap<String, String>();
//		LinkedHashMap<String, String> countryCapital = new LinkedHashMap<String, String>();
		TreeMap<String, String> countryCapital = new TreeMap<String, String>();
		countryCapital.put("Brunei", "Bandar Seri Begawan");
		countryCapital.put("Indonesia", "Jakarta");
		countryCapital.put("Malaysia", "Kuala Lumpur");
		countryCapital.put("Vietnam", "Hanoi");
		countryCapital.put("Thailand", "Bangkok");
		System.out.println(countryCapital);
		countryCapital.put("brunei", "Bandar Seri Begawan");
		System.out.println(countryCapital);
		
		System.out.println(countryCapital.get("Indonesia"));
		System.out.println(countryCapital.get("Cambodia"));
		
		System.out.println(countryCapital.containsKey("Cambodia"));
		System.out.println(countryCapital.containsValue("Hanoi"));
		
		countryCapital.remove("Thailand");
		countryCapital.remove("Indonesia", "Bandung");
		System.out.println(countryCapital);
		
		countryCapital.replace("Malaysia", "Selangor");
		countryCapital.replace("Indonesia", "Bali", "Bandung");
		System.out.println(countryCapital);
		countryCapital.put("brunei", "BSB");
		System.out.println(countryCapital);
		
		System.out.println(countryCapital.keySet());
		System.out.println(countryCapital.values());
	}
	
}
