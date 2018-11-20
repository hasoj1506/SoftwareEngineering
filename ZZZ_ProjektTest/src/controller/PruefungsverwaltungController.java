package controller;

import view.PruefungsverwaltungView;
import model.PruefungsModelInterface;
import model.PruefungslisteModel;
import model.PruefungslisteModelInterface;

public class PruefungsverwaltungController {
	
	private PruefungslisteModel al_model;
	private PruefungsverwaltungView al_view;
	
	public PruefungsverwaltungController(PruefungslisteModel model, PruefungsverwaltungView view){
		this.al_model = model;
		this.al_view = view;
	}
	
	public void hinzufuegenArtikelZuArtikelliste(PruefungsModelInterface a_model){
		al_model.hinzufuegenPruefungZuPruefungsliste(a_model);
	}
	
	public void loescheArtikelAusArtikelliste(PruefungsModelInterface a_model){
		al_model.loeschePruefungAusPruefungsliste(a_model);
	}

}
