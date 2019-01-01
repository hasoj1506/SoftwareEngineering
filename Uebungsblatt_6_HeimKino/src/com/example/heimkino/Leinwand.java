package com.example.heimkino;

public class Leinwand {
	
	private boolean istUnten;
	
	public void hoch() {
		System.out.println("Leinwand fährt hoch");
		istUnten = false;
	}
	
	public void runter() {
		System.out.println("Leinwand fährt runter");
		istUnten = true;
	}
	
	public boolean istLeindwandUnten() {
		return istUnten;
	}

}
