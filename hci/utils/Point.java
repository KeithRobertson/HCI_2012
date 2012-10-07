package hci.utils;

/**
 * simple class for handling points
 * @author Michal
 *
 */
public class Point {
	private int x = 0;
	private int y = 0;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Point other = (Point) obj;
	        if (x != other.x)
	            return false;
	        if (y != other.y)
	            return false;
	        return true;
	    }
	 public double distanceFrom(Point point) {
	        int dx = x - point.getX();
	        int dy = y - point.getY();
	        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	    }
}
