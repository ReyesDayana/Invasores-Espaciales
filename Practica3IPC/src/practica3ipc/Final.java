
package practica3ipc;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Final extends javax.swing.JFrame {

    String[][] jugador;

    public Final() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        puntoos = new javax.swing.JLabel();
        razon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fin del juego");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Good Times", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SE TERMINÓ EL JUEGO ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PUNTUACIÓN:");

        guardar.setForeground(new java.awt.Color(0, 0, 0));
        guardar.setText("Guardar y regresar al inicio");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/extra azul.png"))); // NOI18N

        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        puntoos.setFont(new java.awt.Font("Good Times", 2, 18)); // NOI18N
        puntoos.setForeground(new java.awt.Color(255, 255, 255));

        razon.setFont(new java.awt.Font("Good Times", 2, 14)); // NOI18N
        razon.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(guardar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(75, 75, 75)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(73, 73, 73)
                                .addComponent(puntoos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(razon, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(razon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(puntoos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(Salir))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
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
        Configuracion.velo = 0;
        Practica3IPC.puntos = 0;
        Juego.puntos.setText("" + Practica3IPC.puntos);
        Practica3IPC.jugadores++;
        jugador = new String[1][2];
        jugador[0][0] = nombre.getText();
        jugador[0][1] = puntoos.getText();
        Practica3IPC.nombrejugadores[Practica3IPC.jugadores - 1][0] = jugador[0][0];
        Practica3IPC.nombrejugadores[Practica3IPC.jugadores - 1][1] = jugador[0][1];
        if (Practica3IPC.jugadores == 50) {
            Practica3IPC.jugadores = 49;
        }
        this.setVisible(false);
        Principal inicio = new Principal();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        imagenes();
        conteo();
        ver();
    }//GEN-LAST:event_guardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField nombre;
    public static javax.swing.JLabel puntoos;
    public static javax.swing.JLabel razon;
    // End of variables declaration//GEN-END:variables
 public void imagenes() {
     Tiempo.tiempocongelar=0;
        Tiempo.tiempocontador=0;
        Pausa.pausamastiempo=false;
        Pausa.pausamenostiempo=false;
        Pausa.pausamaspuntos=false;
        Pausa.pausamenospuntos=false;
        Pausa.pausamenospuntos=false;
        Pausa.pausamasvelocidad=false;
        Pausa.pausamenosvelocidad=false;
        Principal.mastiempo.labeltiempo.setVisible(false);
        Principal.menostiempo.labeltiempo.setVisible(false);
        Principal.menospuntos.labelpuntos.setVisible(false);
        Principal.maspuntos.labelpuntos.setVisible(false);
        Principal.tiempodejuego = "hola";
        Juego.Nave.setLocation(12, 347);
        ImageIcon nose = new ImageIcon(getClass().getResource("/Imagenes/verdeoficial.png"));
        ImageIcon imagene = new ImageIcon(nose.getImage().getScaledInstance(Juego.Otro.getWidth(), Juego.Otro.getHeight(), Image.SCALE_DEFAULT));
        Juego.Otro.setIcon(imagene);
        Juego.Verde2.setIcon(imagene);
        Juego.Verde3.setIcon(imagene);
        Juego.Verde4.setIcon(imagene);
        Juego.Verde5.setIcon(imagene);
        Juego.Verde6.setIcon(imagene);
        Juego.Verde7.setIcon(imagene);
        Juego.Verde8.setIcon(imagene);
        Juego.Otro.setBounds(613, 85, 52, 54);
        Juego.Verde2.setBounds(613, 155, 52, 54);
        Juego.Verde3.setBounds(613, 221, 52, 54);
        Juego.Verde4.setBounds(613, 287, 52, 54);
        Juego.Verde5.setBounds(613, 347, 52, 54);
        Juego.Verde6.setBounds(613, 427, 52, 54);
        Juego.Verde7.setBounds(613, 493, 52, 54);
        Juego.Verde8.setBounds(613, 559, 52, 54);
        Juego.Otro.setVisible(true);
        Juego.Verde2.setVisible(true);
        Juego.Verde3.setVisible(true);
        Juego.Verde4.setVisible(true);
        Juego.Verde5.setVisible(true);
        Juego.Verde6.setVisible(true);
        Juego.Verde7.setVisible(true);
        Juego.Verde8.setVisible(true);
        ImageIcon extrarosa = new ImageIcon(getClass().getResource("/Imagenes/rosa.png"));
        ImageIcon rosado = new ImageIcon(extrarosa.getImage().getScaledInstance(Juego.rosa1.getWidth(), Juego.rosa1.getHeight(), Image.SCALE_DEFAULT));
        Juego.rosa1.setIcon(rosado);
        Juego.rosa2.setIcon(rosado);
        Juego.rosa3.setIcon(rosado);
        Juego.rosa4.setIcon(rosado);
        Juego.rosa5.setIcon(rosado);
        Juego.rosa6.setIcon(rosado);
        Juego.rosa7.setIcon(rosado);
        Juego.rosa8.setIcon(rosado);
        Juego.rosa1.setBounds(689, 85, 52, 54);
        Juego.rosa2.setBounds(689, 155, 52, 54);
        Juego.rosa3.setBounds(689, 221, 52, 54);
        Juego.rosa4.setBounds(689, 287, 52, 54);
        Juego.rosa5.setBounds(689, 347, 52, 54);
        Juego.rosa6.setBounds(689, 427, 52, 54);
        Juego.rosa7.setBounds(689, 493, 52, 54);
        Juego.rosa8.setBounds(689, 559, 52, 54);
        Juego.rosa1.setVisible(true);
        Juego.rosa2.setVisible(true);
        Juego.rosa3.setVisible(true);
        Juego.rosa4.setVisible(true);
        Juego.rosa5.setVisible(true);
        Juego.rosa6.setVisible(true);
        Juego.rosa7.setVisible(true);
        Juego.rosa8.setVisible(true);
        Juego.rosado1.setIcon(rosado);
        Juego.rosado2.setIcon(rosado);
        Juego.rosado3.setIcon(rosado);
        Juego.rosado4.setIcon(rosado);
        Juego.rosado5.setIcon(rosado);
        Juego.rosado6.setIcon(rosado);
        Juego.rosado7.setIcon(rosado);
        Juego.rosado8.setIcon(rosado);
        Juego.rosado1.setBounds(753, 85, 52, 54);
        Juego.rosado2.setBounds(753, 155, 52, 54);
        Juego.rosado3.setBounds(753, 221, 52, 54);
        Juego.rosado4.setBounds(753, 287, 52, 54);
        Juego.rosado5.setBounds(753, 347, 52, 54);
        Juego.rosado6.setBounds(753, 427, 52, 54);
        Juego.rosado7.setBounds(753, 493, 52, 54);
        Juego.rosado8.setBounds(753, 559, 52, 54);
        Juego.rosado1.setVisible(true);
        Juego.rosado2.setVisible(true);
        Juego.rosado3.setVisible(true);
        Juego.rosado4.setVisible(true);
        Juego.rosado5.setVisible(true);
        Juego.rosado6.setVisible(true);
        Juego.rosado7.setVisible(true);
        Juego.rosado8.setVisible(true);
        ImageIcon extrarojo = new ImageIcon(getClass().getResource("/Imagenes/rojo.png"));
        ImageIcon rojo = new ImageIcon(extrarojo.getImage().getScaledInstance(Juego.rosa1.getWidth(), Juego.rosa1.getHeight(), Image.SCALE_DEFAULT));
        Juego.roj1.setIcon(rojo);
        Juego.roj2.setIcon(rojo);
        Juego.roj3.setIcon(rojo);
        Juego.roj4.setIcon(rojo);
        Juego.roj5.setIcon(rojo);
        Juego.roj6.setIcon(rojo);
        Juego.roj7.setIcon(rojo);
        Juego.roj8.setIcon(rojo);
        Juego.roj1.setBounds(823, 85, 52, 54);
        Juego.roj2.setBounds(823, 155, 52, 54);
        Juego.roj3.setBounds(823, 221, 52, 54);
        Juego.roj4.setBounds(823, 287, 52, 54);
        Juego.roj5.setBounds(823, 347, 52, 54);
        Juego.roj6.setBounds(823, 427, 52, 54);
        Juego.roj7.setBounds(823, 493, 52, 54);
        Juego.roj8.setBounds(823, 559, 52, 54);
        Juego.roj1.setVisible(true);
        Juego.roj2.setVisible(true);
        Juego.roj3.setVisible(true);
        Juego.roj4.setVisible(true);
        Juego.roj5.setVisible(true);
        Juego.roj6.setVisible(true);
        Juego.roj7.setVisible(true);
        Juego.roj8.setVisible(true);
        Juego.rojo1.setIcon(rojo);
        Juego.rojo2.setIcon(rojo);
        Juego.rojo3.setIcon(rojo);
        Juego.rojo4.setIcon(rojo);
        Juego.rojo5.setIcon(rojo);
        Juego.rojo6.setIcon(rojo);
        Juego.rojo7.setIcon(rojo);
        Juego.rojo8.setIcon(rojo);
        Juego.rojo1.setBounds(905, 85, 52, 54);
        Juego.rojo2.setBounds(905, 155, 52, 54);
        Juego.rojo3.setBounds(905, 221, 52, 54);
        Juego.rojo4.setBounds(905, 287, 52, 54);
        Juego.rojo5.setBounds(905, 347, 52, 54);
        Juego.rojo6.setBounds(905, 427, 52, 54);
        Juego.rojo7.setBounds(905, 493, 52, 54);
        Juego.rojo8.setBounds(905, 559, 52, 54);
        Juego.rojo1.setVisible(true);
        Juego.rojo2.setVisible(true);
        Juego.rojo3.setVisible(true);
        Juego.rojo4.setVisible(true);
        Juego.rojo5.setVisible(true);
        Juego.rojo6.setVisible(true);
        Juego.rojo7.setVisible(true);
        Juego.rojo8.setVisible(true);

    }

    public void conteo() {
        Juego.conteoverde8 = 0;
        Juego.conteoverde7 = 0;
        Juego.conteoverde6 = 0;
        Juego.conteoverde5 = 0;
        Juego.conteoverde4 = 0;
        Juego.conteoverde3 = 0;
        Juego.conteoverde2 = 0;
        Juego.conteoverde1 = 0;
        Juego.conteorosa8 = 0;
        Juego.conteorosa7 = 0;
        Juego.conteorosa6 = 0;
        Juego.conteorosa5 = 0;
        Juego.conteorosa4 = 0;
        Juego.conteorosa3 = 0;
        Juego.conteorosa2 = 0;
        Juego.conteorosa1 = 0;
        Juego.conteorosado8 = 0;
        Juego.conteorosado7 = 0;
        Juego.conteorosado6 = 0;
        Juego.conteorosado5 = 0;
        Juego.conteorosado4 = 0;
        Juego.conteorosado3 = 0;
        Juego.conteorosado2 = 0;
        Juego.conteorosado1 = 0;
        Juego.conteoroj8 = 0;
        Juego.conteoroj7 = 0;
        Juego.conteoroj6 = 0;
        Juego.conteoroj5 = 0;
        Juego.conteoroj4 = 0;
        Juego.conteoroj3 = 0;
        Juego.conteoroj2 = 0;
        Juego.conteoroj1 = 0;
        Juego.conteorojo8 = 0;
        Juego.conteorojo7 = 0;
        Juego.conteorojo6 = 0;
        Juego.conteorojo5 = 0;
        Juego.conteorojo4 = 0;
        Juego.conteorojo3 = 0;
        Juego.conteorojo2 = 0;
        Juego.conteorojo1 = 0;
    }

    public void ver() {
        Disparo.verocho = false;
        Disparo.versiete = false;
        Disparo.verseis = false;
        Disparo.vercinco = false;
        Disparo.vercuatro = false;
        Disparo.vertres = false;
        Disparo.verdos = false;
        Disparo.veruno = false;
        Disparo.rosauno = false;
        Disparo.rosados = false;
        Disparo.rosatres = false;
        Disparo.rosacuatro = false;
        Disparo.rosacinco = false;
        Disparo.rosaseis = false;
        Disparo.rosasiete = false;
        Disparo.rosaocho = false;
        Disparo.rosadouno = false;
        Disparo.rosadodos = false;
        Disparo.rosadotres = false;
        Disparo.rosadocuatro = false;
        Disparo.rosadocinco = false;
        Disparo.rosadoseis = false;
        Disparo.rosadosiete = false;
        Disparo.rosadoocho = false;
        Disparo.rojuno = false;
        Disparo.rojdos = false;
        Disparo.rojtres = false;
        Disparo.rojcuatro = false;
        Disparo.rojcinco = false;
        Disparo.rojseis = false;
        Disparo.rojsiete = false;
        Disparo.rojocho = false;
        Disparo.rojouno = false;
        Disparo.rojodos = false;
        Disparo.rojotres = false;
        Disparo.rojocuatro = false;
        Disparo.rojocinco = false;
        Disparo.rojoseis = false;
        Disparo.rojosiete = false;
        Disparo.rojoocho = false;
    }
}
