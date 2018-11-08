package Speisen;

public class TestSpeisekarte {

	public static void main(String[] args) {
		SpeisekartenKomponente komp = new SpeisekartenKomponente("Pizza");
		SpeisekartenKomponente komp11 = new SpeisekartenKomponente("Nudeln");
		SpeisekartenKomponente komp12 = new SpeisekartenKomponente("Kartoffeln");
		SpeisekartenKomponente komp121 = new SpeisekartenKomponente("Broccoli");
		
		komp.hinzufuegen(komp11);
		komp.hinzufuegen(komp12);
		
		komp12.hinzufuegen(komp121);
		
		Speise speise111 = new Speise("Gnocchi");
		Speise speise112 = new Speise("Tomate");
		
		Speise speise121 = new Speise("Gurke");
		Speise speise122 = new Speise("Rucola");
		Speise speise123 = new Speise("Salz");
		
		Speise speise1211 = new Speise("Pfeffer");
		
		komp11.hinzufuegen(speise111);
		komp11.hinzufuegen(speise112);
		
		komp12.hinzufuegen(speise121);
		komp12.hinzufuegen(speise122);
		komp12.hinzufuegen(speise123);
		
		komp121.hinzufuegen(speise1211);
		
		System.out.println("erster aufruf");
		System.out.println();
		komp.ausgeben();
		
		komp12.entfernen(komp121);
		
		System.out.println("zweiter aufruf");
		System.out.println();
		komp.ausgeben();
	}

}
