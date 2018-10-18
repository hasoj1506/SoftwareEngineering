package Ue2_GenerierterCode;

import java.awt.List;

/**
 * @author 
 * @version 1.0
 * @created 18-Okt-2018 12:51:31
 */
public class Artikel {

	private int artikelnummer;
	private String bezeichnung;
	private String marke;
	private double preis;
	private String status;
	public List<Lieferant> m_Lieferant;
	public List<Groesse> m_Groesse;

	public Artikel(){

	}

	public void finalize() throws Throwable {

	}
}//end Artikel