package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import affichage.jComboBox.ComboBoxListJeux;
import affichage.jComboBox.ComboBoxListMassages;
import affichage.jPanel.JPanelImages;
import affichage.jSlider.JSliderIntensite;

public class FenetrePrincipale extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panelCenter;
	JPanel panelOptions;
	JPanelImages jpanelImages = new JPanelImages();

	private JSliderIntensite slide = new JSliderIntensite();
	private ComboBoxListJeux comboJeux = new ComboBoxListJeux();
	private ComboBoxListMassages comboMass = new ComboBoxListMassages();
	public FenetrePrincipale() {
		super();
		setTitle("Projet combinaison");
		setLayout(new BorderLayout());
		setResizable(false);
		panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(1, 2));
		panelOptions = new JPanel();

		
		JPanel labOptions = new JPanel(new GridLayout(3,1));
		labOptions.add(slide);
		labOptions.add(comboJeux);
		labOptions.add(comboMass);
		


		panelCenter.add(jpanelImages);
		panelOptions.add(labOptions);
		panelOptions.setBorder (BorderFactory.createTitledBorder (
				BorderFactory.createLineBorder (Color.GRAY),
				"Paramètrage"));
		
		this.add(panelCenter, BorderLayout.WEST);
		this.add(panelOptions, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
