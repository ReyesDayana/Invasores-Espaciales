package practica3ipc;

import java.awt.Rectangle;

public class Movimientorosado extends Thread {

    int rapidez;
    Rectangle rosadouno;
    Rectangle rosadodos;
    Rectangle rosadotres;
    Rectangle rosadocuatro;
    Rectangle rosadocinco;
    Rectangle rosadoseis;
    Rectangle rosadosiete;
    Rectangle rosadoocho;
    Juego rosadoframe;

    public Movimientorosado(int rapido, Rectangle ab, Rectangle rsiete, Rectangle rseis, Rectangle rcinco, Rectangle rcuatro, Rectangle rtres, Rectangle rdos, Rectangle rarriba, Juego ventana) {
        this.rapidez = rapido;
        this.rosadoocho = ab;
        this.rosadosiete = rsiete;
        this.rosadoseis = rseis;
        this.rosadocinco = rcinco;
        this.rosadocuatro = rcuatro;
        this.rosadotres = rtres;
        this.rosadodos = rdos;
        this.rosadouno = rarriba;
        this.rosadoframe = ventana;
    }

    public void run() {
        try {
            while (!(rosadoocho.intersects(Juego.Nave.getBounds()) || rosadouno.intersects(Juego.Nave.getBounds())
                    || rosadodos.intersects(Juego.Nave.getBounds()) || rosadotres.intersects(Juego.Nave.getBounds())
                    || rosadocuatro.intersects(Juego.Nave.getBounds()) || rosadocinco.intersects(Juego.Nave.getBounds())
                    || rosadoseis.intersects(Juego.Nave.getBounds()) || rosadosiete.intersects(Juego.Nave.getBounds()))) {
                while (!rosadoocho.intersects(Juego.Labelabajo.getBounds())) {
                    sleep(rapidez);
                    rosadoframe.repaint();
                    Juego.rosado8.setLocation(rosadoocho.x - 1, rosadoocho.y + 1);
                    Juego.rosado7.setLocation(rosadosiete.x - 1, rosadosiete.y + 1);
                    Juego.rosado6.setLocation(rosadoseis.x - 1, rosadoseis.y + 1);
                    Juego.rosado5.setLocation(rosadocinco.x - 1, rosadocinco.y + 1);
                    Juego.rosado4.setLocation(rosadocuatro.x - 1, rosadocuatro.y + 1);
                    Juego.rosado3.setLocation(rosadotres.x - 1, rosadotres.y + 1);
                    Juego.rosado2.setLocation(rosadodos.x - 1, rosadodos.y + 1);
                    Juego.rosado1.setLocation(rosadouno.x - 1, rosadouno.y + 1);
                    rosadoocho = Juego.rosado8.getBounds();
                    rosadosiete = Juego.rosado7.getBounds();
                    rosadoseis = Juego.rosado6.getBounds();
                    rosadocinco = Juego.rosado5.getBounds();
                    rosadocuatro = Juego.rosado4.getBounds();
                    rosadotres = Juego.rosado3.getBounds();
                    rosadodos = Juego.rosado2.getBounds();
                    rosadouno = Juego.rosado1.getBounds();
                    mover();
                }
                if (rosadoocho.intersects(Juego.Labelabajo.getBounds())) {
                    while (!rosadouno.intersects(Juego.Labelarriba.getBounds())) {
                        sleep(rapidez);
                        rosadoframe.repaint();
                        Juego.rosado8.setLocation(rosadoocho.x - 1, rosadoocho.y - 1);
                        Juego.rosado7.setLocation(rosadosiete.x - 1, rosadosiete.y - 1);
                        Juego.rosado6.setLocation(rosadoseis.x - 1, rosadoseis.y - 1);
                        Juego.rosado5.setLocation(rosadocinco.x - 1, rosadocinco.y - 1);
                        Juego.rosado4.setLocation(rosadocuatro.x - 1, rosadocuatro.y - 1);
                        Juego.rosado3.setLocation(rosadotres.x - 1, rosadotres.y - 1);
                        Juego.rosado2.setLocation(rosadodos.x - 1, rosadodos.y - 1);
                        Juego.rosado1.setLocation(rosadouno.x - 1, rosadouno.y - 1);
                        rosadoocho = Juego.rosado8.getBounds();
                        rosadosiete = Juego.rosado7.getBounds();
                        rosadoseis = Juego.rosado6.getBounds();
                        rosadocinco = Juego.rosado5.getBounds();
                        rosadocuatro = Juego.rosado4.getBounds();
                        rosadotres = Juego.rosado3.getBounds();
                        rosadodos = Juego.rosado2.getBounds();
                        rosadouno = Juego.rosado1.getBounds();
                        mover();
                    }
                }

            }
            if (!(Disparo.rosadouno && Disparo.rosadodos && Disparo.rosadotres && Disparo.rosadocuatro && Disparo.rosadocinco && Disparo.rosadoseis
                    && Disparo.rosadosiete && Disparo.rosadoocho)) {
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
        if (Disparo.rosadoocho) {
            Juego.rosado8.setVisible(false);
            Juego.rosado8.setLocation(0, 0);
        }
        if (Disparo.rosadosiete) {
            Juego.rosado7.setVisible(false);
            Juego.rosado7.setLocation(0, 0);
        }
        if (Disparo.rosadoseis) {
            Juego.rosado6.setVisible(false);
            Juego.rosado6.setLocation(0, 0);
        }
        if (Disparo.rosadocinco) {
            Juego.rosado5.setVisible(false);
            Juego.rosado5.setLocation(0, 0);
        }
        if (Disparo.rosadocuatro) {
            Juego.rosado4.setVisible(false);
            Juego.rosado4.setLocation(0, 0);
        }
        if (Disparo.rosadotres) {
            Juego.rosado3.setVisible(false);
            Juego.rosado3.setLocation(0, 0);
        }
        if (Disparo.rosadodos) {
            Juego.rosado2.setVisible(false);
            Juego.rosado2.setLocation(0, 0);
        }
        if (Disparo.rosadouno) {
            Juego.rosado1.setVisible(false);
            Juego.rosado1.setLocation(0, 0);
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
    }
}
