package com.example.csvadapter;

import java.util.Vector;

public class Person {

	private String nachname;
	private String vorname;
	public IPersonenLeser m_IPersonenLeser;
	
	public Person(String nachname, String vorname)
	{
		this.nachname = nachname;
		this.vorname = vorname;
	}
	
	public void print()
	{
		System.out.println(vorname + " " + nachname);
	}
	
}
