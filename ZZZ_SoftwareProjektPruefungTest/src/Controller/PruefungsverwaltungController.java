package Controller;

import Models.PruefungsModelInterface;
import Models.PruefungslisteModel;
import Views.PruefungsverwaltungView;

public class PruefungsverwaltungController {
	private PruefungslisteModel pl_model;
	private PruefungsverwaltungView pv_view;
	
	public PruefungsverwaltungController(PruefungslisteModel model, PruefungsverwaltungView view){
		this.pl_model = model;
		this.pv_view = view;
	}
	
	public void hinzufuegenPruefungZuPruefungsliste(PruefungsModelInterface a_model){
		pl_model.hinzufuegenPruefungZuPruefungsliste(a_model);
	}
	
	public void loeschePruefungAusPruefungsliste(PruefungsModelInterface a_model){
		pl_model.loeschePruefungAusPruefungsliste(a_model);
	}
}
