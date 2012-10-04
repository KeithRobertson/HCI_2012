package hci;

import hci.ImagePanel;
import hci.utils.Point;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Component;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.*;
import java.awt.Event;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


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
	final JFileChooser fc = new JFileChooser();
	
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
	ImagePanel imagePanel = null;
	
	/**
	 * handles New Object button action
	 */

	
	public void addNewPolygon() {
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
		  		//here we exit the program (maybe we should ask if the user really wants to do it?)
		  		//maybe we also want to store the polygons somewhere? and read them next time
		  		System.out.println("Bye bye!");
		    	System.exit(0);
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
        
        
        
        //Add button
		JButton newPolyButton = new JButton("New object");
		newPolyButton.setMnemonic(KeyEvent.VK_N);
		newPolyButton.setSize(50, 20);
		newPolyButton.setEnabled(true);
		newPolyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		newPolyButton.setToolTipText("Click to add new object");
		
		JButton loadButton = new JButton("Load Image");
		loadButton.setSize(50,20);
		loadButton.setEnabled(true);
		loadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = null;
				int returnVal = fc.showOpenDialog(fc);
				if(returnVal == JFileChooser.APPROVE_OPTION){
					file = fc.getSelectedFile();
					String filepath = file.getAbsolutePath();
					ImageLabeller window = new ImageLabeller();
					try {
						window.setupGUI(filepath);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//imagePanel.setImage(file.getPath());
				}
			}
		});
		
		loadButton.setToolTipText("Click here to load a new image");
				
			
			
			loadButton.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent ke) {
					if (ke.getKeyCode()==KeyEvent.VK_O && ke.isControlDown()) {
						File file = null;
						int returnVal = fc.showOpenDialog(fc);
						if(returnVal == JFileChooser.APPROVE_OPTION){
							file = fc.getSelectedFile();
							//imagePanel.setImage(file.getPath());
						}
					}
				}
			});
		
		
		//Create JList of polygons
		ArrayList<ArrayList<Point>> polygonsList = ImagePanel.getPolygonsList();
		
		DefaultListModel listModel = new DefaultListModel();
        
        for(int i = 0; i < polygonsList.size()-1; i++){
        		System.out.println("adding saved polygon");
        		listModel.addElement(polygonsList.get(i));
        		System.out.println("added polygon");
        }
        
		JList polygonList = new JList(listModel);
        polygonList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        polygonList.setSelectedIndex(0);
        polygonList.addListSelectionListener(this);
        polygonList.setVisibleRowCount(5);
		
		polygonList.setSize(100,100);
		polygonList.setEnabled(true);


		toolboxPanel.add(loadButton);
		toolboxPanel.add(polygonList);		
		toolboxPanel.add(newPolyButton);

		
        JScrollPane scroll = new JScrollPane(polygonList);
		scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
        toolboxPanel.add(scroll);
        
        JButton button1 = Menu.getNewButton();
        toolboxPanel.add(button1);
		
		//add toolbox to window
		appPanel.add(toolboxPanel);
		
		//display all the stuff
		this.pack();
        this.setVisible(true);
		}
			
			
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		System.out.println("ok");
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