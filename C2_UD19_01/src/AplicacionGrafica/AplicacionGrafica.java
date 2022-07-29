package AplicacionGrafica;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class AplicacionGrafica extends JFrame {
	
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
		
		
		/*Creation, definition of dimensions and added to the panel of a label*/
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		
		etiqueta.setBounds(155, 20, 200, 50);
	    
		contentPane.add(etiqueta);
		
		/*Creation of a border*/ 
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

		/*Creation, definition of dimensions and added to the panel of a textfield*/	
		JTextField textField = new JTextField();
		
		textField.setBounds(100, 110, 300, 30);
		
		contentPane.add(textField);
		
		textField.setBorder(border); 
		
		/*Creation, definition of dimensions and added to the panel of a button*/			
		JButton btn = new JButton("¡Saludar!");
		
		btn.setBounds(200, 190, 89,23);
		
		contentPane.add(btn);
		
		btn.setBorder(border);

	    /*Creation of a Click Listener*/	
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) { //The action that will be performed when the listener is triggered
				JOptionPane.showMessageDialog(null,"¡Hola "+textField.getText()+"!");
				
			}	
		};
		
		btn.addActionListener(al); //Assign of the listener to the button element		
	}
}
