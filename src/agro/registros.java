/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agro;

import Modelo.SqlUsuarios;
import Modelo.combotipousuario;
import Modelo.usuarios;
import Modelo.hash;
import javax.swing.JOptionPane;

/**
 *
 * @author Envy
 */
public class registros extends javax.swing.JFrame {
      Conexion conn = new Conexion();
    /**
     * Creates new form registros
     */
    public registros() {
        initComponents();
        combotipousuario cat = new combotipousuario();
        cat.llenar_combo(cbousuario);
        this.setTitle("Registro Usuarios");
        this.setLocationRelativeTo(null);

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
        lblusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblcontraseña = new javax.swing.JLabel();
        lblusuario2 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        txtconfirmacontraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbousuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblusuario.setText("Usuario: ");

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        lblcontraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcontraseña.setText("Contraseña: ");

        lblusuario2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblusuario2.setText("<html>Confirmar Contraseña:</html>");
        lblusuario2.setToolTipText("");

        txtcontraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtconfirmacontraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Correo:");

        btnregistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        txtapellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo_Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnregistrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontraseña)
                            .addComponent(lblusuario)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblusuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtconfirmacontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblcontraseña)
                        .addGap(12, 12, 12)
                        .addComponent(lblusuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtconfirmacontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnregistrar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Boton de Registro de Usuarios
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

        SqlUsuarios modsql = new SqlUsuarios();
        usuarios mod = new usuarios();

        String pass = new String(txtcontraseña.getPassword());
        String passCon = new String(txtconfirmacontraseña.getPassword());
        //if valida campos
        if (txtusuario.getText().equals("") || pass.equals("")
                || passCon.equals("") || txtnombre.getText().equals("") || txtapellido.getText().equals("")
                || txtcorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden quedar vacios");
        } else {

            //valida contraseña son iguales
            if (pass.equals(passCon)) {

                // if valida existe usuario 
                if (modsql.existeusuario(txtusuario.getText()) == 0) {

                    if (modsql.esEmail(txtcorreo.getText())) {

                        String nuevopass = hash.sha1(pass);

                        mod.setUsuario(txtusuario.getText().toUpperCase());
                        mod.setClave(nuevopass);
                        mod.setNombre(txtnombre.getText().toUpperCase());
                        mod.setApellido(txtapellido.getText().toUpperCase());
                        mod.setCorreo(txtcorreo.getText());
                      //  mod.setIdtipo(1);
                        //if registra correctamente
                        if (modsql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            limpiar();
                            //error al registrar
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Registrar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Correo no Valido");
                    }
                    //if termina existe usuario 
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ya existe");
                }
                //if termina valida contraseña
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas deben ser iguales");
            }

        }


    }//GEN-LAST:event_btnregistrarActionPerformed

    // PAARA limpoiar las cajas de textos :)
    private void limpiar() {
        txtusuario.setText("");
        txtcontraseña.setText("");
        txtconfirmacontraseña.setText("");
        txtnombre.setText("");
        txtcorreo.setText("");
        txtapellido.setText("");
    }


    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        /*   char caracter= evt.getKeyChar();
        if (Character.isLowerCase(caracter) == true) {
            String strCadena = («» + caracter).toUpperCase();
            caracter = strCadena.charAt(0);
            evt.setKeyChar(caracter);
        }*/
    }//GEN-LAST:event_txtusuarioKeyTyped

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
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    public static javax.swing.JComboBox<combotipousuario> cbousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblusuario2;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtconfirmacontraseña;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
