/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package tools;


import java.awt.BasicStroke;
import java.awt.Color;
/** This class is the abstract class for tools.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public abstract class AbstractTool implements PowerTool {
    /**
     * Static color constant.
     */
    protected static final Color UW_PURPLE = new Color(51, 0, 111);
    
    /**
     * Stroke declaration.
     */
    private BasicStroke myStroke;
    
    /**
     * Color declaration.
     */
    private Color myColor;
   
    /**
     * Initial X coordinate.
     */
    private int myStartingX;
    
    /**
     * Initial Y Coordinate.
     */
    private int myStartingY;
    
    /**
     * Constructor.
     * @param theStroke thickness.
     * @param theColor color.
     */
    public AbstractTool(final BasicStroke theStroke, final Color theColor) {
        
        myStroke = theStroke;
        myColor = theColor;
        
      
    }
    

    /**
     * Sets the thickness.
     * @param theStroke the thickness.
     */
    public void setStroke(final BasicStroke theStroke) {
        myStroke = theStroke;
    }
    
    /**
     * Returns the thickness.
     * @return BasicStroke.
     */
    public BasicStroke getStroke() {
        return myStroke;
    }
    
    /**
     * Returns the color.
     * @return Color.
     */
    public Color getColor() {
        return myColor;
    }
    
    /**
     * Sets the color of the shape.
     * @param theColor Color of shape.
     */
    public void setColor(final Color theColor) {
        myColor = theColor;
    }
    
    
    /**
     * Returns the initial X.
     * @return int.
     */
    public int getStartingX() {
        return myStartingX;
    }
    
    /**
     * Sets the initial X.
     * @param theStartingX initial x.
     */
    public void setStartingX(final int theStartingX) {
        myStartingX = theStartingX;
    }
    
    /**
     * Returns initial y.
     * @return int
     */
    public int getStartingY() {
        return myStartingY;
    }
    
    /**
     * Sets the initial y.
     * @param theStartingY initial y.
     */
    public void setStartingY(final int theStartingY) {
        myStartingY = theStartingY;
    }


}
