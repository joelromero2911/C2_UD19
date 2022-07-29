package AplicacionGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AplicacionGrafica extends JFrame{
	/*Attribute*/
	
	private JPanel contentPane;
	
	
	/*Constructor*/
	
	public AplicacionGrafica() {
		
		/*Definition of the window */
		
		
		setTitle("Saludador");//PopUp window title
		
		/* X Y coordinates of the application and its height and length */
		setBounds(700, 200, 500, 500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Close the window  when the operation is close
		
		setVisible(true);//It allows the window to be visible
		
		/*Creation and added the panel to the window*/
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
	}	
}
