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
			//1
			vibro.drawCircle(graph, 75, 295+35, 5);
		}
		else if(e.getX()>=76 && e.getX() <=118   && e.getY()>=191 && e.getY() <=271 ){
			//2
			vibro.drawCircle(graph, 85, 240+35, 5);
		}
		else if(e.getX()>=85 && e.getX() <=132   && e.getY()>=118 && e.getY() <=190 ){
			//3
			vibro.drawCircle(graph, 110, 145+35, 5);
		}
		else if(e.getX()>=101 && e.getX() <=145   && e.getY()>=38 && e.getY() <=117 ){
			//4
			vibro.drawCircle(graph, 120, 70+35, 5);
		}
		else if(e.getX()>=101 && e.getX() <=213  && e.getY()>=25 && e.getY() <=63 ){
			//5
			vibro.drawCircle(graph, 160, 45+35, 5);
		}
		else if(e.getX()>=214 && e.getX() <=275  && e.getY()>=25 && e.getY() <=63 ){
			//6
			vibro.drawCircle(graph, 255, 45+35, 5);
		}
		else if(e.getX()>=276 && e.getX() <=308  && e.getY()>=38 && e.getY() <=117 ){
			//7
			vibro.drawCircle(graph, 290, 70+35, 5);
		}
		else if(e.getX()>=277 && e.getX() <=313  && e.getY()>=118 && e.getY() <=190){
			//8
			vibro.drawCircle(graph, 295, 145+35, 5);
		}
		else if(e.getX()>=286 && e.getX() <=328  && e.getY()>=191 && e.getY() <=271){
			//9
			vibro.drawCircle(graph, 315, 240+35, 5);
		}
		else if(e.getX()>=303 && e.getX() <=331  && e.getY()>=272 && e.getY() <=350){
			//10
			vibro.drawCircle(graph, 319, 295+35, 5);
		}
		else if(e.getX()>=145 && e.getX() <=213  && e.getY()>=64 && e.getY() <=90 ){
			//11
			vibro.drawCircle(graph, 175, 70+35, 5);
		}
		else if(e.getX()>=145 && e.getX() <=213  && e.getY()>=90 && e.getY() <=115 ){
			//12
			vibro.drawCircle(graph, 190, 90+35, 5);
		}
		else if(e.getX()>=214 && e.getX() <=275  && e.getY()>=90 && e.getY() <=115 ){
			//13
			vibro.drawCircle(graph, 230, 90+35, 5);
		}
		else if(e.getX()>=214 && e.getX() <=275  && e.getY()>=64 && e.getY() <=90 ){
			//14
			vibro.drawCircle(graph, 245, 70+35, 5);
		}
		else if(e.getX()>=145 && e.getX() <=178  && e.getY()>=90 && e.getY() <=160 ){
			//15
			vibro.drawCircle(graph, 170, 115+35, 5);
		}
		else if(e.getX()>=179 && e.getX() <=213  && e.getY()>=90 && e.getY() <=160 ){
			//16
			vibro.drawCircle(graph, 185, 120+35, 5);
		}
		else if(e.getX()>=214 && e.getX() <=240  && e.getY()>=90 && e.getY() <=160 ){
			//17
			vibro.drawCircle(graph, 235, 120+35, 5);
		}
		else if(e.getX()>=241 && e.getX() <=275  && e.getY()>=90 && e.getY() <=160 ){
			//18
			vibro.drawCircle(graph, 250, 115+35, 5);
		}
		else if(e.getX()>=145 && e.getX() <=200  && e.getY()>=90 && e.getY() <=210 ){
			//19
			vibro.drawCircle(graph, 180, 180+35, 5);
		}
		else if(e.getX()>=201 && e.getX() <=265  && e.getY()>=90 && e.getY() <=210 ){
			//20
			vibro.drawCircle(graph, 220, 180+35, 5);
		}
		else if(e.getX()>=135 && e.getX() <=175  && e.getY()>=210 && e.getY() <=255 ){
			//21
			vibro.drawCircle(graph, 160, 230+35, 5);
		}
		else if(e.getX()>=176 && e.getX() <=230  && e.getY()>=210 && e.getY() <=255 ){
			//22
			vibro.drawCircle(graph, 200, 230+35, 5);
		}
		else if(e.getX()>=231 && e.getX() <=265  && e.getY()>=210 && e.getY() <=255 ){
			//23
			vibro.drawCircle(graph, 240, 230+35, 5);
		}
		else if(e.getX()>=125 && e.getX() <=200  && e.getY()>=255 && e.getY() <=315 ){
			//24
			vibro.drawCircle(graph, 170, 275+35, 5);
		}
		else if(e.getX()>=201 && e.getX() <=275  && e.getY()>=255 && e.getY() <=315 ){
			//25
			vibro.drawCircle(graph, 230, 275+35, 5);
		}

		//dos
		else if(e.getX()>=495 && e.getX() <=604  && e.getY()>=25 && e.getY() <=63 ){
			//26
			vibro.drawCircle(graph, 545, 55+35, 5);
		}
		else if(e.getX()>=495 && e.getX() <=604  && e.getY()>=64 && e.getY() <=105 ){
			//27
			vibro.drawCircle(graph, 570, 81+35, 5);
		}
		else if(e.getX()>=605 && e.getX() <=707  && e.getY()>=25 && e.getY() <=63 ){
			//29
			vibro.drawCircle(graph, 660, 55+35, 5);
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
