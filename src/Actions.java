
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import java.awt.event.*;
import java.beans.PropertyVetoException;



public class Actions extends JInternalFrame implements ActionListener, KeyListener, InternalFrameListener{
	private static final long serialVersionUID = 1L;
	private static JTextField textField;
	private  JButton cancel,tag;
	private JPanel main;
	private PolygonInterface desktop;
	private boolean action = false;
	Menu menu =new Menu();
	
	
    public Actions(PolygonInterface desktop,int x, int y,String defaultString) {
        super("Menu", false, true, false, false); 
        this.desktop = desktop;
        setSize(300,100);
        
        textField = menu.getText();
        textField.addKeyListener(this);
        textField.setText(defaultString);
        addInternalFrameListener(this);
        
        cancel = menu.getDiscardButton();
        cancel.addActionListener(this);
        
      
        tag = menu.getSubmitButton();
        tag.addActionListener(this);
        
        main = menu.getMain();
        setContentPane(main);
        setLocation(x, y);
        
    }
   
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if("tag".equals(event.getActionCommand())) {
			addLabel(textField.getText());
			setVisible(false);
			dispose();
		} else if("cancel".equals(event.getActionCommand())) {
			try {
				setClosed(true);
			} catch (PropertyVetoException e1) {
				System.out.println("Oops!!!");
			}
			dispose();
		}
	}
   

	@Override
	public void keyReleased(KeyEvent event) {
		if(action) {
			if(event.getKeyCode() == KeyEvent.VK_ENTER) {
				addLabel(textField.getText());
				setVisible(false);
				dispose();
			} else if(event.getKeyCode() == KeyEvent.VK_ESCAPE) {
				try {
					setClosed(true);
				} catch (PropertyVetoException e) {
					System.out.print("Could not execute requested command");
					e.printStackTrace();
				}
				dispose();
			}
		}
		action = false;
	}
	 public void keyPressed(KeyEvent key) {
			action = true;
		}
    @Override
	public void internalFrameClosing(InternalFrameEvent event) {
			desktop.deleteCurrentPolygon();
		}


	private void addLabel(String label) {
			desktop.addTag(label);
		}
	@Override
	public void internalFrameActivated(InternalFrameEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void internalFrameClosed(InternalFrameEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internalFrameDeactivated(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internalFrameDeiconified(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internalFrameIconified(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internalFrameOpened(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}
}