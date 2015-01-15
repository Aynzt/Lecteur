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
import javax.swing.JProgressBar;

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
		setBounds(100, 100, 815, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu media = new JMenu("M\u00E9dia");
		menuBar.add(media);
		
		JMenuItem ouv_med = new JMenuItem("Ouvrir un m\u00E9dia");
		ouv_med.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		media.add(ouv_med);
		
		JMenuItem ouv_dos = new JMenuItem("Ouvrir un dossier");
		ouv_dos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		media.add(ouv_dos);
		
		JMenuItem ouv_dis = new JMenuItem("Ouvrir un disque");
		ouv_dis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		media.add(ouv_dis);
		
		JSeparator separator = new JSeparator();
		media.add(separator);
		
		JMenuItem enr_list = new JMenuItem("Enregistrer la liste de lecture");
		enr_list.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		media.add(enr_list);
		
		JSeparator separator_1 = new JSeparator();
		media.add(separator_1);
		
		JMenu mnMdiaRcents = new JMenu("M\u00E9dia r\u00E9cents");
		media.add(mnMdiaRcents);
		
		JMenuItem quitter = new JMenuItem("Quitter");
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		media.add(quitter);
		
		JMenu lecture = new JMenu("Lecture");
		menuBar.add(lecture);
		
		JMenuItem jouer = new JMenuItem("Jouer");
		lecture.add(jouer);
		
		JMenuItem stop = new JMenuItem("Stop");
		lecture.add(stop);
		
		JMenuItem prec = new JMenuItem("Pr\u00E9cedent");
		lecture.add(prec);
		
		JMenuItem suiv = new JMenuItem("Suivant");
		lecture.add(suiv);
		
		JMenu audio = new JMenu("Audio");
		menuBar.add(audio);
		
		JMenuItem aug_ton = new JMenuItem("Augmenter la tonalit\u00E9");
		audio.add(aug_ton);
		
		JMenuItem red_ton = new JMenuItem("R\u00E9duire la tonalit\u00E9");
		audio.add(red_ton);
		
		JMenuItem coup_son = new JMenuItem("Couper le son");
		audio.add(coup_son);
		
		JMenu outils = new JMenu("Outils");
		menuBar.add(outils);
		
		JMenu vue = new JMenu("Vue");
		menuBar.add(vue);
		
		JMenuItem list_lect = new JMenuItem("Liste de lecture");
		vue.add(list_lect);
		
		JSeparator separator_2 = new JSeparator();
		vue.add(separator_2);
		
		JMenuItem interf_min = new JMenuItem("Interface Minimale");
		vue.add(interf_min);
		
		JMenuItem plein_ecran = new JMenuItem("Plein \u00E9cran");
		vue.add(plein_ecran);
		
		JMenu aide = new JMenu("Aide");
		menuBar.add(aide);
		
		JMenuItem aide_f = new JMenuItem("Aide");
		aide_f.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		aide.add(aide_f);
		
		JSeparator separator_3 = new JSeparator();
		aide.add(separator_3);
		
		JMenuItem a_propos = new JMenuItem("A propos");
		a_propos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_MASK));
		aide.add(a_propos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 799, 300);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 311, 799, 68);
		contentPane.add(panel_1);
		
		JProgressBar progressBar = new JProgressBar();
		panel_1.add(progressBar);
	}
}
