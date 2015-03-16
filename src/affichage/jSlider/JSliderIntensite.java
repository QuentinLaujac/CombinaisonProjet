package affichage.jSlider;

import java.awt.BorderLayout;





import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSliderIntensite extends JPanel{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label = new JLabel("Valeur actuelle : 1");   
	  public JSliderIntensite(){
	      
	    JSlider slide = new JSlider();
	   
	    slide.setMaximum(10);
	    slide.setMinimum(1);
	    slide.setValue(1);
	    slide.setPaintTicks(true);
	    slide.setPaintLabels(true);
	    slide.setMinorTickSpacing(1);
	    slide.setMajorTickSpacing(3);
	    slide.addChangeListener(new ChangeListener(){
	      public void stateChanged(ChangeEvent event){
	        label.setText("Valeur actuelle : " + slide.getValue());
	      }
	    }); 
	     
		JPanel panel = new JPanel(new GridLayout(2,1));
		panel.add (slide);
		panel.add(label);
		setBorder (BorderFactory.createTitledBorder (
				BorderFactory.createLineBorder (Color.gray),
				"Choix intensité"));
		add(panel);    
	  } 
}