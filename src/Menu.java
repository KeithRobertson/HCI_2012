import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Menu extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField textField;
	private static JPanel main;
	private static JButton cancel;
	private static JButton tag;
	Icon icon = createImageIcon("Icon/add.png","");
	Icon icon2 = createImageIcon("Icon/delete.png","");
	
    public Menu(){
		super("Menu");
		textField = new JTextField();
	    textField.setPreferredSize(new Dimension(100,30));
	    textField.setMaximumSize(new Dimension(100,30));
	    textField.setMinimumSize(new Dimension(100,30));
	    
	    tag = new JButton(icon);
        //tag.setText("Tag");
        tag.setActionCommand("tag");
	    
	    cancel = new JButton(icon2);
        //cancel.setText("Cancel");
        cancel.setActionCommand("cancel");
       
        main = new JPanel();
        main.add(textField);
        main.add(tag);
        main.add(cancel);
        main.setLayout(new FlowLayout(FlowLayout.CENTER));
        
    }
    protected ImageIcon createImageIcon(String path,
			String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
    public JButton getDiscardButton(){
		return cancel;
	}
    public JButton getSubmitButton(){
		return tag;
	}

    public JTextField getText(){
		return textField;
	}
    public JPanel getMain(){
		return main;
	}
}
