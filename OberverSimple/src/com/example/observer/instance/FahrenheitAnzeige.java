package com.example.observer.instance;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FahrenheitAnzeige implements Anzeige {
	private JLabel tempLabel = new JLabel("Temperatur:");
	private JLabel tempValue = new JLabel("UNDEF");
	private JFrame mainWindow = new JFrame("Fahrenheitanzeige");
	private FlowLayout flow = new FlowLayout();
	
	public FahrenheitAnzeige(){
		mainWindow.getContentPane().setLayout(flow);
		mainWindow.add(tempLabel);
		mainWindow.add(tempValue);
		mainWindow.pack();
		mainWindow.setVisible(true);
	}

	@Override
	public void zeigeAn(Fuehler fuehler) {
		String tempText = fuehler.getTemperatur();
		Double tempGrad = Double.parseDouble(tempText);
		Double tempFh = (tempGrad * (9/5)) + 32;
		tempValue.setText(String.valueOf(tempFh));

	}

}
