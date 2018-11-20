package controller;

import model.ArtikelModelInterface;
import model.KundeModel;
import view.ArtikelTextFieldView;

public class ArtikelTextFieldController implements ArtikelControllerInterface {

	private ArtikelModelInterface a_model;
	private ArtikelTextFieldView a_view;
	private KundeModel k_model;

	public ArtikelTextFieldController(ArtikelModelInterface model, ArtikelTextFieldView view, KundeModel k_model) {
		this.a_model = model;
		this.a_view = view;
		this.k_model = k_model;
	}

	public void setPreis(double preis) {
		a_model.setPreis(preis);
	}

}
