/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package powerpaintmain;
import gui.PowerPaintGUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



/**
 * Driver for PowerPaint.
 * @author Igor Kalezic
 * @version 22 November 2016
 *
 */
public final class PowerPaintDriver {
    
    /**
     * Constructor to prevent instantiation.
     */
    private PowerPaintDriver() {
        //Prevent Instantiation.
    }
    
    /**
     * Build the program.
     * @param theArgs ignored.
     */
    public static void main(final String[] theArgs) {
        new PowerPaintGUI().start();
        
        try {
            
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (final UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (final InstantiationException ex) {
            ex.printStackTrace();
        } catch (final ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        UIManager.put("swing.boldMetal", Boolean.FALSE);

    }

}
