package com.sghJed;

public class Thread3 extends Thread {

	public  Thread3(String name) {
		super(name);
	}
	public void run() {
	System.out.println(Thread.currentThread().getName()+"Thread Status"+Thread.currentThread().isDaemon());	
	}
	
	public static void main(String[] args) {
    
		Thread3 t1=new Thread3("a");
				t1.setDaemon(true);
		        t1.start();
        Thread3 t2=new Thread3("b");
				t2.start();
		Thread3 t3=new Thread3("c");
				t3.start();		
	}
}
