import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;


public class PolygonLabelsData {
	public Annotator parent;
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	public boolean dragging;
	public Point startpoint;
	public Point lastdragpoint;
	public ArrayList<Point> currentPolygon;
	public HashMap<Integer, ArrayList<Point>> polygonsList;
	public JPanel drawings;
	public BufferedImage image;
	public int labelIncrementor;
	public boolean pressed;
	public boolean mouseoverS;
	public boolean mouseoverL;
	public Help help;
	public ArrayList<Point> mousedOver;
	public Polygon mousedPolygon;

	public PolygonLabelsData(Point startpoint, Point lastdragpoint,
			ArrayList<Point> currentPolygon,
			HashMap<Integer, ArrayList<Point>> polygonsList,
			int labelIncrementor, boolean mouseoverS, boolean mouseoverL,
			ArrayList<Point> mousedOver, Polygon mousedPolygon) {
		this.startpoint = startpoint;
		this.lastdragpoint = lastdragpoint;
		this.currentPolygon = currentPolygon;
		this.polygonsList = polygonsList;
		this.labelIncrementor = labelIncrementor;
		this.mouseoverS = mouseoverS;
		this.mouseoverL = mouseoverL;
		this.mousedOver = mousedOver;
		this.mousedPolygon = mousedPolygon;
	}
}