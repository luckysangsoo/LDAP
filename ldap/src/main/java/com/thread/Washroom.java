package com.thread;

public class Washroom {
	public synchronized void openDoor(String name){
		System.out.println(name + " 입장");
		for(int i=0; i<1000000; i++){
			if(i == 10000)
				System.out.println(name + " : 끄으응~");
		}
		System.out.println(name + " : 아~ 시원해");
	}

}
