package Speisen;

import java.util.Iterator;

public class SpeisekartenKomponente extends Speisekarte {
	private Double preis;
	private boolean isVegetarisch;

	public SpeisekartenKomponente(String name) {
		super(name);
	}

	public void ausgeben(){
		String formatString;
		ebene++;
		formatString = "%" + (ebene * 2) + "s";
		System.out.printf(formatString, "");
		System.out.println("+ " + super.getName() + "");
		for(Iterator<Speisekarte> iter = speisekartenKomponenten.iterator(); iter.hasNext();){
			Speisekarte f = (Speisekarte) (iter.next());
			f.ausgeben();
		}
		--ebene;
	}

	public void entfernen(Speisekarte s){
		for(Iterator<Speisekarte> iter = speisekartenKomponenten.iterator(); iter.hasNext();){
			Speisekarte f = (Speisekarte) iter.next();
			if(f instanceof Speisekarte){
				((Speisekarte) f).entfernen(s);
			}
		}
		speisekartenKomponenten.remove(s);
	}


	public Double getPreis(){
		return preis;
	}

	public boolean isVegetarisch(){
		return isVegetarisch;
	}
}//end SpeisekartenKomponente