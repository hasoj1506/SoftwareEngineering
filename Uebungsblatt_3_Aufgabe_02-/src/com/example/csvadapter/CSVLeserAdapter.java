package com.example.csvadapter;
import java.util.Vector;


public class CSVLeserAdapter implements IPersonenLeser {
	private String file;
	
	public CSVLeserAdapter(String file)
	{
		this.file = file;
	}
	
	@Override
	public Vector<Person> lesePersonen() {
		
		CSVLeser leser = new CSVLeser();
		Vector<String[]> gelesenePersonen = leser.lesePersonenDatei(file);
		Vector<Person> personenVector = new Vector<Person>();
		for (String[] person : gelesenePersonen)
			personenVector.add(new Person (person [0], person[1]));
		return personenVector;
		
	}

}
