package Models;

import java.util.ArrayList;

public class AufgabeModel implements AufgabeModelInterface {
	
	

	private String aufgabentitel;
	private String frageStellung;
	private ArrayList<Antwort> antworten;
	private int punktzahl;
	
	public AufgabeModel(String aufgabentitel, String frageStellung, int punktzahl) {
		this.aufgabentitel = aufgabentitel;
		this.frageStellung = frageStellung;
		this.punktzahl = punktzahl;
		this.antworten = null;
	}

	public String getAufgabentitel() {
		return aufgabentitel;
	}

	public void setAufgabentitel(String aufgabentitel) {
		this.aufgabentitel = aufgabentitel;
	}

	public String getFrageStellung() {
		return frageStellung;
	}

	public void setFrageStellung(String frageStellung) {
		this.frageStellung = frageStellung;
	}

	public int getPunktzahl() {
		return punktzahl;
	}

	public void setPunktzahl(int punktzahl) {
		this.punktzahl = punktzahl;
	}

	public ArrayList<Antwort> getAntworten() {
		return antworten;
	}

	public void setAntworten(ArrayList<Antwort> antworten) {
		this.antworten = antworten;
	}
		

}
