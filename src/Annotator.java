import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
 
 
public class Annotator extends JFrame implements ListSelectionListener, ActionListener {
    private static final long serialVersionUID = 1L;
    int inset = 0;
    private PolygonLabels labels;
    private JPanel fullScreen;
    private JPanel leftPanel;
    private JPanel mainArea;
    private JPanel rightPanel;
     public JMenuItem undo;
    public JMenuItem redo;
    public JMenuItem quit;
    public JMenuItem open;
    public JMenuItem help;
    private BufferedImage image = null;
    public HashMap<Integer,Tags> labelList;
    public static String imageFilename;
    private MenuBar menuBar = new MenuBar();
    private JMenuBar t=new JMenuBar();
    private JLabel header;
    private JLabel loadInformation;
    GridBagConstraints constraints;
    GridBagConstraints cBag;
    static File initialPicture;
 
    private JLabel picture;
    private JList list;
    public JSplitPane splitPane;
    private File[] listOfFiles;
    private DefaultListModel listmodel;
    private boolean delete = false;
 
 
    public Annotator(File file) throws IOException {
        super("Image Labeller");
 
       File director = new File("data");
        if (!director.exists())
        {
            director.mkdir();
        }
 
        image = ImageIO.read(file);
        imageFilename = file.getName();
 
        setBounds(inset,inset,image.getWidth()+430,
                image.getHeight()+50);
 
        
        fullScreen = new JPanel();
        fullScreen.setLayout(new BoxLayout(fullScreen, BoxLayout.X_AXIS));
        
        leftPanel = new JPanel();
        leftPanel.setLayout(new GridBagLayout());
                
        mainArea = new JPanel();
        mainArea.setLayout(new BoxLayout(mainArea,BoxLayout.X_AXIS));
 
 
 
        labels = new PolygonLabels(image,this);
        labels.setSize(image.getWidth(),image.getHeight());
        labels.setPreferredSize(new Dimension(image.getWidth(),image.getHeight()));
        labels.setMinimumSize(new Dimension(image.getWidth(),image.getHeight()));
        labels.setMaximumSize(new Dimension(image.getWidth(),image.getHeight()));
 
 
        header = new JLabel();
        header.setText("<html><b>Your Image Labels:</b></html>");
        
        loadInformation = new JLabel();
        loadInformation.setText("<html><b>Click a file to preview</b></html>");
 
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridBagLayout());
 
        rightPanel.setPreferredSize(new Dimension(175,image.getHeight()));
        rightPanel.setMinimumSize(new Dimension(175,image.getHeight()));
        rightPanel.setMaximumSize(new Dimension(300,image.getHeight()));
        
        listmodel = new DefaultListModel();
        list = new JList(listmodel);
        getFiles();
        
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	delete = true;
	            if (list.getSelectedIndex() != -1) {
	            	int tmp = list.getSelectedIndex() - 1;
	            	String name = list.getSelectedValue().toString();
	            	File file = new File(System.getProperty("user.dir") +
	        					"/images/" + name);
	            	labels.deletePicture(file);
	            	listmodel.remove(list.getSelectedIndex());
	            	list.setSelectedIndex(tmp);
	            }
	            delete = false;
            }
        });      
        
        JScrollPane listScrollPane = new JScrollPane(list);
        picture = new JLabel();
        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
        picture.setHorizontalAlignment(JLabel.CENTER);
         
        JScrollPane pictureScrollPane = new JScrollPane(picture);
 
        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                                   listScrollPane, pictureScrollPane);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(170);
 
        Dimension minimumSize = new Dimension(150, 250);
        listScrollPane.setMinimumSize(minimumSize);
        pictureScrollPane.setMinimumSize(minimumSize);
 
        splitPane.setPreferredSize(new Dimension(350, 350));
        updateLabel("file:"+listOfFiles[list.getSelectedIndex()].getAbsolutePath());
 
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.gridwidth = 2;
        rightPanel.add(header,constraints);
 
        constraints.gridx = 0;
        constraints.gridy = 100;
        constraints.weightx = 0;
        constraints.weighty = 1;
        rightPanel.add(new JLabel(""),constraints);
        
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        leftPanel.add(loadInformation,constraints);
        
        leftPanel.add(Box.createRigidArea(new Dimension(leftPanel.getWidth(), 50)));
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx = 10;
        leftPanel.add(splitPane,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.weightx = 5;
        leftPanel.add(deleteButton, constraints);
        
        mainArea.add(leftPanel);
        mainArea.add(labels);
        mainArea.add(Box.createRigidArea(new Dimension(5,image.getHeight())));
        mainArea.add(rightPanel);
        mainArea.setSize(image.getWidth()+160,image.getHeight());
 
        setContentPane(mainArea);
 
 
        t=menuBar.createMenuBar();
        undo=menuBar.getUndo();
        undo.setAccelerator(KeyStroke.getKeyStroke("ctrl Z"));
        undo.addActionListener((ActionListener) this);
 
        redo=menuBar.getRedo();
        redo.setAccelerator(KeyStroke.getKeyStroke("ctrl Y"));
        redo.addActionListener((ActionListener) this);
        setJMenuBar(t);
 
        quit=menuBar.getQuit();
        quit.setAccelerator(KeyStroke.getKeyStroke("ctrl Q"));
 
        quit.addActionListener((ActionListener) this);
 
        open=menuBar.getOpen();
        open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        open.addActionListener((ActionListener) this);
 
        help=menuBar.getHelp();
        help.setAccelerator(KeyStroke.getKeyStroke("ctrl H"));
        help.addActionListener(this);
 
        labelList = new HashMap<Integer,Tags>();
        labels.openTag("data/"+file.getName() + ".xml");
 
 
    }
    
    public void getFiles() {
        String path = System.getProperty("user.dir") + "/images";
        File folder = new File(path);
        listOfFiles = folder.listFiles();
        String[] fileNames = new String[listOfFiles.length];
        for (int i = 0; i < listOfFiles.length; i++) {
            fileNames[i] = listOfFiles[i].getName();
            if (!listmodel.contains(fileNames[i])) {
            	listmodel.addElement(fileNames[i]);
            }
        }
        

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(listmodel.size()-1);
        list.addListSelectionListener(this);
        
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {
                	File file = new File(listOfFiles[list.getSelectedIndex()].getAbsolutePath());
                    labels.openPicture(file);
                }
            }
        });
        
    }

    public void valueChanged(ListSelectionEvent e) {
    	if (delete == false) {
	        JList list = (JList)e.getSource();
	        updateLabel("file:" + listOfFiles[list.getSelectedIndex()].getAbsolutePath());
    	}
    }
 
    protected ImageIcon createImageIcon(String path,
                            String description) throws MalformedURLException {
        java.net.URL imgURL = new java.net.URL(path);
        return new ImageIcon(imgURL, description);
    }
 
 
 
    protected void addLabel(String text, int id) {
        labelList.put(id,new Tags(text,id));
        labels.saveTag();
        Graphics g = getGraphics();
        if (g != null) paintComponents(g);
        else repaint();
    }
    
    protected void updateLabel (String name) {
        ImageIcon icon = null;
        try {
            icon = createImageIcon(name, "pic");
            Image img = icon.getImage();
            img = img.getScaledInstance(220,210,java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        picture.setIcon(icon);
        if  (icon != null) {
            picture.setText(null);
        } else {
            picture.setText("Image not found");
        }
    }
    protected void updateLabel(int id, String text,boolean push) {
        if(push) {
            labels.pushEditUndo(id,labelList.get(id).getText());
        }
        deleteLabel(id);
        labelList.put(id,new Tags(text,id));
        Graphics g = getGraphics();
        if (g != null) paintComponents(g);
        else repaint();
        labels.saveTag();
 
    }
    public void deleteLabel(int id) {
        labelList.get(id).delete();
        labelList.remove(id);
    }
    protected String getLabelText(int id) {
        return labelList.get(id).getText();
    }
 
    public class Tags {
        public Panel newLabel;
        public String text;
        public JPanel buttonBorder;
        public JPanel labelBorder;
        public JButton delete;
        public int id;
 
        Icon icon = createImageIcon("Icon/delete.png","");
        public Tags(String text,final int id) {
            this.id = id;
            this.text = text;
            newLabel = new Panel(text);
 
            newLabel.setPreferredSize(new Dimension(115,25));
            newLabel.setMaximumSize(new Dimension(115,25));
            newLabel.setMinimumSize(new Dimension(115,25));
            ValueChangedListener valueListener = new ValueChangedListener() {
                @Override
                public void valueChanged(String value, JComponent source) {
                    updateLabel(id,value,true);
                    requestFocusInWindow();
                    labels.clearRedo();
                }
            };
            MouseOverListener mouseListener = new MouseOverListener() {
                public void mouseEntered() {
                    labels.mouseOverPolygon(true,id);
                }
                public void mouseExited() {
                    labels.mouseOverPolygon(false,id);
                }
            };
            newLabel.addMouseOver(mouseListener);
            newLabel.addValueChanged(valueListener);
 
            delete = new JButton(icon);
            delete.setPreferredSize(new Dimension(25,25));
            delete.setMaximumSize(new Dimension(25,25));
            delete.setMinimumSize(new Dimension(25,25));
            delete.addActionListener(new PolygonRemover(this));
 
            cBag = new GridBagConstraints();
            cBag.anchor = GridBagConstraints.NORTHWEST;
            cBag.weightx = 0.8;
            cBag.weighty = 0;
            cBag.gridx = 0;
            cBag.gridy = id+1;
            rightPanel.add(newLabel,cBag);
            cBag.anchor = GridBagConstraints.NORTHWEST;
            cBag.weightx = 0;
            cBag.gridx = 1;
            cBag.gridy = id+1;
            rightPanel.add(delete,cBag);
        }
        public void delete() {
            newLabel.setVisible(false);
            delete.setVisible(false);
            labels.mouseOverPolygon(false,id);
        }
        public int getPolygonId() {
            return id;
        }
        public String getText() {
            return text;
        }
        protected ImageIcon createImageIcon(String path,
                String description) {
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL, description);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        }
    }
    private class PolygonRemover implements ActionListener{
 
        private Tags self;
        public PolygonRemover(Tags self) {
            this.self = self;
        }
 
        @Override
        public void actionPerformed(ActionEvent e) {
            self.delete();
            labels.deletePolygon(self.getPolygonId());
            labels.clearRedo();
        }
 
    }
 
 
    protected void newStance(int x,int y, String defaultText) {
        int offsetx = labels.getWidth()-300-x;
        int offsety = labels.getHeight()-y-110;
        if(offsetx < 0) {
            x = x + offsetx;
        } else if(offsetx > 500) {
            x = x + 50;
        }
        if(offsety < 0) {
            y = y + offsety;
        } else if(offsety > 490) {
            y = y + 50;
        }
        Actions frame = new Actions(labels,x,y,defaultText);
        frame.setVisible(true);
        labels.add(frame);
        try {
            frame.setSelected(true);
        } catch (PropertyVetoException e) {}
        labels.resetMouseOver();
    }
 
    public static void setInterface(File file) {
        JFrame.setDefaultLookAndFeelDecorated(true);
 
 
        try {
            Annotator frame = new Annotator(file);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e+"\nFatal Error");
        }
 
    }
 
 
    public void actionPerformed(ActionEvent event) {
        if ("undo".equals(event.getActionCommand())) {
            labels.undo();
        } else if ("redo".equals(event.getActionCommand())) {
            labels.redo();
        } else if ("open".equals(event.getActionCommand())) {
            labels.openPicture();
            getFiles();
        }else if ("help".equals(event.getActionCommand())) {
            labels.runHelp();
        } else {
            Object [] options = {"Yes", "No"};
            int result = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Labels will be saved",  
JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (result == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    }

 
    public static void main(String[] args) {
    	initialPicture = new File("images/default.jpg");
        setInterface(initialPicture);
    }

} 