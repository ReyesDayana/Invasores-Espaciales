package practica3ipc;

import java.awt.Rectangle;

public class Movimientoverdes extends Thread {

    int rapidez;
    Rectangle dos;
    Rectangle tres;
    Rectangle cuatro;
    Rectangle cinco;
    Rectangle seis;
    Rectangle siete;
    Rectangle arriba;
    Rectangle abajo;
    Juego jueg;

    public Movimientoverdes(int rapido, Rectangle ab, Rectangle rsiete, Rectangle rseis, Rectangle rcinco, Rectangle rcuatro, Rectangle rtres, Rectangle rdos, Rectangle rarriba, Juego ventana) {
        this.rapidez = rapido;
        this.abajo = ab;
        this.siete = rsiete;
        this.seis = rseis;
        this.cinco = rcinco;
        this.cuatro = rcuatro;
        this.tres = rtres;
        this.dos = rdos;
        this.arriba = rarriba;
        this.jueg = ventana;
    }

    public void run() {
        try {
            while (!(abajo.intersects(Juego.Nave.getBounds()) || arriba.intersects(Juego.Nave.getBounds())
                    || dos.intersects(Juego.Nave.getBounds()) || tres.intersects(Juego.Nave.getBounds())
                    || cuatro.intersects(Juego.Nave.getBounds()) || cinco.intersects(Juego.Nave.getBounds())
                    || seis.intersects(Juego.Nave.getBounds()) || siete.intersects(Juego.Nave.getBounds()))) {
                while (!abajo.intersects(Juego.Labelabajo.getBounds())) {

                    sleep(rapidez);
                    jueg.repaint();
                    Juego.Verde8.setLocation(abajo.x - 1, abajo.y + 1);
                    Juego.Verde7.setLocation(siete.x - 1, siete.y + 1);
                    Juego.Verde6.setLocation(seis.x - 1, seis.y + 1);
                    Juego.Verde5.setLocation(cinco.x - 1, cinco.y + 1);
                    Juego.Verde4.setLocation(cuatro.x - 1, cuatro.y + 1);
                    Juego.Verde3.setLocation(tres.x - 1, tres.y + 1);
                    Juego.Verde2.setLocation(dos.x - 1, dos.y + 1);
                    Juego.Otro.setLocation(arriba.x - 1, arriba.y + 1);
                    siete = Juego.Verde7.getBounds();
                    seis = Juego.Verde6.getBounds();
                    cinco = Juego.Verde5.getBounds();
                    cuatro = Juego.Verde4.getBounds();
                    tres = Juego.Verde3.getBounds();
                    dos = Juego.Verde2.getBounds();
                    arriba = Juego.Otro.getBounds();
                    abajo = Juego.Verde8.getBounds();
                    mover();
                }
                if (abajo.intersects(Juego.Labelabajo.getBounds())) {
                    while (!arriba.intersects(Juego.Labelarriba.getBounds())) {

                        sleep(rapidez);
                        jueg.repaint();
                        Juego.Verde8.setLocation(abajo.x - 1, abajo.y - 1);
                        Juego.Verde7.setLocation(siete.x - 1, siete.y - 1);
                        Juego.Verde6.setLocation(seis.x - 1, seis.y - 1);
                        Juego.Verde5.setLocation(cinco.x - 1, cinco.y - 1);
                        Juego.Verde4.setLocation(cuatro.x - 1, cuatro.y - 1);
                        Juego.Verde3.setLocation(tres.x - 1, tres.y - 1);
                        Juego.Verde2.setLocation(dos.x - 1, dos.y - 1);
                        Juego.Otro.setLocation(arriba.x - 1, arriba.y - 1);
                        siete = Juego.Verde7.getBounds();
                        seis = Juego.Verde6.getBounds();
                        cinco = Juego.Verde5.getBounds();
                        cuatro = Juego.Verde4.getBounds();
                        tres = Juego.Verde3.getBounds();
                        dos = Juego.Verde2.getBounds();
                        arriba = Juego.Otro.getBounds();
                        abajo = Juego.Verde8.getBounds();
                        mover();

                    }
                }
            }
            if (!(Disparo.veruno && Disparo.verdos && Disparo.vertres && Disparo.vercuatro && Disparo.vercinco && Disparo.verseis
                    && Disparo.versiete && Disparo.verocho)) {
                Final fina = new Final();
                fina.setVisible(true);
                fina.setLocationRelativeTo(null);
                Principal.juego.setVisible(false);
                Final.razon.setText("Los enemigos te mataron");
                Final.puntoos.setText("" + Practica3IPC.puntos);
                Principal.tiempo.stop();
                Principal.movimineto.stop();
                Principal.moverosa.stop();
                Principal.moverosado.stop();
                Principal.moveroj.stop();
                Principal.moverojo.stop();
                if (Pausa.pausamastiempo) {
                    Principal.mastiempo.stop();
                    Principal.mastiempo.labeltiempo.setVisible(false);
                }
                if (Pausa.pausamenostiempo) {
                    Principal.menostiempo.stop();
                    Principal.menostiempo.labeltiempo.setVisible(false);
                }
                if (Pausa.pausamenospuntos) {
                    Principal.menospuntos.stop();
                    Principal.menospuntos.labelpuntos.setVisible(false);
                }
                if (Pausa.pausamaspuntos) {
                    Principal.maspuntos.stop();
                    Principal.maspuntos.labelpuntos.setVisible(false);
                }
                if (Pausa.pausamasvelocidad) {
                    Principal.masvelocidaad.stop();
                    Principal.masvelocidaad.labelvelocidad.setVisible(false);
                }
                if (Pausa.pausamenosvelocidad) {
                    Principal.congelar.stop();
                    Principal.congelar.labelvelocidad.setVisible(false);
                }
            }
            stop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("mal");
            e.getStackTrace();
        }

    }

    public void mover() throws InterruptedException {
        if (Disparo.verocho) {

            Juego.Verde8.setVisible(false);
            Juego.Verde8.setLocation(0, 0);
        }
        if (Disparo.versiete) {
            Juego.Verde7.setVisible(false);
            Juego.Verde7.setLocation(0, 0);
        }
        if (Disparo.verseis) {
            Juego.Verde6.setVisible(false);
            Juego.Verde6.setLocation(0, 0);
        }
        if (Disparo.vercinco) {
            Juego.Verde5.setVisible(false);
            Juego.Verde5.setLocation(0, 0);
        }
        if (Disparo.vercuatro) {
            Juego.Verde4.setVisible(false);
            Juego.Verde4.setLocation(0, 0);
        }
        if (Disparo.vertres) {
            Juego.Verde3.setVisible(false);
            Juego.Verde3.setLocation(0, 0);
        }
        if (Disparo.verdos) {
            Juego.conteoverde2 = 0;
            Juego.Verde2.setVisible(false);
            Juego.Verde2.setLocation(0, 0);
        }
        if (Disparo.veruno) {
            Juego.conteoverde1 = 0;
            Juego.Otro.setVisible(false);
            Juego.Otro.setLocation(0, 0);

        }
    }

}
