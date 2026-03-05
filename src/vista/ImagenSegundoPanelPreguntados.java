package vista;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenSegundoPanelPreguntados extends JPanel {

	public void preguntados(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/resource/preguntados.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
        
    }
}
