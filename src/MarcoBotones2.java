import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MarcoBotones2 extends JPanel {
	
	ArrayList<JButton> botonera;
	
	public MarcoBotones2() {
		
		botonera = new ArrayList<JButton>();
		
		for(int i=0; i<7; i++) {
			botonera.add(new JButton("Boton" +i));
			this.add(botonera.get(i));
		}
		
	}

}
