package hci;

import hci.utils.Point;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PolygonBuilder {
	 private String tagName;
	    private List<Point> points = new ArrayList<Point>();
	    private Set<String> tags = new LinkedHashSet<String>();

	    public String getTagName()
	    {
	        return tagName;
	    }

	    public void setName(String name)
	    {
	        this.tagName = tagName;
	    }

	    public boolean isPointsEmpty()
	    {
	        return points.isEmpty();
	    }

	    public void addPoint(Point p)
	    {
	        points.add(p);
	    }

	    public boolean containsPoint(Point p)
	    {
	        return points.contains(p);
	    }

	    public void removePoint(Point p)
	    {
	        points.remove(p);
	    }

	    public boolean isTagsEmpty()
	    {
	        return tags.isEmpty();
	    }

	    public void addTag(String t)
	    {
	        tags.add(t);
	    }

	    public boolean containsTag(String t)
	    {
	        return tags.contains(t);
	    }

	    public void removeTag(String t)
	    {
	        tags.remove(t);
	    }

	    public List<Point> getPoints()
	    {
	        return points;
	    }

	    public void setTags(Set<String> tags)
	    {
	        this.tags = tags;
	    }

	    public Set<String> getTags()
	    {
	        return tags;
	    }

	    public void setPoints(List<Point> points)
	    {
	        this.points = points;
	    }

	    public boolean isInternalPoint(Point point)
	    {
	        int length = this.points.size();

	        int x = point.getX();
	        int y = point.getY();
	        int[] xs = new int[length];
	        int[] ys = new int[length];

	        for (int i = 0; i < length; i++)
	        {
	            Point p = this.points.get(i);
	            xs[i] = p.getX();
	            ys[i] = p.getY();
	        }

	        boolean inside = false;

	        for (int i = 0, j = length-1; i < length; j = i++)
	        {
	            if ( ((ys[i]>y) != (ys[j]>y)) &&
	                (x < (xs[j]-xs[i]) * (y-ys[i]) / (ys[j]-ys[i]) + xs[i]) )
	                    inside = !inside;
	        }

	        return inside;
	    }
}
