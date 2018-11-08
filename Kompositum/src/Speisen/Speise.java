package Speisen;

public class Speise extends Speisekarte {

	public Speise(String name){
		super(name);
	}

	public void ausgeben(){
		String formatString;
		formatString = "%" + (ebene * 2) + "s";
		System.out.printf(formatString, "");
		System.out.println(" - " + super.getName());
	}

}//end Speise