package com.practice.algorithms;

public class Queue {
	private int maxSize;// size
	private long[] queueArray;// maintains data
	private int front; // index pos for index from front
	private int rear; // index pos for elemnet from back
	private int nItems;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		this.queueArray = new long[maxSize];
		this.front = 0; // index pos of frist element
		this.rear = -1; // last elemet
		this.nItems = 0;// dont have items
	}

	public void insert(long i) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = i;
		nItems++;

	}

	public void remove() { // removed from front of the queue
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // all are removed
		}
		nItems--;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public long peekRear() {
		return queueArray[rear];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void view() {
		System.out.print("[");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
}
