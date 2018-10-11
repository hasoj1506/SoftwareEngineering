package Ue2_Online_Modegeschaeft;

/**
* Artikel können von Kunden in deren Warenkorb hinzugefügt werden
* und dann bestellt werden.
*/
public class Artikel implements IArtikel {

	private int artikelnummer;
	private String bezeichnung;
	private double preis;
	
	public Artikel(int aNr, String bez, double pr){
		this.artikelnummer = aNr;
		this.bezeichnung = bez;
		this.preis = pr;			
	}
	
	/* (non-Javadoc)
	 * @see Ue2_Online_Modegeschaeft.IArtikel#getArtikelnummer()
	 */
	@Override
	public int getArtikelnummer(){
		return artikelnummer;
	}
	
	/* (non-Javadoc)
	 * @see Ue2_Online_Modegeschaeft.IArtikel#getBezeichnung()
	 */
	@Override
	public String getBezeichnung(){
		return bezeichnung;
	}
	
	/* (non-Javadoc)
	 * @see Ue2_Online_Modegeschaeft.IArtikel#setBezeichnung(java.lang.String)
	 */
	@Override
	public void setBezeichnung(String bez){
		this.bezeichnung = bez;
	}
	
	/* (non-Javadoc)
	 * @see Ue2_Online_Modegeschaeft.IArtikel#getPreis()
	 */
	@Override
	public double getPreis(){
		return preis;
	}
	
	/* (non-Javadoc)
	 * @see Ue2_Online_Modegeschaeft.IArtikel#setPreis(double)
	 */
	@Override
	public void setPreis(double preis){
		this.preis = preis;
	}
	
}
