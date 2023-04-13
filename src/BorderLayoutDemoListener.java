import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BorderLayoutDemoListener extends JFrame {

	private JTextField texto;
	private ArrayList<JButton> botonera;
	
	public BorderLayoutDemoListener() {
		texto = new JTextField();
		botonera = new ArrayList<JButton>();
		
		botonera.add(new JButton("Norte")); botonera.add(new JButton("Sur"));
		botonera.add(new JButton("Este")); botonera.add(new JButton("Oeste"));
		
		String[] posicion = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST};
		
		for(int i=0; i < botonera.size(); i++) {
			botonera.get(i).addActionListener(new controlBotones(botonera.get(i).getText(), texto));
			this.add(botonera.get(i), posicion[i]);
		}
		this.add(texto, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(400, 200));
		this.pack();
		this.setLocationRelativeTo(null);
	}

	public JTextField getTexto() {
		return texto;
	}

	public void setTexto(JTextField texto) {
		this.texto = texto;
	}

	public ArrayList<JButton> getBotonera() {
		return botonera;
	}

	public void setBotonera(ArrayList<JButton> botonera) {
		this.botonera = botonera;
	}
	
	
	
}
