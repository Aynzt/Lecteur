package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class OpenFile extends JDialog {
	private JTextField textField;
	/**
	 * Create the dialog.
	 */
	public OpenFile() {
		setTitle("Ouvrir un Media");
		setBounds(100, 100, 471, 379);
		
		JPanel pan1 = new JPanel();
		pan1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Lire", "Mettre \u00E0 la file"}));
		pan1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		pan1.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Fichier", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Selection de Fichier", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 41, 407, 169);
		panel.add(panel_3);
		
		JTextArea textArea = new JTextArea();
		
		JButton btnNewButton_1 = new JButton("Ajouter");
		
		JButton btnNewButton_2 = new JButton("Supprimer");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Disque", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Selection du disque", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 11, 407, 116);
		panel_1.add(panel_4);
		
		JRadioButton rdbtnBluray = new JRadioButton("Blu-Ray");
		
		JRadioButton rdbtnDvd = new JRadioButton("DVD");
		
		JRadioButton rdbtnCdrom = new JRadioButton("CD audio");
		
		JRadioButton rdbtnSvcdcd = new JRadioButton("SVCD/VCD");
		
		JCheckBox chckbxPasDeMenu = new JCheckBox("Pas de Menu");
		
		JLabel lblPriphriqueDuDisque = new JLabel("P\u00E9riph\u00E9rique du disque");
		
		textField = new JTextField();
		lblPriphriqueDuDisque.setLabelFor(textField);
		textField.setColumns(10);
		
		JButton btnEjecter = new JButton("Ouvrir");
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_3.setIcon(new ImageIcon("H:\\Package D'icones\\24x24\\eject.png"));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(rdbtnDvd)
							.addGap(18)
							.addComponent(rdbtnCdrom)
							.addGap(18)
							.addComponent(rdbtnBluray)
							.addGap(18)
							.addComponent(rdbtnSvcdcd)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEjecter))
						.addComponent(chckbxPasDeMenu)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblPriphriqueDuDisque)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnDvd)
						.addComponent(rdbtnCdrom)
						.addComponent(rdbtnBluray)
						.addComponent(rdbtnSvcdcd)
						.addComponent(btnEjecter))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(chckbxPasDeMenu)
							.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPriphriqueDuDisque)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNewButton_3))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Position du D\u00E9but", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 129, 407, 61);
		panel_1.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Audio et piste audio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 188, 407, 61);
		panel_1.add(panel_6);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Dossier", null, panel_2, null);
		
		JButton btnNewButton = new JButton("Annuler");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pan1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(pan1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

	}
}
