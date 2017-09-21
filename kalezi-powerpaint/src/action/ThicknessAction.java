/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package action;
import drawingpanel.DrawingPanel;
import java.awt.BasicStroke;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;




/** This class is the action for the thickness... button.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class ThicknessAction extends AbstractAction {
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = -3988086496810366041L;
    /**
     * Drawing panel field.
     */
    private final DrawingPanel myDrawingPanel;

    /**
     * Constructor.
     * @param theDrawingPanel panel passed.
     */
    public ThicknessAction(final DrawingPanel theDrawingPanel) {
        super("Thickness...");
        myDrawingPanel = theDrawingPanel;
        
    }
    
    /**
     * What occurs when button is pressed.
     * @param theEvent event that occurs.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        final AbstractButton thickness = (AbstractButton) theEvent.getSource();
        
        myDrawingPanel.setStroke(new BasicStroke(Integer.valueOf(thickness.getText())));

    }

}
