package affichage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawVibro extends JPanel{

	public DrawVibro() {
		repaint();
		setPreferredSize(new Dimension(50, 50));
	}

	public void drawCircle(Graphics cg, int xCenter, int yCenter, int r) {
		cg.setPaintMode();
		cg.setColor(new Color(0,255,255,127));
		cg.fillOval(xCenter-r, yCenter-r, 3*r, 3*r);
	}
}
