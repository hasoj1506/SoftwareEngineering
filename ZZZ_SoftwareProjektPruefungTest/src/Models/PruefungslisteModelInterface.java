package Models;

import java.util.ArrayList;


public interface PruefungslisteModelInterface extends Observable{

	public void hinzufuegenPruefungZuPruefungsliste(PruefungsModelInterface p_model);
	public void loeschePruefungAusPruefungsliste(PruefungsModelInterface p_model);
	
	public ArrayList<PruefungsModelInterface> getPruefungsliste();
	
}
