package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Uno {

	private JFrame frmHaudio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Uno window = new Uno();
			window.frmHaudio.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

	/**
	 * Create the application.
	 */
	public Uno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHaudio = new JFrame();
		frmHaudio.setTitle("HAudio");
		frmHaudio.setBounds(100, 100, 731, 483);
		frmHaudio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHaudio.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(268, 236, 89, 23);
		frmHaudio.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(268, 310, 89, 23);
		frmHaudio.getContentPane().add(button);
	}
}
