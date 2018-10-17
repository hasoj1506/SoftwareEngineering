package Ue2_WetterDaten2.src;

public class FahrenheitAnzeige implements Anzeige {
	
	private WetterDaten wetterDaten;

	public FahrenheitAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		this.wetterDaten.registriereAnzeige(this);
	}

	@Override
	public void aktualisieren(double temperatur, double feuchtigkeit, double luftdruck) {
		anzeigen();

	}
	
	public void anzeigen() 
	{
		String ausgabe = "Fahrenheitausgabe";
		System.out.println("Neu dabei: " + ausgabe);
	}

}
