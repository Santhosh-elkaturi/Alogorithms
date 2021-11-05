package com.practice.algorithms;

public class AppQueue {

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		queue.insert(5);
		queue.insert(6);
		queue.insert(7);
		queue.insert(8);
		queue.insert(9);
		queue.insert(11);
		queue.insert(12);
		
		System.out.println(queue.peekFront());
		System.out.println(queue.peekRear());
		while(!queue.isEmpty()) {

			queue.remove();
			
		}	
		queue.view();
		queue.insert(10);
		
	}
}
