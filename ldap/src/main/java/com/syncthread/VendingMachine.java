package com.syncthread;

import java.util.Stack;

public class VendingMachine {
	Stack store = new Stack();
	
	//For consumer
	public synchronized String getDrink(){
		while(store.isEmpty()){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return store.pop().toString();
	}
	
	//For producer
	public synchronized void putDrink(String drink){
		this.notify();
		store.push(drink);
	}

}
