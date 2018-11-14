package Ue2_PizzeriaBeispiel.src;

public class BerlinPizzeria extends Pizzeria {

	@Override
	public Pizza erstellePizza(String typ) {
		Pizza pizza = null;
		if (typ.equals("Salami")) {
			pizza = new BerlinerSalamiPizza();
		} else if (typ.equals("Schinken")) {
			pizza = new BerlinerSchinkenPizza();
		} else if (typ.equals("Thunfisch")) {
			pizza = new BerlinerThunfischPizza();
		}
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacken();
		return pizza;
	}

}
