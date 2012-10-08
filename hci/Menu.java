package hci;

import hci.ImagePanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * simple class for handling points
 * @author Andrei
 *
 */


public class Menu extends JFrame{

	
	public static JButton getNewButton(){
		return newButton;
	}

	public static JButton getLoadButton(){
		return loadButton;
	}
	
	public static JButton getSaveButton(){
		return saveButton;
	}
	
	public static JButton getDeleteButton(){
		return deleteButton;
	}
	
	public static JButton getRenameButton(){
		return renameButton;
	}

    public static JButton getQuitButton(){
        return quitButton;
    }

	private static final long serialVersionUID = 1L;
	ImagePanel imagePanel = null;
	
	/* Defining the layout and the buttons of the application*/
	
	private FlowLayout layout;
	private static JButton newButton;
	private static JButton loadButton;
	private static JButton saveButton;
	private static JButton deleteButton;
	private static JButton renameButton;
    private static JButton quitButton;
	
	
	public Menu(){
		super("Menu1");
		
		layout = new FlowLayout();
		setLayout(layout);
		
		/*  Buttons */
		
		newButton = new JButton("New object");
		newButton.setMnemonic(KeyEvent.VK_N);
		newButton.setSize(80,20);
		newButton.setEnabled(true);
		newButton.setToolTipText("Click to add new polygon");
		newButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(null, "Enter the name of the polygon: ",
						"HCI_2012", 1);
				if (name != null){
					//create polygon with name
					ImageLabeller.addNewPolygon(name);
				}
			}
		});
		
		loadButton = new JButton("Load");
		loadButton.setMnemonic(KeyEvent.VK_N);
		loadButton.setSize(80,20);
		loadButton.setEnabled(true);
		loadButton.setToolTipText("Click to load new image");
		loadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageLabeller.loadImage();
			}
		});
		
		loadButton.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode()==KeyEvent.VK_O && ke.isControlDown()) {
					ImageLabeller.loadImage();
				}
			}
		});
		
		saveButton = new JButton("Save");
		saveButton.setMnemonic(KeyEvent.VK_N);
		saveButton.setSize(80, 20);
		saveButton.setEnabled(true);
		saveButton.setToolTipText("Click to save current image configuration");
				
	    deleteButton = new JButton("Delete");
		deleteButton.setMnemonic(KeyEvent.VK_N);
		deleteButton.setSize(80,20);
		deleteButton.setEnabled(true);
		deleteButton.setToolTipText("Click to delete the selected polygon");
		
	    renameButton = new JButton("Rename");
		renameButton.setMnemonic(KeyEvent.VK_N);
		renameButton.setSize(80,20);
		renameButton.setEnabled(true);
		renameButton.setToolTipText("Click to rename the tag");

        quitButton = new JButton("Quit");
        quitButton.setMnemonic(KeyEvent.VK_N);
        quitButton.setSize(80,20);
        quitButton.setEnabled(true);
        quitButton.setToolTipText("Click to quit");
		quitButton.addActionListener(new ActionListener(){
			@Override		
			public void actionPerformed(ActionEvent e) {
				ImageLabeller.quit();
			}
		});
		
	
		
			
	}

	
	
}	

	
