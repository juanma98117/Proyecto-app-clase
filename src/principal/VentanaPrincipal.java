package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import minijuego.ImagenVentanaPrincipal;
import minijuego.MusicaFondo;

public class VentanaPrincipal extends JPanel{

	public static void main(String[] args) {

		// Crear ventana

		//Creamos el JFrame que nos har� de ventana
		JFrame ventana = new JFrame("MINIJUEGOS");

		//Le damos un tama�o a nuestra ventana
		ventana.setSize(800, 600);

		//Detiene todos los procesos al cerrar la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Centra la ventana a la pantalla
		ventana.setLocationRelativeTo(null);

		//Ponemos la ventana visible
		ventana.setVisible(true);

		//Creamos un panel con la imagen
		ImagenVentanaPrincipal imagen = new ImagenVentanaPrincipal();
		imagen.setLayout(null);
		ventana.setContentPane(imagen); 


		//Creamos el primer botón
		JButton boton = new JButton("Botón");
		boton.setBounds(100, 400, 100, 50);
		boton.setBackground(Color.BLACK);
		imagen.add(boton); 

		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("¡Botón pulsado!");
			}
		});


		//Creamos el segundo botón
		JButton boton2 = new JButton("Botón");
		boton2.setBounds(300, 400, 100, 50);
		boton2.setBackground(Color.BLACK);
		imagen.add(boton2); 

		boton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("¡Botón pulsado!");
			}
		});

		//Creamos el tercer botón
		JButton boton3 = new JButton("Botón");
		boton3.setBounds(500, 400, 100, 50);
		boton3.setBackground(Color.BLACK);
		imagen.add(boton3); 

		boton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("¡Botón pulsado!");
			}
		});
		// Establecer el panel como contenido de la ventana
		ventana.setContentPane(imagen);

		// Música de fondo
		MusicaFondo fondo = new MusicaFondo("/sonidos/CancionFondo.wav");
		fondo.playLoop();

		// Detener al cerrar ventana
		ventana.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		        fondo.stop();
		    }
		});



	}

}


