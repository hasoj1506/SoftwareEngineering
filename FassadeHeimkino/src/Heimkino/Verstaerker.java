package Heimkino;
/**
 * @author ispeckens
 * @version 1.0
 * @created 05-Nov-2018 15:20:58
 */
public class Verstaerker {

	public CDSpieler m_CDSpieler;
	public DVDSpieler m_DVDSpieler;
	public FassadeHeimkino m_FassadeHeimkino;

	public Verstaerker(){

	}

	public void finalize() throws Throwable {

	}
	public void aus(){

	}

	public void ein(){
		System.out.println("Verstärker geht an.");

	}

	public void setCd(CDSpieler m_CDSpieler) {
		this.m_CDSpieler = m_CDSpieler;
	}



	public void setDvd() {
		System.out.println("Verstärker wird auf DVD gesetzt");
	
	}

	public void setLautstaerke(){

	}

	public void setStereoSound(){

	}

	public void setSurroundSound(){
		System.out.println("Verstärker wird auf Surround Sound gesetzt.");

	}

	public void setTuner(){

	}
}//end Verstaerker