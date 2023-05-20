
package practica3ipc;

import java.awt.Image;
import java.awt.Rectangle;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Maspuntos extends Thread{
    JLabel labelpuntos = new JLabel("Mas puntos");
    Rectangle tamaño;
    Juego frame;
    boolean mover;
    
    public Maspuntos(Rectangle tamaño, Juego ventana) {
        this.tamaño = tamaño;
        this.frame = ventana;
        labelpuntos.setBounds(tamaño);
        ImageIcon navee = new ImageIcon(getClass().getResource("/Imagenes/cruzverde.png"));
        ImageIcon imagen = new ImageIcon(navee.getImage().getScaledInstance(labelpuntos.getWidth(), labelpuntos.getHeight(), Image.SCALE_DEFAULT));
        labelpuntos.setIcon(imagen);
        frame.add(labelpuntos);
    }
    public void run() {
        try {
           
            labelpuntos.setVisible(false);
            while (!tamaño.intersects(Juego.Nave.getBounds())) {
               labelpuntos.setVisible(true);
                sleep(180);
                frame.repaint();
                labelpuntos.setLocation(tamaño.x - 10, tamaño.y);
                tamaño = labelpuntos.getBounds();
            
            }
           
           
            if(tamaño.intersects(Juego.Nave.getBounds())){
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                labelpuntos.setVisible(false);
                stop();
            }
            
        } catch (InterruptedException ex) {
            System.out.println("mal");
        }
    }
}
