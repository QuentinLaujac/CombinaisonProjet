package affichage;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetrePrincipale extends JFrame implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DrawVibro vibro = new DrawVibro();
	JPanel panelCenter;


	public FenetrePrincipale() {
		super();

		setLayout(new BorderLayout());
		setResizable(false);
		panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(1, 2));

		JPanel panelFace = new JPanel();
		panelFace.setLayout(new GridLayout(20, 20));

		JPanel panelDos = new JPanel();
		panelDos.setLayout(new GridLayout(20, 20));

		/*for (int i = 0; i != 20; i++) {
			for (int j = 0; j != 20; j++) {
				panelFace.add(new BoutonMot(EnumCombinaison.RIEN));
			}
		}*/

		JLabel labFace = new JLabel(new ImageIcon("face.jpg"));
		labFace.setBounds(0, 0, 270, 230);
		JLabel labDos = new JLabel(new ImageIcon("dos.jpg"));
		labDos.setBounds(0, 0, 270, 230);
		panelFace.add(labFace);
		panelDos.add(labDos);

		panelCenter.add(labFace);
		panelCenter.add(labDos);
		this.add(panelCenter, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelCenter.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("X: "+e.getX()+" Y: "+e.getY());
		
		Graphics graph = getGraphics();

		if(e.getX() <=100 && e.getX()>=94 && e.getY()>=152 && e.getY() <=251 ){
			update(graph);
			vibro.drawCircle(graph, 75, 220+35, 5);
			
		}
		if(e.getX() <=119 && e.getX()>=78 && e.getY()>=185 && e.getY() <=261 ){
			update(graph);
			vibro.drawCircle(graph, 75, 295+35, 5);
		}
		
		this.add(vibro);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
