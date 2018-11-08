package Proxy;

public class ProxyDateiZugriff implements IDateizugriff {
	String name;
	IDateizugriff realeDatei;
	
	public ProxyDateiZugriff(String name) {
		this.name = name;
		System.out.println("Stellvertretendes Objekt instanziiert");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getInhalt() {
		if(realeDatei == null){
			System.out.println("Inhalt liegt lokal nicht vor");
			realeDatei = new Dateizugriff(name);
		}
		return realeDatei.getInhalt();
	}
}
