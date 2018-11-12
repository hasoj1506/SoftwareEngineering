package com.example.mvc.student;

import java.util.ArrayList;

public class StudentModel implements IModel {
	private String name;
	private String number;
	private int semester=0;
	private ArrayList<IView> views = new ArrayList<IView>();

	//private IView view;
	
	public StudentModel(String sname, String snumber, int ssemester)
	{
		name = sname;
		number = snumber;
		semester = ssemester;
	}
	
	public void increaseSemester()
	{
		semester++;
		benachrichtigen();
		
	}
	
	public void anmelden(IView view) {
		views.add(view);
	}
	
	@Override
	public void abmelden(IView view) {
		if(views.contains(view))
			views.remove(view);
		
	}

	
	private void benachrichtigen() {
		
		for(int i = 0; i < views.size(); ++i)
			views.get(i).aktualisieren(this);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
	public String getSemester()
	{
		return String.valueOf(semester);
		
	}

	
}