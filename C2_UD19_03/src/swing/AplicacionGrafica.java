package swing;

import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;

public class AplicacionGrafica extends JFrame{
	
	private JPanel contentPane;
	
	public AplicacionGrafica() {
		
		setTitle("Titulo de la ventana");
		setBounds(400, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Componentes
		// Radio buttons
		JRadioButton radio_01 = new JRadioButton("Windows", false);
		radio_01.setBounds(40, 40, 109, 23);
		contentPane.add(radio_01);
		
		JRadioButton radio_02 = new JRadioButton("Linux", false);
		radio_02.setBounds(40, 66, 109, 23);
		contentPane.add(radio_02);
		
		JRadioButton radio_03= new JRadioButton("Mac", false);
		radio_03.setBounds(40, 92, 109, 23);
		contentPane.add(radio_03);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(radio_01);
		bgroup.add(radio_02);
		bgroup.add(radio_03);
		
		// CheckBoxes
		JCheckBox checkButton_01 = new JCheckBox("Programacion", false);
		checkButton_01.setBounds(40, 144, 200, 23);
		contentPane.add(checkButton_01);
		
		JCheckBox checkButton_02 = new JCheckBox("Diseno grafico", false);
		checkButton_02.setBounds(40, 170, 200, 23);
		contentPane.add(checkButton_02);
		
		JCheckBox checkButton_03 = new JCheckBox("Administracion", false);
		checkButton_03.setBounds(40, 196, 200, 23);
		contentPane.add(checkButton_03);
		
		// Slider
		JSlider slider = new JSlider(1, 10, 2);
		slider.setBounds(40, 248, 200, 46);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		contentPane.add(slider);
		
		// Button
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(40, 310, 50, 23);
		contentPane.add(btnOk);
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "";
				
				for (Enumeration<AbstractButton> buttons = bgroup.getElements(); buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();

		            if (button.isSelected()) {
		                message += "RadioButton selected: " + button.getText() + "\n";
		            }
		        }
				
				if(checkButton_01.isSelected()) {
					String chck_01 = checkButton_01.getText();
					message += "CheckBox 1: " + checkButton_01.getText() + "\n";
				}
				if(checkButton_02.isSelected()) {
					String chck_02 = checkButton_02.getText();
					message += "CheckBox 2: " + checkButton_02.getText() + "\n";
				}
				if(checkButton_03.isSelected()) {
					String chck_03 = checkButton_03.getText();
					message += "CheckBox 3: " + checkButton_03.getText() + "\n";
				}
				
				message += "Slider: " + slider.getValue() + "\n";
				
				// Message dialog that shows the selected data from previous panel.
				JOptionPane.showMessageDialog(null, message);
			}
		});
		
	}
}