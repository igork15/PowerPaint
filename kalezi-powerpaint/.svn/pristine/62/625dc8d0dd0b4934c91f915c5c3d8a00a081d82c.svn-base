/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package tools;

import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/** This class is the ellipse tool class.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class EllipseTool extends RectangleTool {
    
    @Override
    public PowerShape getPowerShape(final MouseEvent theEvent) {
        final Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame((Rectangle2D) super.getPowerShape(theEvent).getShape());
        
        return new PowerShape(getColor(), ellipse, getStroke());
    }

}
