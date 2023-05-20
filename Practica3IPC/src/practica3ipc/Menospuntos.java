
package practica3ipc;

import java.awt.Image;
import java.awt.Rectangle;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Menospuntos extends Thread{
    JLabel labelpuntos = new JLabel("Meno puntos");
    Rectangle tamaño;
    Juego frame;
    int rapidez;
    boolean mover;
    
    public Menospuntos(Rectangle tamaño, Juego ventana) {
        this.tamaño = tamaño;
        this.frame = ventana;
        labelpuntos.setBounds(tamaño);
        ImageIcon navee = new ImageIcon(getClass().getResource("/Imagenes/menosrojo .png"));
        ImageIcon imagen = new ImageIcon(navee.getImage().getScaledInstance(labelpuntos.getWidth(), labelpuntos.getHeight(), Image.SCALE_DEFAULT));
        labelpuntos.setIcon(imagen);
        frame.add(labelpuntos);
    }
    public void run() {
        try {
           
            labelpuntos.setVisible(false);
            while (!tamaño.intersects(Juego.Nave.getBounds())) {
               labelpuntos.setVisible(true);
                sleep(300);
                frame.repaint();
                labelpuntos.setLocation(tamaño.x - 10, tamaño.y);
                tamaño = labelpuntos.getBounds();
            
            }
           
           
            if(tamaño.intersects(Juego.Nave.getBounds())){
                Practica3IPC.puntos=Practica3IPC.puntos-10;
                labelpuntos.setVisible(false);
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                stop();
            }
            
        } catch (InterruptedException ex) {
            System.out.println("mal");
        }
    }
}
