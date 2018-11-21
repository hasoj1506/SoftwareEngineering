package Controller;

import Views.PruefungsDetailsView;
import Models.PruefungsInterface;

public class PruefungsdetailsController implements PruefungsControllerInterface{

	private PruefungsInterface a_model;
	private PruefungsDetailsView a_view;
	
	public PruefungsdetailsController (PruefungsInterface model, PruefungsDetailsView view){
		this.a_model = model;
		this.a_view = view;
	}
	
	public void bearbeitePruefung(){
		
	}
	
	public void loeschePruefung(){
		
	}
	
	public void speicherPruefung(){
		
	}
	
}
