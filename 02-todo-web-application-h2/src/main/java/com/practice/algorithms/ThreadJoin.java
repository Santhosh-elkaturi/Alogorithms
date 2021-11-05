package com.practice.algorithms;

 class MyRunnable implements Runnable{
	 
	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("Thread-0")) {
			try {
				Thread.currentThread().join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" -- and i = "+i);
		}
		
	}

}

public class ThreadJoin {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main");
		System.out.println("started: "+Thread.currentThread().getName());
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
		//t3.join();
		
		
		System.out.println("t1 join");
		
		System.out.println("t2 join");
		
		
	}
}