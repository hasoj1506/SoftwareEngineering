package Ue2_PizzeriaBeispiel.src;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pizzeria muenchenPizzeria;
		Pizzeria berlinPizzeria;
		
		muenchenPizzeria = new MuenchenPizzeria();
		berlinPizzeria = new BerlinPizzeria();
		
		berlinPizzeria.erstellePizza("Salami");
		System.out.println();
		muenchenPizzeria.erstellePizza("Schinken");
		
	}

}
