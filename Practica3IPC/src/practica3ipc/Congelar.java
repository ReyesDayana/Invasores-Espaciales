
package practica3ipc;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Congelar extends Thread {
   
    JLabel labelvelocidad = new JLabel("Mas Velocidad");
    Rectangle tamaño;
    Juego frame;
    static boolean nomover;

    public Congelar(Rectangle tamaño, Juego ventana) {
        this.tamaño = tamaño;
        this.frame = ventana;
        labelvelocidad.setBounds(tamaño);
        ImageIcon navee = new ImageIcon(getClass().getResource("/Imagenes/congelar.png"));
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
                while (Tiempo.tiempocongelar != 21) {
                    System.out.println(Tiempo.tiempocongelar);
                    nomover = true;

                }

                labelvelocidad.setVisible(false);
                nomover = false;
                stop();
                 
            }

        } catch (InterruptedException ex) {
            System.out.println("mal");
        }
    } 
}
