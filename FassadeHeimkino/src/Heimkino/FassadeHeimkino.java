package Heimkino;

/**
 * @author ispeckens
 * @version 1.0
 * @created 05-Nov-2018 15:20:58
 */
public class FassadeHeimkino {

	Beleuchtung beleuchtung;
	Leinwand leinwand;
	Verstaerker verstaerker;
	Beamer beamer;
	DVDSpieler dvdSpieler;
	CDSpieler cdspieler;

	public FassadeHeimkino() {

		beleuchtung = new Beleuchtung();
		leinwand = new Leinwand();
		verstaerker = new Verstaerker();
		beamer = new Beamer();
		dvdSpieler = new DVDSpieler();
		cdspieler = new CDSpieler();

	}

	public void FilmStarten() {
		beleuchtung.dimmen();
		leinwand.runter();
		verstaerker.ein();
		beamer.ein();
		dvdSpieler.ein();
		verstaerker.setDvd();
		verstaerker.setSurroundSound();
		dvdSpieler.setSetSurroundSound();
		dvdSpieler.spielen();
	}

	public void CDStarten() {
		cdspieler.ein();

	}
}// end FassadeHeimkino