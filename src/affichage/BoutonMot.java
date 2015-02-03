package affichage;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JButton;

import metier.EnumCombinaison;

public class BoutonMot extends JButton {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2654421244066635177L;

	private EnumCombinaison enumCombinaison = EnumCombinaison.RIEN;

	public BoutonMot(final EnumCombinaison enumCombinaison) {
		super();
		this.enumCombinaison = enumCombinaison;
	}

	public EnumCombinaison getEnumCombinaison() {
		return enumCombinaison;
	}

	public void setEnumCombinaison(final EnumCombinaison enumCombinaison) {
		this.enumCombinaison = enumCombinaison;
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setPaint(new GradientPaint(new Point(0, 0), Color.WHITE, new Point(
				0, getHeight()), Color.BLUE.darker()));
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
		g2.setPaint(Color.BLACK);
		g2.drawString(getText(), 30, 12);
		g2.dispose();
	}
}
