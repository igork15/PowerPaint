/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package action;
import gui.PowerPaintGUI;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;




/** This class is the action for the quit button.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class QuitAction extends AbstractAction {
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = 7981178141986160020L;
    /**
     * GUI field.
     */
    private final PowerPaintGUI myGui;
    
    /**
     * Constructor.
     * @param theGui GUI passed.
     */
    public QuitAction(final PowerPaintGUI theGui) {
        super("quit");
        
        myGui = theGui;
    }
    
    /**
     * What occurs when button is pressed.
     * @param theEvent the event that occurs.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        myGui.dispose();
    }

}
