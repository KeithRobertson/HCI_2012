import javax.swing.JLabel;
import javax.swing.JTextField;

public interface PanelInterface {

	public abstract void setInputState(boolean hover);

	public abstract void addValueChanged(ValueChangedListener value);

	public abstract void addMouseOver(MouseOverListener value);

	public abstract void setText(String text);

	public abstract String getText();

	public abstract JTextField getTextField();

	public abstract JLabel getLabel();
	
	
}