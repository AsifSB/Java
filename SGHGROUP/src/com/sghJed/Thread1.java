package com.sghJed;

public class Thread1 implements Runnable{

	public void run() {
		System.out.println("new thread life cycle");
		
	}
	
	public static void main(String[] args) {
		Thread1 obj = new Thread1();
		Thread t1=new Thread(obj);
		t1.start();
	}
}
