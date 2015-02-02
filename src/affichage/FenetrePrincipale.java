package affichage;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetrePrincipale extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FenetrePrincipale(){
		super();
		
		this.setLayout(new BorderLayout());
		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(1, 2));
		
		JPanel panelFace = new JPanel();
		panelFace.setLayout(new GridLayout(20, 20));
		
		for(int i = 0; i != 20; i++){
			for(int j = 0; j != 20; j++){
				panelFace.add(new JButton("k"));
			}
		}
		
		
		JLabel labFace = new JLabel(new ImageIcon("face.jpg")); 
		labFace.setBounds(0, 0, 270, 230);
		panelCenter.add(panelFace);
		JLabel labDos = new JLabel(new ImageIcon("dos.jpg")); 
		labDos.setBounds(0, 0, 270, 230);
		panelCenter.add(labDos);
		this.add(panelCenter, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
