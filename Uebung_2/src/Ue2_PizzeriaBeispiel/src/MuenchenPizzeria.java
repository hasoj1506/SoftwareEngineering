package Ue2_PizzeriaBeispiel.src;

public class MuenchenPizzeria extends Pizzeria {

	@Override
	public Pizza erstellePizza(String typ) {
		Pizza pizza = null;
		if (typ.equals("Salami")) {
			pizza = new MuenchenerSalamiPizza();
		} else if (typ.equals("Schinken")) {
			pizza = new MuenchenerSchinkenPizza();
		} else if (typ.equals("Thunfisch")) {
			pizza = new MuenchenerThunfischPizza();
		}
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacken();
		return pizza;
	}

}
