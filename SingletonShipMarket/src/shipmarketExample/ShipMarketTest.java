package shipmarketExample;

public class ShipMarketTest {

	public static void main(String[] args) {
		
		ShipMarket.getInstance();

		ShipOwner so1 = new ShipOwner("Meier");
		ShipOwner so2 = new ShipOwner("Mueller");
		ShipOwner so3 = new ShipOwner("Hansen");

		Ship karsten = new Ship("St. Karsten");
		Ship karolin = new Ship("St. Karolin");
		Ship kristina = new Ship("St. Kristina");

		Ship josef = new Ship("St. Josef");
		Ship julian = new Ship("St. Julian");
		Ship johanna = new Ship("St. Johanna");

		Ship markus = new Ship("St. Markus");
		Ship manfred = new Ship("St. Manfred");
		Ship milena = new Ship("St. Milena");

		so1.addShip(karsten);
		so1.addShip(karolin);
		so1.addShip(kristina);

		so2.addShip(josef);
		so2.addShip(julian);
		so2.addShip(johanna);

		so3.addShip(markus);
		so3.addShip(manfred);
		so3.addShip(milena);

		// Bevor es auf den ShipMarket ging
		System.out.println("Without trading:");
		System.out.println("Current ships from Meier:");
		so1.printShips(so1.getShips());
		System.out.println();
		System.out.println("Current ships from Mueller:");
		so2.printShips(so2.getShips());
		System.out.println();
		System.out.println("Current ships from Hansen:");
		so3.printShips(so3.getShips());
		System.out.println();

		// Alle 3 bieten ein Schiff an
		so1.advertiseShipForSale("St. Karolin");
		so2.advertiseShipForSale("St. Johanna");
		so3.advertiseShipForSale("St. Milena");
		System.out.println();

		// Jemand ist interessiert
		so2.registerInterestForShip(karolin);
		System.out.println();

		// Transfer completed
		ShipMarket.getInstance().completeTransfer(karolin, so1, so2);

	}

}
