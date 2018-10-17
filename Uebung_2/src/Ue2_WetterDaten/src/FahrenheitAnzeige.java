package Ue2_WetterDaten.src;

public class FahrenheitAnzeige {
	private double temperatur;
	private double feuchtigkeit;
	
	public FahrenheitAnzeige()
	{
		
	}
	
	public void aktualisieren(double temp, double feucht, double luftdruck)
	{
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		anzeigen();
	}

	public void anzeigen() 
	{
		System.out.println("Aktuelle Wetterbedingungen: " + temperatur + " Grad F und Luftfeuchtigkeit % " + feuchtigkeit);
	}


}
