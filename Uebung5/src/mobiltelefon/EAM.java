package mobiltelefon;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//Datei EAM.java
/* ------------------------------------------------------------------------
 Die Klasse EAM ("Eingabe-Modul") enthaelt Methoden, mit denen man Werte der
 8 primitiven Typen (byte, char, short, int, long, float, double, boolean)
 und Objekte der Klasse String von der Standardeingabe (das ist normalerweise 
 die Tastatur) einlesen kann.

 Die Funktion rShort liefert ein Ergebnis vom Typ short. Entsprechendes
 gilt auch fuer die anderen Funktionen mit Namen der Form rXXX.

 Zahlen muss der Benutzer wie Java-Literale eingeben, d.h. mit einem Punkt
 als dezimalem Separator und ohne Gruppierung der Ziffern, z.B. so:
 123 oder 12.34 oder -10000000.00 etc. Als erstes Zeichen ist ein Minus-
 Zeichen '-' (aber kein Pluszeichen '+') erlaubt. Kommata inZeichenketten,
 (z.B. 12,34 oder 12,345 oder 12345,67) sind als Repraesentation einer 
 Zahl eigentlich nicht erlaubt, werden aber durch einen Dezimalpunkt ersetzt. 

 Wenn beim Einlesen eines Wertes eine Ausnahme auftritt (z.B. weil der
 Benutzer Buchstaben eingegeben hat, obwohl nur Ziffern erlaubt sind), wird
 dder Benutzer aufgefordert, eine erneute Eingabe mit gültigen Werten zu
 tätigen. Ein Abbruch durch eine Fehleingabe ist nicht vorgesehen.
 ---------------------------------------------------------------------------
 Hinweis: In den Methoden rShort, rByte, rInt und rLong werden jetzt
 die Methoden namens decode anstelle von parseShort, parseByte, parseInt bzw.
 parseLong verwendet. Die parse-Methoden koennen nur dezimale Zahlen
 umwandeln, decode "versteht" auch Hexadezimalzahlen wie "0xFF" und
 "#FF" und Oktalzahlen wie "0377".*/

public class EAM {

	// ---------------------------------------------------------------------
	
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(isr);
	
	// ---------------------------------------------------------------------

	public static long rLong() {
		// Liest einen long-Wert von der Standardeingabe und liefert ihn als
		// Ergebnis. Dabei wird die Zeichenkette von der Standardeingabe mit der
		// Methode decode in einen gültigen long-Wert decodiert und in der
		// Variablen input gespeichert. Überflüssige Leerzeichen werden mit der
		// Methode trim() entfernt.
		// Bei einer Fehleingabe wird eine Exception geworfen, bei der eine
		// erneute
		// Eingabe angefordert wird. Die Methode kann erst verlassen werden,
		// wenn die
		// Eingabe korrekt ist.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				long input = Long.decode(br.readLine().trim());
				return input;
			} catch (Throwable nf) {
				System.err.println("Fehler beim Einlesen eines long-Wertes!"
						+ "\nBitte geben Sie einen gültigen long-Wert\n"
						+ "zwischen " + Long.MIN_VALUE + " und "
						+ Long.MAX_VALUE + " ein: ");
			}// try/catch
		}// while
	}// rLong()

	public static int rInt() {
		// Liest einen int-Wert von der Standardeingabe und liefert ihn als
		// Ergebnis. Dabei wird die Zeichenkette von der Standardeingabe mit der
		// Methode decode in einen gültigen int-Wert decodiert und in der
		// Variablen input gespeichert. Überflüssige Leerzeichen werden mit der
		// Methode trim() entfernt.
		// Bei einer Fehleingabe wird eine Exception geworfen, bei der eine
		// erneute
		// Eingabe angefordert wird. Die Methode kann erst verlassen werden,
		// wenn die
		// Eingabe korrekt ist.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				int input = Integer.decode(br.readLine().trim());
				return input;
			} catch (Throwable nf) {
				System.err.println("Fehler beim Einlesen eines int-Wertes!"
						+ "\nBitte geben Sie einen gültigen int-Wert\n"
						+ "zwischen " + Integer.MIN_VALUE + " und "
						+ Integer.MAX_VALUE + " ein: ");
			}// try/catch
		}// while
	}// rInt()

	public static byte rByte() {
		// Liest einen byte-Wert von der Standardeingabe und liefert ihn als
		// Ergebnis. Dabei wird die Zeichenkette von der Standardeingabe mit der
		// Methode decode in einen gültigen byte-Wert decodiert und in der
		// Variablen input gespeichert. Überflüssige Leerzeichen werden mit der
		// Methode trim() entfernt.
		// Bei einer Fehleingabe wird eine Exception geworfen, bei der eine
		// erneute
		// Eingabe angefordert wird. Die Methode kann erst verlassen werden,
		// wenn die
		// Eingabe korrekt ist.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				byte input = Byte.decode(br.readLine().trim());
				return input;
			} catch (Throwable nf) {
				System.err.println("Fehler beim Einlesen eines byte-Wertes!"
						+ "\nBitte geben Sie einen gültigen byte-Wert\n"
						+ "zwischen " + Byte.MIN_VALUE + " und "
						+ Byte.MAX_VALUE + " ein: ");
			}// try/catch
		}// while
	}// rByte()

	public static short rShort() {
		// Liest einen short-Wert von der Standardeingabe und liefert ihn als
		// Ergebnis. Dabei wird die Zeichenkette von der Standardeingabe mit der
		// Methode decode in einen gültigen short-Wert decodiert und in der
		// Variablen input gespeichert. Überflüssige Leerzeichen werden mit der
		// Methode trim() entfernt.
		// Bei einer Fehleingabe wird eine Exception geworfen, bei der eine
		// erneute
		// Eingabe angefordert wird. Die Methode kann erst verlassen werden,
		// wenn die
		// Eingabe korrekt ist.

		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				short input = Short.decode(br.readLine().trim());
				return input;
			} catch (Throwable nf) {
				System.err.println("Fehler beim Einlesen eines short-Wertes!"
						+ "\nBitte geben Sie einen gültigen short-Wert\n"
						+ "zwischen " + Short.MIN_VALUE + " und "
						+ Short.MAX_VALUE + " ein: ");
			}// try/catch
		}// while
	}// rShort()

	public static char rChar() {
		// Liest einen char-Wert von der Standardeingabe und liefert ihn als
		// Ergebnis. Falls eine Ausnahme des Typs IOException auftritt, wird
		// Nutzer aufgerufen, die Eingabe erneut vorzunehmen. Vor der Rückgabe
		// wird geprüft, ob tatsächlich nur ein Zeichen eingegeben wurde.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				String input = br.readLine();
				if (input.length() > 1)
					throw new Exception();
				return input.charAt(0);
			} catch (Throwable nf) {
				System.err.println("Fehler beim Einlesen eines char-Wertes!"
						+ "\nBitte geben Sie einen gültigen char-Wert\n"
						+ "ein: ");
			}// try/catch
		}// while
	}// rChar()

	public static float rFloat() {
		// Liest einen float-Wert von der Standardeingabe und liefert ihn als
		// Ergebnis. Falls eine Ausnahme des Typs IOException oder des Typs
		// NumberFormatException auftritt, wird Nutzer aufgerufen, die Eingabe
		// erneut vorzunehmen. Das Kommazeichen wird bei der Eingabe durch einen
		// Dezimalpunkt ersetzt.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				float input = Float.parseFloat(br.readLine().replace(',', '.')
						.trim());
				return input;
			} catch (Throwable nf) {
				System.err.println("Fehler beim Einlesen eines float-Wertes!"
						+ "\nBitte geben Sie einen gültigen float-Wert\n"
						+ "zwischen " + Float.MIN_VALUE + " und "
						+ Float.MAX_VALUE + " ein: ");
			}// try/catch
		}// while
	}// rFloat()

	public static double rDouble() {
		// Liest einen double-Wert von der Standardeingabe und liefert ihn als
		// Ergebnis. Falls eine Ausnahme des Typs IOException oder des Typs
		// NumberFormatException auftritt, wird Nutzer aufgerufen, die Eingabe
		// erneut vorzunehmen. Das Kommazeichen wird bei der Eingabe durch einen
		// Dezimalpunkt ersetzt.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				double input = Double.parseDouble(br.readLine()
						.replace(',', '.').trim());
				return input;
			} catch (Throwable nf) {
				System.err.println("Fehler beim Einlesen eines double-Wertes!"
						+ "\nBitte geben Sie einen gültigen double-Wert\n"
						+ "zwischen " + Double.MIN_VALUE + " und "
						+ Double.MAX_VALUE + " ein: ");
			}// try/catch
		}// while
	}// rDouble()

	public static String rString() {
		// Liest einen String von der Standardeingabe (der aus allen Zeichen
		// besteht, die vor dem naechsten Zeilenende stehen) und liefert
		// ihn als Ergebnis. Falls eine Ausnahme des Typs IOException auf-
		// tritt (was sehr unwahrscheinlich ist), wird der Nutzer aufgerufen
		// die Eingabe erneut vorzunehmenein.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				String input = br.readLine().trim();
				return input;
			} catch (Throwable nf) {
				System.err.print("Fehler beim Einlesen eines String-Wertes!"
						+ "\nBitte geben Sie einen gültigen String-Wert\n"
						+ "ein: ");
			}// try/Catch
		}// while
	}// rString()

	public static boolean rBoolean() {
		// Liest einen boolean-Wert von der Standardeingabe und liefert ihn
		// als Ergebnis. Falls der Benutzer nicht true oder false eingibt,
		// wird der wert erneut abgefragt.
		while (true) {
			// Solange die Eingabe nicht Korrekt ist erfolgt eine Eingabe
			// des Nutzers
			try {
				String input = br.readLine().trim();
				if (input.equalsIgnoreCase("true"))
					return true;
				else if (input.equalsIgnoreCase("false"))
					return false;
				else
					throw new Exception();
			} catch (Throwable nf) {
				System.err.print("Fehler beim Einlesen eines boolean-Wertes!"
						+ "\nBitte geben Sie einen gültigen boolean-Wert\n"
						+ "\"true\" oder \"false\" ein: ");
			}// try/catch
		}// while
	}// rBoolean()
	
	public static void pause(){
		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Fehler bei der manuellen Pause!");
		}
	}
	
	public static void pause (int millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("Fehler bei der zeitabhängigen Pause!");
		}
	}
}
