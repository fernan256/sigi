package sigi;

import Connection.Conexion;
import Utils.ConfigVar;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModificarContrasenia extends javax.swing.JFrame {
    Conexion con;
    ResultSet rs;

    public ModificarContrasenia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newPass = new javax.swing.JPasswordField();
        repeatNewPass = new javax.swing.JPasswordField();
        changePass = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        close = new javax.swing.JMenu();
        closeApp = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setTitle("Modificar Contraseña");
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(actualPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 80, 146, -1));

        jLabel1.setText("Contraseña Actual:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, -1, -1));

        jLabel2.setText("Contraseña Nueva:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 115, -1, -1));

        jLabel3.setText("Repetir Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 147, -1, -1));
        getContentPane().add(newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 112, 146, -1));
        getContentPane().add(repeatNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 144, 146, -1));

        changePass.setBackground(new java.awt.Color(204, 204, 204));
        changePass.setText("Cambiar");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });
        getContentPane().add(changePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 196, 91, 35));

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 196, 88, 33));

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cambiar contraseña", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jLabel4.setName(""); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 270));
        jLabel4.getAccessibleContext().setAccessibleDescription("Cambiar contraseña actual");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        close.setText("Archivo");

        closeApp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        closeApp.setText("Cancelar");
        closeApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAppActionPerformed(evt);
            }
        });
        close.add(closeApp);

        jMenuBar1.add(close);

        jMenu2.setText("Info");

        about.setText("Acerca de...");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu2.add(about);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
    this.dispose();
}//GEN-LAST:event_cancelActionPerformed

private void changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassActionPerformed
    if(actualPass.getPassword().equals("") ||newPass.getPassword().equals("") || repeatNewPass.getPassword().equals("")) {    
        JOptionPane.showMessageDialog(null,"No puede dejar espacios sin llenar");
    }else{ 
        try {    
            con = new Conexion();
            String getSalt = "", comparePass = "";
            String getVal = "SELECT password, salt FROM usuarios WHERE id_usuario = "+Login.userId+"";
            rs = con.Consulta(getVal);
            while(rs.next()){
                comparePass = rs.getString("password");
                getSalt = rs.getString("salt");
            }
            String oldPassword = ConfigVar.get_SHA_1_Pass(Arrays.toString(actualPass.getPassword()), getSalt);
            System.out.println("comparePass: " +comparePass);
            System.out.println("oldPassword: "+oldPassword);
            if(comparePass.equals(oldPassword)) {
                String salt = ConfigVar.getSalt();
                String newPassword = ConfigVar.get_SHA_1_Pass(Arrays.toString(newPass.getPassword()), salt);
                String repeatNewPassword = ConfigVar.get_SHA_1_Pass(Arrays.toString(repeatNewPass.getPassword()), salt);
                if(newPassword.equals(repeatNewPassword)) {
                    String modificar = "UPDATE usuarios SET password = '"+newPassword+"', salt = '"+salt+"' WHERE id_usuario = "+Login.userId+"";
                    con.ejecutar(modificar);
                    JOptionPane.showMessageDialog(null,"La contraseña a sido guardada");                
                    actualPass.setText("");
                    newPass.setText("");
                    repeatNewPass.setText(""); 
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Se debe escribir la misma contraseña en Contraseña Nueva y Repetir Contraseña");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña actual incorrecta");
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException | NoSuchAlgorithmException ex) {
            Logger.getLogger(ModificarContrasenia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//GEN-LAST:event_changePassActionPerformed

private void closeAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAppActionPerformed
    if(JOptionPane.showConfirmDialog(rootPane, "Estas seguro de cerrarla?","Cerrar aplicación",1)==0){
        this.dispose();
    }
}//GEN-LAST:event_closeAppActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        JOptionPane.showMessageDialog(rootPane, "En caso de inconvenientes, por favor contacte al servicio tÃ©cnico de Systec, gracias.");
    }//GEN-LAST:event_aboutActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ModificarContrasenia().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JPasswordField actualPass;
    private javax.swing.JButton cancel;
    private javax.swing.JButton changePass;
    private javax.swing.JMenu close;
    private javax.swing.JMenuItem closeApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField repeatNewPass;
    // End of variables declaration//GEN-END:variables
}
