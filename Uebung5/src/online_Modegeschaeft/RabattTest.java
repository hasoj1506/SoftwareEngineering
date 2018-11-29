package online_Modegeschaeft;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RabattTest {

	@Before
	public void setUp() throws Exception {
		Bestellungen best = new Bestellungen();
		Kunde Mueller = new Kunde("2;Müller;Tom;17");
		Artikel NikeFree = new Artikel(1, "Nike Free", 89.99);
		
		Mueller.setAnzVergangenerBestellungen(15);
		Mueller.hinzufuegenArtikelInWarenkorb(NikeFree);
		Mueller.bestellen(best, true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetGesamtbetrag() {
		
	}

}
