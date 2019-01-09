package Heimkino;

public class HeimkinoFassade {

	Beleuchtung beleuchtung;
	Leinwand leinwand;
	Verstaerker verstaerker;
	Beamer beamer;
	DVDPlayer dvdPlayer;
	CDPlayer cdPlayer;

	public HeimkinoFassade() {

		beleuchtung = new Beleuchtung();
		leinwand = new Leinwand();
		verstaerker = new Verstaerker();
		beamer = new Beamer();
		dvdPlayer = new DVDPlayer();
		cdPlayer = new CDPlayer();

	}

	public void FilmStarten() {
		beleuchtung.dimmen();
		leinwand.runter();
		verstaerker.ein();
		beamer.ein();
		dvdPlayer.ein();
		verstaerker.setDvd();
		verstaerker.setSurroundSound();
		dvdPlayer.setSetSurroundSound();
		dvdPlayer.spielen();
	}

	public void CDStarten() {
		cdPlayer.ein();

	}
}// end FassadeHeimkino