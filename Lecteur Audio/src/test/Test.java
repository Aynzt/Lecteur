package test;

import javax.swing.JDialog;

import view.Lecteur;
import view.OpenFile;

public class Test {

	public static void main(String[] args) {
		Lecteur frame = new Lecteur();
		frame.setVisible(true);
		OpenFile dialog = new OpenFile();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(false);
	}

}
