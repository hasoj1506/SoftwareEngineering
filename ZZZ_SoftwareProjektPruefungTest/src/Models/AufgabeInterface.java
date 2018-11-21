package Models;

import java.util.ArrayList;

public interface AufgabeInterface {
	public String getAufgabentitel();

	public void setAufgabentitel(String aufgabentitel);

	public String getFrageStellung();

	public void setFrageStellung(String frageStellung);

	public int getPunktzahl();

	public void setPunktzahl(int punktzahl);

	public ArrayList<Antwort> getAntworten();

	public void setAntworten(ArrayList<Antwort> antworten);

}
