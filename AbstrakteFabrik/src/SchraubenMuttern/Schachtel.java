package SchraubenMuttern;

public class Schachtel {
	private int anzahl;
	private int anzahlSchrauben = 0;
	private int anzahlMuttern = 0;
	private ISchraube[] schrauben;
	private IMutter[] muttern;

	Schachtel(int groesse) {
		anzahl = groesse;
		schrauben = new ISchraube[anzahl];
		muttern = new IMutter[anzahl];
	}

	int anzahl() {
		return anzahl;
	}

	public void legeSchraubeHinein(ISchraube schraube) {
		if (anzahlSchrauben == anzahl) // wenn schon voll
		{
			return;
		} else {
			anzahlSchrauben++;
			schrauben[anzahlSchrauben - 1] = schraube;
		}
	}

	public void legeMutterHinein(IMutter mutter) {
		if (anzahlMuttern == anzahl) // wenn schon voll
		{
			return;
		} else {
			anzahlMuttern++;
			muttern[anzahlMuttern - 1] = mutter;
		}
	}

	public void zeigeInhalt() {
		int i;
		for (i = 0; i < anzahlSchrauben; i++) {
			schrauben[i].print();
		}
		for (i = 0; i < anzahlMuttern; i++) {
			muttern[i].print();
		}
	}
}
