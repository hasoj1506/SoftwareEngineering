package SchraubenMuttern;

public class KonkreteFabrikM6 implements IAbstrakteFabrik {

	@Override
	public ISchraube erzeugeSchraube() {
		return new SchraubeM6();
	}

	@Override
	public IMutter erzeugeMutter() {
		return new MutterM6();
	}

}
