import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public interface PolygonInterface {

	public abstract void scalePicture();

	public abstract void deleteCurrentPolygon();

	public abstract void deletePolygon(int id);

	public abstract void newPolygon();

	public abstract void resetMouseOver();

	public abstract void finishPolygon(String label);

	public abstract boolean tagsExists();

	public abstract void saveTag();

	public abstract void resetState();

	public abstract void openPicture();

	public abstract void openTag(String imageLabelFile);

	public abstract void checkUndoRedo();

	public abstract void undo();

	public abstract Point getStartPoint(int id);

	public abstract void mouseDragged(MouseEvent e);

	public abstract void drawPolygon(ArrayList<Point> polygon, boolean current,
			BufferedImage temp);

	public abstract void mouseMoved(MouseEvent e);

	public abstract void paintComponent(Graphics g);

	public abstract void addTag(String text);

	public abstract void mouseOverCheck(MouseEvent e);

	public abstract void mouseClicked(MouseEvent e);

	public abstract void mouseEntered(MouseEvent arg0);

	public abstract void mouseExited(MouseEvent arg0);

	public abstract void mousePressed(MouseEvent e);

	public abstract void mouseReleased(MouseEvent e);

	void runHelp();


}