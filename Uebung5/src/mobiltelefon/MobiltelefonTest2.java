package mobiltelefon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MobiltelefonTest2 {
	Mobiltelefon2 telefon;

	@Before
	public void setUp() throws Exception {
		telefon = new Mobiltelefon2("Peter", "Nokia", "blau");
	}

	@After
	public void tearDown() throws Exception {
		telefon.einschalten();
		assertEquals("Telefon eingeschaltet", true, telefon.getEingeschaltet());
	}

	@Test
	public void testEinschalten() {
		telefon.einschalten();
		assertEquals("Telefon solltet eingeschaltet sein!",true, telefon.getEingeschaltet());
	}

	@Test
	public void testAusschalten() {
		telefon.ausschalten();
		assertEquals("Telefon sollte ausgeschaltet sein!", false, telefon.getAusgeschaltet());
	}

	@Test
	public void testTelefonieren() {
		System.out.println("Bitte geben Sie eine Telefonnummer ein: ");
		String tel = EAM.rString();
		telefon.telefonieren(tel);
		assertEquals("Sie sollten nun mit dem Telefon telefonieren können!", true, telefon.getTelefonieren());
	}

	@Test
	public void testSpielen() {
		telefon.spielen();
		assertEquals("Man kann so lange Spielen bis der Akku alle ist", true, telefon.getSpielen());
	}

}
