package practica3ipc;

import java.awt.Rectangle;

public class Movimientorosa extends Thread {

    int rapidez;
    Rectangle rosados;
    Rectangle rosatres;
    Rectangle rosacuatro;
    Rectangle rosacinco;
    Rectangle rosaseis;
    Rectangle rosasiete;
    Rectangle rosauno;
    Rectangle rosaocho;
    Juego rosaframe;

    public Movimientorosa(int rapido, Rectangle ab, Rectangle rsiete, Rectangle rseis, Rectangle rcinco, Rectangle rcuatro, Rectangle rtres, Rectangle rdos, Rectangle rarriba, Juego ventana) {
        this.rapidez = rapido;
        this.rosaocho = ab;
        this.rosasiete = rsiete;
        this.rosaseis = rseis;
        this.rosacinco = rcinco;
        this.rosacuatro = rcuatro;
        this.rosatres = rtres;
        this.rosados = rdos;
        this.rosauno = rarriba;
        this.rosaframe = ventana;
    }

    public void run() {
        try {
            while (!(rosaocho.intersects(Juego.topaste.getBounds()) || rosauno.intersects(Juego.topaste.getBounds())
                    || rosados.intersects(Juego.topaste.getBounds()) || rosatres.intersects(Juego.topaste.getBounds())
                    || rosacuatro.intersects(Juego.topaste.getBounds()) || rosacinco.intersects(Juego.topaste.getBounds())
                    || rosaseis.intersects(Juego.topaste.getBounds()) || rosasiete.intersects(Juego.topaste.getBounds()))) {
                while (!rosaocho.intersects(Juego.Labelabajo.getBounds())) {
                    sleep(rapidez);
                    rosaframe.repaint();
                    Juego.rosa8.setLocation(rosaocho.x - 1, rosaocho.y + 1);
                    Juego.rosa7.setLocation(rosasiete.x - 1, rosasiete.y + 1);
                    Juego.rosa6.setLocation(rosaseis.x - 1, rosaseis.y + 1);
                    Juego.rosa5.setLocation(rosacinco.x - 1, rosacinco.y + 1);
                    Juego.rosa4.setLocation(rosacuatro.x - 1, rosacuatro.y + 1);
                    Juego.rosa3.setLocation(rosatres.x - 1, rosatres.y + 1);
                    Juego.rosa2.setLocation(rosados.x - 1, rosados.y + 1);
                    Juego.rosa1.setLocation(rosauno.x - 1, rosauno.y + 1);
                    rosaocho = Juego.rosa8.getBounds();
                    rosasiete = Juego.rosa7.getBounds();
                    rosaseis = Juego.rosa6.getBounds();
                    rosacinco = Juego.rosa5.getBounds();
                    rosacuatro = Juego.rosa4.getBounds();
                    rosatres = Juego.rosa3.getBounds();
                    rosados = Juego.rosa2.getBounds();
                    rosauno = Juego.rosa1.getBounds();
                    mover();
                }
                if (rosaocho.intersects(Juego.Labelabajo.getBounds())) {
                    while (!rosauno.intersects(Juego.Labelarriba.getBounds())) {
                        sleep(rapidez);
                        rosaframe.repaint();
                        Juego.rosa8.setLocation(rosaocho.x - 1, rosaocho.y - 1);
                        Juego.rosa7.setLocation(rosasiete.x - 1, rosasiete.y - 1);
                        Juego.rosa6.setLocation(rosaseis.x - 1, rosaseis.y - 1);
                        Juego.rosa5.setLocation(rosacinco.x - 1, rosacinco.y - 1);
                        Juego.rosa4.setLocation(rosacuatro.x - 1, rosacuatro.y - 1);
                        Juego.rosa3.setLocation(rosatres.x - 1, rosatres.y - 1);
                        Juego.rosa2.setLocation(rosados.x - 1, rosados.y - 1);
                        Juego.rosa1.setLocation(rosauno.x - 1, rosauno.y - 1);
                        rosaocho = Juego.rosa8.getBounds();
                        rosasiete = Juego.rosa7.getBounds();
                        rosaseis = Juego.rosa6.getBounds();
                        rosacinco = Juego.rosa5.getBounds();
                        rosacuatro = Juego.rosa4.getBounds();
                        rosatres = Juego.rosa3.getBounds();
                        rosados = Juego.rosa2.getBounds();
                        rosauno = Juego.rosa1.getBounds();
                        mover();
                    }
                }

            }
            if (!(Disparo.rosauno && Disparo.rosados && Disparo.rosatres && Disparo.rosacuatro && Disparo.rosacinco && Disparo.rosaseis
                    && Disparo.rosasiete && Disparo.rosaocho)) {
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
        if (Disparo.rosaocho) {
            Juego.rosa8.setVisible(false);
            Juego.rosa8.setLocation(0, 0);
        }
        if (Disparo.rosasiete) {
            Juego.rosa7.setVisible(false);
            Juego.rosa7.setLocation(0, 0);
        }
        if (Disparo.rosaseis) {
            Juego.rosa6.setVisible(false);
            Juego.rosa6.setLocation(0, 0);
        }
        if (Disparo.rosacinco) {
            Juego.rosa5.setVisible(false);
            Juego.rosa5.setLocation(0, 0);
        }
        if (Disparo.rosacuatro) {
            Juego.rosa4.setVisible(false);
            Juego.rosa4.setLocation(0, 0);
        }
        if (Disparo.rosatres) {
            Juego.rosa3.setVisible(false);
            Juego.rosa3.setLocation(0, 0);
        }
        if (Disparo.rosados) {
            Juego.rosa2.setVisible(false);
            Juego.rosa2.setLocation(0, 0);
        }
        if (Disparo.rosauno) {
            Juego.rosa1.setVisible(false);
            Juego.rosa1.setLocation(0, 0);
        }
        if ((Disparo.veruno && Disparo.verdos && Disparo.vertres && Disparo.vercuatro && Disparo.vercinco && Disparo.verseis
                && Disparo.versiete && Disparo.verocho)) {
            if (Configuracion.velo == 0) {
                this.rapidez = 53;
                Juego.velocidadjuego.setText("1.5");
            }
            if (Configuracion.velo == 1) {
                this.rapidez = 40;
                Juego.velocidadjuego.setText("3");
            }

        }
        if ((Disparo.rosauno && Disparo.rosados && Disparo.rosatres && Disparo.rosacuatro && Disparo.rosacinco && Disparo.rosaseis
                && Disparo.rosasiete && Disparo.rosaocho && Disparo.rosadouno && Disparo.rosadodos && Disparo.rosadotres
                && Disparo.rosadocuatro && Disparo.rosadocinco && Disparo.rosadoseis
                && Disparo.rosadosiete && Disparo.rosadoocho)) {

            if (Configuracion.velo == 0) {
                Juego.velocidadjuego.setText("2");
            }
            if (Configuracion.velo == 1) {
                Juego.velocidadjuego.setText("4");
            }
        }
    }
}
