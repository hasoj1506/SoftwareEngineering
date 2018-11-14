package Ue2_PizzeriaBeispiel.src;

public class BerlinerThunfischPizza extends Pizza {

	@Override
	public void vorbereiten() {
		System.out.println("Die Berliner Thunfisch-Pizza wurde vorbereitet.");
	}

	@Override
	public void backen() {
		System.out.println("Die Berliner Thunfisch-Pizza wurde gebacken.");
	}

	@Override
	public void schneiden() {
		System.out.println("Die Berliner Thunfisch-Pizza wurde geschnitten.");
	}

	@Override
	public void verpacken() {
		System.out.println("Die Berliner Thunfisch-Pizza wurde verpackt.");
	}

}
