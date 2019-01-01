package edu.ncsu.monopoly;

public interface IOwnable {

	Player getTheOwner();

	int getPrice();

	boolean isAvailable();

	void setAvailable(boolean available);

	void setTheOwner(Player owner);

}