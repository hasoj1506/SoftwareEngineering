package com.example.heimkino;

public class Beamer {
	
	private boolean an;
	private String modus;
	
	public void ein() {
		System.out.println("Beamer an");
		an = true;
	}
	
	public void aus() {
		System.out.println("Beamer aus");
		an = false;
	}
	
	public boolean istAn() {
		return an;
	}
	
	public void tvModus() {
		modus = "TV";
		System.out.println("Beamer: TV Modus ein");
	}
	
	public void breitwandModus() {
		modus = "Breitwand";
		System.out.println("Beamer: Breitwandmodus ein");
	}

}
