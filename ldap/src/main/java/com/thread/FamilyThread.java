package com.thread;

public class FamilyThread extends Thread {
	private Washroom wr;
	private String who;
	
	public FamilyThread(String name, Washroom wr) {
		who = name;
		this.wr = wr;
	}
	
	public void run(){
		wr.openDoor(who);
	}

}
