package week06.slot02;

import java.util.LinkedList;
import java.util.Queue;

public class LearningQueue {

	public static void main(String[] args) {
		Queue<String> emailQueue = new LinkedList<String>();
		emailQueue.offer("abc@123.com");
		emailQueue.offer("def@456.com");
		emailQueue.offer("ghi@789.com");
		
		System.out.println(emailQueue);
		
		System.out.println(emailQueue.peek());
		System.out.println(emailQueue.peek());
		System.out.println(emailQueue.peek());
		
		while(!emailQueue.isEmpty()) {
			System.out.println(emailQueue.poll());
			System.out.println(emailQueue);
		}
	}
	
}
