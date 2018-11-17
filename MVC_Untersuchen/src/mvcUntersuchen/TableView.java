package mvcUntersuchen;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;

public class TableView implements IObserverInterface {
	private IControllerInterface m_controller;
	private IModelInterface m_model;
	private JFrame m_tableViewFrame;
	private JTextField m_redTextField;
	private JTextField m_greenTextField;
	private JTextField m_blueTextField;
	private JLabel lblRed;
	private JLabel lblGreen;
	private JLabel lblBlue;
	private JButton m_setButton;

	public TableView(IModelInterface model) {
		createComponents();
		m_model = model;
		model.registerObserver(this);
		m_controller = new TableViewController(model, this);
	}

	public void createComponents() {

		m_tableViewFrame = new JFrame("Table View");
		m_tableViewFrame.setMinimumSize(new Dimension(100, 100));
		m_tableViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_tableViewFrame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		m_tableViewFrame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblRed = new JLabel("Red:");
		lblRed.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblRed = new GridBagConstraints();
		gbc_lblRed.gridwidth = 2;
		gbc_lblRed.insets = new Insets(0, 0, 5, 5);
		gbc_lblRed.gridx = 0;
		gbc_lblRed.gridy = 0;
		panel.add(lblRed, gbc_lblRed);

		m_redTextField = new JTextField();
		GridBagConstraints gbc_m_redTextField = new GridBagConstraints();
		gbc_m_redTextField.insets = new Insets(0, 0, 5, 0);
		gbc_m_redTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_m_redTextField.gridx = 2;
		gbc_m_redTextField.gridy = 0;
		panel.add(m_redTextField, gbc_m_redTextField);
		m_redTextField.setColumns(10);

		lblGreen = new JLabel("Green:");
		lblGreen.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblGreen = new GridBagConstraints();
		gbc_lblGreen.gridwidth = 2;
		gbc_lblGreen.insets = new Insets(0, 0, 5, 5);
		gbc_lblGreen.gridx = 0;
		gbc_lblGreen.gridy = 1;
		panel.add(lblGreen, gbc_lblGreen);

		m_greenTextField = new JTextField();
		GridBagConstraints gbc_m_greenTextField = new GridBagConstraints();
		gbc_m_greenTextField.insets = new Insets(0, 0, 5, 0);
		gbc_m_greenTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_m_greenTextField.gridx = 2;
		gbc_m_greenTextField.gridy = 1;
		panel.add(m_greenTextField, gbc_m_greenTextField);
		m_greenTextField.setColumns(10);

		lblBlue = new JLabel("Blue:");
		lblBlue.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblBlue = new GridBagConstraints();
		gbc_lblBlue.gridwidth = 2;
		gbc_lblBlue.insets = new Insets(0, 0, 0, 5);
		gbc_lblBlue.gridx = 0;
		gbc_lblBlue.gridy = 2;
		panel.add(lblBlue, gbc_lblBlue);

		m_blueTextField = new JTextField();
		GridBagConstraints gbc_m_blueTextField = new GridBagConstraints();
		gbc_m_blueTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_m_blueTextField.gridx = 2;
		gbc_m_blueTextField.gridy = 2;
		panel.add(m_blueTextField, gbc_m_blueTextField);
		m_blueTextField.setColumns(10);

		m_setButton = new JButton("Set");
		m_setButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m_controller.setValues(m_redTextField.getText(), m_greenTextField.getText(), m_blueTextField.getText());
			}
		});
		m_tableViewFrame.getContentPane().add(m_setButton, BorderLayout.SOUTH);
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

		// theoretisch:
		m_redTextField.setText(String.valueOf(m_model.getRedPercentage()));
		m_greenTextField.setText(String.valueOf(m_model.getGreenPercentage()));
		m_blueTextField.setText(String.valueOf(m_model.getBluePercentage()));
	}
}