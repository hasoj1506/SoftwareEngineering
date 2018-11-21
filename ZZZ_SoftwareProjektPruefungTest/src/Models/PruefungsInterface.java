package Models;

/**
 * Schnittstelle, die das Model definiert, das die Artikel speichert.
 */
public interface PruefungsInterface extends Observable {

	public int getPruefungsnummer();

	public String getPruefungstitel();

	public int getPruefungsdauer();

	public void setPruefungstitel(String pruefungstitel);

	public void setPruefungsdauer(int dauer);

}
