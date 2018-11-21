package Controller;

import Views.PruefungsdetailsView;
import Models.PruefungsModelInterface;

public class PruefungsdetailsController implements PruefungsControllerInterface{

	private PruefungsModelInterface a_model;
	private PruefungsdetailsView a_view;
	
	public PruefungsdetailsController (PruefungsModelInterface model, PruefungsdetailsView view){
		this.a_model = model;
		this.a_view = view;
	}
	
	public void bearbeitePruefung(){
		
	}
	
	public void loeschePruefung(){
		
	}
	
}
