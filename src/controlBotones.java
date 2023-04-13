import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class controlBotones implements ActionListener {

	private String s;
	private JTextField jtf;
	
	public controlBotones(String s, JTextField jtf) {
		this.s=s;
		this.jtf=jtf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.getJtf().setText("Ha pulsado: " + this.getS());
		
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public JTextField getJtf() {
		return jtf;
	}

	public void setJtf(JTextField jtf) {
		this.jtf = jtf;
	}

}
