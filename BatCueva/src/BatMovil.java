import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Documento la parte de BatNovil

public class BatMovil extends JFrame {
	private JTextField textField;
	//Esta es la primera aportacion de robin

	/**
	 * Create the panel.
	 */
	public BatMovil() {
		getContentPane().setLayout(null);

		JLabel nombre = new JLabel("BatMovil");
		nombre.setBounds(10, 10, 85, 50);
		getContentPane().add(nombre);
		textField = new JTextField();
		textField.setBounds(10, 54, 296, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		setBounds(200, 100, 350, 300);

		
	}
}
