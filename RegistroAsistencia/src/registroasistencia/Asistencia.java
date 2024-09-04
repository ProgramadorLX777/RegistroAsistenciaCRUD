package registroasistencia;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Asistencia extends javax.swing.JFrame {

    private DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Asistencia() {
        initComponents();
        this.setTitle("Marcar Asistencia");
        setLocationRelativeTo(null);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_hora_actual.setText(formateador.format(LocalDateTime.now()));
            }
        });

        timer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        panel_menu_principal = new javax.swing.JPanel();
        panel_cuerpo_menu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_volver_menu_marcaje = new javax.swing.JButton();
        panel_entrada = new javax.swing.JPanel();
        btn_marcar_entrada = new javax.swing.JButton();
        lbl_mensaje_entrada = new javax.swing.JLabel();
        panel_salida = new javax.swing.JPanel();
        lbl_mensaje_salida = new javax.swing.JLabel();
        btn_marcar_salida = new javax.swing.JButton();
        lbl_hora_actual = new javax.swing.JFormattedTextField();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_menu_principal.setBackground(new java.awt.Color(204, 102, 0));

        panel_cuerpo_menu.setBackground(new java.awt.Color(0, 102, 153));
        panel_cuerpo_menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Marcar Asistencia");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Para marcar asistencia debe presionar el botón correspondiente: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("- Presionar Botón Verde");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("- Presionar Botón Rojo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("para marcar Entrada");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("para marcar Salida");

        btn_volver_menu_marcaje.setBackground(new java.awt.Color(204, 102, 0));
        btn_volver_menu_marcaje.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_volver_menu_marcaje.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver_menu_marcaje.setText("VOLVER A MENÚ");
        btn_volver_menu_marcaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btn_volver_menu_marcaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_menu_marcajeActionPerformed(evt);
            }
        });

        panel_entrada.setBackground(new java.awt.Color(0, 102, 153));

        btn_marcar_entrada.setBackground(new java.awt.Color(0, 153, 0));
        btn_marcar_entrada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_marcar_entrada.setForeground(new java.awt.Color(255, 255, 255));
        btn_marcar_entrada.setText("ENTRADA");
        btn_marcar_entrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btn_marcar_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marcar_entradaActionPerformed(evt);
            }
        });

        lbl_mensaje_entrada.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbl_mensaje_entrada.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mensaje_entrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mensaje_entrada.setText("--");

        javax.swing.GroupLayout panel_entradaLayout = new javax.swing.GroupLayout(panel_entrada);
        panel_entrada.setLayout(panel_entradaLayout);
        panel_entradaLayout.setHorizontalGroup(
            panel_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_entradaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_mensaje_entrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_entradaLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(btn_marcar_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panel_entradaLayout.setVerticalGroup(
            panel_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_entradaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_marcar_entrada)
                .addGap(18, 18, 18)
                .addComponent(lbl_mensaje_entrada)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panel_salida.setBackground(new java.awt.Color(0, 102, 153));

        lbl_mensaje_salida.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbl_mensaje_salida.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mensaje_salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mensaje_salida.setText("--");

        btn_marcar_salida.setBackground(new java.awt.Color(204, 0, 0));
        btn_marcar_salida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_marcar_salida.setForeground(new java.awt.Color(255, 255, 255));
        btn_marcar_salida.setText("SALIDA");
        btn_marcar_salida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btn_marcar_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marcar_salidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_salidaLayout = new javax.swing.GroupLayout(panel_salida);
        panel_salida.setLayout(panel_salidaLayout);
        panel_salidaLayout.setHorizontalGroup(
            panel_salidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_mensaje_salida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_salidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_marcar_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        panel_salidaLayout.setVerticalGroup(
            panel_salidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_marcar_salida)
                .addGap(18, 18, 18)
                .addComponent(lbl_mensaje_salida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_hora_actual.setBackground(new java.awt.Color(0, 102, 153));
        lbl_hora_actual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        lbl_hora_actual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hora_actual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        lbl_hora_actual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbl_hora_actual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout panel_cuerpo_menuLayout = new javax.swing.GroupLayout(panel_cuerpo_menu);
        panel_cuerpo_menu.setLayout(panel_cuerpo_menuLayout);
        panel_cuerpo_menuLayout.setHorizontalGroup(
            panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_hora_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btn_volver_menu_marcaje, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(panel_salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)))
                .addGap(56, 56, 56))
        );
        panel_cuerpo_menuLayout.setVerticalGroup(
            panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6))
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_hora_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_volver_menu_marcaje, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_menu_principalLayout = new javax.swing.GroupLayout(panel_menu_principal);
        panel_menu_principal.setLayout(panel_menu_principalLayout);
        panel_menu_principalLayout.setHorizontalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_cuerpo_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_menu_principalLayout.setVerticalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_cuerpo_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_menu_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_menu_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volver_menu_marcajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_menu_marcajeActionPerformed
        Menu oMenu;
        try {
            oMenu = new Menu();
            oMenu.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btn_volver_menu_marcajeActionPerformed

    private void btn_marcar_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marcar_entradaActionPerformed
        lbl_mensaje_entrada.setText("¡¡Entrada marcada!!");

    }//GEN-LAST:event_btn_marcar_entradaActionPerformed

    private void btn_marcar_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marcar_salidaActionPerformed
        lbl_mensaje_salida.setText("¡¡Salida marcada!!");

    }//GEN-LAST:event_btn_marcar_salidaActionPerformed

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
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_marcar_entrada;
    private javax.swing.JButton btn_marcar_salida;
    private javax.swing.JButton btn_volver_menu_marcaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField lbl_hora_actual;
    private javax.swing.JLabel lbl_mensaje_entrada;
    private javax.swing.JLabel lbl_mensaje_salida;
    private javax.swing.JPanel panel_cuerpo_menu;
    private javax.swing.JPanel panel_entrada;
    private javax.swing.JPanel panel_menu_principal;
    private javax.swing.JPanel panel_salida;
    // End of variables declaration//GEN-END:variables
}
