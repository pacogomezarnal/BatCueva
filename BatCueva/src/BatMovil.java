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
		//Definimos las propiedades de la ventana
		getContentPane().setLayout(null);
		setBounds(200, 100, 350, 300);

		//Contenido
		JLabel nombre = new JLabel("BatMovil");
		nombre.setBounds(10, 10, 85, 50);
		getContentPane().add(nombre);
		textField = new JTextField();
		textField.setBounds(10, 54, 296, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setBounds(10, 80, 200, 50);
		getContentPane().add(usuario);
		setBounds(200, 100, 350, 300);

		
	}
}
