package mvcUntersuchen;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BarChartView implements IObserverInterface {
	IModelInterface m_model;
	JFrame m_viewFrame;
	JPanel m_viewPanel;

	public BarChartView(IModelInterface model) {
		createComponents();
		m_model = model;
		model.registerObserver(this);
	}

	public void createComponents() {
	}

	public void update() {
		double red = m_model.getRedPercentage();
		double green = m_model.getGreenPercentage();
		double blue = m_model.getBluePercentage();
		m_viewPanel = createChartPanel(red, green, blue);
	}

	private JPanel createChartPanel(final double red, final double green, final double blue) {
		return null; //ändern
	}
}
