package com.example.observer.instance;

import java.util.ArrayList;
import java.util.List;

public class TemperaturFuehler implements Fuehler {

	private int temperature;
	private double fahrenheit;
	private List<Anzeige> anzeigen = new ArrayList<Anzeige>();

	public void veraendern() {
		temperature++;

		fahrenheit = temperature * 9 / 5 + 32;

		// Rufe nun alle Beobachter auf, hier ist es nur eine Anzeige

		for (Anzeige anzeige : anzeigen) {
			anzeige.zeigeAn(this);
		}
	}

	@Override
	public String getTemperatur() {
		return String.valueOf(temperature);
	}

	@Override
	public void registriereAnzeige(Anzeige anzeige) {
		anzeigen.add(anzeige);
	}

	@Override
	public void entferneAnzeige(Anzeige anzeige) {
		anzeigen.remove(anzeige);
	}

	public String getFahrenheit() {
		return String.valueOf(fahrenheit);
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

}
