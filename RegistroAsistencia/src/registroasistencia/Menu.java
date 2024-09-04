package registroasistencia;

import com.sun.tools.javac.Main;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    DefaultTableModel oModelProveedor = new DefaultTableModel();

    public Menu() {
        initComponents();
        this.setTitle("Menú Principal");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu_principal = new javax.swing.JPanel();
        panel_cabecera_menu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_cuerpo_menu = new javax.swing.JPanel();
        btn_marcar_asistencia = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_reporte_inasistencias = new javax.swing.JButton();
        btn_reporte_mensual = new javax.swing.JButton();
        btn_crear_usuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_menu_principal.setBackground(new java.awt.Color(204, 102, 0));

        panel_cabecera_menu.setBackground(new java.awt.Color(0, 102, 153));
        panel_cabecera_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true), "Registro Asistencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido al Registro de Asistencia");

        javax.swing.GroupLayout panel_cabecera_menuLayout = new javax.swing.GroupLayout(panel_cabecera_menu);
        panel_cabecera_menu.setLayout(panel_cabecera_menuLayout);
        panel_cabecera_menuLayout.setHorizontalGroup(
            panel_cabecera_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cabecera_menuLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_cabecera_menuLayout.setVerticalGroup(
            panel_cabecera_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cabecera_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_cuerpo_menu.setBackground(new java.awt.Color(0, 102, 153));
        panel_cuerpo_menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        btn_marcar_asistencia.setBackground(new java.awt.Color(0, 102, 204));
        btn_marcar_asistencia.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_marcar_asistencia.setForeground(new java.awt.Color(255, 255, 255));
        btn_marcar_asistencia.setText("Marcar Asistencia");
        btn_marcar_asistencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btn_marcar_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marcar_asistenciaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("¿Qué desea hacer hoy?");

        btn_reporte_inasistencias.setBackground(new java.awt.Color(0, 102, 204));
        btn_reporte_inasistencias.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_reporte_inasistencias.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte_inasistencias.setText("Obtener reporte inasistencias");
        btn_reporte_inasistencias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        btn_reporte_mensual.setBackground(new java.awt.Color(0, 102, 204));
        btn_reporte_mensual.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_reporte_mensual.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte_mensual.setText("Obtener reporte mensual");
        btn_reporte_mensual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        btn_crear_usuarios.setBackground(new java.awt.Color(0, 102, 204));
        btn_crear_usuarios.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_crear_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_usuarios.setText("Crear Usuarios");
        btn_crear_usuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btn_crear_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_usuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_cuerpo_menuLayout = new javax.swing.GroupLayout(panel_cuerpo_menu);
        panel_cuerpo_menu.setLayout(panel_cuerpo_menuLayout);
        panel_cuerpo_menuLayout.setHorizontalGroup(
            panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cuerpo_menuLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reporte_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cuerpo_menuLayout.createSequentialGroup()
                        .addComponent(btn_marcar_asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGap(27, 27, 27)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reporte_inasistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btn_crear_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
            .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_cuerpo_menuLayout.setVerticalGroup(
            panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cuerpo_menuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addGap(76, 76, 76)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_marcar_asistencia)
                    .addComponent(btn_crear_usuarios))
                .addGap(36, 36, 36)
                .addGroup(panel_cuerpo_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reporte_mensual)
                    .addComponent(btn_reporte_inasistencias))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_menu_principalLayout = new javax.swing.GroupLayout(panel_menu_principal);
        panel_menu_principal.setLayout(panel_menu_principalLayout);
        panel_menu_principalLayout.setHorizontalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_principalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_cabecera_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_cuerpo_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_menu_principalLayout.setVerticalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_principalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panel_cabecera_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_cuerpo_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void btn_crear_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_usuariosActionPerformed
        Usuarios oUsuarios = null;
        try {
            oUsuarios = new Usuarios();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oUsuarios.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_crear_usuariosActionPerformed

    private void btn_marcar_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marcar_asistenciaActionPerformed
        Asistencia oAsistencia;
        try {
            oAsistencia = new Asistencia();
            oAsistencia.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btn_marcar_asistenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear_usuarios;
    private javax.swing.JButton btn_marcar_asistencia;
    private javax.swing.JButton btn_reporte_inasistencias;
    private javax.swing.JButton btn_reporte_mensual;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel_cabecera_menu;
    private javax.swing.JPanel panel_cuerpo_menu;
    private javax.swing.JPanel panel_menu_principal;
    // End of variables declaration//GEN-END:variables
}
