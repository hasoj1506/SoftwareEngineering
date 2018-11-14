package shipmarketExample;

public class ShipMarket {
	private static ShipMarket instance;
	
	private ShipMarket(){
		System.out.println("ShipMarket erzeugt");
	}
	
	public static ShipMarket getInstance(){
		if (instance == null){
			instance = new ShipMarket();
		}
		return instance;
	}
	
	public void advertiseShipForSale(Ship ship, ShipOwner shipOwner){
		
	}
	
	public void registerInterestForShip(Ship ship, ShipOwner shipOwner){
		
	}
	
	public void completeTransfer(Ship ship, ShipOwner shipOwner1, ShipOwner shipOwner2){
		
	}

}
