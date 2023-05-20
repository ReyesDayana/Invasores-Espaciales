package practica3ipc;

import java.awt.Rectangle;

public class Tiempo extends Thread {

    static int tiempocontador = 0;
    static int tiempocongelar = 0;
    int contadormastiempo = 5;
    int contadormenostiempo = 7;
    int contadormenospuntos = 2;
    int contadormaspuntos = 8;
    int contadormasvelocidad = 12;
    int contadormenosvelocidad = 10;
    Rectangle mastiempo = Juego.mastiempoo.getBounds();
    Rectangle menostiempo = Juego.menostiempo.getBounds();
    Rectangle maspuntos = Juego.maspuntos.getBounds();
    Rectangle menospuntos = Juego.menospuntos.getBounds();
    Rectangle masveloz = Juego.masvelocidad.getBounds();
    Rectangle para = Juego.congelarl.getBounds();
    static int contadorsegundos;
    static int contadorminutos;
    private int intervalo;
    private int minutos;
    private int segundos;
    boolean parar = true;

    public Tiempo(int intervalo, int minutos, int segundos) {
        this.intervalo = intervalo;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void run() {
        try {
            contadorminutos = minutos;
            contadorsegundos = segundos;
            while (parar) {
                String min = String.valueOf(Tiempo.contadorminutos);
                String sec = String.valueOf(Tiempo.contadorsegundos);
                Juego.Tiempo.setText(min + ":" + sec);

                sleep(intervalo);

                if (contadorsegundos == 0 && contadorminutos != 0) {
                    contadorsegundos = 60;
                    contadorminutos--;
                }
                if (contadorminutos == 0) {
                    if (contadorsegundos == 0) {
                        Final fin = new Final();
                        fin.setVisible(true);
                        fin.setLocationRelativeTo(null);
                        Principal.juego.setVisible(false);
                        Final.razon.setText("Se te acabo el tiempo");
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
                        parar = false;

                    }
                }

                if (contadormastiempo == 0 && Configuracion.tiempomas) {
                    Principal.mastiempo = new Mastiempo(mastiempo, Principal.juego);
                    Principal.mastiempo.start();
                    Pausa.pausamastiempo = true;
                    if (Configuracion.frecuencia == 0) {
                        contadormastiempo = 30;
                    }
                    if (Configuracion.frecuencia == 1) {
                        contadormastiempo = 20;
                    }
                    if (Configuracion.frecuencia == 2) {
                        contadormastiempo = 10;
                    }
                }
                if (contadormenostiempo == 0 && Configuracion.tiempomenos) {
                    Principal.menostiempo = new Menostiempo(menostiempo, Principal.juego);
                    Principal.menostiempo.start();
                    Pausa.pausamenostiempo = true;
                    if (Configuracion.frecuencia == 0) {
                        contadormenostiempo = 32;
                    }
                    if (Configuracion.frecuencia == 1) {
                        contadormenostiempo = 36;
                    }
                    if (Configuracion.frecuencia == 2) {
                        contadormenostiempo = 8;
                    }
                }
                if (contadormaspuntos == 0 && Configuracion.puntosmas) {
                    Principal.maspuntos = new Maspuntos(maspuntos, Principal.juego);
                    Principal.maspuntos.start();
                    Pausa.pausamaspuntos = true;
                    if (Configuracion.frecuencia == 0) {
                        contadormaspuntos = 32;
                    }
                    if (Configuracion.frecuencia == 1) {
                        contadormaspuntos = 32;
                    }
                    if (Configuracion.frecuencia == 2) {
                        contadormaspuntos = 8;
                    }
                }
                if (contadormenospuntos == 0 && Configuracion.puntosmenos) {
                    Principal.menospuntos = new Menospuntos(menospuntos, Principal.juego);
                    Principal.menospuntos.start();
                    Pausa.pausamenospuntos = true;
                    if (Configuracion.frecuencia == 0) {
                        contadormenospuntos = 32;
                    }
                    if (Configuracion.frecuencia == 1) {
                        contadormenospuntos = 28;
                    }
                    if (Configuracion.frecuencia == 2) {
                        contadormenospuntos = 8;
                    }
                }

                if (contadormasvelocidad == 0 && Configuracion.velocidadmas) {
                    Principal.masvelocidaad = new Masvelocidad(masveloz, Principal.juego);
                    Principal.masvelocidaad.start();
                    tiempocontador = -5;
                    Pausa.pausamasvelocidad = true;
                    if (Configuracion.frecuencia == 0) {
                        contadormasvelocidad = 32;
                    }
                    if (Configuracion.frecuencia == 1) {
                        contadormasvelocidad = 28;
                    }
                    if (Configuracion.frecuencia == 2) {
                        contadormasvelocidad = 8;
                    }
                }
                if (contadormenosvelocidad == 0 && Configuracion.velocidadmenos) {
                    Principal.congelar = new Congelar(para, Principal.juego);
                    Principal.congelar.start();
                    tiempocontador = 0;
                    Pausa.pausamenosvelocidad = true;
                    if (Configuracion.frecuencia == 0) {
                        contadormenosvelocidad = 42;
                    }
                    if (Configuracion.frecuencia == 1) {
                        contadormenosvelocidad = 35;
                    }
                    if (Configuracion.frecuencia == 2) {
                        contadormenosvelocidad = 10;
                    }
                }
                tiempocontador++;
                tiempocongelar++;
                contadorsegundos--;
                contadormastiempo--;
                contadormenostiempo--;
                contadormaspuntos--;
                contadormenospuntos--;
                contadormasvelocidad--;
                contadormenosvelocidad--;
                Juego.Tiempo.repaint();
            }
            stop();
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }

    public int getContadorsegundos() {
        return contadorsegundos;
    }

    /**
     * @param contadorsegundos the contadorsegundos to set
     */
    public void setContadorsegundos(int contadorsegundos) {
        this.contadorsegundos = contadorsegundos;
    }

    /**
     * @return the contadorminutos
     */
    public int getContadorminutos() {
        return contadorminutos;
    }

    /**
     * @param contadorminutos the contadorminutos to set
     */
    public void setContadorminutos(int contadorminutos) {
        this.contadorminutos = contadorminutos;
    }

    /**
     * @return the intervalo
     */
    public int getIntervalo() {
        return intervalo;
    }

    /**
     * @param intervalo the intervalo to set
     */
    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
