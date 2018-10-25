package com.example.csvadapter;
import java.util.Vector;

/***
 * 
 * Tester für die AdapterLösung
 * 
 *
 */

public class TestAdapter {
	public CSVLeser m_CSVLeser;


	public static void main (String[] args)
	{
		IPersonenLeser leser = new CSVLeserAdapter("person.csv");
		Vector<String[]> personen = leser.lesePersonen();
		
		for (String[] person : personen)
		{
			person.print();
		}
	}
}
