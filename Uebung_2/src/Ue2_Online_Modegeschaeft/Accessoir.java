package Ue2_Online_Modegeschaeft;

public class Accessoir extends Artikel implements IArtikel {
	
	private String material;

	public Accessoir(int aNr, String bez, double pr, String mat){
		super(aNr, bez, pr);
		this.material = mat;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String mat) {
		this.material = mat;
	}

}
