package com.example.heimkino;

public class Tuner {

	private boolean an;
	private double am = 95;
	private double fm = 95;
	private String kanal = "AM";
	
	
	public void ein() {
		System.out.println("Tuner an");
		an = true;
	}
	
	public void aus() {
		System.out.println("Tuner aus");
		an = false;
	}
	
	public boolean istAn() {
		return an;
	}
	
	public void setAM(double am) {
		this.am = am;
		System.out.println("AM auf Freqzenz "+am+" gesetzt");
	}
	
	public void setFM(double fm) {
		this.fm = fm;
		System.out.println("AM auf Freqzenz "+fm+" gesetzt");
	}
	
	public void setKanal(String kanal) {
		this.kanal = kanal;
		System.out.println(kanal+" eingeschaltet");
	}
	
	public void frequenzHoch() {
		if(kanal=="AM") {
			am+=0.1;
			System.out.println("AM: "+am);
		}
		else {
			fm+=0.1;
			System.out.println("FM: "+fm);
		}
	}
	
	public void frequenzRunter() {
		if(kanal=="AM") {
			am-=0.1;
			System.out.println("AM: "+am);
		}
		else {
			fm-=0.1;
			System.out.println("FM: "+fm);
		}
	}
}
