package model;

import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JLabel;

/**
* Eine vom Kunden ausgelöste Bestellung. Hat mehrere Artikelpositionen
* in denen die einzelnen Artikel hinterlegt sind.
*/
public class BestellungModel {
	
	private int bestellNr;
	private ArrayList<PruefungsModelInterface> artikelpositionen = new ArrayList<PruefungsModelInterface>();
	private KundeModel kunde;
	
	public BestellungModel(int n, KundeModel k){
		this.bestellNr = n;
		this.kunde = k;
	}
	
	public void hinzufuegenArtikel(PruefungsModelInterface a_model){
		artikelpositionen.add(a_model);
	}
	
	public int getBestellNr(){
		return bestellNr;
	}
	
	public double getGesamtbetrag(){
		double betrag = 0;
		
		for(int i = 0; i < artikelpositionen.size(); i++){
			betrag = betrag + artikelpositionen.get(i).getPruefungsdauer();
		}
		
		return betrag;
	}
	
	public ArrayList<PruefungsModelInterface> getArtikelpositionen(){
		return artikelpositionen;
	}
	
	public KundeModel getKunde(){
		return kunde;
	}
	
}
