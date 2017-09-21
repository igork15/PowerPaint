/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */


package action;

import gui.PowerPaintGUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JColorChooser;



/** This class is the action for the draw color... button.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class DrawColorAction extends AbstractAction {
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = 5848091828777875979L;
    /**
     * Frame field.
     */
    private final PowerPaintGUI myGui;
    
    /**
     * Constructor.
     * @param theGui the GUI passed.
     */
    public DrawColorAction(final PowerPaintGUI theGui) {
        super("Draw Color...");
        myGui = theGui;
        
    }
    
    /**
     * What occurs when button is pressed.
     * @param theAction action that occurs.
     */
    public void actionPerformed(final ActionEvent theAction) {
        final Color color = JColorChooser.showDialog(myGui,  "Choose color", null);
        myGui.getPanel().setColor(color);
    }

}
