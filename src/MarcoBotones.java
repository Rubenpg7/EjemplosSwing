import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class MarcoBotones extends JInternalFrame {

	JPanel panel;
	ArrayList<JButton> botonera;
	
	public MarcoBotones() {
		super("JInternalFrame con botones", true, true, true, true);
		
		panel = new JPanel();
		botonera = new ArrayList<JButton>();
		
		for(int i=0; i<7; i++) {
			botonera.add(new JButton("Boton" +i));
			panel.add(botonera.get(i));
		}
		
		panel.setPreferredSize(new Dimension(400, 100));
		panel.setBackground(Color.PINK);
		
		this.setContentPane(panel);
		this.pack();
		this.setVisible(true);
	}
	
}
