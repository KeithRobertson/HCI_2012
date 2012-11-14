import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class PolygonLabels extends JDesktopPane implements MouseListener, MouseMotionListener, PolygonInterface{
	private static final long serialVersionUID = 1L;
	public	HashMap<Integer,String> readMap;
	public	FileInputStream inputStream;
	public	XMLDecoder decoderXML;
	public	FileOutputStream outputStream;
	public XMLEncoder encoderXML;
	public HashMap<Integer, String> stringSet;
	public Set<Integer> keys ;
	public Graphics2D graphics;
	public BufferedImage tempImage;
	public static Stack<UndoPolygon> undoPolygon;
	public static Stack<RedoPolygon> redoPolygon;
	final static JFileChooser fileChooser = new JFileChooser();
	public PolygonLabelsData data = new PolygonLabelsData(null, null, null,
			null, 0, false, false, null, null);
	int returnVal;
	File file;
	Image scaledPicture;

	
	public PolygonLabels(BufferedImage readImage, Annotator parent) {
		super();
		
		undoPolygon = new Stack<UndoPolygon>();
		redoPolygon = new Stack<RedoPolygon>();
		
		data.image = readImage;
		scalePicture();
		setDesktopManager(new Paint());  
		
		this.data.parent = parent;
		data.currentPolygon = new ArrayList<Point>();
		data.polygonsList = new HashMap<Integer,ArrayList<Point>>();
		data.dragging = false;
		
		data.drawings = new JPanel();
		data.drawings.setVisible(true);
		data.drawings.setBackground(Color.gray);
		add(data.drawings);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		
		data.pressed = false;
		fileChooser.setAcceptAllFileFilterUsed(false);
 		
	}
	protected void mouseOverPolygon(boolean over, int id) {
		if(over) {
			data.mousedOver = data.polygonsList.get(id);
		} else {
			data.mousedOver = null;
		}
		repaint();
	}
	private boolean maxLabels() {
		if(data.parent.labelList.size()>15) {
			JOptionPane.showMessageDialog(this, "You have created the maximum number of labels.<br>Please delete one before creating more.");
			return true;
		} else {
			return false;
		}
	}
	private boolean isOpenDialog() {
		if(getAllFrames().length > 0) {
			for(JInternalFrame f : getAllFrames()) {
				 if (!"help".equals(f.getClientProperty("type"))) {
					 return true;
				 }
			}
			return false;
		} else {
			return false;
		}
	}
	
	
 	@Override
	public void openPicture() {
 		String[] ext = new String[5];
 		ext[0] = "jpeg";
 		ext[1] = "jpg";
 		ext[2] = "gif";
 		ext[3] = "png";
 		ext[4] = "tiff";
 		fileChooser.setFileFilter(new FileNameExtensionFilter("Images",ext));
 		fileChooser.setCurrentDirectory(new File("images"));
		returnVal = fileChooser.showOpenDialog(data.parent);
		
		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
	        file = fileChooser.getSelectedFile();
	        Annotator.imageFilename = file.getName();
	        data.labelIncrementor = 0;
	        try {
				data.image = ImageIO.read(file);
			} catch (IOException e) {
				System.out.println("invalid image");
			}
	        if (!(new File(System.getProperty("user.dir") +
	        					"/images/" + file.getName())).exists()){
	        	File source = new File(file.getAbsolutePath());
		        File destination = new File(System.getProperty("user.dir") +
						"/images/" + file.getName());	        	
	        	try {
					copyFile(source, destination);
				} catch (IOException e) {
					System.out.println("failed to copy");
				}
			}
			scalePicture();
			resetState();
	        openTag("data/"+file.getName() + ".xml");
		}
		
	}
 	
	public void openPicture(File file) {
        Annotator.imageFilename = file.getName();
        data.labelIncrementor = 0;
	    try {
	    	data.image = ImageIO.read(file);
		} catch (IOException e) {
			System.out.println("invalid image");
		}
	    if (!(new File(System.getProperty("user.dir") +
				"/images/" + file.getName())).exists()){
	        File source = new File(file.getAbsolutePath());
	        File destination = new File(System.getProperty("user.dir") +
	        							"/images/" + file.getName());
	        System.out.println(destination.getAbsolutePath());
			try {
				copyFile(source, destination);
			} catch (IOException f) {
				System.out.println("failed to copy");
			}
	    }
	   
		scalePicture();
		resetState();
	    openTag("data/"+file.getName() + ".xml");
	    
	}
	
 	public void deletePicture(File file) {
 		file.delete();
 	}
 	
 	@SuppressWarnings("resource")
	private static void copyFile(File sourceFile, File destFile)
            throws IOException {
    if (!sourceFile.exists()) {
            return;
    }
    if (!destFile.exists()) {
            destFile.createNewFile();
    }
    FileChannel source = null;
    FileChannel destination = null;
    source = new FileInputStream(sourceFile).getChannel();
    destination = new FileOutputStream(destFile).getChannel();
    if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
    }
    if (source != null) {
            source.close();
    }
    if (destination != null) {
            destination.close();
    }

}

 	
	
	
	@Override
	public void scalePicture() {
		if (data.image.getWidth() > 800 || data.image.getHeight() > 600) {
			int newWidth = data.image.getWidth() > 800 ? 800 : (data.image.getWidth() * 600)/data.image.getHeight();
			int newHeight = data.image.getHeight() > 600 ? 600 : (data.image.getHeight() * 800)/data.image.getWidth();
			scaledPicture = data.image.getScaledInstance(newWidth, newHeight, Image.SCALE_FAST);
			data.image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
			data.image.getGraphics().drawImage(scaledPicture, 0, 0, this);
		}
	}
	
	
	

	@Override
	public void deleteCurrentPolygon() {
		data.startpoint = null;
  	  	data.lastdragpoint = null;
  	  	undoPolygon.push(new UndoPolygon("deleteCurrentPolygon",data.currentPolygon));
		data.currentPolygon = new ArrayList<Point>();
		repaint();
		clearRedo();
	}
	
	
	@Override
	public void deletePolygon(int id) {
		undoPolygon.push(new UndoPolygon("deleteSavedPolygon",data.polygonsList.get(id),data.parent.getLabelText(id),id));
		clearRedo();
		data.polygonsList.remove(id);
		data.parent.deleteLabel(id);
		repaint();
        saveTag();
	}
	
	
	@Override
	public void newPolygon() {
		
		data.parent.newStance(data.startpoint.getX()-50,data.startpoint.getY()-50,"");	
	}
	
	@Override
	public void resetMouseOver() {
		data.mouseoverS = false;
		data.mouseoverL = false;
	}
	
	
	@Override
	public void finishPolygon(String label) {
		if (data.currentPolygon != null ) {
			data.polygonsList.put(data.labelIncrementor,data.currentPolygon);
			data.parent.addLabel(label,data.labelIncrementor);
			undoPolygon.push(new UndoPolygon("completePolygon",data.labelIncrementor));
			clearRedo();
			
			data.labelIncrementor++;
			
			data.startpoint = null;
	  	  	data.lastdragpoint = null;
	  	  	data.dragging = false;
	  	  	data.mouseoverS = false;
	  	  	data.mouseoverL = false;
			data.currentPolygon = new ArrayList<Point>();

		}
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void openTag(String imageLabelFile) {
		try {
			inputStream = new FileInputStream(imageLabelFile);
			decoderXML = new XMLDecoder(inputStream);
				
			readMap = (HashMap<Integer,String>) decoderXML.readObject();
			data.polygonsList = (HashMap<Integer, ArrayList<Point>>) decoderXML.readObject();
			int i = 0;
			for (Integer key : readMap.keySet()) {
				String value = readMap.get(key);
				int keyid = key;
				
				data.parent.addLabel(value, i);
				if(i!=keyid) {
					data.polygonsList.put(i,data.polygonsList.get(keyid));
					data.polygonsList.remove(keyid);
				}
				i++;
			}
			data.labelIncrementor = i;
			
		    
			decoderXML.close();
			inputStream.close();
		        
		} catch (IOException ex) {
			System.out.println("No existing polygons to load");
		}

	}
	
	
	@Override
	public void saveTag() {
		String currentImageLabels = "data/"+Annotator.imageFilename + ".xml";
		
		try {
			 outputStream = new FileOutputStream(currentImageLabels);
			 encoderXML = new XMLEncoder(outputStream);
		    
		     stringSet = new HashMap<Integer, String>();
		    for (Integer i : data.parent.labelList.keySet()) {
		    	stringSet.put(i,(data.parent.labelList.get(i).getText()));
		    }
		    
	    	encoderXML.writeObject(stringSet);
	    	encoderXML.writeObject(data.polygonsList);
		    
		    encoderXML.close();
		    outputStream.close();
		    } catch (IOException ex) {
		    System.err.println("Could not write polygons");
	    }
	}
	
	
	@Override
	public boolean tagsExists() {
		
		String files;
		File folder = new File("data");
		File[] listOfFiles = folder.listFiles(); 
		
		for (int i = 0; i < listOfFiles.length; i++) 
		  {
		 
		   if (listOfFiles[i].isFile()) 
		   {
		   files = listOfFiles[i].getName();
		       if (files.endsWith(".xml") || files.endsWith(".XML"))
		       {
		          return true;
		        }
		     }
		  }
		return false;
		
	}

	
	@Override
	public void resetState() {
	    keys = new HashSet<Integer>();
		keys.addAll(data.parent.labelList.keySet());
		for(Integer i : keys) {
			data.parent.deleteLabel(i);
		}
		for(JInternalFrame f : getAllFrames()) {
			f.dispose();
		}
		data.labelIncrementor = 0;
		data.startpoint = null;
		data.lastdragpoint = null;
		data.dragging = false;
		data.currentPolygon = new ArrayList<Point>();
		data.polygonsList = new HashMap<Integer,ArrayList<Point>>();
		undoPolygon = new Stack<UndoPolygon>();
		redoPolygon = new Stack<RedoPolygon>();
		checkUndoRedo();
		repaint();
	}
	
 

	@Override
	public void checkUndoRedo() {
		if(undoPolygon.empty()) {
			data.parent.undo.setEnabled(false);
		} else {
			data.parent.undo.setEnabled(true);
		}
		if(redoPolygon.empty()) {
			data.parent.redo.setEnabled(false);
		} else {
			data.parent.redo.setEnabled(true);
		}
	}
	
	@Override
	public void undo() {
		if(data.pressed || undoPolygon.empty()) {
			return;
		}
		UndoPolygon last = undoPolygon.pop();
		if(last.action().equals("addPointToCurrent") && data.currentPolygon != null) {
			if(data.currentPolygon.size() > 1) {
				ArrayList<Point> removedPoints = new ArrayList<Point>();
				removedPoints.add(data.currentPolygon.get(data.currentPolygon.size()-1));
				data.currentPolygon.remove(data.currentPolygon.size()-1);
				while(!data.currentPolygon.get(data.currentPolygon.size()-1).isPrimary()) {
					removedPoints.add(data.currentPolygon.get(data.currentPolygon.size()-1));
					data.currentPolygon.remove(data.currentPolygon.size()-1);
				}
				data.lastdragpoint = data.currentPolygon.get(data.currentPolygon.size()-1);
				for(JInternalFrame j: getAllFrames()) {
					j.dispose();
				}
				redoPolygon.push(new RedoPolygon("addPointToCurrent",removedPoints));
				repaint();
			} else if(data.currentPolygon.size() == 1) {
				ArrayList<Point> removedPoints = new ArrayList<Point>();
				removedPoints.add(data.currentPolygon.get(0));
				redoPolygon.push(new RedoPolygon("addPointToCurrent",removedPoints));
				data.currentPolygon.remove(0);
				data.startpoint = null;
				data.lastdragpoint = null;
				repaint();
			} else {
				undo();
			}
		} else if(last.action().equals("completePolygon")){
			if(data.polygonsList.size()>0) {
				data.currentPolygon = data.polygonsList.get(last.getId());
				if(data.currentPolygon != null) {
					data.polygonsList.remove(last.getId());
					String text = data.parent.getLabelText(last.getId());
					data.parent.deleteLabel(last.getId());
					data.startpoint = data.currentPolygon.get(0);
					data.lastdragpoint = null;
					data.parent.newStance(data.startpoint.getX()-50,data.startpoint.getY()-50,text);
					redoPolygon.push(new RedoPolygon("completePolygon",text,last.getId()));
				} else {
					undo();
				}
				saveTag();
			}
		} else if(last.action().equals("deleteCurrentPolygon")){
			data.currentPolygon = last.getPoints();
			data.startpoint = data.currentPolygon.get(0);
			data.lastdragpoint = null;
			newPolygon();
			redoPolygon.push(new RedoPolygon("deleteCurrentPolygon"));
			saveTag();
			repaint();
		} else if(last.action().equals("deleteSavedPolygon")){
			ArrayList<Point> tempPoly = last.getPoints();
			if (tempPoly != null ) {
				data.polygonsList.put(last.getId(),tempPoly);
				data.parent.addLabel(last.getLabel(),last.getId());
			}
			redoPolygon.push(new RedoPolygon("deleteSavedPolygon",last.getId()));
			repaint();
		} else if(last.action().equals("editLabel")){
			redoPolygon.push(new RedoPolygon("editLabel",data.parent.getLabelText(last.getId()),last.getId()));
			data.parent.updateLabel(last.getId(),last.getLabel(),false);
		} else {
			undo();
		}
		checkUndoRedo();
	}
	protected void pushEditUndo(int id, String label) {
		undoPolygon.push(new UndoPolygon("editLabel",label, id));
		clearRedo();
	}
	protected void clearRedo() {
		redoPolygon = new Stack<RedoPolygon>();
		checkUndoRedo();
	}
	protected void redo() {
		if(data.pressed || redoPolygon.empty()) {
			return;
		}
		RedoPolygon next = redoPolygon.pop();
		if(next.action().equals("addPointToCurrent")) {
			if(data.currentPolygon == null || data.currentPolygon.size()<1) {
				data.currentPolygon = next.getPoints();
				data.startpoint = data.currentPolygon.get(0);
				data.lastdragpoint = data.currentPolygon.get(data.currentPolygon.size()-1);
				undoPolygon.push(new UndoPolygon("addPointToCurrent"));
				repaint();
			} else {
				for(int i = next.getPoints().size()-1;i>=0;i--) {
					data.currentPolygon.add(next.getPoints().get(i));
				}
				undoPolygon.push(new UndoPolygon("addPointToCurrent"));
				data.lastdragpoint = data.currentPolygon.get(data.currentPolygon.size()-1);
				if(data.startpoint == data.lastdragpoint) {
					
					if(!redoPolygon.empty()) {
						data.parent.newStance(data.startpoint.getX()-50,data.startpoint.getY()-50,redoPolygon.peek().getLabel());
					} else {
						data.parent.newStance(data.startpoint.getX()-50,data.startpoint.getY()-50,"");
					}
					
				}
				repaint();
			}
		} else if(next.action().equals("completePolygon")) {
			for(JInternalFrame j: getAllFrames()) {
				j.dispose();
			}
			if (data.currentPolygon != null ) {
				data.polygonsList.put(next.getId(),data.currentPolygon);
				data.parent.addLabel(next.getLabel(),next.getId());
				undoPolygon.push(new UndoPolygon("completePolygon",next.getId()));
			}
			
			data.startpoint = null;
	  	  	data.lastdragpoint = null;
			data.currentPolygon = new ArrayList<Point>();
		} else if(next.action().equals("deleteCurrentPolygon")) {
			for(JInternalFrame j: getAllFrames()) {
				j.dispose();
			}
			deleteCurrentPolygon();
			repaint();
		} else if(next.action().equals("deleteSavedPolygon")) {
			deletePolygon(next.getId());
			repaint();
		} else if(next.action().equals("editLabel")) {
			undoPolygon.push(new UndoPolygon("editLabel",data.parent.getLabelText(next.getId()),next.getId()));
			data.parent.updateLabel(next.getId(),next.getLabel(),false);
		} else {
			redo();
		}
		checkUndoRedo();
	}
	
	@Override
	public Point getStartPoint(int id) {
		return data.polygonsList.get(id).get(0);
	}
	
	@Override
	public void mouseDragged( MouseEvent e ) {
		if(!isOpenDialog()) {
			data.x2 = e.getX();
			data.y2 = e.getY();
			data.dragging = true;
			Point cur = new Point(data.x2,data.y2,4);
			data.currentPolygon.add(cur);
			Graphics2D g = (Graphics2D) this.getGraphics();
			g.setStroke(new BasicStroke(4.0f,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			g.setColor(Color.CYAN);
			g.drawLine(data.x1,data.y1,data.x2,data.y2);

			mouseOverCheck(e);

			data.x1 = data.x2;
			data.y1 = data.y2;
		}
	}
	
	
	@Override
	public void drawPolygon(ArrayList<Point> polygon, boolean current,BufferedImage temp) {
		graphics = (Graphics2D)temp.getGraphics();
		graphics.setStroke(new BasicStroke(4.0f,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		for(int i = 0; i < polygon.size(); i++) {
			Point currentVertex = polygon.get(i);
			if (i != 0) {
				Point prevVertex = polygon.get(i - 1);
				graphics.setColor(Color.CYAN);
				graphics.drawLine(prevVertex.getX(), prevVertex.getY(), currentVertex.getX(), currentVertex.getY());
			}
			if(currentVertex.isPrimary()) {
				if (i != 0) {
					graphics.setColor(Color.CYAN);
					graphics.fillOval(currentVertex.getX() - 7, currentVertex.getY() - 7, 15, 15);
				}
			}
		}
		if(data.startpoint != null) {
			if(current && data.mouseoverS) {
				graphics.setColor(Color.WHITE);
			} else if(current) {
				graphics.setColor(Color.RED);
			} else {
				graphics.setColor(Color.CYAN);
			}
			graphics.fillOval(data.startpoint.getX() - 7, data.startpoint.getY() - 7, 15, 15);
			if(data.lastdragpoint != null && data.lastdragpoint != data.startpoint && current) {
				if(data.mouseoverL) {
					graphics.setColor(Color.WHITE);
				} else  {
					graphics.setColor(Color.CYAN);
				}
				graphics.fillOval(data.lastdragpoint.getX() - 7, data.lastdragpoint.getY() - 7, 15, 15);
			}
			
			
		}
	}
	
	
	
	@Override
	public void mouseMoved(MouseEvent e) {
		if(!isOpenDialog()) {
			mouseOverCheck(e);
		}
	}
	
	
	@Override
	public void paintComponent(Graphics g)
    {
		tempImage = new BufferedImage(data.image.getWidth(),data.image.getHeight(),data.image.getType());
		tempImage.setData(data.image.getData());
	    data.mousedPolygon = new Polygon();
	    if(data.mousedOver != null) {
			for(int i = 0;i<data.mousedOver.size();i++) {
				Point p = data.mousedOver.get(i);
				data.mousedPolygon.addPoint(p.getX()+1,p.getY()+1);
			}
			Graphics2D g2 = (Graphics2D)tempImage.getGraphics();
			g2.setColor(Color.RED);
			Composite defaultC = g2.getComposite();
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.2f));
			g2.fillPolygon(data.mousedPolygon);
			g2.setComposite(defaultC);
	    }
	    for(ArrayList<Point> polygon : data.polygonsList.values()) {
			drawPolygon(polygon,false,tempImage);
		} 
			
		drawPolygon(data.currentPolygon,true,tempImage);
		
		
		g.drawImage(tempImage, 0, 0, null);
    }
	

	@Override
	public void mouseOverCheck(MouseEvent e) {
			boolean start1 = data.mouseoverS;
			boolean start2 = data.mouseoverL;
			if(data.startpoint != null && data.startpoint.near(new Point(e.getX(),e.getY(),1))) {
				data.mouseoverS = true;
			} else if(data.startpoint != null) {
				data.mouseoverS = false;
				if(data.lastdragpoint != null && data.lastdragpoint.near(new Point(e.getX(),e.getY(),1))) {
					data.mouseoverL = true;
				} else {
					if(data.lastdragpoint != null && data.lastdragpoint != data.startpoint) {
						data.mouseoverL = false;
					}
				}
			}
			if(data.mouseoverS != start1 || data.mouseoverL != start2) {
				repaint();
			}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		data.pressed = true;
		if(!maxLabels() && !isOpenDialog() && e.getButton() == MouseEvent.BUTTON1) {
			data.pressed = true;
			boolean end = false;
			data.x1 = e.getX();
			data.y1 = e.getY();
			if(data.startpoint == null) {
				data.startpoint = new Point(data.x1,data.y1,8, true);
				data.lastdragpoint = data.startpoint;
		    	data.currentPolygon.add(data.startpoint);
		    } else if(data.startpoint.near(new Point(data.x1,data.y1,1)) && data.startpoint != data.lastdragpoint) {
		    	data.currentPolygon.add(data.startpoint);
		    	data.x1 = data.startpoint.getX();
		    	data.y1 = data.startpoint.getY();
		    	end = true;
		    } else if(data.lastdragpoint != null && data.lastdragpoint.near(new Point(data.x1,data.y1,1))) {
		    	  
		    	return;
		    } else {
		    	data.lastdragpoint = new Point(data.x1,data.y1,8,true);
		    	data.currentPolygon.add(data.lastdragpoint);
		    }
		      
			Graphics2D g = (Graphics2D)this.getGraphics();

		      
		
				g.setColor(Color.CYAN);
				if (data.currentPolygon.size() > 1) {
					Point lastVertex = data.currentPolygon.get(data.currentPolygon.size() - 2);
					g.setStroke(new BasicStroke(4.0f,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
					g.drawLine(lastVertex.getX(), lastVertex.getY(), data.x1, data.y1);
				}
				
				if(!end) {
					g.fillOval(data.x1-7,data.y1-7,15,15);
				} else {
					newPolygon();
				}

		  
			undoPolygon.push(new UndoPolygon("addPointToCurrent"));
			clearRedo();
			mouseOverCheck(e);
		}
	}

	
	@Override
	public void mouseReleased(MouseEvent e) {
		if(data.pressed && !isOpenDialog()) {
			if(data.dragging) {
				data.dragging = false;
				if(data.startpoint != null && data.startpoint.near(new Point(e.getX(),e.getY(),1))) {
			    	  data.currentPolygon.add(data.startpoint);
			    	  newPolygon();
			    } else {

			    	data.lastdragpoint = new Point(e.getX(),e.getY(),8,true);
			    	data.currentPolygon.add(data.lastdragpoint);
			    }
			}
			mouseOverCheck(e);
			undoPolygon.push(new UndoPolygon("addPointToCurrent"));
			clearRedo();
		}
		data.pressed = false;
	}
	@Override
	public void addTag(String text) {
		finishPolygon(text);
	}
	
	@Override
	public void runHelp() {
		data.help = new Help(this);
		data.help.next();
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		
	}

	
	@Override
	public void mouseExited(MouseEvent arg0) {
		
		
	}

}