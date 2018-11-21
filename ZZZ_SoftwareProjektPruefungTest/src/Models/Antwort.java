package Models;

public class Antwort {
	
	private boolean istRichtig;
	private String antworttext;
	
	public Antwort(String antworttext, boolean istRichtig) {
		this.antworttext = antworttext;
		this.istRichtig = istRichtig;
	}

	public boolean isIstRichtig() {
		return istRichtig;
	}

	public void setIstRichtig(boolean istRichtig) {
		this.istRichtig = istRichtig;
	}

	public String getAntworttext() {
		return antworttext;
	}

	public void setAntworttext(String antworttext) {
		this.antworttext = antworttext;
	}

}
