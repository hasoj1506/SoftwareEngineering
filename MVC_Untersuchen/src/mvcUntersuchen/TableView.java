package mvcUntersuchen;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableView implements IObserverInterface {
	private IControllerInterface m_controller;
	private IModelInterface m_model;
	private JFrame m_tableViewFrame;
	private JPanel m_panel;
	private JButton m_setButton;
	private JTextField m_redTextField;
	private JTextField m_greenTextField;
	private JTextField m_blueTextField;

	public TableView(IModelInterface model) {
		createComponents();
		m_model = model;
		model.registerObserver(this);
		m_controller = new TableViewController(model, this);
	}

	public void createComponents() {
		m_panel = new JPanel();
		m_redTextField = new JTextField();
		m_greenTextField = new JTextField();
		m_blueTextField = new JTextField();
		m_setButton = new JButton("Set");
		m_setButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m_controller.setValues(m_redTextField.getText(), m_greenTextField.getText(), m_blueTextField.getText());
			}
		});
		m_tableViewFrame = new JFrame("Table View");
		m_tableViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_tableViewFrame.getContentPane().add(viewPanel,BorderLayout.CENTER);
		m_tableViewFrame.pack();
		m_tableViewFrame.setBounds(100, 200, 500, 200);
		m_tableViewFrame.setVisible(true);
	}

	public void update() {
		// Update-Methode wird nach erfolgter Datenaenderung vom
		// Model aufgerufen. Da die Datenaenderung nach Eingabe vom
		// Benutzer ueber die TableView-Klasse erfolgt, und – in
		// unserem Beispiel – von nirgendwo sonst, muessen die
		// angezeigten Daten hier nicht nochmal aktualisiert werden.
	}
}