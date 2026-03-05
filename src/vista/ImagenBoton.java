package vista;

import javax.swing.ImageIcon;
import java.awt.Image;

public class ImagenBoton {

    private Image imagen;

    public ImagenBoton() {
        // Cargar la imagen desde recursos
        ImageIcon icon = new ImageIcon(getClass().getResource("/resource/BotonPrincipal.jpg"));
        imagen = icon.getImage();
    }

    // Método para obtener la imagen
    public Image getImagenBoton() {
        return imagen;
    }
}