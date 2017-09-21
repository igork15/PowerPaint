/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package tools;

import java.awt.BasicStroke;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;


/** This class is the pencil tool class.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class PencilTool extends AbstractTool {
    
    /**
     * Pencil declaration.
     */
    private GeneralPath myPencil;
    
    
    /**
     * Constructor.
     */
    public PencilTool() {
        super(new BasicStroke(1), UW_PURPLE);
        myPencil = new GeneralPath();
    }
    
    @Override
    public PowerShape getPowerShape(final MouseEvent theEvent) {
        final int mouse = theEvent.getID();
        
        if (mouse == MouseEvent.MOUSE_PRESSED) {
            myPencil = new GeneralPath();
            myPencil.moveTo(theEvent.getX(), theEvent.getY());
            myPencil.lineTo(theEvent.getX(), theEvent.getY());
        } else if (mouse == MouseEvent.MOUSE_DRAGGED || mouse == MouseEvent.MOUSE_RELEASED) {
            myPencil.lineTo(theEvent.getX(), theEvent.getY());
        }
        
        return new PowerShape(getColor(), myPencil, getStroke());
    }

}
