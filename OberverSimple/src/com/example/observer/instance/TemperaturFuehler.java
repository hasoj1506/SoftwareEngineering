package com.example.observer.instance;

public class TemperaturFuehler implements Fuehler {

	private int temperature;
	private Anzeige anzeige;

	public void veraendern() {
		temperature++;

		// Rufe nun alle Beobachter auf, hier ist es nur eine Anzeige

		anzeige.zeigeAn(this);
	}

	@Override
	public String getTemperatur() {
		return String.valueOf(temperature);
	}

	@Override
	public void registriereAnzeige(Anzeige anzeige) {
		this.anzeige = anzeige;
	}

	@Override
	public void entferneAnzeige(Anzeige anzeige) {
		this.anzeige = null;
	}

}
