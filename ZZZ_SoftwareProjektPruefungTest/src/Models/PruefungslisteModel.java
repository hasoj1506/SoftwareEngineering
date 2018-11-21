package Models;

import java.util.ArrayList;

public class PruefungslisteModel implements PruefungslisteModelInterface{

	private ArrayList<PruefungsModelInterface> pruefungsliste = new ArrayList<PruefungsModelInterface>();
	private ArrayList<Observer> p_observers = new ArrayList<Observer>();
	
	public PruefungslisteModel(){

	}
	
	public void hinzufuegenPruefungZuPruefungsliste(PruefungsModelInterface p_model){
		pruefungsliste.add(p_model);
		notifyObservers();
	}
	
	public void loeschePruefungAusPruefungsliste(PruefungsModelInterface p_model){
		boolean geloescht = false;
		
		for(int i = 0; i < pruefungsliste.size(); i++){
			if(p_model.getPruefungsnummer() == pruefungsliste.get(i).getPruefungsnummer() && geloescht == false){
				pruefungsliste.remove(i);
				geloescht = true;
			}
		}
		
		notifyObservers();
		
	}
	
	public ArrayList<PruefungsModelInterface> getPruefungsliste(){
		return pruefungsliste;
	}
	
	public void register(Observer view) {
		p_observers.add(view);
	}

	public void removeObserver(Observer view) {

		if(p_observers.contains(view)){
			p_observers.remove(view);
		}
		
	}

	public void notifyObservers() {
		
		for(int i = 0; i < p_observers.size(); i++){
			p_observers.get(i).update();
		}
		
	}
	
}
