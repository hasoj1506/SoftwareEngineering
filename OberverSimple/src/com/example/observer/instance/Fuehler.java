package com.example.observer.instance;

public interface Fuehler {
	
	public String getTemperatur();
	public void registriereAnzeige(Anzeige anzeige);
	public void entferneAnzeige(Anzeige anzeige);
}
