package vista;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

public class MusicaFondo {

    private Clip clip;

    // Constructor: carga el archivo WAV desde recursos
    public MusicaFondo(String nombreArchivo) {
        try {
            // Busca el archivo dentro del paquete minijuego/sonidos
            InputStream audioSrc = getClass().getResourceAsStream(nombreArchivo);
            if (audioSrc == null) {
                throw new IOException("No se encuentra el archivo de sonido en los recursos: " + nombreArchivo);
            }

            // Necesario para AudioSystem
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(new java.io.BufferedInputStream(audioSrc));

            clip = AudioSystem.getClip();
            clip.open(audioInput);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Reproduce el sonido en bucle continuo
    public void playLoop() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        }
    }

    // Detener el sonido
    public void stop() {
        if (clip != null) {
            clip.stop();
        }
    }
}