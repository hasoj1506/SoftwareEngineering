package Heimkino;

public class Tester {

	public HeimkinoFassade heimkinoFassade;

	public Tester() {

	}

	public void finalize() throws Throwable {

	}

	public static void main(String[] args) {
		HeimkinoFassade heimkino = new HeimkinoFassade();

		heimkino.FilmStarten();

		HeimkinoFassade cd1 = new HeimkinoFassade();

		cd1.CDStarten();

	}
}