package Ue2_PizzeriaBeispiel.src;

public class MuenchenerThunfischPizza extends Pizza {

	@Override
	public void vorbereiten() {
		System.out.println("Die M�nchener Thunfisch-Pizza wurde vorbereitet.");
	}

	@Override
	public void backen() {
		System.out.println("Die M�nchener Thunfisch-Pizza wurde gebacken.");
	}

	@Override
	public void schneiden() {
		System.out.println("Die M�nchener Thunfisch-Pizza wurde geschnitten.");
	}

	@Override
	public void verpacken() {
		System.out.println("Die M�nchener Thunfisch-Pizza wurde verpackt.");
	}

}
