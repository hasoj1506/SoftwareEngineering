package mvcUntersuchen;

import java.util.ArrayList;

public class DataModel implements IModelInterface {
	private int m_redValue = 0;
	private int m_greenValue = 0;
	private int m_blueValue = 0;
	private ArrayList<IObserverInterface> m_observers = new ArrayList<IObserverInterface>();

	public double getBluePercentage() {
		double total = m_redValue + m_greenValue + m_blueValue;
		if (total > 0)
			return m_blueValue / total;
		return 0;
	}

	public double getGreenPercentage() {
		double total = m_redValue + m_greenValue + m_blueValue;
		if (total > 0)
			return m_greenValue / total;
		return 0;
	}

	public double getRedPercentage() {
		double total = m_redValue + m_greenValue + m_blueValue;
		if (total > 0)
			return m_redValue / total;
		return 0;
	}

	public void setBlueValue(int value) {
		m_blueValue = value;
		notifyObservers();
	}

	public void setGreenValue(int value) {
		m_greenValue = value;
		notifyObservers();
	}

	public void setRedValue(int value) {
		m_redValue = value;
		notifyObservers();
	}

	public void notifyObservers() {
		for (int i = 0; i < m_observers.size(); ++i)
			m_observers.get(i).update();
	}

	public void registerObserver(IObserverInterface o) {
		m_observers.add(o);
	}

	public void removeObserver(IObserverInterface o) {
		if (m_observers.contains(o))
			m_observers.remove(o);
	}
}