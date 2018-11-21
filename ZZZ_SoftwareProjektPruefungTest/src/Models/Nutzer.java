package Models;

public class Nutzer {

	private String vorname;
	private String nachname;

	private String benutzername;
	private String passwort;

	private boolean istDozent;
	private int idNummer; // Dozentennummer oder Matrikelnummer

	public Nutzer(String vorname, String nachname, boolean istDozent, int idNummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.istDozent = istDozent;
		this.benutzername = null;
		this.passwort = null;
		this.idNummer = idNummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getBenutzername() {
		return benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public boolean isIstDozent() {
		return istDozent;
	}

	public void setIstDozent(boolean istDozent) {
		this.istDozent = istDozent;
	}

	public int getIdNummer() {
		return idNummer;
	}

	public void setIdNummer(int idNummer) {
		this.idNummer = idNummer;
	}

}
