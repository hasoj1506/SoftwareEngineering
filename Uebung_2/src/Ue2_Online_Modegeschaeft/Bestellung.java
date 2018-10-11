package Ue2_Online_Modegeschaeft;

import java.util.ArrayList;

/**
* Eine vom Kunden ausgelöste Bestellung. Hat mehrere Artikelpositionen
* in denen die einzelnen Artikel hinterlegt sind.
*/
public class Bestellung {
	
	private int bestellNr;
	private ArrayList<Artikel> artikelpositionen = new ArrayList<Artikel>();
	private IKunde kunde;
	
	public Bestellung(int n, IKunde k){
		this.bestellNr = n;
		this.kunde = k;
	}
	
	public void hinzufuegenArtikel(Artikel a){
		artikelpositionen.add(a);
	}
	
	public int getBestellNr(){
		return bestellNr;
	}
	
	public double getGesamtbetrag(){
		double betrag = 0;
		double rabatt = kunde.getRabatt();
		
		for(int i = 0; i < artikelpositionen.size(); i++){
			betrag = betrag + artikelpositionen.get(i).getPreis();
		}
		
		return betrag * ((100 - rabatt) / 100);
	}
	
	public ArrayList<Artikel> getArtikelpositionen(){
		return artikelpositionen;
	}
	
	public IKunde getKunde(){
		return kunde;
	}
	
}
