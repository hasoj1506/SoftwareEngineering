package Speisen;

import java.util.ArrayList;

public abstract class Speisekarte {
	
	private String name = "";
	private String beschreibung;
	static int ebene = 0;
	ArrayList<Speisekarte> speisekartenKomponenten = new ArrayList<Speisekarte>();

	public Speisekarte(String name){
		this.name = name;
	}

	public abstract void ausgeben();

	public void entfernen(Speisekarte s){
	}

	public String getBeschreibung(){
		return beschreibung;
	}

	public void getKind(){

	}

	public String getName(){
		return name;
	}

	/**
	 * 
	 * @param s
	 */
	public void hinzufuegen(Speisekarte s){
		speisekartenKomponenten.add(s);
	}
}//end Speisekarte