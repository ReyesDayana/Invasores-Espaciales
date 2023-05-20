/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3ipc;

/**
 *
 * @author dayan
 */
public class Configuracion extends javax.swing.JFrame {

    static String tiempo = "hola";
    static int velo;
    static boolean tiempomas = true;
    static boolean tiempomenos = true;
    static boolean puntosmas = true;
    static boolean puntosmenos = true;
    static boolean velocidadmas = true;
    static boolean velocidadmenos = true;
    static int frecuencia=1;
    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
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
        aumentotiempo = new javax.swing.JRadioButton();
        puntosextra = new javax.swing.JRadioButton();
        aumentovelocidad = new javax.swing.JRadioButton();
        disminuciontiempo = new javax.swing.JRadioButton();
        congelacion = new javax.swing.JRadioButton();
        penalizacion = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        velocidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        TiempodeJuego = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        frecuen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Good Times", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONFIGURACIÓN");

        aumentotiempo.setBackground(new java.awt.Color(0, 0, 0));
        aumentotiempo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        aumentotiempo.setForeground(new java.awt.Color(255, 255, 255));
        aumentotiempo.setText("Aumento de tiempo");

        puntosextra.setBackground(new java.awt.Color(0, 0, 0));
        puntosextra.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        puntosextra.setForeground(new java.awt.Color(255, 255, 255));
        puntosextra.setText("Puntos Extra");

        aumentovelocidad.setBackground(new java.awt.Color(0, 0, 0));
        aumentovelocidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        aumentovelocidad.setForeground(new java.awt.Color(255, 255, 255));
        aumentovelocidad.setText("Aumento de Velocidad");
        aumentovelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentovelocidadActionPerformed(evt);
            }
        });

        disminuciontiempo.setBackground(new java.awt.Color(0, 0, 0));
        disminuciontiempo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        disminuciontiempo.setForeground(new java.awt.Color(255, 255, 255));
        disminuciontiempo.setText("Disminución de Tiempo");

        congelacion.setBackground(new java.awt.Color(0, 0, 0));
        congelacion.setForeground(new java.awt.Color(255, 255, 255));
        congelacion.setText("Congelación");

        penalizacion.setBackground(new java.awt.Color(0, 0, 0));
        penalizacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        penalizacion.setForeground(new java.awt.Color(255, 255, 255));
        penalizacion.setText("Penalización");

        jLabel2.setFont(new java.awt.Font("Good Times", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Velocidad");

        jLabel3.setFont(new java.awt.Font("Good Times", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Items");

        velocidad.setForeground(new java.awt.Color(0, 0, 0));
        velocidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Rápido" }));

        jLabel4.setFont(new java.awt.Font("Good Times", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiempo");

        TiempodeJuego.setBackground(new java.awt.Color(255, 255, 255));
        TiempodeJuego.setForeground(new java.awt.Color(0, 0, 0));
        TiempodeJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempodeJuegoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Segundos");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        frecuen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poco Frecuente", "Normal", "Muy Frecuente" }));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Frecuencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puntosextra)
                    .addComponent(aumentovelocidad)
                    .addComponent(disminuciontiempo)
                    .addComponent(penalizacion)
                    .addComponent(aumentotiempo)
                    .addComponent(jLabel3)
                    .addComponent(congelacion)
                    .addComponent(frecuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TiempodeJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)))))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aumentotiempo)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puntosextra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aumentovelocidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disminuciontiempo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(penalizacion))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(TiempodeJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(congelacion)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frecuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Regresar))
                        .addGap(17, 17, 17))))
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

    private void aumentovelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentovelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aumentovelocidadActionPerformed

    private void TiempodeJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempodeJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempodeJuegoActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_RegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tiempo = TiempodeJuego.getText();
        tiempomas = false;
        tiempomenos = false;
        puntosmas = false;
        puntosmenos = false;
        velocidadmas = false;
        velocidadmenos = false;
        if (tiempo.equals("")) {
            tiempo = "hola";
        }
        velo = velocidad.getSelectedIndex();
        if (aumentotiempo.isSelected()) {
            tiempomas = true;
            
        }
        if (puntosextra.isSelected()) {
            puntosmas = true;
            
        }
        if (aumentovelocidad.isSelected()) {
            velocidadmas = true;
            
        }
        if (disminuciontiempo.isSelected()) {
            tiempomenos = true;
            
        }
        if (penalizacion.isSelected()) {
            puntosmenos = true;
            
        }
        if (congelacion.isSelected()) {
            velocidadmenos = true;
            
        }
        frecuencia=frecuen.getSelectedIndex();
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    public static javax.swing.JTextField TiempodeJuego;
    public static javax.swing.JRadioButton aumentotiempo;
    public static javax.swing.JRadioButton aumentovelocidad;
    public static javax.swing.JRadioButton congelacion;
    public static javax.swing.JRadioButton disminuciontiempo;
    public static javax.swing.JComboBox<String> frecuen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton penalizacion;
    public static javax.swing.JRadioButton puntosextra;
    public static javax.swing.JComboBox<String> velocidad;
    // End of variables declaration//GEN-END:variables

}
