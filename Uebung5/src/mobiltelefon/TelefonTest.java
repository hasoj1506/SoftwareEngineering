package mobiltelefon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelefonTest {
	private Mobiltelefon telefon;

	@Before
	public void setUp() throws Exception {
		telefon = new Mobiltelefon("Hans", "Samsung", "blau");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEinschalten() {
		telefon.einschalten();
		assertEquals("Mobiltelefon eingeschaltet", true, telefon.getEingeschaltet());
	}

	@Test
	public void testAusschalten() {
		telefon.ausschalten();
		assertEquals("Mobiltelefon ausgeschaltet", true, telefon.getAusgeschaltet());
	}

	@Test
	public void testTelefonieren() {
		int ladezustandVorher = telefon.getLadezustand();
		telefon.telefonieren("12345");
		assertEquals("Mobiltelefon weniger geladen", ladezustandVorher - 30, telefon.getLadezustand());
	}

	@Test
	public void testSpielen() {
		int ladezustandVorher = telefon.getLadezustand();
		telefon.spielen();
		assertEquals("Mobiltelefon weniger geladen", ladezustandVorher - 20, telefon.getLadezustand());
	}

}
