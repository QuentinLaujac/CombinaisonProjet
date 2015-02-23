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
		update(graph);
		//face
		if(e.getX()>=65 && e.getX() <=95   && e.getY()>=272 && e.getY() <=355 ){
			vibro.drawCircle(graph, 75, 295+35, 5);
		}
		else if(e.getX()>=76 && e.getX() <=118   && e.getY()>=191 && e.getY() <=271 ){
			vibro.drawCircle(graph, 85, 240+35, 5);
		}
		else if(e.getX()>=85 && e.getX() <=132   && e.getY()>=118 && e.getY() <=270 ){
			vibro.drawCircle(graph, 110, 145+35, 5);
		}
		else if(e.getX()>=101 && e.getX() <=145   && e.getY()>=38 && e.getY() <=117 ){
			vibro.drawCircle(graph, 120, 70+35, 5);
		}
		else if(e.getX()>=101 && e.getX() <=213  && e.getY()>=25 && e.getY() <=63 ){
			vibro.drawCircle(graph, 160, 55+35, 5);
		}
		else if(e.getX()>=214 && e.getX() <=275  && e.getY()>=25 && e.getY() <=63 ){
			vibro.drawCircle(graph, 250, 55+35, 5);
		}
		else if(e.getX()>=276 && e.getX() <=308  && e.getY()>=38 && e.getY() <=117 ){
			vibro.drawCircle(graph, 290, 70+35, 5);
		}
		else if(e.getX()>=277 && e.getX() <=313  && e.getY()>=118 && e.getY() <=190){
			vibro.drawCircle(graph, 295, 145+35, 5);
		}
		else if(e.getX()>=286 && e.getX() <=328  && e.getY()>=191 && e.getY() <=271){
			vibro.drawCircle(graph, 315, 240+35, 5);
		}
		else if(e.getX()>=303 && e.getX() <=331  && e.getY()>=272 && e.getY() <=350){
			vibro.drawCircle(graph, 319, 295+35, 5);
		}
		//dos
		else if(e.getX()>=495 && e.getX() <=604  && e.getY()>=25 && e.getY() <=63 ){
			vibro.drawCircle(graph, 545, 55+35, 5);
		}
		else if(e.getX()>=605 && e.getX() <=707  && e.getY()>=25 && e.getY() <=63 ){
			vibro.drawCircle(graph, 660, 55+35, 5);
		}
		else if(e.getX()>=495 && e.getX() <=604  && e.getY()>=64 && e.getY() <=105 ){
			vibro.drawCircle(graph, 570, 81+35, 5);
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
