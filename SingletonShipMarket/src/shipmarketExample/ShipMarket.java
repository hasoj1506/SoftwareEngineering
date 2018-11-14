package shipmarketExample;

public class ShipMarket {
	private static ShipMarket instance;

	private ShipMarket() {
		System.out.println("ShipMarket erzeugt");
	}

	public static ShipMarket getInstance() {
		if (instance == null) {
			instance = new ShipMarket();
		}
		return instance;
	}

	public void advertiseShipForSale(Ship ship, ShipOwner shipOwner) {
		System.out.println("The ship " + ship.getName() + " has been advertised for sale by " + shipOwner.getName());

	}

	public void registerInterestForShip(Ship ship, ShipOwner shipOwner) {
		System.out.println(shipOwner.getName() + " has registered interest for the ship " + ship.getName());

	}

	public void completeTransfer(Ship ship, ShipOwner shipOwner1, ShipOwner shipOwner2) {
		System.out.println("The transfer of the ship " + ship.getName() + " from " + shipOwner1.getName() + " to "
				+ shipOwner2.getName() + " has been completed!");
		shipOwner2.getShips().add(ship);

	}

}
