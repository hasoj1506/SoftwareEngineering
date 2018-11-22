package mobiltelefon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MobiltelefonTest {
	private Mobiltelefon telefon;
	
	@Before
	public void setup() throws Exception{
		telefon = new Mobiltelefon("Meier", "Samsung", "blau");
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void testEinschalten(){
		telefon.einschalten();
		assertEquals("Mobiltelefon sollte eingeschaltet sein", true, telefon.getEingeschaltet());
	}
	
	@Test
	public void testAusschalten(){
		telefon.ausschalten();
		assertEquals("Mobiltelefon sollte ausgeschaltet sein", true, telefon.getAusgeschaltet());
	}

}
