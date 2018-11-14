package SchraubenMuttern;

public class ProduktionsMaschine {
	private IAbstrakteFabrik fabrik = null;

	public void setFabrik(IAbstrakteFabrik fabrikRef) {
		this.fabrik = fabrikRef;
	}

	public void fuelleSchachtel(Schachtel schachtel) {
		int i;
		for (i = 0; i < schachtel.anzahl(); i++) {
			schachtel.legeSchraubeHinein(fabrik.erzeugeSchraube());
			schachtel.legeMutterHinein(fabrik.erzeugeMutter());
		}
	}
}
