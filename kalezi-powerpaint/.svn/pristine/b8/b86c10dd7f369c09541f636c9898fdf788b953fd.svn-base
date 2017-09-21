/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package tools;

import java.awt.BasicStroke;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;


/** 
* Rectangle tool class.
* 
* @author Igor Kalezic
* @version 22 November 2016 
*/
public class RectangleTool extends AbstractTool {
    
    /**
     * Rectangle instantiation.
     */
    private Rectangle2D myRectangle;
    
    /**
     * Constructor.
     */
    public RectangleTool() {
        super(new BasicStroke(1), UW_PURPLE);
    }
    @Override
    public PowerShape getPowerShape(final MouseEvent theEvent) {
        final int mouse = theEvent.getID();
        
        if (mouse == MouseEvent.MOUSE_PRESSED) {
            setStartingX(theEvent.getX());
            setStartingY(theEvent.getY());
            
            myRectangle = new Rectangle2D.Double(getStartingX(), getStartingY(), 0, 0);
        } else if (mouse == MouseEvent.MOUSE_DRAGGED || mouse == MouseEvent.MOUSE_RELEASED) {
            myRectangle.setFrame(Math.min(theEvent.getX(), getStartingX()),
                                 Math.min(theEvent.getY(), getStartingY()),
                                 Math.abs(theEvent.getX() - getStartingX()),
                                 Math.abs(theEvent.getY() - getStartingY()));
        }
        return new PowerShape(getColor(), myRectangle, getStroke());
    }

}
