import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

//Documento la parte de BatNovil

public class BatMovil extends JFrame {
	//Esta es la primera aportacion de robin

	/**
	 * Create the panel.
	 */
	public BatMovil() {
		getContentPane().setLayout(null);
		
		JLabel nombre = new JLabel("BatMovil");
		nombre.setBounds(10, 10, 85, 50);
		getContentPane().add(nombre);

	}
}
