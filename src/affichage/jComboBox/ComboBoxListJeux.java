package affichage.jComboBox;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboBoxListJeux extends JPanel{
	private DefaultComboBoxModel comboList;
	private JComboBox combo;
	private String textComboBoxList;
	private JButton jbutton = new JButton("Lancer");

	public ComboBoxListJeux(){
		initialize();
	}

	private void initialize(){
		comboList = new DefaultComboBoxModel();
		comboList.addElement("Jeux 1");
		comboList.addElement("Jeux 2");
		combo = new JComboBox(comboList);
		add (combo);
		add (jbutton);
		setBorder (BorderFactory.createTitledBorder (
				BorderFactory.createLineBorder (Color.gray),
				"Choix d'un jeu"));

	}


	public String getTextComboList(){
		return textComboBoxList=combo.getSelectedItem().toString();
	}

	public void SelectItem(String value){
		combo.setSelectedItem(value);
	}
	
	

}
