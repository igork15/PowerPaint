/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */

package drawingpanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import tools.EllipseTool;
import tools.LineTool;
import tools.PencilTool;
import tools.PowerShape;
import tools.PowerTool;
import tools.RectangleTool;

/** This class is the drawing panel.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class DrawingPanel extends JPanel {
    
    /**
     * Static color constant.
     */
    private static final Color UW_PURPLE = new Color(51, 0, 111);
    
    /**
     * Width of the panel.
     */
    private static final int WIDTH = 600;
       
    /**
     * Height of the panel.
     */
    
    private static final int HEIGHT = 400;
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = -2714526870869104284L;

    /**
     * Color field.
     */
    private Color myColor;
    
    /**
     * ArrayList of shapes that have been drawn.
     */
    private final ArrayList<PowerShape> myShapes = new ArrayList<PowerShape>();
    
    /**
     * Current shape field.
     */
    private PowerShape myCurrentShape;
    
    /**
     * Tool currently selected.
     */
    private PowerTool myToolBeingUsed;
    
    /**
     * Map of tools.
     */
    private final Map<String, PowerTool> myTools;
    
//    
//    /**
//     * Mouse listener instantiation.
//     */
//    private final MouseListener listener = new MyMouseListener();
    
    /**
     * Constructor.
     */
    public DrawingPanel() {
        super(new BorderLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        final MyMouseListener listener = new MyMouseListener();
        
        addMouseListener(listener);
        addMouseMotionListener(listener);
        
        myTools = new HashMap<String, PowerTool>();
        myToolBeingUsed = new PencilTool();
        
        myTools.put("Pencil", myToolBeingUsed);
        myTools.put("Line",  new LineTool());
        myTools.put("Rectangle", new RectangleTool());
        myTools.put("Ellipse", new EllipseTool());
        myColor = UW_PURPLE;
        
    }

    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;
        
        
        for (final PowerShape p : myShapes) {
            p.paint(g2d);
        }
        if (myCurrentShape != null) {
            myCurrentShape.paint(g2d);
        } 
        
    }
    
    /**
     * Sets the tool to be used.
     * @param theToolName name of tool
     */
    public void setTool(final String theToolName) {
        myToolBeingUsed = myTools.get(theToolName);
    }
    
    /**
     * Sets the color of the tool.
     * @param theColor color.
     */
    public void setColor(final Color theColor) {
        for (PowerTool p : myTools.values()) {
            p.setColor(theColor);
        }
        myColor = theColor;
    }
    
    /**
     * Returns the color of the shape.
     * @return Color.
     */
    public Color getColor() {
        return myColor;
    }
    
    /**
     * Returns tool being used.
     * @return PowerTool.
     */
    public PowerShape getShape() {
        return myCurrentShape;
    }
    
    /**
     * Clears the drawing panel.
     */
    public void clearPanel() {
        myShapes.clear();
        myCurrentShape = new PowerShape();
        repaint();
    }
    
    /**
     * Sets the thickness of the shape.
     * @param theStroke BasicStroke.
     */
    public void setStroke(final BasicStroke theStroke) {
        for (PowerTool p : myTools.values()) {
            p.setStroke(theStroke);
        }
    }
    
    
    
    /**
     * 
     * @author Igor Kalezic
     *
     */
    public class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(final MouseEvent theEvent) {
            myCurrentShape = myToolBeingUsed.getPowerShape(theEvent);
            
            repaint();

        }
        @Override
        public void mouseDragged(final MouseEvent theEvent) {
            myCurrentShape = myToolBeingUsed.getPowerShape(theEvent);
            
            repaint();
        }
        @Override
        public void mouseReleased(final MouseEvent theEvent) {
            myCurrentShape = myToolBeingUsed.getPowerShape(theEvent);
            myShapes.add(myCurrentShape);
            myCurrentShape = new PowerShape();
        }

    }

}
