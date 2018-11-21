package Controller;

import Views.PruefungsDetailsView;
import Models.PruefungsModelInterface;

public class PruefungsdetailsController implements PruefungsControllerInterface{

	private PruefungsModelInterface a_model;
	private PruefungsDetailsView a_view;
	
	public PruefungsdetailsController (PruefungsModelInterface model, PruefungsDetailsView view){
		this.a_model = model;
		this.a_view = view;
	}
	
	public void bearbeitePruefung(){
		
	}
	
	public void loeschePruefung(){
		
	}
	
}
