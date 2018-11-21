package Models;

import java.util.ArrayList;

public class PruefungsModel implements PruefungsModelInterface {

	private int pruefungsnummer;
	private String pruefungstitel;
	private int pruefungsdauer;
	private ArrayList<Observer> p_observers = new ArrayList<Observer>();
	private ArrayList<AufgabeModelInterface> aufgaben;

	public PruefungsModel(int pNr, String titel, int dauer) {
		this.pruefungsnummer = pNr;
		this.pruefungstitel = titel;
		this.pruefungsdauer = dauer;
	}

	public int getPruefungsnummer() {
		return pruefungsnummer;
	}

	public String getPruefungstitel() {
		return pruefungstitel;
	}

	public int getPruefungsdauer() {
		return pruefungsdauer;
	}

	public void setPruefungstitel(String titel) {
		this.pruefungstitel = titel;
		notifyObservers();
	}

	public void setPruefungsdauer(int dauer) {
		this.pruefungsdauer = dauer;
		notifyObservers();
	}

	public ArrayList<AufgabeModelInterface> getAufgaben() {
		return aufgaben;
	}

	public void setAufgaben(ArrayList<AufgabeModelInterface> aufgaben) {
		this.aufgaben = aufgaben;
	}

	public void register(Observer view) {
		p_observers.add(view);
	}

	public void removeObserver(Observer view) {

		if (p_observers.contains(view)) {
			p_observers.remove(view);
		}

	}

	public void notifyObservers() {

		for (int i = 0; i < p_observers.size(); i++) {
			p_observers.get(i).update();
		}

	}

}
