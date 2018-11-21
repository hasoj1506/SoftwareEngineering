package Views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.PruefungsdetailsController;
import Models.Observer;
import Models.PruefungsModelInterface;

public class PruefungsdetailsView implements Observer{

	private PruefungsdetailsController p_controller;
	private PruefungsModelInterface p_model;
	private JFrame frame;
	private JLabel pruefungstitel;
	private JLabel pruefungsdauer;
	private JButton speichernButton;
	
	public PruefungsdetailsView(PruefungsModelInterface pruefungsModelInterface){
		p_model = pruefungsModelInterface;
		p_model.register(this);
		p_controller = new PruefungsdetailsController(pruefungsModelInterface, this);
		createComponents();
	}
	
	public void createComponents(){
		
		frame = new JFrame("Prüfung");
		
		pruefungstitel = new JLabel("Bezeichnung: " + p_model.getPruefungstitel());
		pruefungsdauer = new JLabel("Dauer: " + p_model.getPruefungsdauer());
		speichernButton = new JButton("Speichern");
		speichernButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		frame.setLayout(new GridLayout(3,1));
		frame.add(pruefungstitel);
		frame.add(pruefungsdauer);
		frame.add(speichernButton);
		
		frame.setSize(300, 150);
		
		frame.setVisible(true);

	}
	
	@Override
	public void update() {
		// Hier Werte des Models abfragen und Labels anpassen
		pruefungsdauer.setText("Dauer: " + p_model.getPruefungsdauer());
	}

}
