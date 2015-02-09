package affichage;

import java.awt.BorderLayout;
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

	public FenetrePrincipale() {
		super();

		setLayout(new BorderLayout());

		JPanel panelCenter = new JPanel();
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
		System.out.println(e.getLocationOnScreen());
		DrawVibro drawVibro = new DrawVibro();
		drawVibro.drawCircle(getGraphics(), e.getX(), e.getY()+35, 10);
		this.add(new DrawVibro());
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
