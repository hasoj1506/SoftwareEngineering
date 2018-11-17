package mvcUntersuchen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;

public class AndereView implements IObserverInterface {
	private IModelInterface m_model;
	private JPanel m_viewPanel;
	
	private JFrame andereView;

	public AndereView(IModelInterface model) {
		createComponents();
		m_model = model;
		model.registerObserver(this);
	}

	public void createComponents() {
		andereView = new JFrame("Andere View");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		andereView.getContentPane().setLayout(gridBagLayout);
	}

	public void update() {
		double red = m_model.getRedPercentage();
		double green = m_model.getGreenPercentage();
		double blue = m_model.getBluePercentage();
	}
}
