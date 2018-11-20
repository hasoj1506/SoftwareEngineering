package Test;


import model.BestellungenModel;
import model.PruefungsModel;
import model.PruefungslisteModel;
import view.PruefungsverwaltungView;


public class Tester {
	
	public static void main(String[] args){
	
		//Erstellen eines Objektes der Klasse Bestellungen das die einzelnen Bestellungen verwaltet
		BestellungenModel best = new BestellungenModel();
		
		//Erstellen von 4 Beispielartikeln
		PruefungsModel p1 = new PruefungsModel(1234, "WS 18/19", 90);
		PruefungsModel p2 = new PruefungsModel(1256, "WS 19/20", 120);
		PruefungsModel p3 = new PruefungsModel(1423, "WS 25/26", 60);
		PruefungsModel p4 = new PruefungsModel(1754, "WS 23/24", 40);
	
		PruefungslisteModel pruefungsliste= new PruefungslisteModel();
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p1);
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p2);
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p3);
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p4);
		PruefungsverwaltungView alview = new PruefungsverwaltungView(pruefungsliste);
		
	}
	
}
