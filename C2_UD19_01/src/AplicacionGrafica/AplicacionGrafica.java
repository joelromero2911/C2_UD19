package AplicacionGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AplicacionGrafica extends JFrame {

	private JPanel contentPane;
	
	public AplicacionGrafica() {
		
		setTitle("Saludador");
		
		// Coordenadas X Y de la aplicacion y su altura ylongitud
		setBounds(700, 200, 500, 500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		
		etiqueta.setBounds(155, 20, 200, 50);
		
		contentPane.add(etiqueta);
		
		
		JTextField textField = new JTextField();
		
		textField.setBounds(100, 110, 300, 30);
		
		contentPane.add(textField);
		
		
		JButton btn = new JButton("¡Saludar!");
		
		btn.setBounds(200, 190, 89,23);
		
		contentPane.add(btn);
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"¡Hola "+textField.getText()+"!");
				
			}	
		};
		
		btn.addActionListener(al);
		
	}
	
	
}
