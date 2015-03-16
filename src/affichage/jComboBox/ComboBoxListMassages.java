package affichage.jComboBox;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboBoxListMassages extends JPanel{
	private DefaultComboBoxModel comboList;
	private JComboBox combo;
	private String textComboBoxList;
	private JButton jbutton = new JButton("Lancer");

	public ComboBoxListMassages(){
		initialize();
	}

	private void initialize(){
		comboList = new DefaultComboBoxModel();
		comboList.addElement("Bras gauche");
		comboList.addElement("Bras droit");
		comboList.addElement("Corps");
		combo = new JComboBox(comboList);
		
		add (combo);
		add (jbutton);
		setBorder (BorderFactory.createTitledBorder (
				BorderFactory.createLineBorder (Color.gray),
				"Choix d'un massage"));

	}


	public String getTextComboList(){
		return textComboBoxList=combo.getSelectedItem().toString();
	}

	public void SelectItem(String value){
		combo.setSelectedItem(value);
	}
	
	

}
