import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Help {
	private JPanel inner;
	private int step = 0;
	private JInternalFrame frame;
	JButton nextButton1 = new JButton();
	JButton nextButton2 = new JButton();
	JButton nextButton3 = new JButton();
	JButton nextButton4 = new JButton();
	JButton backButton1 = new JButton();
	JButton backButton2 = new JButton();
	JButton backButton3 = new JButton();
	JButton backButton4 = new JButton();
	JPanel buttons1 = new JPanel();
	JPanel buttons2 = new JPanel();
	JPanel buttons3 = new JPanel();
	JPanel buttons4 = new JPanel();
	JPanel pane1 = new JPanel();
	JPanel pane2 = new JPanel();
	JPanel pane3 = new JPanel();
	JPanel pane4 = new JPanel();

	public Help(PolygonLabels parent) {
		frame = new JInternalFrame("Guide", false, true, false, false);
		frame.putClientProperty("type", "Guide");
		frame.setSize(300,250);
		frame.setLocation(10,10);
         frame.setVisible(true);
         parent.add(frame);
 
		CardLayout layout = new CardLayout(0, 0);
 
		inner = new JPanel();
		inner.setLayout(layout);
		inner.setBorder(new EmptyBorder(5,5,5,5));
		inner.setBackground(Color.ORANGE);
		frame.add(inner);
 
 
 
		nextButton1 = setUpButtons(nextButton1,0);
		nextButton2 = setUpButtons(nextButton2,0);
		nextButton3 = setUpButtons(nextButton3,0);
		nextButton4 = setUpButtons(nextButton4,0);
 
 
		backButton1 = setUpButtons(backButton1,1);
		backButton2 = setUpButtons(backButton2,1);
		backButton3 = setUpButtons(backButton3,1);
		backButton4 = setUpButtons(backButton4,1);
 
 
		buttons1 = setButtons(buttons1, nextButton1, backButton1);
		buttons2 = setButtons(buttons2, nextButton2, backButton2);
		buttons3 = setButtons(buttons3, nextButton3, backButton3);
		buttons4 = setButtons(buttons4, nextButton4, backButton4);
 
 
 
		pane1.setBackground(Color.ORANGE);
		pane1.setLayout(new BorderLayout());
		JLabel text = new JLabel("<html><b>Drawing Guide</b><br><br>In order " + 
								"to start drawing a label click anywhere on the picture.You can " + 
								"complete a polygon label by clicking or dragging the mouse coursor " + 
								"around your desired object and then back to its starting point <html>");
		text.setFont(new  
Font(text.getFont().getFamily(),text.getFont().getStyle(),14));
		pane1.add(text,BorderLayout.PAGE_START);
		pane1.add(buttons1,BorderLayout.SOUTH);
 
 
		pane2.setBackground(Color.ORANGE);
		pane2.setLayout(new BorderLayout());
		text = new JLabel("<html><b>Undo-Redo</b><br><br>When a mistake was " + 
							"made you can use the Undo or Redo actions by using the Options menu " +
							"from the top or just by using the shorkeys 'Ctrl-U' for Undo and " +
							"'Ctrl-Y' for Redo.</html>");
		text.setFont(new  
Font(text.getFont().getFamily(),text.getFont().getStyle(),14));
		pane2.add(text,BorderLayout.PAGE_START);
		pane2.add(buttons2,BorderLayout.SOUTH);
 
 
		pane3.setBackground(Color.ORANGE);
		pane3.setLayout(new BorderLayout());
		text = new JLabel("<html><b>Editing Labels</b><br><br>Editing " +
						"existing a tag is easy, just click on the one you wish to edit on the " +
						"right panel and type in the new name. " +
										"Press 'Enter' to submit the change.Don't worry about your " +  
						"labels,they're saved automatically</html>");
		text.setFont(new  
Font(text.getFont().getFamily(),text.getFont().getStyle(),14));
		pane3.add(text,BorderLayout.PAGE_START);
		pane3.add(buttons3,BorderLayout.SOUTH);
 
 
		pane4.setBackground(Color.ORANGE);
		pane4.setLayout(new BorderLayout());
		text = new JLabel("<html><b>Picture Panel</b><br><br>Each picture " +
						"you open will be added to the panel on the left for easier access.You " +
						"can do a fast load by double clicking on an image from the panel or " +
						"delete one by pressing the 'Delete' button.If the program becomes " +
						"slow,delete some images from the panel.</html>");
		text.setFont(new  
Font(text.getFont().getFamily(),text.getFont().getStyle(),14));
		pane4.add(text,BorderLayout.PAGE_START);
		pane4.add(buttons4,BorderLayout.SOUTH);
 
 
		inner.add(pane1,"1");
		inner.add(pane2,"2");
		inner.add(pane3,"3");
		inner.add(pane4,"4");
		layout.show(inner,"0");
	}

	public void back() {

		if (step >= 1) {
			((CardLayout) inner.getLayout()).show(inner, --step + "");
		} else {
			step = 5;
			back();
		}
	}

	public void next() {
		if (step <= 3) {
			((CardLayout) inner.getLayout()).show(inner, ++step + "");
		} else {
			step = 0;
			next();
		}
	}

	public int getStep() {
		return step;
	}

	JPanel setButtons(JPanel buttons, JButton button1, JButton button2) {
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		buttons.setBackground(Color.ORANGE);
		buttons.add(button1);
		buttons.add(button2);
		return buttons;
	}

	JButton setUpButtons(JButton button, int i) {
		if (i == 0) {
			button = new JButton("Next");
			button.setMnemonic(KeyEvent.VK_N);
			button.setEnabled(true);
			button.setToolTipText("Click to proceed with the guide");
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					next();
				}
			});
		} else if (i == 1) {
			button = new JButton("Back");
			button.setMnemonic(KeyEvent.VK_B);
			button.setEnabled(true);
			button.setToolTipText("Click to go back in the guide");
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					back();
				}
			});
		}
		button.setLayout(new BorderLayout());
		return button;
	}
}