package shipmarketExample;

import java.util.ArrayList;

public class ShipOwner {

	private String name;
	// private ShipMarket market;
	private ArrayList<Ship> ships;

	public ShipOwner(String name) {
		this.name = name;
		this.ships = new ArrayList<Ship>();
	}

	public void printShips(ArrayList<Ship> ships) {
		for (Ship s : ships) {
			System.out.println(s.getName());
		}
	}

	public ArrayList<Ship> getShips() {
		return ships;
	}

	public void addShip(Ship ship) {
		ships.add(ship);
	}

	public String getName() {
		return name;
	}

	public void advertiseShipForSale(String shipName) {
		for (Ship s : ships) {
			if (s.getName().equals(shipName)) {
				ShipMarket.getInstance().advertiseShipForSale(s, this);
			}
		}
	}

	public void registerInterestForShip(Ship ship) {
		ShipMarket.getInstance().registerInterestForShip(ship, this);
	}

}
