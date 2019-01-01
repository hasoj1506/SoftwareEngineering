package com.example.heimkino;

public class Beleuchtung {

	public boolean an;
	
	public void ein() {
		System.out.println("Licht an");
		an = true;
	}
	
	public void aus() {
		System.out.println("Licht aus");
		an = false;
	}
	
	public boolean istAn() {
		return an;
	}
	
	public void dimmen() {
		System.out.println("Licht wird gedimmt");
	}
}
