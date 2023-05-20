package practica3ipc;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Disparo extends Thread {
    static boolean veruno;
    static boolean verdos;
    static boolean vertres;
    static boolean vercuatro;
    static boolean vercinco;
    static boolean verseis;
    static boolean versiete;
    static boolean verocho;
    static boolean rosauno;
    static boolean rosados;
    static boolean rosatres;
    static boolean rosacuatro;
    static boolean rosacinco;
    static boolean rosaseis;
    static boolean rosasiete;
    static boolean rosaocho;
    static boolean rosadouno;
    static boolean rosadodos;
    static boolean rosadotres;
    static boolean rosadocuatro;
    static boolean rosadocinco;
    static boolean rosadoseis;
    static boolean rosadosiete;
    static boolean rosadoocho;
    static boolean rojuno;
    static boolean rojdos;
    static boolean rojtres;
    static boolean rojcuatro;
    static boolean rojcinco;
    static boolean rojseis;
    static boolean rojsiete;
    static boolean rojouno;
    static boolean rojocho;
    static boolean rojodos;
    static boolean rojotres;
    static boolean rojocuatro;
    static boolean rojocinco;
    static boolean rojoseis;
    static boolean rojosiete;
    static boolean rojoocho;
    JLabel labeldisparo = new JLabel("Disparo");
    Rectangle tamaño;
    Juego frame;
    int rapidez;
    boolean mover;

    public Disparo(Rectangle tamaño, Juego ventana, int rapido) {
        this.tamaño = tamaño;
        this.frame = ventana;
        this.rapidez = rapido;
        labeldisparo.setBounds(tamaño);
        ImageIcon navee = new ImageIcon(getClass().getResource("/Imagenes/Luz lasere.png"));
        ImageIcon imagen = new ImageIcon(navee.getImage().getScaledInstance(labeldisparo.getWidth(), labeldisparo.getHeight(), Image.SCALE_DEFAULT));
        labeldisparo.setIcon(imagen);

        frame.add(labeldisparo);
    }

    public void run() {

        try {

            while (!((tamaño.intersects(Juego.Otro.getBounds())) || (tamaño.intersects(Juego.Verde2.getBounds()))
                    || (tamaño.intersects(Juego.Verde3.getBounds())) || (tamaño.intersects(Juego.Verde4.getBounds()))
                    || (tamaño.intersects(Juego.Verde5.getBounds())) || (tamaño.intersects(Juego.Verde6.getBounds()))
                    || (tamaño.intersects(Juego.Verde7.getBounds())) || (tamaño.intersects(Juego.Verde8.getBounds()))
                    || (tamaño.intersects(Juego.rosa1.getBounds()))|| (tamaño.intersects(Juego.rosa2.getBounds()))
                    || (tamaño.intersects(Juego.rosa3.getBounds()))|| (tamaño.intersects(Juego.rosa4.getBounds()))
                    || (tamaño.intersects(Juego.rosa5.getBounds()))|| (tamaño.intersects(Juego.rosa6.getBounds()))
                    || (tamaño.intersects(Juego.rosa7.getBounds()))|| (tamaño.intersects(Juego.rosa8.getBounds()))
                    || (tamaño.intersects(Juego.rosado1.getBounds()))|| (tamaño.intersects(Juego.rosado2.getBounds()))
                    || (tamaño.intersects(Juego.rosado3.getBounds()))|| (tamaño.intersects(Juego.rosado4.getBounds()))
                    || (tamaño.intersects(Juego.rosado5.getBounds()))|| (tamaño.intersects(Juego.rosado6.getBounds()))
                    || (tamaño.intersects(Juego.rosado7.getBounds()))|| (tamaño.intersects(Juego.rosado8.getBounds()))
                    || (tamaño.intersects(Juego.roj1.getBounds()))|| (tamaño.intersects(Juego.roj2.getBounds()))
                    || (tamaño.intersects(Juego.roj3.getBounds()))|| (tamaño.intersects(Juego.roj4.getBounds()))
                    || (tamaño.intersects(Juego.roj5.getBounds()))|| (tamaño.intersects(Juego.roj6.getBounds()))
                    || (tamaño.intersects(Juego.roj7.getBounds()))|| (tamaño.intersects(Juego.roj8.getBounds()))
                    || (tamaño.intersects(Juego.rojo1.getBounds()))|| (tamaño.intersects(Juego.rojo2.getBounds()))
                    || (tamaño.intersects(Juego.rojo3.getBounds()))|| (tamaño.intersects(Juego.rojo4.getBounds()))
                    || (tamaño.intersects(Juego.rojo5.getBounds()))|| (tamaño.intersects(Juego.rojo6.getBounds()))
                    || (tamaño.intersects(Juego.rojo7.getBounds()))|| (tamaño.intersects(Juego.rojo8.getBounds()))
                    )) {
                sleep(rapidez);
                frame.repaint();
                labeldisparo.setLocation(tamaño.x + 10, tamaño.y);

                tamaño = labeldisparo.getBounds();
               
            }
            desaparecer();
     
            labeldisparo.setVisible(false);
            
            stop();
        } catch (Exception e) {
            System.out.println("Hay algo mal aqui");
        }
    }
    
    
    
    
    
    
    
    public  void desaparecer() throws InterruptedException{
         //verde1
        if (tamaño.intersects(Juego.Otro.getBounds())) {
                Juego.conteoverde1++;
               
            }
            if (Juego.conteoverde1 == 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Otro.setIcon(imagene);
                sleep(500);
                veruno=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde1=0;
               
            }
            //Verde 2
             if (tamaño.intersects(Juego.Verde2.getBounds())) {
                Juego.conteoverde2++;
               
            }
            if (Juego.conteoverde2== 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Verde2.setIcon(imagene);
                sleep(500);
                verdos=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde2=0;
            }
          //Verde 3
            if (tamaño.intersects(Juego.Verde3.getBounds())) {
                Juego.conteoverde3++;
               
            }
            if (Juego.conteoverde3== 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Verde3.setIcon(imagene);
                sleep(500);
                vertres=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde3=0;
            }
             //Verde 4
            if (tamaño.intersects(Juego.Verde4.getBounds())) {
                Juego.conteoverde4++;
               
            }
            if (Juego.conteoverde4== 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Verde4.setIcon(imagene);
                sleep(500);
                vercuatro=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde4=0;
            }
            //Verde 5
            if (tamaño.intersects(Juego.Verde5.getBounds())) {
                Juego.conteoverde5++;
               
            }
            if (Juego.conteoverde5== 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Verde5.setIcon(imagene);
                sleep(500);
                vercinco=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde5=0;
            }
            //Verde 6
            if (tamaño.intersects(Juego.Verde6.getBounds())) {
                Juego.conteoverde6++;
               
            }
            if (Juego.conteoverde6== 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Verde6.setIcon(imagene);
                sleep(500);
                verseis=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde6=0;
            }
            //Verde 7
            if (tamaño.intersects(Juego.Verde7.getBounds())) {
                Juego.conteoverde7++;
               
            }
            if (Juego.conteoverde7== 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Verde7.setIcon(imagene);
                sleep(500);
                versiete=true;
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde7=0;
            }
            //Verde 8
            if (tamaño.intersects(Juego.Verde8.getBounds())) {
                Juego.conteoverde8++;
               
            }
            if (Juego.conteoverde8== 2) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.Verde8.setIcon(imagene);
                sleep(500);
                verocho=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+10;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoverde8=0;

            }
            //Rosa 1
            if (tamaño.intersects(Juego.rosa1.getBounds())) {
                Juego.conteorosa1++;
               
            }
            if (Juego.conteorosa1== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa1.setIcon(imagene);
                sleep(500);
                rosauno=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa1=0;
            }
            //Rosa 2
            if (tamaño.intersects(Juego.rosa2.getBounds())) {
                Juego.conteorosa2++;
               
            }
            if (Juego.conteorosa2== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa2.setIcon(imagene);
                sleep(500);
                rosados=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa2=0;
            }
            //Rosa 3
            if (tamaño.intersects(Juego.rosa3.getBounds())) {
                Juego.conteorosa3++;
               
            }
            if (Juego.conteorosa3== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa3.setIcon(imagene);
                sleep(500);
                rosatres=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa3=0;
            }
            //Rosa 4
            if (tamaño.intersects(Juego.rosa4.getBounds())) {
                Juego.conteorosa4++;
               
            }
            if (Juego.conteorosa4== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa4.setIcon(imagene);
                sleep(500);
                rosacuatro=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa4=0;
            }
            //Rosa 5
            if (tamaño.intersects(Juego.rosa5.getBounds())) {
                Juego.conteorosa5++;
               
            }
            if (Juego.conteorosa5== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa5.setIcon(imagene);
                sleep(500);
                rosacinco=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa5=0;
            }
            //Rosa 6
            if (tamaño.intersects(Juego.rosa6.getBounds())) {
                Juego.conteorosa6++;
               
            }
            if (Juego.conteorosa6== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa6.setIcon(imagene);
                sleep(500);
                rosaseis=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa6=0;
            }
            //Rosa 7
            if (tamaño.intersects(Juego.rosa7.getBounds())) {
                Juego.conteorosa7++;
               
            }
            if (Juego.conteorosa7== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa7.setIcon(imagene);
                sleep(500);
                rosasiete=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa7=0;
            }
            //Rosa 8
            if (tamaño.intersects(Juego.rosa8.getBounds())) {
                Juego.conteorosa8++;
               
            }
            if (Juego.conteorosa8== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosa8.setIcon(imagene);
                sleep(500);
                rosaocho=true;              
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosa8=0;
            }
            //Rosado 1
            if (tamaño.intersects(Juego.rosado1.getBounds())) {
                Juego.conteorosado1++;
               
            }
            if (Juego.conteorosado1== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado1.setIcon(imagene);
                sleep(500);
                rosadouno=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado1=0;

            }
            //Rosado 2
            if (tamaño.intersects(Juego.rosado2.getBounds())) {
                Juego.conteorosado2++;
               
            }
            if (Juego.conteorosado2== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado2.setIcon(imagene);
                sleep(500);
                rosadodos=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado2=0;
            }
            //Rosado 3
            if (tamaño.intersects(Juego.rosado3.getBounds())) {
                Juego.conteorosado3++;
               
            }
            if (Juego.conteorosado3== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado3.setIcon(imagene);
                sleep(500);
                rosadotres=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado3=0;
            }
            //Rosado 4
            if (tamaño.intersects(Juego.rosado4.getBounds())) {
                Juego.conteorosado4++;
               
            }
            if (Juego.conteorosado4== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado4.setIcon(imagene);
                sleep(500);
                rosadocuatro=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado4=0;
            }
            //Rosado 5
            if (tamaño.intersects(Juego.rosado5.getBounds())) {
                Juego.conteorosado5++;
               
            }
            if (Juego.conteorosado5== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado5.setIcon(imagene);
                sleep(500);
                rosadocinco=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado5=0;
            }
            //Rosado 6
            if (tamaño.intersects(Juego.rosado6.getBounds())) {
                Juego.conteorosado6++;
               
            }
            if (Juego.conteorosado6== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado6.setIcon(imagene);
                sleep(500);
                rosadoseis=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado6=0;
            }
            //Rosado 7
            if (tamaño.intersects(Juego.rosado7.getBounds())) {
                Juego.conteorosado7++;
               
            }
            if (Juego.conteorosado7== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado7.setIcon(imagene);
                sleep(500);
                rosadosiete=true;
                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado7=0;
            }
            //Rosado 8
            if (tamaño.intersects(Juego.rosado8.getBounds())) {
                Juego.conteorosado8++;               
            }
            if (Juego.conteorosado8== 3) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rosado8.setIcon(imagene);
                sleep(500);
                rosadoocho=true;                
                Practica3IPC.puntos=Practica3IPC.puntos+20;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorosado8=0;
            }
            //Roj 1
            if (tamaño.intersects(Juego.roj1.getBounds())) {
                Juego.conteoroj1++;
               
            }
            if (Juego.conteoroj1== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj1.setIcon(imagene);
                sleep(500);
                rojuno=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj1=0;
            }
            //Roj 2
            if (tamaño.intersects(Juego.roj2.getBounds())) {
                Juego.conteoroj2++;
               
            }
            if (Juego.conteoroj2== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj2.setIcon(imagene);
                sleep(500);
                rojdos=true;
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj2=0;
            }
             //Roj 3
            if (tamaño.intersects(Juego.roj3.getBounds())) {
                Juego.conteoroj3++;
               
            }
            if (Juego.conteoroj3== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj3.setIcon(imagene);
                sleep(500);
                rojtres=true;   
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj3=0;
            }
            //Roj 4
            if (tamaño.intersects(Juego.roj4.getBounds())) {
                Juego.conteoroj4++;
               
            }
            if (Juego.conteoroj4== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj4.setIcon(imagene);
                sleep(500);
                rojcuatro=true;   
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj4=0;
            }
            //Roj 5
            if (tamaño.intersects(Juego.roj5.getBounds())) {
                Juego.conteoroj5++;
               
            }
            if (Juego.conteoroj5== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj5.setIcon(imagene);
                sleep(500);
                rojcinco=true;   
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj5=0;
            }
            //Roj 6
            if (tamaño.intersects(Juego.roj6.getBounds())) {
                Juego.conteoroj6++;
               
            }
            if (Juego.conteoroj6== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj6.setIcon(imagene);
                sleep(500);
                rojseis=true;   
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj6=0;
            }
            //Roj 7
            if (tamaño.intersects(Juego.roj7.getBounds())) {
                Juego.conteoroj7++;
               
            }
            if (Juego.conteoroj7== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj7.setIcon(imagene);
                sleep(500);
                rojsiete=true;   
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj7=0;
            }
            //Roj 8
            if (tamaño.intersects(Juego.roj8.getBounds())) {
                Juego.conteoroj8++;
               
            }
            if (Juego.conteoroj8== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.roj8.setIcon(imagene);
                sleep(500);
                rojocho=true;   
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteoroj8=0;
            }
            //Rojo 1
            if (tamaño.intersects(Juego.rojo1.getBounds())) {
                Juego.conteorojo1++;
               
            }
            if (Juego.conteorojo1== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo1.setIcon(imagene);
                sleep(500);
                rojouno=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo1=0;
            }
            //Rojo 2
            if (tamaño.intersects(Juego.rojo2.getBounds())) {
                Juego.conteorojo2++;
               
            }
            if (Juego.conteorojo2== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo2.setIcon(imagene);
                sleep(500);
                rojodos=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo2=0;
            }
            //Rojo 3
            if (tamaño.intersects(Juego.rojo3.getBounds())) {
                Juego.conteorojo3++;
               
            }
            if (Juego.conteorojo3== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo3.setIcon(imagene);
                sleep(500);
                rojotres=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo3=0;
            }
            //Rojo 4
            if (tamaño.intersects(Juego.rojo4.getBounds())) {
                Juego.conteorojo4++;
               
            }
            if (Juego.conteorojo4== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo4.setIcon(imagene);
                sleep(500);
                rojocuatro=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo4=0;
            }
            //Rojo 5
            if (tamaño.intersects(Juego.rojo5.getBounds())) {
                Juego.conteorojo5++;
               
            }
            if (Juego.conteorojo5== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo5.setIcon(imagene);
                sleep(500);
                rojocinco=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo5=0;
            }
            //Rojo 6
            if (tamaño.intersects(Juego.rojo6.getBounds())) {
                Juego.conteorojo6++;
               
            }
            if (Juego.conteorojo6== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo6.setIcon(imagene);
                sleep(500);
                rojoseis=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo6=0;
            }
            //Rojo 7
            if (tamaño.intersects(Juego.rojo7.getBounds())) {
                Juego.conteorojo7++;
               
            }
            if (Juego.conteorojo7== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo7.setIcon(imagene);
                sleep(500);
                rojosiete=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo7=0;
            }
            //Rojo 8
            if (tamaño.intersects(Juego.rojo8.getBounds())) {
                Juego.conteorojo8++;
               
            }
            if (Juego.conteorojo8== 4) {
                ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/explosion.png"));
                ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
                Juego.rojo8.setIcon(imagene);
                sleep(500);
                rojoocho=true;               
                Practica3IPC.puntos=Practica3IPC.puntos+30;
                Juego.puntos.setText(""+ Practica3IPC.puntos);
                Juego.conteorojo8=0;
            }
    }
}
