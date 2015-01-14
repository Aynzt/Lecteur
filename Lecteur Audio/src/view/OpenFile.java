package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class OpenFile extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenFile dialog = new OpenFile();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public OpenFile() {
		setTitle("Ouvrir un Fichier");
		setBounds(100, 100, 479, 375);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

	}
}
