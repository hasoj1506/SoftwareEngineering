package Ue2_Online_Modegeschaeft;

public class SilberKunde extends Kunde implements IKunde {

	public SilberKunde(String s) {
		super(s);
		setRabatt(10);
	}

}
