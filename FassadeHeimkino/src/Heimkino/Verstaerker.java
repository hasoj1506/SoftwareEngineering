package Heimkino;

public class Verstaerker {

	public CDPlayer cdPlayer;
	public DVDPlayer dvdPlayer;
	public HeimkinoFassade heimkinoFassade;

	public Verstaerker() {

	}

	public void ein() {
		System.out.println("Verstärker startet.");

	}

	public void setCd(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public void setDvd() {
		System.out.println("Verstärker wird auf DVD gesetzt");

	}

	public void setSurroundSound() {
		System.out.println("Verstärker wird auf Surround Sound gesetzt.");

	}

}