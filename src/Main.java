import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
	
		// Clase BorderLayoutDemo
//		BorderLayoutDemo bld = new BorderLayoutDemo();
//		bld.setVisible(true);
		
		//Clases BorderLayoutDemo y controlBotones
//		BorderLayoutDemoListener bld = new BorderLayoutDemoListener();
//		bld.setVisible(true);
		
		//Clases JDesktopEjemplo, MarcoBotones y MarcoTexto
//		javax.swing.SwingUtilities.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//				JFrame jf = new JFrame("Escritorio");
//				jf.setBounds(10, 10, 650, 300);
//				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				jf.setContentPane(new JDesktopEjemplo());
//				jf.setVisible(true);
//				
//			}
//		});

		//Clases JTabbedSencillo, MarcoBotones2 y MarcoTexto2
		JPanel pt = new MarcoTexto2();
		JPanel pb = new MarcoBotones2();
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.add("Botonera", pb);
		jtp.add("Texto", pt);
		
		JFrame fr = new JFrame("Demostracion de panel con solapas");
		fr.getContentPane().add(jtp, BorderLayout.CENTER);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.pack();
		fr.setVisible(true);
		

	}

}
