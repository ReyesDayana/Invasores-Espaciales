package practica3ipc;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mastiempo extends Thread {

    JLabel labeltiempo = new JLabel("Mas tiempo");
    Rectangle tamaño;
    Juego frame;
    int rapidez;
    boolean mover;

    public Mastiempo(Rectangle tamaño, Juego ventana) {
        this.tamaño = tamaño;
        this.frame = ventana;
        labeltiempo.setBounds(tamaño);
        ImageIcon navee = new ImageIcon(getClass().getResource("/Imagenes/tiempoverde.png"));
        ImageIcon imagen = new ImageIcon(navee.getImage().getScaledInstance(labeltiempo.getWidth(), labeltiempo.getHeight(), Image.SCALE_DEFAULT));
        labeltiempo.setIcon(imagen);
        frame.add(labeltiempo);
    }

    public void run() {
        try {
           
            labeltiempo.setVisible(false);
            while (!tamaño.intersects(Juego.Nave.getBounds())) {
               labeltiempo.setVisible(true);
                sleep(200);
                frame.repaint();
                labeltiempo.setLocation(tamaño.x - 10, tamaño.y);
                tamaño = labeltiempo.getBounds();
            
            }
           
           
            if(tamaño.intersects(Juego.Nave.getBounds())){
                Tiempo.contadorsegundos=Tiempo.contadorsegundos+11;
                labeltiempo.setVisible(false);
                stop();
            }
            
        } catch (InterruptedException ex) {
            System.out.println("mal");
        }
    }
}
