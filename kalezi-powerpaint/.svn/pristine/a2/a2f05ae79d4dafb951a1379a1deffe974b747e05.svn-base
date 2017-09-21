/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package action;

import drawingpanel.DrawingPanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;



/** This class is the action for the clear button.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class ClearAction extends AbstractAction {
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = 6853505631518597764L;
    /**
     * Drawing panel field.
     */
    private final DrawingPanel myDrawingPanel;
    
    /**
     * 
     * @param theDrawingPanel the drawing panel to be affected.
     */
    public ClearAction(final DrawingPanel theDrawingPanel) {
        super("Clear");
        myDrawingPanel = theDrawingPanel;
        
    }
    
    /**
     * What occurs when button is pressed.
     * @param theEvent event that occurs.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        myDrawingPanel.clearPanel();
        
    }
    
}
