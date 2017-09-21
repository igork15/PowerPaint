/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package tools;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.MouseEvent;

/** Interface for the tools.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public interface PowerTool {
    
    /**
     * Sets the color of the shape.
     * @param theColor color.
     */
    void setColor(final Color theColor);
    
    /**
     * Sets the thickness of the shape.
     * @param theStroke thickness.
     */
    void setStroke(final BasicStroke theStroke);
    
    /**
     * Returns the shape.
     * @param theEvent the mouse event.
     * @return PowerShape.
     */
    PowerShape getPowerShape(final MouseEvent theEvent);

}
