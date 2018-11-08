package Proxy;

public class Dateizugriff implements IDateizugriff {
	String name;
	
	public Dateizugriff(String name){
		this.name = name;
		System.out.println("Echtes Objekt instanziiert.");
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getInhalt() {
		return ("Daten von " + name);
	}

}
