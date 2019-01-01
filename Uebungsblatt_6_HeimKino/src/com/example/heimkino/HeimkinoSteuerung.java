package com.example.heimkino;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeimkinoSteuerung extends JFrame{
	
	private Verstaerker verstaerker = new Verstaerker();
	private Tuner tuner = new Tuner();
	private DVDSpieler dvd = new DVDSpieler();
	private CDSpieler cd = new CDSpieler();
	private Beamer beamer = new Beamer();
	private Leinwand leinwand = new Leinwand();
	private Beleuchtung beleuchtung = new Beleuchtung();
	
	private String modus = "";
	
	public HeimkinoSteuerung() {
		getContentPane().setLayout(null);
		
		createPlayButton();
		
		extractMethod();
		
		extracted2();
		
		createDVDModusButton();
//		btnDvdModus.setBounds(10, 7, 89, 23);
//		getContentPane().add(btnDvdModus);
		
		createCDModusButton();
		
		createAuswerfenButton();
		
		createAMButton();
		
		createFMButton();
		
		createRadioModusButton();
		
		createPlusButton();
		
		createMinusButton();
		
		createLautstaerkeLabel();
		
		createMinusButton2();
		
		createPlusButton2();
		
		createLichtLabel();
		
		createEinButton();
		
		createAusButton();
		
		createDimmenButton();
		
		createBeamerLabel();
		
		createTVModusButton();
		
		createBreitwandModusButton();
		
		createSoundLabel();
		
		createStereoButton();
		
		createSurroundButton();
		
		createOffButton();
		
		this.setSize(600, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void createOffButton() {
		JButton btnOff = new JButton("Off");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuner.aus();
				cd.aus();
				dvd.aus();
				beamer.aus();
				leinwand.hoch();
				beleuchtung.aus();
				modus = "";
				System.out.println();
			}
		});
		btnOff.setBounds(437, 300, 89, 23);
		getContentPane().add(btnOff);
	}

	private void createSurroundButton() {
		JButton btnSurround = new JButton("Surround");
		btnSurround.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "dvd") {
					dvd.setSurroundSound();
				}
				if(verstaerker.istAn()) {
					verstaerker.setSurroundSound();
				}
			}
		});
		btnSurround.setBounds(425, 204, 89, 23);
		getContentPane().add(btnSurround);
	}

	private void createStereoButton() {
		JButton btnStereo = new JButton("Stereo");
		btnStereo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "dvd") {
					dvd.setStereoSound();
				}
				if(verstaerker.istAn()) {
					verstaerker.setStereoSound();
				}
				
			}
		});
		btnStereo.setBounds(425, 169, 89, 23);
		getContentPane().add(btnStereo);
	}

	private void createSoundLabel() {
		JLabel lblSound = new JLabel("Sound");
		lblSound.setBounds(449, 145, 46, 14);
		getContentPane().add(lblSound);
	}

	private void createBreitwandModusButton() {
		JButton btnBreitwandModus = new JButton("Breitwand Modus");
		btnBreitwandModus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(beamer.istAn()) {
					beamer.breitwandModus();
				}
			}
		});
		btnBreitwandModus.setBounds(249, 184, 116, 23);
		getContentPane().add(btnBreitwandModus);
	}

	private void createTVModusButton() {
		JButton btnTvModus = new JButton("TV Modus");
		btnTvModus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(beamer.istAn()) {
					beamer.tvModus();
				}
			}
		});
		btnTvModus.setBounds(260, 156, 89, 23);
		getContentPane().add(btnTvModus);
	}

	private void createBeamerLabel() {
		JLabel lblBeamer = new JLabel("Beamer");
		lblBeamer.setBounds(285, 140, 46, 14);
		getContentPane().add(lblBeamer);
	}

	private void createDimmenButton() {
		JButton btnDimmen = new JButton("dimmen");
		btnDimmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beleuchtung.dimmen();
			}
		});
		btnDimmen.setBounds(159, 283, 69, 23);
		getContentPane().add(btnDimmen);
	}

	private void createAusButton() {
		JButton btnAus = new JButton("aus");
		btnAus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			beleuchtung.aus();
			}
		});
		btnAus.setBounds(159, 254, 68, 23);
		getContentPane().add(btnAus);
	}

	private void createEinButton() {
		JButton btnEin = new JButton("ein");
		btnEin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beleuchtung.ein();
			}
		});
		btnEin.setBounds(159, 227, 68, 23);
		getContentPane().add(btnEin);
	}

	private void createLichtLabel() {
		JLabel lblLicht = new JLabel("Licht");
		lblLicht.setBounds(181, 208, 46, 14);
		getContentPane().add(lblLicht);
	}

	private void createPlusButton2() {
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verstaerker.istAn())
					verstaerker.lauter();
			}
		});
		button_3.setBounds(58, 227, 41, 23);
		getContentPane().add(button_3);
	}

	private void createMinusButton2() {
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verstaerker.istAn())
					verstaerker.leiser();
			}
		});
		button_2.setBounds(10, 227, 41, 23);
		getContentPane().add(button_2);
	}

	private void createLautstaerkeLabel() {
		JLabel lblLautstaerke = new JLabel("Lautstaerke");
		lblLautstaerke.setBounds(24, 208, 64, 14);
		getContentPane().add(lblLautstaerke);
	}

	private void createMinusButton() {
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "radio") {
					tuner.frequenzRunter();
				}
			}
		});
		button_1.setBounds(308, 68, 41, 23);
		getContentPane().add(button_1);
	}

	private void createPlusButton() {
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "radio") {
					tuner.frequenzHoch();
				}
			}
		});
		button.setBounds(359, 68, 41, 23);
		getContentPane().add(button);
	}

	private void createRadioModusButton() {
		JButton btnRadioModus = new JButton("Radio Modus");
		btnRadioModus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dvd.aus();
				cd.aus();
				tuner.ein();
				verstaerker.ein();
				verstaerker.setTuner(tuner);
				modus = "radio";
				System.out.println();
			}
		});
		btnRadioModus.setBounds(307, 7, 101, 23);
		getContentPane().add(btnRadioModus);
	}

	private void createFMButton() {
		JButton btnFm = new JButton("FM");
		btnFm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "radio") {
					tuner.setKanal("FM");
				}
				return;
			}
		});
		btnFm.setBounds(359, 34, 64, 23);
		getContentPane().add(btnFm);
	}

	private void createAMButton() {
		JButton btnAm = new JButton("AM");
		btnAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "radio") {
					tuner.setKanal("AM");
				}
				return;
			}
		});
		btnAm.setBounds(285, 34, 64, 23);
		getContentPane().add(btnAm);
	}

	private void createAuswerfenButton() {
		JButton btnAuswerfen = new JButton("auswerfen");
		btnAuswerfen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "dvd") {
					dvd.auswerfen();
				}
				else if(modus == "cd") {
					cd.auswerfen();
				}
				else {
					return;
				}
			}
		});
		btnAuswerfen.setBounds(54, 136, 89, 23);
		getContentPane().add(btnAuswerfen);
	}

	private void createCDModusButton() {
		JButton btnCdModus = new JButton("CD Modus");
		btnCdModus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dvd.aus();
				tuner.aus();
				cd.ein();
				verstaerker.ein();
				verstaerker.setCD(cd);
				modus = "cd";
				System.out.println();
			}
		});
		btnCdModus.setBounds(114, 7, 89, 23);
		getContentPane().add(btnCdModus);
	}

	private void createDVDModusButton() {
		JButton btnDvdModus = new JButton("DVD Modus");
		btnDvdModus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.aus();
				tuner.aus();
				dvd.ein();
				verstaerker.ein();
				beamer.ein();
				leinwand.runter();
				beleuchtung.dimmen();
				verstaerker.setDVD(dvd);
				modus = "dvd";
				System.out.println();
			}
		});
	}

	private void extracted2() {
		JButton dvdbtnStop = new JButton("Stop");
		dvdbtnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "dvd") {
					dvd.stop();
				}
				else if(modus == "cd") {
					cd.stop();
				}
				else {
					return;
				}
			}
		});
		dvdbtnStop.setBounds(54, 102, 89, 23);
		getContentPane().add(dvdbtnStop);
	}

	private void extractMethod() {
		JButton dvdbtnPause = new JButton("Pause");
		dvdbtnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "dvd") {
					dvd.pause();
				}
				else if(modus == "cd") {
					cd.pause();
				}
				else {
					return;
				}
			}
		});
		dvdbtnPause.setBounds(54, 68, 89, 23);
		getContentPane().add(dvdbtnPause);
	}

	private void createPlayButton() {
		JButton btndvdPlay = new JButton("Play");
		btndvdPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modus == "dvd") {
					dvd.play();
				}
				else if(modus == "cd") {
					cd.play();
				}
				else {
					return;
				}
			}
		});
		btndvdPlay.setBounds(54, 34, 89, 23);
		getContentPane().add(btndvdPlay);
	}
}
