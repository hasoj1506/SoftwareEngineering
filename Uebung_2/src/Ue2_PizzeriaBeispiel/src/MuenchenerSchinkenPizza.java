package Ue2_PizzeriaBeispiel.src;

public class MuenchenerSchinkenPizza extends Pizza {

	@Override
	public void vorbereiten() {
		System.out.println("Die M�nchener Schinken-Pizza wurde vorbereitet.");
	}

	@Override
	public void backen() {
		System.out.println("Die M�nchener Schinken-Pizza wurde gebacken.");
	}

	@Override
	public void schneiden() {
		System.out.println("Die M�nchener Schinken-Pizza wurde geschnitten.");
	}

	@Override
	public void verpacken() {
		System.out.println("Die M�nchener Schinken-Pizza wurde verpackt.");
	}

}
