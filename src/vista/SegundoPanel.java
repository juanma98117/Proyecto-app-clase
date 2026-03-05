package vista;

import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import minijuego.PanelArkanoid;
import minijuego.PanelBingo;
import minijuego.PanelPreguntados;

public class SegundoPanel extends JFrame {

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;

    public SegundoPanel() {

        setTitle("Menú");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        

        // Panel principal con 1 fila y 3 columnas
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 4, 60, 90));
        setContentPane(panel);
        panel.setBackground(java.awt.Color.BLACK);

     //  Etiqueta
        JTextArea titulo = new JTextArea("SELECCIONA UN \nMINIJUEGO.\n¡¡¡DIVIERTETEEEE!!!");
        titulo.setEditable(false);
        titulo.setOpaque(false);
        titulo.setFont(new Font("Comic Sans Serif", Font.BOLD, 28));
        titulo.setForeground(Color.PINK);
        titulo.setFocusable(false);

        // Lo añadimos arriba
        add(titulo, BorderLayout.NORTH);
        
        // --- BOTÓN 1 ---
        boton1 = new JButton();
        boton1.setBorderPainted(false);
        boton1.setFocusPainted(false);
        boton1.setContentAreaFilled(false);
        // Cargar imagen y escalar
        ImagenSegundoPanelBingo imagenBoton1 = new ImagenSegundoPanelBingo();
        ImageIcon icono1 = new ImageIcon(getClass().getResource("/resource/Bingo.jpg"));
        Image imgEscalada1 = icono1.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH);
        boton1.setIcon(new ImageIcon(imgEscalada1));

        // Listener 
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Menú iniciado!");
                new PanelBingo();
            }
        });
            

        // --- BOTÓN 2 ---
        boton2 = new JButton();
        boton2.setBorderPainted(false);
        boton2.setFocusPainted(false);
        boton2.setContentAreaFilled(false);
        // Cargar imagen y escalar
        ImagenSegundoPanelPreguntados imagenBoton2 = new ImagenSegundoPanelPreguntados();
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/resource/Preguntados.jpg"));
        Image imgEscalada2 = icono2.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        boton2.setIcon(new ImageIcon(imgEscalada2));
        // Listener individual
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Menú iniciado!");
                new PanelArkanoid();
            }
        });

        // --- BOTÓN 3 ---
        boton3 = new JButton();
        boton3.setBorderPainted(false);
        boton3.setFocusPainted(false);
        boton3.setContentAreaFilled(false);
        // Cargar imagen y escalar
        ImagenSegundoPanelArkanoid imagenBoton3 = new ImagenSegundoPanelArkanoid();
        ImageIcon icono3 = new ImageIcon(getClass().getResource("/resource/arkanaid.jpg"));
        Image imgEscalada3 = icono3.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH);
        boton3.setIcon(new ImageIcon(imgEscalada3));
        // Listener individual
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Menú iniciado!");
                new PanelPreguntados();
            }
        });

        // Añadir los 3 botones al panel
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        
        setVisible(true);
    }
}