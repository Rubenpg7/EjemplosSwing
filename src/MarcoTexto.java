import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoTexto extends JInternalFrame {
	
	JPanel panel;
	ArrayList<JButton> botonera;
	
	public MarcoTexto() {
		
		super("JInternalFrame con texto", true, true, true, true);
		
		panel = new JPanel();
		JLabel etiqueta = new JLabel("Texto añadido al panel...");
		panel.add(etiqueta);
		
		panel.setPreferredSize(new Dimension(250, 100));
		panel.setBackground(Color.CYAN);
		
		this.setContentPane(panel);
		this.pack();
		this.setVisible(true);
	}

}
