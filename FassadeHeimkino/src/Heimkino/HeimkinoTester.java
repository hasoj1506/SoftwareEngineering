package Heimkino;
/**
 * @author ispeckens
 * @version 1.0
 * @created 05-Nov-2018 15:20:58
 */
public class HeimkinoTester {

	public FassadeHeimkino m_FassadeHeimkino;

	public HeimkinoTester(){

	}

	public void finalize() throws Throwable {

	}
	
	public static void main(String[] args) {
		FassadeHeimkino kino1 = new FassadeHeimkino();
		
		kino1.FilmStarten();
		
		FassadeHeimkino cd1 = new FassadeHeimkino();
		
		cd1.CDStarten();

	}
}//end HeimkinoTester