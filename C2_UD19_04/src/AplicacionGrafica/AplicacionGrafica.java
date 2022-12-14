package AplicacionGrafica;

import javax.swing.DefaultListModel;
import javax.swing.*;

import MiniCalculadora.MiniCalculadora;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class AplicacionGrafica extends JFrame{
	/*Attribute*/
	
	private JPanel contentPane;
	private JTextField textFieldOp1;
	private JTextField textFieldOp2;
	private JTextField textFieldResultado;
	
	
	/*Constructor*/
	
	public AplicacionGrafica() {
		
		/*Definition of the window */
		
		
		setTitle("MiniCalculadora");//PopUp window title
		
		/* X Y coordinates of the application and its height and length */
		setBounds(600, 200, 508, 330);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Close the window  when the operation is close
		
		setVisible(true);//It allows the window to be visible
		
		/*Creation and added the panel to the window*/
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		
		
		
		/*Creation, definition of dimensions and added to the panel of the  labels*/		
		JLabel lblNum2 = new JLabel("Operando2:");
		lblNum2.setBounds(51, 86, 80, 14);
		contentPane.add(lblNum2);
		
		JLabel lblNum1 = new JLabel("Operando1:");
		lblNum1.setBounds(51, 30, 74, 14);
		contentPane.add(lblNum1);
		
		JLabel lblResult = new JLabel("Anteriores Resultados:");
		lblResult.setDisplayedMnemonicIndex(1);
		lblResult.setBounds(51, 153, 163, 14);
		contentPane.add(lblResult);
		
		JLabel lblHistoric = new JLabel();
		String[] history = {"", "", "", ""};
		lblHistoric.setBackground(SystemColor.window);
		lblHistoric.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblHistoric.setBounds(51, 179, 388, 60);
		contentPane.add(lblHistoric);
	
		
		/*Creation, definition of dimensions and added to the panel of the JTextFields*/				
		textFieldOp1 = new JTextField();
		textFieldOp1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		textFieldOp1.setBounds(51, 50, 86, 20);
		contentPane.add(textFieldOp1);
		textFieldOp1.setColumns(10);
	
		
		textFieldOp2 = new JTextField();
		textFieldOp2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		textFieldOp2.setBounds(51, 111, 86, 20);
		contentPane.add(textFieldOp2);
		textFieldOp2.setColumns(10);
	
		
		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		textFieldResultado.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		textFieldResultado.setBounds(353, 79, 86, 20);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
	
	
		/*Creation, definition of dimensions and added to the panel of the buttons*/				
		JButton btnPlus = new JButton("+");
		btnPlus.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		btnPlus.setBounds(182, 60, 54, 23);
		contentPane.add(btnPlus);

		
		JButton btnDivide = new JButton("/");
		btnDivide.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		btnDivide.setBounds(253, 94, 54, 23);
		contentPane.add(btnDivide);
	
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		btnMinus.setBounds(253, 60, 54, 23);
		contentPane.add(btnMinus);

		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		btnMultiply.setBounds(182, 94, 54, 23);
		contentPane.add(btnMultiply);
	
		JButton close = new JButton("Salir");
		close.setBounds(370, 250, 70, 23);
		contentPane.add(close);
		
		JLabel lblResult_1 = new JLabel("Resultado:");
		lblResult_1.setDisplayedMnemonicIndex(1);
		lblResult_1.setBounds(353, 53, 86, 14);
		contentPane.add(lblResult_1);
		
		
		MiniCalculadora calc = new MiniCalculadora();
		
		/*Creation of the button listeners*/				
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msgHistory = "<html><body>";
				
				Double r = calc.sum(Double.parseDouble(textFieldOp1.getText()),Double.parseDouble(textFieldOp2.getText()));
				textFieldResultado.setText(r.toString());
				
				history[3] = history[2];
				history[2] = history[1];
				history[1] = history[0];
				history[0] = textFieldOp1.getText()+ " + "+textFieldOp2.getText() +" = " + r.toString();
				for (int i = 0; i < history.length; i++) {
					msgHistory +=  history[i] + "<br>";
				}
				lblHistoric.setText(msgHistory);

			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msgHistory = "<html><body>";
				
				Double r = calc.rest(Double.parseDouble(textFieldOp1.getText()),Double.parseDouble(textFieldOp2.getText()));
				textFieldResultado.setText(r.toString());
				
				history[3] = history[2];
				history[2] = history[1];
				history[1] = history[0];
				history[0] = textFieldOp1.getText()+ " - "+textFieldOp2.getText() +" = " + r.toString();
				for (int i = 0; i < history.length; i++) {
					msgHistory += history[i] + "<br>";
				}
				lblHistoric.setText(msgHistory);
			}
		});
		
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msgHistory = "<html><body>";
				
				Double r = calc.division(Double.parseDouble(textFieldOp1.getText()),Double.parseDouble(textFieldOp2.getText()));
				textFieldResultado.setText(r.toString());
				
				history[3] = history[2];
				history[2] = history[1];
				history[1] = history[0];
				history[0] = textFieldOp1.getText()+ " / "+textFieldOp2.getText() +" = " + r.toString();
				for (int i = 0; i < history.length; i++) {
					msgHistory += history[i] + "<br>";
				}
				lblHistoric.setText(msgHistory);
			}
		});

		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msgHistory = "<html><body>";
				
				Double r = calc.multiplication(Double.parseDouble(textFieldOp1.getText()),Double.parseDouble(textFieldOp2.getText()));
				textFieldResultado.setText(r.toString());
				
				history[3] = history[2];
				history[2] = history[1];
				history[1] = history[0];
				history[0] = textFieldOp1.getText()+ " * "+textFieldOp2.getText() +" = " + r.toString();
				for (int i = 0; i < history.length; i++) {
					msgHistory += history[i] + "<br>";
				}
				lblHistoric.setText(msgHistory);
			}
			
		});
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}


	
}
