package com.test;

public class Bees {
	public static void main(String[] args) {
		try {
			new Bees().go();
			
		} catch (Exception e) {
			System.out.println("thrown to main");
		}
	}
	
	synchronized void go() throws InterruptedException {
		Thread t1 = new Thread();
		t1.start();
		System.out.println("t1 1");
		
		System.out.println("t1 2 ");
		
		Thread t2 = new Thread();
		t2.start();
		System.out.println("t2 1 ");
		System.out.println("t2 2 ");
	}

}
