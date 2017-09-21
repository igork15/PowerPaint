/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package action;



import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/** This class is the action for the about button.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class AboutAction extends AbstractAction {
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = 3328140104843550600L;

    /**
     * Default constructor.
     */
    public AboutAction() {
        super("About...");
        
    }
    
    /**
     * What occurs when button is pressed.
     * @param theEvent the event that occurs.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        JOptionPane.showMessageDialog(null, "TCSS 305 PowerPaint\n"
                                            +  "Autumn 2016\n"
                                            + "<Igor Kalezic>", "PowerPaint", JOptionPane.INFORMATION_MESSAGE, 
                                            new ImageIcon("images/basketballsmall.png"));
    }

}
