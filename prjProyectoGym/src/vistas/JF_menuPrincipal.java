/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import prjproyectogym.clsCliente;
import prjproyectogym.clsMenu;


/**
 *
 * @author Derek
 */
public class JF_menuPrincipal extends javax.swing.JFrame {

    clsMenu clsM = new clsMenu();

    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(730, 400, width, height);
    }

    /**
     * Creates new form JF_menuPrincipal
     */
    public JF_menuPrincipal() {
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
        png_empleado = new javax.swing.JLabel();
        png_cliente = new javax.swing.JLabel();
        ong_gym = new javax.swing.JLabel();
        jbl_empleados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_salir_JF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        png_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        png_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                png_empleadoMouseClicked(evt);
            }
        });
        jPanel1.add(png_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        png_cliente.setForeground(new java.awt.Color(255, 255, 255));
        png_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ejercicio.png"))); // NOI18N
        png_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                png_clienteMouseClicked(evt);
            }
        });
        jPanel1.add(png_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        ong_gym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gym32.png"))); // NOI18N
        jPanel1.add(ong_gym, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jbl_empleados.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jbl_empleados.setForeground(new java.awt.Color(0, 0, 0));
        jbl_empleados.setText("  EMPLEADOS ");
        jPanel1.add(jbl_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" CLIENTES ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("QUE DESEA GESTIONAR?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CERRAR SESION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        btn_salir_JF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btn_salir_JF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salir_JFMouseClicked(evt);
            }
        });
        jPanel1.add(btn_salir_JF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salir_JFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_JFMouseClicked
        // TODO add your handling code here:
        dispose();
        JF_inicioSesion JFIS = new JF_inicioSesion();
        JFIS.setVisible(true);
    }//GEN-LAST:event_btn_salir_JFMouseClicked

    private void png_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_png_clienteMouseClicked
        // TODO add your handling code here:
        String opcion = "A";
        dispose();
        clsM.menuPrincipal(opcion);
    }//GEN-LAST:event_png_clienteMouseClicked

    private void png_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_png_empleadoMouseClicked
        // TODO add your handling code here:
        String opcion = "B";
        dispose();
        clsM.menuPrincipal(opcion);
    }//GEN-LAST:event_png_empleadoMouseClicked

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
            java.util.logging.Logger.getLogger(JF_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_salir_JF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbl_empleados;
    private javax.swing.JLabel ong_gym;
    private javax.swing.JLabel png_cliente;
    private javax.swing.JLabel png_empleado;
    // End of variables declaration//GEN-END:variables
}
