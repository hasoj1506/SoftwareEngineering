package Models;

import java.util.ArrayList;

public interface PruefungslisteInterface extends Observable {

	public void hinzufuegenPruefungZuPruefungsliste(PruefungsInterface p_model);

	public void loeschePruefungAusPruefungsliste(PruefungsInterface p_model);

	public ArrayList<PruefungsInterface> getPruefungsliste();

}
