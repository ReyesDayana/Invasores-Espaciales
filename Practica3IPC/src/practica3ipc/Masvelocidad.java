package practica3ipc;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Masvelocidad extends Thread {

    JLabel labelvelocidad = new JLabel("Mas Velocidad");
    Rectangle tamaño;
    Juego frame;
    static boolean mover;

    public Masvelocidad(Rectangle tamaño, Juego ventana) {
        this.tamaño = tamaño;
        this.frame = ventana;
        labelvelocidad.setBounds(tamaño);
        ImageIcon navee = new ImageIcon(getClass().getResource("/Imagenes/velocidad.png"));
        ImageIcon imagen = new ImageIcon(navee.getImage().getScaledInstance(labelvelocidad.getWidth(), labelvelocidad.getHeight(), Image.SCALE_DEFAULT));
        labelvelocidad.setIcon(imagen);
        frame.add(labelvelocidad);
    }

    public void run() {
        try {

            labelvelocidad.setVisible(false);
            while (!tamaño.intersects(Juego.Nave.getBounds())) {
                labelvelocidad.setVisible(true);
                sleep(180);
                frame.repaint();
                labelvelocidad.setLocation(tamaño.x - 10, tamaño.y);
                tamaño = labelvelocidad.getBounds();
            }

            if (tamaño.intersects(Juego.Nave.getBounds())) {
                while (Tiempo.tiempocontador != 10) {
                    System.out.println(Tiempo.tiempocontador);
                    mover = true;

                }

                labelvelocidad.setVisible(false);
                stop();

            }

        } catch (InterruptedException ex) {
            System.out.println("mal");
        }
    }
}
