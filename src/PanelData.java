import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class PanelData {
	public JLabel label;
	public JTextField textField;
	public String text;
	public LinkedList<ValueChangedListener> listeners;
	public LinkedList<MouseOverListener> mouselisteners;

	public PanelData(LinkedList<ValueChangedListener> listeners,
			LinkedList<MouseOverListener> mouselisteners) {
		this.listeners = listeners;
		this.mouselisteners = mouselisteners;
	}
}