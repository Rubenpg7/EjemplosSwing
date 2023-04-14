import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {

	
	public BorderLayoutDemo() {
		
		String[] nombre = {"Norte", "Sur", "E", "O", "Centro"};
		String[] posicion = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER};
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Da el comportamiento del boton
		
		for(int i=0; i<nombre.length; i++) {
			this.add(new JButton(nombre[i]), posicion[i]);
		}
		
		this.setPreferredSize(new Dimension(400, 200)); //Da el tamaño/dimension 400 largo, 200 alto
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
}
