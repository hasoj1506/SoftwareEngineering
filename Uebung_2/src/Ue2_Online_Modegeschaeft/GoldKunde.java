package Ue2_Online_Modegeschaeft;

public class GoldKunde extends Kunde implements IKunde {

	public GoldKunde(String s) {
		super(s);
		setRabatt(20);
	}

}
