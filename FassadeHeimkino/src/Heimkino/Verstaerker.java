package Heimkino;

public class Verstaerker {

	public CDPlayer cdPlayer;
	public DVDPlayer dvdPlayer;
	public HeimkinoFassade heimkinoFassade;

	public Verstaerker() {

	}

	public void aus() {

	}

	public void ein() {
		System.out.println("Verst�rker startet.");

	}

	public void setCd(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public void setDvd() {
		System.out.println("Verst�rker wird auf DVD gesetzt");

	}

	public void setLautstaerke() {

	}

	public void setStereoSound() {

	}

	public void setSurroundSound() {
		System.out.println("Verst�rker wird auf Surround Sound gesetzt.");

	}

	public void setTuner() {

	}
}