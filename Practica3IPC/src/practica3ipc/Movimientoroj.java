package practica3ipc;

import java.awt.Rectangle;

public class Movimientoroj extends Thread {

    int rapidez;
    Rectangle rojuno;
    Rectangle rojdos;
    Rectangle rojtres;
    Rectangle rojcuatro;
    Rectangle rojcinco;
    Rectangle rojseis;
    Rectangle rojsiete;
    Rectangle rojocho;
    Juego rojframe;

    public Movimientoroj(int rapido, Rectangle ab, Rectangle rsiete, Rectangle rseis, Rectangle rcinco, Rectangle rcuatro, Rectangle rtres, Rectangle rdos, Rectangle rarriba, Juego ventana) {
        this.rapidez = rapido;
        this.rojocho = ab;
        this.rojsiete = rsiete;
        this.rojseis = rseis;
        this.rojcinco = rcinco;
        this.rojcuatro = rcuatro;
        this.rojtres = rtres;
        this.rojdos = rdos;
        this.rojuno = rarriba;
        this.rojframe = ventana;
    }

    public void run() {
        try {
            while (!(rojocho.intersects(Juego.topaste.getBounds()) || rojuno.intersects(Juego.topaste.getBounds())
                    || rojdos.intersects(Juego.topaste.getBounds()) || rojtres.intersects(Juego.topaste.getBounds())
                    || rojcuatro.intersects(Juego.topaste.getBounds()) || rojcinco.intersects(Juego.topaste.getBounds())
                    || rojseis.intersects(Juego.topaste.getBounds()) || rojsiete.intersects(Juego.topaste.getBounds()))) {
                while (!rojocho.intersects(Juego.Labelabajo.getBounds())) {
                    sleep(rapidez);
                    rojframe.repaint();
                    Juego.roj8.setLocation(rojocho.x - 1, rojocho.y + 1);
                    Juego.roj7.setLocation(rojsiete.x - 1, rojsiete.y + 1);
                    Juego.roj6.setLocation(rojseis.x - 1, rojseis.y + 1);
                    Juego.roj5.setLocation(rojcinco.x - 1, rojcinco.y + 1);
                    Juego.roj4.setLocation(rojcuatro.x - 1, rojcuatro.y + 1);
                    Juego.roj3.setLocation(rojtres.x - 1, rojtres.y + 1);
                    Juego.roj2.setLocation(rojdos.x - 1, rojdos.y + 1);
                    Juego.roj1.setLocation(rojuno.x - 1, rojuno.y + 1);
                    rojocho = Juego.roj8.getBounds();
                    rojsiete = Juego.roj7.getBounds();
                    rojseis = Juego.roj6.getBounds();
                    rojcinco = Juego.roj5.getBounds();
                    rojcuatro = Juego.roj4.getBounds();
                    rojtres = Juego.roj3.getBounds();
                    rojdos = Juego.roj2.getBounds();
                    rojuno = Juego.roj1.getBounds();
                    mover();
                }
                if (rojocho.intersects(Juego.Labelabajo.getBounds())) {
                    while (!rojuno.intersects(Juego.Labelarriba.getBounds())) {
                        sleep(rapidez);
                        rojframe.repaint();
                        Juego.roj8.setLocation(rojocho.x - 1, rojocho.y - 1);
                        Juego.roj7.setLocation(rojsiete.x - 1, rojsiete.y - 1);
                        Juego.roj6.setLocation(rojseis.x - 1, rojseis.y - 1);
                        Juego.roj5.setLocation(rojcinco.x - 1, rojcinco.y - 1);
                        Juego.roj4.setLocation(rojcuatro.x - 1, rojcuatro.y - 1);
                        Juego.roj3.setLocation(rojtres.x - 1, rojtres.y - 1);
                        Juego.roj2.setLocation(rojdos.x - 1, rojdos.y - 1);
                        Juego.roj1.setLocation(rojuno.x - 1, rojuno.y - 1);
                        rojocho = Juego.roj8.getBounds();
                        rojsiete = Juego.roj7.getBounds();
                        rojseis = Juego.roj6.getBounds();
                        rojcinco = Juego.roj5.getBounds();
                        rojcuatro = Juego.roj4.getBounds();
                        rojtres = Juego.roj3.getBounds();
                        rojdos = Juego.roj2.getBounds();
                        rojuno = Juego.roj1.getBounds();
                        mover();
                    }
                }

            }
            if (!(Disparo.rojuno && Disparo.rojdos && Disparo.rojtres && Disparo.rojcuatro && Disparo.rojcinco && Disparo.rojseis
                    && Disparo.rojsiete && Disparo.rojocho)) {
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
            e.printStackTrace();
        }
    }

    public void mover() throws InterruptedException {
        if (Disparo.rojocho) {
            Juego.roj8.setVisible(false);
            Juego.roj8.setLocation(0, 0);
        }
        if (Disparo.rojsiete) {
            Juego.roj7.setVisible(false);
            Juego.roj7.setLocation(0, 0);
        }
        if (Disparo.rojseis) {
            Juego.roj6.setVisible(false);
            Juego.roj6.setLocation(0, 0);
        }
        if (Disparo.rojcinco) {
            Juego.roj5.setVisible(false);
            Juego.roj5.setLocation(0, 0);
        }
        if (Disparo.rojcuatro) {
            Juego.roj4.setVisible(false);
            Juego.roj4.setLocation(0, 0);
        }
        if (Disparo.rojtres) {
            Juego.roj3.setVisible(false);
            Juego.roj3.setLocation(0, 0);
        }
        if (Disparo.rojdos) {
            Juego.roj2.setVisible(false);
            Juego.roj2.setLocation(0, 0);
        }
        if (Disparo.rojuno) {
            Juego.roj1.setVisible(false);
            Juego.roj1.setLocation(0, 0);
        }
        if ((Disparo.veruno && Disparo.verdos && Disparo.vertres && Disparo.vercuatro && Disparo.vercinco && Disparo.verseis
                && Disparo.versiete && Disparo.verocho)) {
            if (Configuracion.velo == 0) {
                this.rapidez = 53;

            }
            if (Configuracion.velo == 1) {
                this.rapidez = 40;

            }
        }

        if ((Disparo.rosauno && Disparo.rosados && Disparo.rosatres && Disparo.rosacuatro && Disparo.rosacinco && Disparo.rosaseis
                && Disparo.rosasiete && Disparo.rosaocho && Disparo.rosadouno && Disparo.rosadodos && Disparo.rosadotres
                && Disparo.rosadocuatro && Disparo.rosadocinco && Disparo.rosadoseis
                && Disparo.rosadosiete && Disparo.rosadoocho)) {

            if (Configuracion.velo == 0) {
                this.rapidez = 27;
                Juego.velocidadjuego.setText("2");
            }
            if (Configuracion.velo == 1) {
                this.rapidez = 20;
                Juego.velocidadjuego.setText("4");
            }
        }
    }
}
