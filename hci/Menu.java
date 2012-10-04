package hci;

import hci.ImagePanel;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

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
	private static final long serialVersionUID = 1L;
	ImagePanel imagePanel = null;
	
	/* Defining the layout and the buttons of the application*/
	
	private FlowLayout layout;
	private static JButton newButton;
	private static JButton loadButton;
	private static JButton saveButton;
	private static JButton deleteButton;
	private static JButton renameButton;
	
	
	public Menu(){
		super("Menu1");
		
		layout = new FlowLayout();
		setLayout(layout);
		
		/*  Buttons */
		
		newButton = new JButton("New image");
		newButton.setMnemonic(KeyEvent.VK_N);
		newButton.setSize(80,20);
		newButton.setEnabled(true);
		newButton.setToolTipText("Click to add new image");
		
		loadButton = new JButton("Load");
		loadButton.setMnemonic(KeyEvent.VK_N);
		loadButton.setSize(80,20);
		loadButton.setEnabled(true);
		loadButton.setToolTipText("Click to load new image");
		
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
		renameButton.setSize(100,20);
		renameButton.setEnabled(true);
		renameButton.setToolTipText("Click to rename the tag");
		
	
		
			
	}

	
	
}	

	
