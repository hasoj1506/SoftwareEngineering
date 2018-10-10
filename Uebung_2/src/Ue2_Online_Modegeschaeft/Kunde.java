package Ue2_Online_Modegeschaeft;

/**
* Nutzer des Modegesch�fts. Haben einen Warenkorb in den
* sie Artikel hinzuf�gen und l�schen k�nnen. K�nnen aus 
* dem Warenkorb Bestellungen ausl�sen.
*/
public class Kunde {

	private int kundenID;
	private String nachname;
	private String vorname;
	private Warenkorb waren = new Warenkorb(this);
	
	public Kunde(String s){
		String[] teil = s.split(";");
		this.kundenID = Integer.parseInt(teil[0]);
		this.nachname = teil[1];
		this.vorname = teil[2];	
	}
	
	public int getKundenID() {
		return kundenID;
	}

	public void setKundenID(int kundenID) {
		this.kundenID = kundenID;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Warenkorb getWarenkorb() {
		return waren;
	}
	
}
