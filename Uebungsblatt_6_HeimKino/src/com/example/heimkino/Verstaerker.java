package com.example.heimkino;

public class Verstaerker {
	
	private boolean an;
	private CDSpieler cd;
	private DVDSpieler dvd;
	private Tuner tuner;
	private int lautstaerke = 20;
	private String sound ="stereo";
	
	
	public void ein() {
		System.out.println("Verstaerker an");
		an = true;
	}
	
	public void aus() {
		System.out.println("Verstaerker aus");
		an = false;
	}
	
	public boolean istAn() {
		return an;
	}
	
	public void setSurroundSound() {
		sound = "surround";
		System.out.println("Verstärker Soundeinstellung: Surround");
	}
	
	public void setStereoSound() {
		sound = "stereo";
		System.out.println("Verstärker Soundeinstellung: Stereo");
	}
	
	public void setCD(CDSpieler cd) {
		this.cd = cd;
	}
	
	public void setDVD(DVDSpieler dvd) {
		this.dvd = dvd;
	}
	
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}
	
	public void setLautstaerke(int lautstaerke) {
		this.lautstaerke = lautstaerke;
	}
	
	public void lauter() {
		lautstaerke++;
		System.out.println("Lautstaerke: " + lautstaerke);
	}
	
	public void leiser() {
		lautstaerke--;
		System.out.println("Lautstaerke: " + lautstaerke);
	}
	
	

}
