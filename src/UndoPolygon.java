import java.util.ArrayList;

public class UndoPolygon {
		private String action;
		private int polygonId;
		private ArrayList<Point> points;
		private String label;
		public UndoPolygon(String action) {
			this.action = action;
			polygonId = -1;
		}
		public UndoPolygon(String action,int polygonId) {
			this.action = action;
			this.polygonId = polygonId;
		}
		public UndoPolygon(String action,String label, int id) {
			this.action = action;
			this.label = label;
			this.polygonId = id;
		}
		public UndoPolygon(String action,ArrayList<Point> points) {
			this.action = action;
			this.points = points;
		}
		public UndoPolygon(String action,ArrayList<Point> points, String label, int id) {
			this.action = action;
			this.points = points;
			this.label = label;
			this.polygonId = id;
		}
		public String action() {
			return action;
		}
		public ArrayList<Point> getPoints() {
			return points;
		}
		public int getId() {
			return polygonId;
		}
		public String getLabel() {
			return label;
		}
	}
	