package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import vista.ImagenVentanaPrincipal;
import vista.MusicaFondo;
import vista.PanelBingo;

public class VentanaPrincipal extends JFrame {

    private MusicaFondo fondo;

    public VentanaPrincipal() {

        // Configuración básica de la ventana
        setTitle("MINIJUEGOS");
        
        //Ajustar el tamaño de la ventana
        setSize(800, 600);
        
        //Cerrar todos los procesos
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Posicionarlo en mitad de la pantalla
        setLocationRelativeTo(null);

        // Panel con imagen de fondo
        ImagenVentanaPrincipal imagen = new ImagenVentanaPrincipal();
        
        imagen.setLayout(null);
        setContentPane(imagen);

        // BOTÓN 1
        JButton boton = new JButton("Bingo");
        
        //Dimensiones
        boton.setBounds(100, 400, 100, 50);
        boton.setBackground(Color.BLACK);
        imagen.add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Bingo iniciado!");
                new PanelBingo();
            }
        });

        // BOTÓN 2
        JButton boton2 = new JButton("PREGUNTA2");
        boton2.setBounds(300, 400, 100, 50);
        boton2.setBackground(Color.BLACK);
        imagen.add(boton2);

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón 2 pulsado");
            }
        });

        // BOTÓN 3
        JButton boton3 = new JButton("ARKANOID");
        boton3.setBounds(500, 400, 100, 50);
        boton3.setBackground(Color.BLACK);
        imagen.add(boton3);

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón 3 pulsado");
            }
        });

        // Música de fondo
        fondo = new MusicaFondo("/resource/CancionFondo.wav");
        fondo.playLoop();

        // Detener música al cerrar
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                fondo.stop();
            }
        });

        setVisible(true);
    }
}