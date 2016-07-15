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
        jMenuBar1 = new javax.swing.JMenuBar();
        close = new javax.swing.JMenu();
        closeApp = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setTitle("Modificar Contraseña");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Contraseña Actual");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Contraseña Nueva");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Repetir Contraseña");

        changePass.setBackground(new java.awt.Color(204, 204, 204));
        changePass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        changePass.setText("Cambiar");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualPass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changePass)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancel)
                            .addComponent(repeatNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(actualPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(changePass)
                    .addComponent(cancel))
                .addContainerGap())
        );

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
            con.Cerrar();
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField repeatNewPass;
    // End of variables declaration//GEN-END:variables
}
