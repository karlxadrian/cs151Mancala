package src;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
/**
 * This is a format class implementing the MancalaFormatter strategy pattern
 * @author Team SJSD - Karl Lapuz, Matt Sternquist, Emerson Ye
 */
public class BoardStyle1 implements MancalaFormatter{
	
	/**
     * Sets Pit shape 
     * @param s a MancalaShape
     */
	public Shape setPitShape(MancalaShape s) {
		return new Ellipse2D.Double(s.getX(), s.getY(), s.getWidth(), s.getHeight());
	}

	/**
     * Sets Mancala shape 
     * @param s a MancalaShape
     */
	public Shape setMancalaShape(MancalaShape s) {
		return new RoundRectangle2D.Double(s.getX(), s.getY(), s.getWidth(), s.getWidth()+200, 20, 20);
	}

	/**
     * Sets Pit color
     */
	public Color setPitColor() {
		return Color.BLUE;
	}

	/**
     * Sets Stone color 
     */
	public Color setStoneColor() {
		return Color.GREEN;
	}

}
