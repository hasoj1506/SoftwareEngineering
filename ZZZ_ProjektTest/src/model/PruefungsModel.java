package model;

import java.util.ArrayList;

/**
 * Artikel können von Kunden in deren Warenkorb hinzugefügt werden und dann
 * bestellt werden.
 */
public class PruefungsModel implements PruefungsModelInterface {

	private int pruefungsnummer;
	private String pruefungstitel;
	private int pruefungsdauer;
	private ArrayList<Observer> p_observers = new ArrayList<Observer>();

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
