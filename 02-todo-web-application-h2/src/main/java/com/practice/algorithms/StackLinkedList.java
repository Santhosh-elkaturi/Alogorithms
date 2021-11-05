package com.practice.algorithms;

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class StackClass {
	
	private Node head;
	private int size;
	
	public StackClass(){
		this.head = null;
		this.size=0;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next =head;
		head =node;
		size++;
		System.out.println(head.data);
	}
	public int getSize() {
		return size;
	}
	public int pop() {
		if(isEmpty()) {
			return -1;
		}else {

			int x = head.data;
			Node temp = head;
			head = head.next;
			size--;
			System.out.println(temp.data);
			return x;
			
		}	
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}

	public int top() {
		if(isEmpty()) {
			return 0;
		}else {
			return head.data;
		}
	}
}

public class StackLinkedList {
	public static void main(String[] args) {

		StackClass sc = new StackClass();
		sc.push(1);
		sc.push(2);
		sc.push(3);
		sc.push(4);
		System.out.println(sc.getSize());
		sc.pop();
		sc.pop();
		sc.pop();
		sc.pop();
		System.out.println(sc.getSize());
		System.out.println(sc.top());
		System.out.println(sc.isEmpty());
		
	}
}
