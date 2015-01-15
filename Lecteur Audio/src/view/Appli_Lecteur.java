package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Appli_Lecteur extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appli_Lecteur frame = new Appli_Lecteur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Appli_Lecteur() {
		setTitle("Mini Lecteur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 430);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMedia = new JMenu("Media");
		menuBar.add(mnMedia);
		
		JMenuItem mntmOuvrirUnMdia = new JMenuItem("Ouvrir un m\u00E9dia");
		mntmOuvrirUnMdia.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnMedia.add(mntmOuvrirUnMdia);
		
		JMenuItem mntmOuvrirUnDossier = new JMenuItem("Ouvrir un dossier");
		mntmOuvrirUnDossier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnMedia.add(mntmOuvrirUnDossier);
		
		JMenuItem mntmOuvrirUnDisque = new JMenuItem("Ouvrir un disque");
		mntmOuvrirUnDisque.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		mnMedia.add(mntmOuvrirUnDisque);
		
		JSeparator separator = new JSeparator();
		mnMedia.add(separator);
		
		JMenuItem mntmEnregistrerLaListe = new JMenuItem("Enregistrer la liste de lecture");
		mntmEnregistrerLaListe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnMedia.add(mntmEnregistrerLaListe);
		
		JSeparator separator_1 = new JSeparator();
		mnMedia.add(separator_1);
		
		JMenu mnMdiaRcents = new JMenu("M\u00E9dia r\u00E9cents");
		mnMedia.add(mnMdiaRcents);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnMedia.add(mntmQuitter);
		
		JMenu mnLecture = new JMenu("Lecture");
		menuBar.add(mnLecture);
		
		JMenuItem mntmPlay = new JMenuItem("Jouer");
		mnLecture.add(mntmPlay);
		
		JMenuItem mntmStop = new JMenuItem("Stop");
		mnLecture.add(mntmStop);
		
		JMenuItem mntmPrcedent = new JMenuItem("Pr\u00E9cedent");
		mnLecture.add(mntmPrcedent);
		
		JMenuItem mntmSuivant = new JMenuItem("Suivant");
		mnLecture.add(mntmSuivant);
		
		JMenu mnAudio = new JMenu("Audio");
		menuBar.add(mnAudio);
		
		JMenuItem mntmAugmenterLaTonalit = new JMenuItem("Augmenter la tonalit\u00E9");
		mnAudio.add(mntmAugmenterLaTonalit);
		
		JMenuItem mntmRduireLaTonalit = new JMenuItem("R\u00E9duire la tonalit\u00E9");
		mnAudio.add(mntmRduireLaTonalit);
		
		JMenuItem mntmCouperLeSon = new JMenuItem("Couper le son");
		mnAudio.add(mntmCouperLeSon);
		
		JMenu mnOutils = new JMenu("Outils");
		menuBar.add(mnOutils);
		
		JMenu mnVue = new JMenu("Vue");
		menuBar.add(mnVue);
		
		JMenu mnAide = new JMenu("Aide");
		menuBar.add(mnAide);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
