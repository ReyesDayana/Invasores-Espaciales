package practica3ipc;

import java.util.Scanner;

/**
 *
 * @author dayan
 */
public class Practica3IPC {

    static Scanner entrada = new Scanner(System.in);
    static int intervalo;
    static int minutos;
    static int jugadores;
    static String[] []nombrejugadores=new String [50][2];
    static int segundos;
    static int puntos;
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }
   
}
