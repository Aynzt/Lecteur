package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_Lecteur implements ActionListener {
	
	private Lecteur fnt_lect;
	

	public Ctrl_Lecteur(Lecteur fnt_lect) {
		super();
		this.fnt_lect = fnt_lect;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}


	public Lecteur getFnt_lect() {
		return fnt_lect;
	}


	public void setFnt_lect(Lecteur fnt_lect) {
		this.fnt_lect = fnt_lect;
	}

	
}
