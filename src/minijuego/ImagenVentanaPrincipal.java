
	
	package minijuego;

	import java.awt.Dimension;
	import java.awt.Graphics;
	import javax.swing.ImageIcon;
	import javax.swing.JPanel;

	public class ImagenVentanaPrincipal extends JPanel {


	    @Override
	    public void paint(Graphics g){
	        Dimension dimension = this.getSize();
	        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/minijuegos.jpg"));
	        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
	        setOpaque(false);
	        super.paintChildren(g);
	        }
	    }
	
