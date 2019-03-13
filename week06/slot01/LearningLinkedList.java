package week06.slot01;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		nameList.add("Jailani");
		nameList.add("Rahman");
		nameList.add("Aji");
		nameList.addFirst("Mohammad");
		nameList.addLast("Yusuf");
		
		ListIterator<String> nameIterator = nameList.listIterator();
		System.out.println(nameIterator.next());
		System.out.println(nameIterator.next());
		System.out.println(nameIterator.previous());
		System.out.println(nameIterator.previous());
		if(nameIterator.hasPrevious()) {
			System.out.println(nameIterator.previous());
		}
		while(nameIterator.hasNext()) {
			System.out.println(nameIterator.next());
		}
		nameIterator.add("Abu");
		System.out.println(nameIterator.previous());
		System.out.println(nameIterator.previous());
		System.out.println(nameIterator.previous());
		System.out.println(nameIterator.previous());
		nameIterator.add("Abdul");
		nameIterator.next();
		nameIterator.remove();
		
		nameIterator.next();
		nameIterator.set("Haji");
		
		System.out.println(nameList);
	}
	
}
