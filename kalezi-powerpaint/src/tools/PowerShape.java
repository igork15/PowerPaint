/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package tools;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

/** 
* Power shape class.
* 
* @author Igor Kalezic
* @version 22 November 2016 
*/
public class PowerShape {
    
    /**
     * Static color constant.
     */
    protected static final Color UW_PURPLE = new Color(51, 0, 111);
    
    /**
     * Color declaration.
     */
    private final Color myColor;
    
    /**
     * Thickness declaration.
     */
    private final BasicStroke myStroke;
    
    /**
     * Shape declaration.
     */
    private final Shape myShape;
    
    /**
     * Constructor.
     * 
     * @param theColor color of shape.
     * @param theShape the shape itself.
     * @param theStroke thickness.
     */
    public PowerShape(final Color theColor, final Shape theShape, final BasicStroke theStroke) {
        myColor = theColor;
        myShape = theShape;
        myStroke = theStroke;
    }
    
    /**
     * Default Constructor.
     */
    public PowerShape() {
        this(UW_PURPLE, new GeneralPath(), new BasicStroke(1));
        
        
    }
    
    /**
     * Returns the shape.
     * @return Shape.
     */
    public Shape getShape() {
        return myShape;
    }
    
    /**
     * Paints the shape.
     * @param theG2d graphics.
     */
    public void paint(final Graphics2D theG2d) {
        theG2d.setPaint(myColor);
        theG2d.setStroke(myStroke);
        theG2d.draw(myShape);
    }

}
