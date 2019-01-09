package com.example.observer.instance;

public class TestApp {

	public static void main(String[] args) {

		Anzeige anzeige = new TemperaturAnzeige();
		Anzeige fhAnzeige = new FahrenheitAnzeige();
		TemperaturFuehler fuehler = new TemperaturFuehler();
		fuehler.setTemperature(30);

		fuehler.registriereAnzeige(anzeige);
		fuehler.registriereAnzeige(fhAnzeige);

		for (int i = 1; i < 20; i++) {
			fuehler.veraendern();
			sleep();
		}

	}

	private static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
