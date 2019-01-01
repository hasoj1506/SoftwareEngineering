package com.example.heimkino;

public class DVDSpieler {

	private boolean an;
	private String status;
	private String sound ="stereo";
	
	
	public void ein() {
		System.out.println("DVD Spieler an");
		an = true;
	}
	
	public void aus() {
		System.out.println("DVD Spieler aus");
		an = false;
	}
	
	public boolean istAn() {
		return an;
	}
	
	public void auswerfen() {
		System.out.println("Werfe DVD aus");
	}
	
	public void pause() {
		System.out.println("DVD Pause");
	}
	
	public void play() {
		System.out.println("DVD play");
	}
	
	public void stop() {
		System.out.println("DVD Stop");
	}
	
	public void setSurroundSound() {
		sound = "surround";
		System.out.println("DVD Soundeinstellung: Surround");
	}
	
	public void setStereoSound() {
		sound = "stereo";
		System.out.println("DVD Soundeinstellung: Stereo");
	}
}
