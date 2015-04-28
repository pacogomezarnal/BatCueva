import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

//La BatPuerta tiene ahora un Absolute Layout

public class BatCuevaPuerta extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public BatCuevaPuerta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane usuario = new JTextPane();
		usuario.setBounds(34, 10, 141, 25);
		contentPane.add(usuario);
	}
}
