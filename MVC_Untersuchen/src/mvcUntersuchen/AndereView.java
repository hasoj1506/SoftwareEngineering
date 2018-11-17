package mvcUntersuchen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JProgressBar;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class AndereView implements IObserverInterface {
	private IModelInterface m_model;
	private JPanel m_viewPanel;
	private JButton redButton;
	private JButton greenButton;
	private JButton blueButton;

	private JFrame andereView;

	public AndereView(IModelInterface model) {
		createComponents();
		m_model = model;
		model.registerObserver(this);
	}

	public void createComponents() {
		andereView = new JFrame("Andere View");
		andereView.setMinimumSize(new Dimension(300, 300));
		andereView.setVisible(true);
		andereView.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		redButton = new JButton("");
		redButton.setPreferredSize(new Dimension(80, 150));
		redButton.setForeground(Color.WHITE);
		redButton.setBackground(Color.RED);
		andereView.getContentPane().add(redButton);

		greenButton = new JButton("");
		greenButton.setPreferredSize(new Dimension(80, 150));
		greenButton.setForeground(Color.WHITE);
		greenButton.setBackground(Color.GREEN);
		andereView.getContentPane().add(greenButton);

		blueButton = new JButton("");
		blueButton.setPreferredSize(new Dimension(80, 150));
		blueButton.setForeground(Color.WHITE);
		blueButton.setBackground(Color.BLUE);
		andereView.getContentPane().add(blueButton);
	}

	public void update() {
		redButton.setText(String.valueOf(m_model.getRedPercentage() * 100) + " %");
		greenButton.setText(String.valueOf(m_model.getGreenPercentage() * 100) + " %");
		blueButton.setText(String.valueOf(m_model.getBluePercentage() * 100) + " %");

	}
}
