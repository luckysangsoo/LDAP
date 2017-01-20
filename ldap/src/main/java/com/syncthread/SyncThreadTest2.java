package com.syncthread;

public class SyncThreadTest2 {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		Producer p = new Producer(vm);
		Consumer c = new Consumer(vm);
		
		Thread t1 = new Thread(p, "Scott");
		Thread t2 = new Thread(c, "Andrew");
		
		t1.start();
		t2.start();
	}

}
