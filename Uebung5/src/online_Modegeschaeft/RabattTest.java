package online_Modegeschaeft;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RabattTest {

	private Bestellungen best;
	private Kunde mueller;
	private Artikel nikeFree;

	@Before
	public void setUp() throws Exception {
		best = new Bestellungen();
		mueller = new Kunde("2;Müller;Tom;15");
		nikeFree = new Artikel(1, "Nike Free", 100.0);
		
		mueller.setAnzVergangenerBestellungen(4);
		mueller.hinzufuegenArtikelInWarenkorb(nikeFree);
		mueller.bestellen(best, true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetGesamtbetrag() {
		best = new Bestellungen();
		mueller = new Kunde("2;Müller;Tom;15");
		nikeFree = new Artikel(1, "Nike Free", 100.0);
		
		mueller.setAnzVergangenerBestellungen(4);
		mueller.hinzufuegenArtikelInWarenkorb(nikeFree);
		mueller.bestellen(best, true);
		double betrag = best.getBestellung(1).getGesamtbetrag();
		assertEquals("Gesamtbetrag getestet", 85.5, betrag, 0.05);
	}
	
	@Test
	public void testGetGesamtbetrag2() {
		best = new Bestellungen();
		mueller = new Kunde("2;Müller;Tom;15");
		nikeFree = new Artikel(1, "Nike Free", 5.0);
		
		mueller.setAnzVergangenerBestellungen(4);
		mueller.hinzufuegenArtikelInWarenkorb(nikeFree);
		mueller.bestellen(best, false);
		double betrag = best.getBestellung(1).getGesamtbetrag();
		assertEquals("Gesamtbetrag getestet", 4.75, betrag, 0.05);
	}
	
	@Test
	public void testGetGesamtbetrag3() {
		best = new Bestellungen();
		mueller = new Kunde("2;Müller;Tom;30");
		nikeFree = new Artikel(1, "Nike Free", 5.0);
		
		mueller.setAnzVergangenerBestellungen(15);
		mueller.hinzufuegenArtikelInWarenkorb(nikeFree);
		mueller.bestellen(best, false);
		double betrag = best.getBestellung(1).getGesamtbetrag();
		assertEquals("Gesamtbetrag getestet", 4.625, betrag, 0.05);
	}

}
