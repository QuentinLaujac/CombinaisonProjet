package affichage;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JButton;

import metier.EnumIntensite;

public class BoutonIntensite extends JButton {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 130122542271958189L;

	private EnumIntensite enumIntensite = EnumIntensite.RIEN;

	public BoutonIntensite(final EnumIntensite enumIntensite) {
		super();
		this.enumIntensite = enumIntensite;
		this.setText(enumIntensite.toString());
	}

	public EnumIntensite getEnumIntensite() {
		return enumIntensite;
	}

	public void setEnumIntensite(final EnumIntensite enumIntensite) {
		this.enumIntensite = enumIntensite;
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		// TODO une couleur par intensite
		g2.setPaint(new GradientPaint(new Point(0, 0), Color.WHITE, new Point(
				0, getHeight()), Color.YELLOW.darker()));
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
		g2.setPaint(Color.BLACK);
		g2.drawString(getText(), 30, 12);
		g2.dispose();
	}

}
