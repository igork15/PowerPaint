/* 
 * TCSS 305 – Autumn 2016
 * Assignment 5b – Power Paint
 */


package gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Cursor;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import action.AboutAction;
import action.ClearAction;
import action.DrawColorAction;
import action.QuitAction;
import action.ThicknessAction;
import action.ToolsAction;

import drawingpanel.DrawingPanel;

/** This class is the frame.
 * 
 * 
 * @author Igor Kalezic
 * @version 22 November 2016 
 */
public class PowerPaintGUI extends JFrame {
    
    /**
     * Serialization.
     */
    private static final long serialVersionUID = 5819603525576171820L;
    
    /**
     * File name for ellipse icon.
     */
    private static final String ELLIPSE_ICON = "images/ellipse_bw.gif";
    
    /**
     * File name for ellipse icon.
     */
    private static final String RECTANGLE_ICON = "images/rectangle_bw.gif";
    
    /**
     * File name for ellipse icon.
     */
    private static final String PENCIL_ICON = "images/pencil_bw.gif";
    
    /**
     * File name for ellipse icon.
     */
    private static final String LINE_ICON = "images/line_bw.gif";

    /**
     * Static slider initial value.
     */
    private static final int INITIAL_VALUE = 1;
    
    /**
     * static slider max value.
     */
    private static final int MAX_VALUE = 20;
    
    /**
     * static slider tick spacing.
     */
    private static final int MINOR_TICK_SPACING = 1;
    
    /**
     * static slider major tick spacing.
     */
    private static final int MAJOR_TICK_SPACING = 5;
    
    /**
     * Line radio button field.
     */
    private final JRadioButtonMenuItem myLine = new JRadioButtonMenuItem("Line");
    
    /**
     * Pencil radio button field.
     */
    private final JRadioButtonMenuItem myPencil = new JRadioButtonMenuItem("Pencil");
    
    /**
     * Rectangle radio button field.
     */
    private final JRadioButtonMenuItem myRectangle = new JRadioButtonMenuItem("Rectangle");
    
    /**
     * Ellipse radio button field.
     */
    private final JRadioButtonMenuItem myEllipse = new JRadioButtonMenuItem("Ellipse");
    
    /**
     * Button group for radio buttons.
     */
    private final ButtonGroup myRadioGroup = new ButtonGroup();
    
    /**
     * Thickness menu item.
     */
    private final JMenu myThickness = new JMenu("Thickness");
    
    /**
     * Draw Color... menu item.
     */
    private final JMenuItem myDrawColor = new JMenuItem("Draw Color...");
    
    /**
     * Fill Color... menu item.
     */
    private final JMenuItem myFillColor = new JMenuItem("Fill Color...");
    
    /**
     * Fill check box.
     */
    private final JCheckBox myFill = new JCheckBox("Fill");
    
    /**
     * About menu item.
     */
    private final JMenuItem myAbout = new JMenuItem("About...");
    
    /**
     * Clear menu item.
     */
    private final JMenuItem myClear = new JMenuItem("Clear");
    
    /**
     * Quit menu item.
     */
    private final JMenuItem myQuit = new JMenuItem("Quit");
    
    /**
     * Line toggle button.
     */
    private final JToggleButton myToggleLine = new JToggleButton(myLine.getText());
    
    /**
     * Pencil toggle button.
     */
    private final JToggleButton myTogglePencil = new JToggleButton(myPencil.getText());
    
    /**
     * Rectangle toggle button.
     */
    private final JToggleButton myToggleRectangle = new JToggleButton(myRectangle.getText());
    
    /**
     * Ellipse toggle button.
     */
    private final JToggleButton myToggleEllipse = new JToggleButton(myEllipse.getText());
    
    /**
     * Toggle button group.
     */
    private final ButtonGroup myToggleGroup = new ButtonGroup();
    
    /**
     * Slider declaration.
     */
    private JSlider mySlider;
    
    /**
     * Drawing panel creation.
     */
    private final DrawingPanel myPanel = new DrawingPanel();
    
    /**
     * Ellipse action creation.
     */
    private final ToolsAction myEllipseAction = new ToolsAction(myEllipse.getText(), myPanel);
    
    /**
     * rectangleAction creation.
     */
    private final ToolsAction myRectAction = new ToolsAction(myRectangle.getText(), myPanel);
    
    /**
     * Pencil action creation.
     */
    private final ToolsAction myPencilAction = new ToolsAction(myPencil.getText(), myPanel);
    
    /**
     * line action creation.
     */
    private final ToolsAction myLineAction = new ToolsAction(myLine.getText(), myPanel);
    
    
    /**
     * Constructor for the JFrame.
     */
    public PowerPaintGUI() {
        super();
    }
    
    /**
     * Sets up the GUI.
     */
    public void start() {
        
        setLayout(new BorderLayout());       
        setTitle("TCSS 305 PowerPaint");
        final ImageIcon img = new ImageIcon("images/basketball.png");
        setIconImage(img.getImage());
        setLocationRelativeTo(null);
        
        
        
        setJMenuBar(createMenuBar());        
        
        
        
        myPanel.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        add(myPanel);
        
        add(createToolBar(), BorderLayout.SOUTH);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);       
        pack();
        setVisible(true);
    }
    
    /**
     * Creates and returns the menu bar.
     * @return JMenuBar.
     */
    private JMenuBar createMenuBar() {
        final JMenuBar bar = new JMenuBar();
        
        final JMenu file = new JMenu("File");
    
        bar.add(file);
        file.setMnemonic('F');
        
        final ClearAction clearAction = new ClearAction(myPanel);
        myClear.setMnemonic('c');
        myClear.addActionListener(clearAction);
        
        file.add(myClear);
        file.addSeparator();
        
        final QuitAction quitAction = new QuitAction(this);
        myQuit.addActionListener(quitAction);
        myQuit.setMnemonic('Q');
        
        file.add(myQuit);
        
        final JMenu options = new JMenu("Options");
        bar.add(options);
        options.setMnemonic('O');
        
        mySlider = new JSlider(SwingConstants.HORIZONTAL, 0, MAX_VALUE,
                               INITIAL_VALUE);
        mySlider.setMajorTickSpacing(MAJOR_TICK_SPACING);
        mySlider.setMinorTickSpacing(MINOR_TICK_SPACING);
        mySlider.setPaintLabels(true);
        mySlider.setPaintTicks(true);
        mySlider.addChangeListener(new ChangeListener() {
            /** Called in response to slider events in this window. */
            @Override
            public void stateChanged(final ChangeEvent theEvent) {
                final int value = mySlider.getValue();
                myPanel.setStroke(new BasicStroke(value));
            }
        });

        
        final ThicknessAction thicknessAction = new ThicknessAction(myPanel);
        myThickness.setMnemonic('T');
        myThickness.add(mySlider);
        myThickness.addActionListener(thicknessAction);
        
        options.add(myThickness);
        
        options.addSeparator();
        
        final DrawColorAction drawColorAction = new DrawColorAction(this);
        

        myDrawColor.setMnemonic('D');
        myDrawColor.addActionListener(drawColorAction);
        
        options.add(myDrawColor);
        
        myFillColor.setMnemonic('F');
        myFillColor.addActionListener(drawColorAction);
        options.add(myFillColor);
        options.addSeparator();
        
        myFill.setMnemonic('F');
        options.add(myFill);
        
        final JMenu tools = new JMenu("Tools");
        bar.add(tools);
        tools.setMnemonic('T');
        
        
        myLine.addActionListener(myLineAction);
        myLine.setMnemonic('L');
        myLine.setIcon(new ImageIcon(LINE_ICON));
        tools.add(myLine);  
        
        
        myPencil.addActionListener(myPencilAction);
        myPencil.setMnemonic('P');
        myPencil.setIcon(new ImageIcon(PENCIL_ICON));
        tools.add(myPencil);
        
        
        myRectangle.addActionListener(myRectAction);
        myRectangle.setMnemonic('R');
        myRectangle.setIcon(new ImageIcon(RECTANGLE_ICON));
        tools.add(myRectangle); 
        
        
        myEllipse.addActionListener(myEllipseAction);
        myEllipse.setMnemonic('E');
        myEllipse.setIcon(new ImageIcon(ELLIPSE_ICON));
        tools.add(myEllipse);
        
        
        final JMenu help = new JMenu("Help");
        final AboutAction aboutAction = new AboutAction();
        bar.add(help);
        help.setMnemonic('h');
        myAbout.setMnemonic('A');
        myAbout.addActionListener(aboutAction);
        help.add(myAbout);
        
        myRadioGroup.add(myLine);
        myRadioGroup.add(myRectangle);
        myRadioGroup.add(myEllipse);
        myRadioGroup.add(myPencil);
             
        return bar;
        
    }
    
    /**
     * Creates and returns the toolbar.
     * @return JToolBar
     */
    private JToolBar createToolBar() {
        final JToolBar toolBar = new JToolBar();
        
        myToggleLine.setMnemonic('L');
        myToggleLine.setIcon(new ImageIcon(LINE_ICON));
        myToggleLine.addActionListener(myLineAction);
        toolBar.add(myToggleLine);
        
        myTogglePencil.setMnemonic('P');
        myTogglePencil.setIcon(new ImageIcon(PENCIL_ICON));
        myTogglePencil.addActionListener(myPencilAction);
        toolBar.add(myTogglePencil);
        
        myToggleRectangle.setMnemonic('R');
        myToggleRectangle.setIcon(new ImageIcon(RECTANGLE_ICON));
        myToggleRectangle.addActionListener(myRectAction);
        toolBar.add(myToggleRectangle);
        
        myToggleEllipse.setMnemonic('E');
        myToggleEllipse.setIcon(new ImageIcon(ELLIPSE_ICON));
        myToggleEllipse.addActionListener(myEllipseAction);
        toolBar.add(myToggleEllipse);
        
        myToggleGroup.add(myToggleLine);
        myToggleGroup.add(myTogglePencil);
        myToggleGroup.add(myToggleRectangle);
        myToggleGroup.add(myToggleEllipse);
        return toolBar;
    }
    
    /**
     * Returns the panel.
     * @return DrawingPanel.
     */
    public DrawingPanel getPanel() {
        return myPanel;
    }


}
