package hci;

import hci.ImagePanel;
import hci.utils.Point;
import hci.Menu;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;


/**
 * Main class of the program - handles display of the main window
 * @author Michal
 *
 */
public class ImageLabeller extends JFrame implements ListSelectionListener{
	/**
	 * some java stuff to get rid of warnings
	 */
	private static final long serialVersionUID = 1L;
	final static JFileChooser fc = new JFileChooser();
	
	/**
	 * main window panel
	 */
	JPanel appPanel = null;
	
	/**
	 * toolbox - put all buttons and stuff here!
	 */
	JPanel toolboxPanel = null;
	
	/**
	 * image panel - displays image and editing area
	 */
	static ImagePanel imagePanel = null;
	
	/**
	 * handles New Object button action
	 */
	
	
	//Create JList of polygons
	ArrayList<ArrayList<Point>> polygonsList = ImagePanel.getPolygonsList();
	
	static DefaultListModel listModel = new DefaultListModel();
            

	
	public static void addNewPolygon() {
		imagePanel.addNewPolygon();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		imagePanel.paint(g); //update image panel
	}
	
	/**
	 * sets up application window
	 * @param imageFilename image to be loaded for editing
	 * @throws Exception
	 */
	public void setupGUI(String imageFilename) throws Exception {
		
		this.addWindowListener(new WindowAdapter() {
		  	public void windowClosing(WindowEvent event) {
		  		quit();
		  	}
		});

		//setup main window panel
		appPanel = new JPanel();
		this.setLayout(new BoxLayout(appPanel, BoxLayout.X_AXIS));
		this.setContentPane(appPanel);
		
        //Create and set up the image panel.
		imagePanel = new ImagePanel(imageFilename);
		imagePanel.setOpaque(true); //content panes must be opaque
		
        appPanel.add(imagePanel);

        //create toolbox panel
        toolboxPanel = new JPanel();
        toolboxPanel.setLayout(new BoxLayout(toolboxPanel, BoxLayout.Y_AXIS));
        
		@SuppressWarnings("unused")
		Menu menu = new Menu();
        JButton deleteButton = Menu.getDeleteButton();
        JButton loadButton = Menu.getLoadButton();
        JButton newButton = Menu.getNewButton();
        JButton quitButton = Menu.getQuitButton();
        JButton renameButton = Menu.getRenameButton();
        JButton saveButton = Menu.getSaveButton();


		JList polygonList = new JList(listModel);
        polygonList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        polygonList.setSelectedIndex(0);
        polygonList.addListSelectionListener(this);
        polygonList.setVisibleRowCount(5);
		
		polygonList.setSize(100,100);
		polygonList.setEnabled(true);

		toolboxPanel.add(deleteButton);
		toolboxPanel.add(loadButton);
		toolboxPanel.add(newButton);
		toolboxPanel.add(polygonList);
		toolboxPanel.add(renameButton);
		toolboxPanel.add(saveButton);
		toolboxPanel.add(quitButton);
        JScrollPane scroll = new JScrollPane(polygonList);
		scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
        toolboxPanel.add(scroll);
        
		//add toolbox to window
		appPanel.add(toolboxPanel);
		
		//display all the stuff
		this.pack();
        this.setVisible(true);
		}
	
	public static void loadImage(){
		File file = null;
		int returnVal = fc.showOpenDialog(fc);
		if(returnVal == JFileChooser.APPROVE_OPTION){
			file = fc.getSelectedFile();
			String filepath = file.getAbsolutePath();
			ImageLabeller window = new ImageLabeller();
			try {
				window.setupGUI(filepath);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
  
	
	public static void quit(){
		Object [] options = {"Yes", "No"};
		int result = JOptionPane.showOptionDialog(null, "Quit", "Confirm quit", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		if (result == JOptionPane.YES_OPTION){
			System.out.println("Bye bye!");
			System.exit(0);
		}else{
			;
		}
	}
			
			
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
        for(int i = 0; i < polygonsList.size()-1; i++){
    		listModel.addElement(polygonsList.get(i));
        }
	}
	
	/**
	 * Runs the program
	 * @param argv path to an image
	 */
	public static void main(String argv[]) {
		try {
			//create a window and display the image
			ImageLabeller window = new ImageLabeller();
			window.setupGUI(argv[0]);
		} catch (Exception e) {
			System.err.println("Image: " + argv[0]);
			e.printStackTrace();
		}
	}

}
