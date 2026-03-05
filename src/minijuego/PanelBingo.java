package minijuego;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanelBingo extends JFrame {

    public PanelBingo() {
        setTitle("BINGO");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);

        JLabel texto = new JLabel("cccccgo");
        panel.add(texto);

        add(panel);
        setVisible(true);
        
        
    }
}