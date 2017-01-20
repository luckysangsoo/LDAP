package com.thread;

public class SyncThreadTest {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		FamilyThread father = new FamilyThread("Father", wr);
		FamilyThread mother = new FamilyThread("Mother", wr);
		FamilyThread sister = new FamilyThread("siter", wr);
		FamilyThread brother = new FamilyThread("brother", wr);
		FamilyThread me = new FamilyThread("me", wr);
		
		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();

	}

}
