package com.syncthread;

public class Producer implements Runnable {
	private VendingMachine vm;
	
	public Producer(VendingMachine vm) {
		// TODO Auto-generated constructor stub
		this.vm = vm;
	}

	@Override
	public void run() {
		for(int i=1; i<11; i++){
			System.out.println(Thread.currentThread().getName() + " : 음료수 No."+i+" 넣음");
			vm.putDrink("음료수 No."+ i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
