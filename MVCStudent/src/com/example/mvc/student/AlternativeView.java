package com.example.mvc.student;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlternativeView implements IView {
	private StudentController controller;
	private StudentModel model;

	JFrame viewFrame;
	JPanel viewPanel;
	JPanel studentPanel;
	JPanel semesterPanel;
	JLabel semesterLabel;
	JLabel studentLabel;
	JLabel numberLabel;
	JLabel titelLabel;
	JLabel studentTitelLabel;
	JLabel semesterTitelLabel;
	JLabel numberTitelLabel;

	public AlternativeView(StudentController scontroller, StudentModel smodel) {
		controller = scontroller;
		model = smodel;
		model.anmelden(this);
		createElements();
	}

	public void createElements() {
		viewPanel = new JPanel(new BorderLayout());

		studentPanel = new JPanel(new FlowLayout());
		studentTitelLabel = new JLabel("Name: ");
		studentLabel = new JLabel(model.getName());
		studentPanel.add(studentTitelLabel);
		studentPanel.add(studentLabel);

		semesterPanel = new JPanel(new FlowLayout());
		semesterTitelLabel = new JLabel("Anzahl Semester: ");
		semesterLabel = new JLabel(model.getSemester());
		numberTitelLabel = new JLabel("Nummer: ");
		numberLabel = new JLabel(model.getNumber());
		semesterPanel.add(semesterTitelLabel);
		semesterPanel.add(semesterLabel);
		semesterPanel.add(numberTitelLabel);
		semesterPanel.add(numberLabel);

		titelLabel = new JLabel("Das ist eine alternative View!");
		viewPanel.add(studentPanel, BorderLayout.WEST);
		viewPanel.add(semesterPanel, BorderLayout.SOUTH);
		viewPanel.add(titelLabel, BorderLayout.NORTH);
		viewFrame = new JFrame("Alternative View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setBounds(700, 200, 500, 200);
		viewFrame.setVisible(true);

	}

	/**
	 * Diese Methode wird vom Model aufgerufen, wenn sich das Model verändert
	 * hat.
	 * 
	 */
	public void aktualisieren(IModel model) {

		semesterLabel.setText(model.getSemester());

	}

}