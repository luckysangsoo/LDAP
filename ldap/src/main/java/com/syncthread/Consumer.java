package com.syncthread;

public class Consumer implements Runnable {

	private VendingMachine vm;
	
	public Consumer(VendingMachine vm) {
		// TODO Auto-generated constructor stub
		this.vm = vm;
	}
	
	@Override
	public void run() {
		for(int i=1; i<11; i++){
			System.out.println(Thread.currentThread().getName()+" : "+vm.getDrink()+"꺼내 먹음" );
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
