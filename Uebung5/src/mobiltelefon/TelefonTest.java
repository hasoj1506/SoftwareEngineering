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
		telefon.telefonieren("12345");
		assertEquals("Mobiltelefon weniger geladen", telefon.getLadezustand()-30, telefon.getLadezustand());
	}

	@Test
	public void testSpielen() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEingeschaltet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAusgeschaltet() {
		fail("Not yet implemented");
	}

}
