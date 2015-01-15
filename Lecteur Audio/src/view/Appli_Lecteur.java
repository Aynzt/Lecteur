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
		
		JPanel panel = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 799, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JLabel minut_debut = new JLabel("00 : 00");
		
		JProgressBar progressBar = new JProgressBar();
		
		JLabel label = new JLabel("00 : 00");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addGap(39))
		);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(minut_debut, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(minut_debut, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(11))
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 789, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
