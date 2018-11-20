package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ArtikelControllerInterface;
import controller.ArtikelLabelController;
import controller.ArtikelTextFieldController;
import model.ArtikelModel;
import model.ArtikelModelInterface;
import model.KundeModel;
import model.Observer;
import javax.swing.JTextField;

public class ArtikelTextFieldView implements Observer {

	private ArtikelTextFieldController a_controller;
	private ArtikelModelInterface a_model;
	private JFrame frame;
	private JLabel artikelbezeichnung;
	private JLabel artikelpreis;
	private JButton preisAendernButton;
	private JTextField preisAendernTextField;

	public ArtikelTextFieldView(ArtikelModelInterface artikelModelInterface, KundeModel k_model) {
		a_model = artikelModelInterface;
		a_model.register(this);
		a_controller = new ArtikelTextFieldController(artikelModelInterface, this, k_model);
		createComponents();
	}

	public void createComponents() {

		frame = new JFrame("Artikel");

		artikelbezeichnung = new JLabel("Bezeichnung: " + a_model.getBezeichnung());
		artikelpreis = new JLabel("Preis: " + a_model.getPreis() + "€");
		preisAendernButton = new JButton("Preis ändern");
		preisAendernButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a_controller.setPreis(Double.parseDouble(preisAendernTextField.getText()));
				;
			}
		});

		frame.getContentPane().setLayout(new GridLayout(4, 1));
		frame.getContentPane().add(artikelbezeichnung);
		frame.getContentPane().add(artikelpreis);

		preisAendernTextField = new JTextField();
		frame.getContentPane().add(preisAendernTextField);
		preisAendernTextField.setColumns(10);
		frame.getContentPane().add(preisAendernButton);

		frame.setSize(300, 150);

		frame.setVisible(true);

	}

	@Override
	public void update() {
		// Hier Werte des Models abfragen und Labels anpassen
		artikelpreis.setText("Preis: " + a_model.getPreis() + "€");
	}

}
