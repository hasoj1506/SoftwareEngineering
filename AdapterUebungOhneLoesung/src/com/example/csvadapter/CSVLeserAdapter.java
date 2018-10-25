package com.example.csvadapter;
import java.util.Vector;


public class CSVLeserAdapter implements IPersonenLeser {
	private String file;
	public CSVLeser m_CSVLeser;
	
	public CSVLeserAdapter(String file)
	{
		this.file = file;
	}
	
	@Override
	public Vector<Person[]> lesePersonen() {
		
		Vector<String[]> strings = m_CSVLeser.lesePersonenDatei(file);
		Vector<Person[]> personen;
		return personen;
		
	}

}
