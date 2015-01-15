package test;

import javax.swing.JDialog;

import view.Appli_Lecteur;
import view.OpenFile;

public class Test {

	public static void main(String[] args) {
		Appli_Lecteur frame = new Appli_Lecteur();
		frame.setVisible(true);
		OpenFile dialog = new OpenFile();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(false);
	}

}
