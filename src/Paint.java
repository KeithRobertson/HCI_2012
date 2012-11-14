import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;

public class Paint extends DefaultDesktopManager {  
		private static final long serialVersionUID = 1L;
		public void beginDraggingFrame(JComponent f)
        {
			super.beginDraggingFrame(f);
			f.repaint();
        }	
		public void dragFrame(JComponent f, int newX, int newY)
        {
            if (!"help".equals(f.getClientProperty("type")))
                super.dragFrame(f, newX, newY);
        }
		public void endDraggingFrame(JComponent f)
        {
			super.endDraggingFrame(f);
			f.repaint();
        }
		public void activateFrame(JInternalFrame f) {
			super.activateFrame(f);
			f.repaint();
		}
		public void deactivateFrame(JInternalFrame f) {
			super.deactivateFrame(f);
			f.repaint();
		}
    }