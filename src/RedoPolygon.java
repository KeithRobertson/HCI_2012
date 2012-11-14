import java.util.ArrayList;

public class RedoPolygon {
		private String action;
		private int polygonId;
		private ArrayList<Point> points;
		private String label;
		
		public RedoPolygon(String action) {
			this.action = action;
		}
		public RedoPolygon(String action, ArrayList<Point> points) {
			this.action = action;
			this.points = points;
		}
		public RedoPolygon(String action, int polygonId) {
			this.action = action;
			this.polygonId = polygonId;
		}
		public RedoPolygon(String action,String label, int id) {
			this.action = action;
			this.label = label;
			this.polygonId = id;
		}
		public String action() {
			return action;
		}
		public int getId() {
			return polygonId;
		}
		public ArrayList<Point> getPoints() {
			return points;
		}
		public String getLabel() {
			return label;
		}
	}