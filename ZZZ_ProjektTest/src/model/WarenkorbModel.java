package model;


import java.util.ArrayList;

/**
* Je ein Objekt pro Kunde vorhanden. In ihm k�nnen Artikel abgelegt werden
* und es kann die Bestellung ausgel�st werden.
*/
public class WarenkorbModel extends PruefungslisteModel{

//	private BestellungenModel best;
//	
//	public WarenkorbModel(KundeModel k, BestellungenModel best){
//		super(k);
//		this.best = best;
//	}
//	
//	/**
//	* L�st eine Bestellung aus dem Warenkorb aus, wenn in der 
//	* Artikelliste des Warenkorbes mindestens ein Artikel
//	* vorhanden ist. 
//	*
//	* @param best Referenz auf ein Objekt Bestellungen von
//	* dem aus die einzelne Bestellung erzeugt und verwaltet
//	* wird.
//	* 
//	* @return Gibt den Wert -1 zur�ck wenn keine Bestellung 
//	* ausgel�st wird. Gibt die Bestellungsnummer zur�ck 
//	* wenn eine Bestellung ausgel�st wird.
//	**/
//	public int bestellen(){
//		int nr = -1;
//		
//		if(super.getPruefungsliste().size() > 0){
//			nr = best.neueBestellung(super.getPruefungsliste(), super.getKunde());
//			super.getPruefungsliste().clear();
//		}else{
//			System.out.println("Keine Artikel im Warenkorb");
//		}
//		super.notifyObservers();
//		
//		return nr;
//		
//	}
//	
}
