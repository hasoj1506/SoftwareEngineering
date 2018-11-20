package controller;

import model.PruefungsModelInterface;
import model.KundeModel;
import view.ArtikelTextFieldView;

public class PruefungsblablaController implements PruefungsControllerInterface {

	private PruefungsModelInterface a_model;
	private ArtikelTextFieldView a_view;
	private KundeModel k_model;

	public PruefungsblablaController(PruefungsModelInterface model, ArtikelTextFieldView view, KundeModel k_model) {
		this.a_model = model;
		this.a_view = view;
		this.k_model = k_model;
	}

	public void setPreis(int preis) {
		a_model.setPruefungsdauer(preis);
	}

}
