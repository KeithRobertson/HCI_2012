import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class MenuBar implements ActionListener {
	private static JMenuItem undo;
	private static JMenuItem redo;
	private static JMenuItem open;
	private static JMenuItem quit;
	private static JMenuItem help;
	JMenu fmenu;
	JMenu emenu;
	JMenu hmenu;

	
	public JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
 
        
        fmenu = new JMenu("File");
        fmenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fmenu);
        
       
        emenu = new JMenu("Options");
        emenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(emenu);
        
        
       
        hmenu = new JMenu("Help");
        hmenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(hmenu);

        
        open= new JMenuItem("Open");
        open.setMnemonic(KeyEvent.VK_O);
        open.setActionCommand("open");
        fmenu.add(open);
        
        
        undo = new JMenuItem("Undo");
        undo.setMnemonic(KeyEvent.VK_Z);
        undo.setActionCommand("undo");
        undo.setEnabled(false);
        emenu.add(undo);
 
        
        redo = new JMenuItem("Redo");
        redo.setMnemonic(KeyEvent.VK_Y);
        redo.setActionCommand("redo");
        redo.setEnabled(false);
        emenu.add(redo);
        
        
       quit = new JMenuItem("Quit");
       quit.setMnemonic(KeyEvent.VK_Q);
       quit.setActionCommand("quit");
       fmenu.add(quit);
       
       help = new JMenuItem("Help");
       help.setMnemonic(KeyEvent.VK_H);
       help.setActionCommand("help");
       hmenu.add(help);
 
        return menuBar;
    }
    public  JMenuItem getUndo(){
    	return undo;
    }
    public  JMenuItem getQuit(){
    	return quit;
    }
    public  JMenuItem getOpen(){
    	return open;
    }
    
    public JMenuItem getRedo(){
    	return redo;
    }
    
    public JMenuItem getHelp(){
    	return help;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
