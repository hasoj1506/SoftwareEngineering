package Ue2_GenerierterCode;

import java.awt.List;
import java.sql.Date;

/**
 * @author 
 * @version 1.0
 * @created 18-Okt-2018 12:51:38
 */
public class Mitarbeiter {

	private String benutzername;
	private Date einstellungsdatum;
	private String email;
	private String nachname;
	private String passwort;
	private String vorname;
	public List<Artikel> m_Artikel;

	public Mitarbeiter(){

	}

	public void finalize() throws Throwable {

	}
}//end Mitarbeiter