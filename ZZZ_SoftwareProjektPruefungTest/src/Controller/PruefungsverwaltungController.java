package Controller;

import Models.PruefungsInterface;
import Models.Pruefungsliste;
import Views.PruefungsverwaltungView;

public class PruefungsverwaltungController {
	private Pruefungsliste pl_model;
	private PruefungsverwaltungView pv_view;
	
	public PruefungsverwaltungController(Pruefungsliste model, PruefungsverwaltungView view){
		this.pl_model = model;
		this.pv_view = view;
	}
	
	public void hinzufuegenPruefungZuPruefungsliste(PruefungsInterface a_model){
		pl_model.hinzufuegenPruefungZuPruefungsliste(a_model);
	}
	
	public void loeschePruefungAusPruefungsliste(PruefungsInterface a_model){
		pl_model.loeschePruefungAusPruefungsliste(a_model);
	}
}
