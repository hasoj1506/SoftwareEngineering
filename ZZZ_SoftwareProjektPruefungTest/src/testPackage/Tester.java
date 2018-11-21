package testPackage;

import Models.Pruefung;
import Models.Pruefungsliste;
import Views.PruefungsverwaltungView;

public class Tester {

	public static void main(String[] args) {

		// Erstellen von 4 Beispielartikeln
		Pruefung p1 = new Pruefung(1234, "WS 18/19", 90);
		Pruefung p2 = new Pruefung(1256, "WS 19/20", 120);
		Pruefung p3 = new Pruefung(1423, "WS 25/26", 60);
		Pruefung p4 = new Pruefung(1754, "WS 23/24", 40);

		Pruefungsliste pruefungsliste = new Pruefungsliste();
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p1);
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p2);
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p3);
		pruefungsliste.hinzufuegenPruefungZuPruefungsliste(p4);
		PruefungsverwaltungView pvview = new PruefungsverwaltungView(pruefungsliste);

	}

}
