/* 
 * TCSS 305 � Autumn 2016
 * Assignment 5b � Power Paint
 */

package action;
import drawingpanel.DrawingPanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;


/** This class is the action for the tools buttons.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class ToolsAction extends AbstractAction {
    
    
    /**
     * static default field initiated.
     */
    public static final String STARTING_TOOL = "Pencil";
    
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = 8908033574885691033L;

   
    
    /**
     * Drawing panel field.
     */
    private final DrawingPanel myDrawingPanel;
    
    /**
     * Constructor.
     * 
     * @param theName name of button.
     * @param theDrawingPanel drawing panel.
     */
    public ToolsAction(final String theName, final DrawingPanel theDrawingPanel) {
        super(theName);
        
        
        
        myDrawingPanel = theDrawingPanel;
    }
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        final AbstractButton button = (AbstractButton) theEvent.getSource();
        myDrawingPanel.setTool(button.getText());
       
        putValue(Action.SELECTED_KEY, true);
    }


}
