package practica3ipc;

import java.awt.Rectangle;

public class Movimientorojo extends Thread {

    int rapidez;
    Rectangle rojouno;
    Rectangle rojodos;
    Rectangle rojotres;
    Rectangle rojocuatro;
    Rectangle rojocinco;
    Rectangle rojoseis;
    Rectangle rojosiete;
    Rectangle rojoocho;
    Juego rojoframe;

    public Movimientorojo(int rapido, Rectangle ab, Rectangle rsiete, Rectangle rseis, Rectangle rcinco, Rectangle rcuatro, Rectangle rtres, Rectangle rdos, Rectangle rarriba, Juego ventana) {
        this.rapidez = rapido;
        this.rojoocho = ab;
        this.rojosiete = rsiete;
        this.rojoseis = rseis;
        this.rojocinco = rcinco;
        this.rojocuatro = rcuatro;
        this.rojotres = rtres;
        this.rojodos = rdos;
        this.rojouno = rarriba;
        this.rojoframe = ventana;
    }

    public void run() {
        try {
            while (!(rojoocho.intersects(Juego.Nave.getBounds()) || rojouno.intersects(Juego.Nave.getBounds())
                    || rojodos.intersects(Juego.Nave.getBounds()) || rojotres.intersects(Juego.Nave.getBounds())
                    || rojocuatro.intersects(Juego.Nave.getBounds()) || rojocinco.intersects(Juego.Nave.getBounds())
                    || rojoseis.intersects(Juego.Nave.getBounds()) || rojosiete.intersects(Juego.Nave.getBounds()))) {
                while (!rojoocho.intersects(Juego.Labelabajo.getBounds())) {
                    sleep(rapidez);
                    rojoframe.repaint();
                    Juego.rojo8.setLocation(rojoocho.x - 1, rojoocho.y + 1);
                    Juego.rojo7.setLocation(rojosiete.x - 1, rojosiete.y + 1);
                    Juego.rojo6.setLocation(rojoseis.x - 1, rojoseis.y + 1);
                    Juego.rojo5.setLocation(rojocinco.x - 1, rojocinco.y + 1);
                    Juego.rojo4.setLocation(rojocuatro.x - 1, rojocuatro.y + 1);
                    Juego.rojo3.setLocation(rojotres.x - 1, rojotres.y + 1);
                    Juego.rojo2.setLocation(rojodos.x - 1, rojodos.y + 1);
                    Juego.rojo1.setLocation(rojouno.x - 1, rojouno.y + 1);
                    rojoocho = Juego.rojo8.getBounds();
                    rojosiete = Juego.rojo7.getBounds();
                    rojoseis = Juego.rojo6.getBounds();
                    rojocinco = Juego.rojo5.getBounds();
                    rojocuatro = Juego.rojo4.getBounds();
                    rojotres = Juego.rojo3.getBounds();
                    rojodos = Juego.rojo2.getBounds();
                    rojouno = Juego.rojo1.getBounds();
                    mover();
                }
                if (rojoocho.intersects(Juego.Labelabajo.getBounds())) {
                    while (!rojouno.intersects(Juego.Labelarriba.getBounds())) {
                        sleep(rapidez);
                        rojoframe.repaint();
                        Juego.rojo8.setLocation(rojoocho.x - 1, rojoocho.y - 1);
                        Juego.rojo7.setLocation(rojosiete.x - 1, rojosiete.y - 1);
                        Juego.rojo6.setLocation(rojoseis.x - 1, rojoseis.y - 1);
                        Juego.rojo5.setLocation(rojocinco.x - 1, rojocinco.y - 1);
                        Juego.rojo4.setLocation(rojocuatro.x - 1, rojocuatro.y - 1);
                        Juego.rojo3.setLocation(rojotres.x - 1, rojotres.y - 1);
                        Juego.rojo2.setLocation(rojodos.x - 1, rojodos.y - 1);
                        Juego.rojo1.setLocation(rojouno.x - 1, rojouno.y - 1);
                        rojoocho = Juego.rojo8.getBounds();
                        rojosiete = Juego.rojo7.getBounds();
                        rojoseis = Juego.rojo6.getBounds();
                        rojocinco = Juego.rojo5.getBounds();
                        rojocuatro = Juego.rojo4.getBounds();
                        rojotres = Juego.rojo3.getBounds();
                        rojodos = Juego.rojo2.getBounds();
                        rojouno = Juego.rojo1.getBounds();
                        mover();
                    }
                }

            }
            if (!(Disparo.rojouno && Disparo.rojodos && Disparo.rojotres && Disparo.rojocuatro && Disparo.rojocinco && Disparo.rojoseis
                    && Disparo.rojosiete && Disparo.rojoocho)) {
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
        if (Disparo.rojoocho) {
            Juego.rojo8.setVisible(false);
            Juego.rojo8.setLocation(0, 0);
        }
        if (Disparo.rojosiete) {
            Juego.rojo7.setVisible(false);
            Juego.rojo7.setLocation(0, 0);
        }
        if (Disparo.rojoseis) {
            Juego.rojo6.setVisible(false);
            Juego.rojo6.setLocation(0, 0);
        }
        if (Disparo.rojocinco) {
            Juego.rojo5.setVisible(false);
            Juego.rojo5.setLocation(0, 0);
        }
        if (Disparo.rojocuatro) {
            Juego.rojo4.setVisible(false);
            Juego.rojo4.setLocation(0, 0);
        }
        if (Disparo.rojotres) {
            Juego.rojo3.setVisible(false);
            Juego.rojo3.setLocation(0, 0);
        }
        if (Disparo.rojodos) {
            Juego.rojo2.setVisible(false);
            Juego.rojo2.setLocation(0, 0);
        }
        if (Disparo.rojouno) {
            Juego.rojo1.setVisible(false);
            Juego.rojo1.setLocation(0, 0);
        }
        if ((Disparo.rojouno && Disparo.rojodos && Disparo.rojotres && Disparo.rojocuatro && Disparo.rojocinco && Disparo.rojoseis
                && Disparo.rojosiete && Disparo.rojoocho)) {
            Final fina = new Final();
            fina.setVisible(true);
            fina.setLocationRelativeTo(null);
            Principal.juego.setVisible(false);
            Final.razon.setText("Ganaste");
            Final.puntoos.setText("" + Practica3IPC.puntos);
            Principal.tiempo.stop();
            Principal.movimineto.stop();
            Principal.moverosa.stop();
            Principal.moverosado.stop();
            Principal.moveroj.stop();
            Principal.moverojo.stop();
        }
        if ((Disparo.veruno && Disparo.verdos && Disparo.vertres && Disparo.vercuatro && Disparo.vercinco && Disparo.verseis
                && Disparo.versiete && Disparo.verocho)) {
            this.rapidez = 53;
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

            }
            if (Configuracion.velo == 1) {
                this.rapidez = 20;

            }
        }
    }
}
