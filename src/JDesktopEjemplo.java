import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class JDesktopEjemplo extends JDesktopPane {

	JInternalFrame m1, m2;
	
	public JDesktopEjemplo() {
		m1 = new MarcoBotones();
		m1.setLocation(200, 100);
		
		m2 = new MarcoTexto();
		m2.setLocation(10, 10);
		
		add(m1);
		add(m2);
	}
	
}
