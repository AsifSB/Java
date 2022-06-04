package com.sghJed;

public class Thread2 extends Thread {

	public Thread2(String name) {
		super(name);
	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" is Daemon?: "+Thread.currentThread().isDaemon());
		
	}

	public static void main(String[] args) {
		Thread2 t1 = new Thread2("Thread 1");
		t1.setDaemon(true);
		t1.start();
		Thread2 t2 = new Thread2("Thread 2");
		t2.start();
		Thread2 t3 = new Thread2("Thread 3");
		t3.setDaemon(true);
		t3.start();
		Thread2 t4 = new Thread2("Thread 4");
		t4.start();
		Thread2 t5 = new Thread2("Thread 5");
		t5.setDaemon(true);
		t5.start();
		
	
		
	}
}
