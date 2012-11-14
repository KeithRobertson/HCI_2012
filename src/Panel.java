import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public  class Panel extends JPanel implements PanelInterface {

	private static final long serialVersionUID = 1L;
	private PanelData data = new PanelData(new LinkedList<ValueChangedListener>(),
			new LinkedList<MouseOverListener>());
	CardLayout layout;
	JPanel labelP;
	JPanel inputP;
	
	Panel(String text) {
		super();

		
		layout = new CardLayout(0, 0);
		this.setLayout(layout);
		EditPanel editPanel = new EditPanel();


		labelP = new JPanel(new GridLayout(1, 1));
		data.text = text;
		data.label = new JLabel(text);
		labelP.add(data.label);

		
		inputP = new JPanel(new GridLayout(1, 1));
		data.textField = new JTextField(text);
		data.textField.addMouseListener(editPanel);
		data.textField.addKeyListener(editPanel);
		data.textField.addFocusListener(editPanel);
		inputP.add(data.textField);

		this.addMouseListener(editPanel);

		
		this.add(labelP, "Label");
		this.add(inputP, "Input");

		
		layout.show(this, "Label");
	}

	@Override
	public void setInputState(boolean hover) {
		CardLayout cl = (CardLayout) (this.getLayout());
		
		if (hover)
			cl.show(this, "Input");
		else
			cl.show(this, "Label");
	}

	@Override
	public void addValueChanged(ValueChangedListener value) {
		this.data.listeners.add(value);
	}

	@Override
	public void addMouseOver(MouseOverListener value) {
		this.data.mouselisteners.add(value);
	}

	@Override
	public void setText(String text) {
		this.data.text = text;
		this.data.label.setText(text);
		this.data.textField.setText(text);
	}

	@Override
	public String getText() {
		return data.text;
	}

	@Override
	public JTextField getTextField() {
		return data.textField;
	}

	@Override
	public JLabel getLabel() {
		return data.label;
	}
	public class EditPanel implements MouseListener, KeyListener, FocusListener {

		boolean locked = false;
		String oldValue;

		@Override
		public void focusGained(FocusEvent arg0) {
			locked = true;
			oldValue = data.textField.getText();
		}

		
		public void release() {
			this.locked = false;
		}

		
		@Override
		public void mouseEntered(MouseEvent e) {
			data.label.setForeground(Color.gray);
			for (MouseOverListener v : data.mouselisteners) {
				v.mouseEntered();
			}
			
		}

		
		@Override
		public void mouseExited(MouseEvent e) {
			if (!locked) {
				setInputState(false);
			}
			data.label.setForeground(Color.gray);
			data.label.setText(data.text);
			for (MouseOverListener v : data.mouselisteners) {
				v.mouseExited();
			}
		}

		
		@Override
		public void focusLost(FocusEvent e) {
			setText(data.textField.getText());
			for (ValueChangedListener v : data.listeners) {
				v.valueChanged(data.textField.getText(), Panel.this);
			}
			release();
			mouseExited(null);
		}

		
		@Override
		public void keyTyped(KeyEvent e) {
			if (e.getKeyChar() == KeyEvent.VK_ENTER) {
				setText(data.textField.getText());
				release();
				mouseExited(null);
			} else if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
				release();
				mouseExited(null);
				setText(oldValue);
			}
		}

		
		@Override
		public void mousePressed(MouseEvent e) {
		}
		// TODO Auto-generated method stub
		@Override
		public void mouseReleased(MouseEvent e) {
		}
		// TODO Auto-generated method stub
		@Override
		public void keyPressed(KeyEvent e) {
		}
		// TODO Auto-generated method stub
		@Override
		public void keyReleased(KeyEvent e) {
		}// TODO Auto-generated method stub

		@Override
		public void mouseClicked(MouseEvent e) {
			setInputState(true);
			data.textField.grabFocus();
			
		}

	}
	
	
}


interface ValueChangedListener {
	public void valueChanged(String value, JComponent source);
}

interface MouseOverListener {
	public  void mouseEntered();
	public  void mouseExited();
	
}