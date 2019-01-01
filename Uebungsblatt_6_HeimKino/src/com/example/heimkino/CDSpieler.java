package com.example.heimkino;

public class CDSpieler {
	
	private boolean an;
	
	public void ein() {
		System.out.println("CD Spieler an");
		an = true;
	}
	
	public void aus() {
		System.out.println("CD Spieler aus");
		an = false;
	}
	
	public boolean istAn() {
		return an;
	}
	
	public void auswerfen() {
		System.out.println("Werfe CD aus");
	}
	
	public void pause() {
		System.out.println("CD Pause");
	}
	
	public void play() {
		System.out.println("CD play");
	}
	
	public void stop() {
		System.out.println("CD Stop");
	}

}
