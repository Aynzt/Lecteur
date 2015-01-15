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
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSlider;

import controller.Ctrl_Lecteur;

public class Lecteur extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JButton btnPlay;
	private JButton btnPrec;
	private JMenuItem ouv_med;
	private JPanel panel_pochet;
	private JButton btnStop;
	private JButton btnSuiv;
	private JButton btnRep;
	private JButton btnAlea;
	private JButton btnListe;
	private JSlider slider;
	private JLabel minut_fin;
	private JLabel minut_debut;
	private JProgressBar progressBar;
	private JMenuItem ouv_dos;
	private JMenuItem ouv_dis;
	private JMenuItem enr_list;
	private JMenu mnMdiaRcents;
	private JMenuItem quitter;
	private JMenu lecture;
	private JMenuItem jouer;
	private JMenuItem stop;
	private JMenuItem prec;
	private JMenuItem suiv;
	private JMenuItem aug_ton;
	private JMenu audio;
	private JMenu media;
	private JMenuItem red_ton;
	private JMenuItem coup_son;
	private JMenu outils;
	private JMenu vue;
	private JMenuItem list_lect;
	private JMenuItem interf_min;
	private JMenuItem plein_ecran;
	private JMenu aide;
	private JMenuItem aide_f;
	private JMenuItem a_propos;
	private Ctrl_Lecteur ctrl_lect;
	

	/**
	 * Create the frame.
	 */
	public Lecteur() {
		setTitle("Mini Lecteur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 420);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		media = new JMenu("M\u00E9dia");
		menuBar.add(media);
		
		ouv_med = new JMenuItem("Ouvrir un m\u00E9dia");
		ouv_med.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		media.add(ouv_med);
		
		ouv_dos = new JMenuItem("Ouvrir un dossier");
		ouv_dos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		media.add(ouv_dos);
		
		ouv_dis = new JMenuItem("Ouvrir un disque");
		ouv_dis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		media.add(ouv_dis);
		
		JSeparator separator = new JSeparator();
		media.add(separator);
		
		enr_list = new JMenuItem("Enregistrer la liste de lecture");
		enr_list.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		media.add(enr_list);
		
		JSeparator separator_1 = new JSeparator();
		media.add(separator_1);
		
		mnMdiaRcents = new JMenu("M\u00E9dia r\u00E9cents");
		media.add(mnMdiaRcents);
		
		quitter = new JMenuItem("Quitter");
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		media.add(quitter);
		
		lecture = new JMenu("Lecture");
		menuBar.add(lecture);
		
		jouer = new JMenuItem("Jouer");
		lecture.add(jouer);
		
		stop = new JMenuItem("Stop");
		lecture.add(stop);
		
		prec = new JMenuItem("Pr\u00E9cedent");
		lecture.add(prec);
		
		suiv = new JMenuItem("Suivant");
		lecture.add(suiv);
		
		audio = new JMenu("Audio");
		menuBar.add(audio);
		
		aug_ton = new JMenuItem("Augmenter la tonalit\u00E9");
		audio.add(aug_ton);
		
		red_ton = new JMenuItem("R\u00E9duire la tonalit\u00E9");
		audio.add(red_ton);
		
		coup_son = new JMenuItem("Couper le son");
		audio.add(coup_son);
		
		outils = new JMenu("Outils");
		menuBar.add(outils);
		
		vue = new JMenu("Vue");
		menuBar.add(vue);
		
		list_lect = new JMenuItem("Liste de lecture");
		vue.add(list_lect);
		
		JSeparator separator_2 = new JSeparator();
		vue.add(separator_2);
		
		interf_min = new JMenuItem("Interface Minimale");
		vue.add(interf_min);
		
		plein_ecran = new JMenuItem("Plein \u00E9cran");
		vue.add(plein_ecran);
		
		aide = new JMenu("Aide");
		menuBar.add(aide);
		
		aide_f = new JMenuItem("Aide");
		aide_f.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		aide.add(aide_f);
		
		JSeparator separator_3 = new JSeparator();
		aide.add(separator_3);
		
		a_propos = new JMenuItem("A propos");
		a_propos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_MASK));
		aide.add(a_propos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel_pochet = new JPanel();
		GroupLayout gl_panel_pochet = new GroupLayout(panel_pochet);
		gl_panel_pochet.setHorizontalGroup(
			gl_panel_pochet.createParallelGroup(Alignment.LEADING)
				.addGap(0, 799, Short.MAX_VALUE)
		);
		gl_panel_pochet.setVerticalGroup(
			gl_panel_pochet.createParallelGroup(Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
		);
		panel_pochet.setLayout(gl_panel_pochet);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		minut_debut = new JLabel("00 : 00");
		
		progressBar = new JProgressBar();
		
		minut_fin = new JLabel("00 : 00");
		
		btnPlay = new JButton("Play");
		
		btnPrec = new JButton("Prec");
		
		btnStop = new JButton("Stop");
		
		btnSuiv = new JButton("Suiv");
		
		btnListe = new JButton("Liste");
		
		btnAlea = new JButton("Al\u00E9a.");
		
		btnRep = new JButton("Rep.");
		
		slider = new JSlider();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnPlay, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(btnPrec, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSuiv, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(btnRep, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAlea, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnListe, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(14)
							.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnPlay, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnRep, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnAlea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnPrec, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnSuiv, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnListe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))))
					.addContainerGap())
		);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(2)
					.addComponent(minut_debut, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(minut_fin, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
					.addGap(2))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(minut_fin, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(minut_debut, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(12))
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
				.addComponent(panel_pochet, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel_pochet, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
		ctrl_lect = new Ctrl_Lecteur(this);
		btnPlay.addActionListener(ctrl_lect);
		btnPrec.addActionListener(ctrl_lect);
		ouv_med.addActionListener(ctrl_lect);
		panel_pochet.addMouseListener(ctrl_lect);
		btnStop.addActionListener(ctrl_lect);
		btnSuiv.addActionListener(ctrl_lect);
		btnRep.addActionListener(ctrl_lect);
		btnAlea.addActionListener(ctrl_lect);
		btnListe.addActionListener(ctrl_lect);
		slider.addMouseListener(ctrl_lect);
		minut_fin.addMouseListener(ctrl_lect);
		minut_debut.addMouseListener(ctrl_lect);
		progressBar.addMouseListener(ctrl_lect);
		ouv_dos.addActionListener(ctrl_lect);
		ouv_dis.addActionListener(ctrl_lect);
		enr_list.addActionListener(ctrl_lect);
		mnMdiaRcents.addActionListener(ctrl_lect);
		quitter.addActionListener(ctrl_lect);
		jouer.addActionListener(ctrl_lect);
		stop.addActionListener(ctrl_lect);
		prec.addActionListener(ctrl_lect);
		suiv.addActionListener(ctrl_lect);
		aug_ton.addActionListener(ctrl_lect);
		red_ton.addActionListener(ctrl_lect);
		coup_son.addActionListener(ctrl_lect);
		list_lect.addActionListener(ctrl_lect);
		interf_min.addActionListener(ctrl_lect);
		plein_ecran.addActionListener(ctrl_lect);
		aide_f.addActionListener(ctrl_lect);
		a_propos.addActionListener(ctrl_lect);
		
	}
}
