package swing;
import java.awt.Color;
import javax.swing.*;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Border;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;


public class AplicacionGrafica extends JFrame {


//Panel de la aplicacion
private JPanel contentPane;
protected JLabel textField;

public AplicacionGrafica(){


setTitle("Añadir Peliculas");

//Coordenadas X Y /   LONG    ALTURA
setBounds(400, 200, 400, 300);

//Indicamos que cuando se cierre la ventana se acaba la app
setDefaultCloseOperation (EXIT_ON_CLOSE);

//Hacer visible la ventana
setVisible(true);

//Creamos el panel
contentPane = new JPanel();
contentPane.setBackground(SystemColor.control);

//Indicamos su diseño
contentPane.setLayout (null);

//asigno el panel de la ventana
setContentPane (contentPane);




//==========CREACION DE COMPONENTES============

javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

//TEXT BOX
JLabel titulo = new JLabel("Introduce el nombre de la pelicula: ");
titulo.setBounds(60, 20, 250, 20);
contentPane.add(titulo);

//TEXT BOX WHERE TO WRITE THE NAME OF THE MOVIE
JTextField textField = new JTextField();
textField.setBounds(60, 40, 250, 20);
contentPane.add(textField);
textField.setBorder(new LineBorder(Color.GRAY, 2, true));

//ADD BUTTON
JButton add = new JButton("Añadir");
add.setBackground(Color.LIGHT_GRAY);
add.setBounds(60, 70, 100, 20);
contentPane.add(add);
add.setBorder(new LineBorder(new Color(0, 0, 0), 0));


//TEXT BOX
JLabel AddedFilms = new JLabel("Peliculas añadidas: ");
AddedFilms.setDisplayedMnemonicIndex(1);
AddedFilms.setBounds(60, 110, 250, 20);
contentPane.add(AddedFilms);
AddedFilms.setBorder(new LineBorder(new Color(0, 0, 0), 0));


//LIST
		JComboBox<String> FilmList = new JComboBox<String>();
		FilmList.setBounds(60, 140, 250, 20);
		contentPane.add(FilmList);
		FilmList.setBorder(new LineBorder(Color.GRAY, 2, true));
//		
		ActionListener BT1= new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      FilmList.addItem(textField.getText());
			}
		};
		add.addActionListener(BT1); //Assign of the listener to the button element		
	
	
	}
}


