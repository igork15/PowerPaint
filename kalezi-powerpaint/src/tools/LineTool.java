/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package tools;

import java.awt.BasicStroke;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

/** This class is the line tool class.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class LineTool extends AbstractTool {
    
    /**
     * Line declaration.
     */
    private Line2D myLine;
    
    
    /**
     * Constructor.
     */
    public LineTool() {
        
        super(new BasicStroke(1), UW_PURPLE);
        
    }

    @Override
    public PowerShape getPowerShape(final MouseEvent theEvent) {
        final int mouse = theEvent.getID();
        if (mouse == MouseEvent.MOUSE_PRESSED) {
            setStartingX(theEvent.getX());
            setStartingY(theEvent.getY());
            
            myLine = new Line2D.Double(getStartingX(), getStartingY(), getStartingX(), getStartingY());
            
        } else if (mouse == MouseEvent.MOUSE_DRAGGED || mouse == MouseEvent.MOUSE_RELEASED) {
            
            
            myLine.setLine(getStartingX(), getStartingY(), theEvent.getX(), theEvent.getY());
             
                       
        }
        return new PowerShape(getColor(), myLine, getStroke());
    }

}