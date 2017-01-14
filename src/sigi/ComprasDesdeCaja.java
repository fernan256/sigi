package sigi;

import Utils.Utils;
import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComprasDesdeCaja extends javax.swing.JDialog {
    Conexion con;
    ResultSet rs;
    public ComprasDesdeCaja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        getValues();
        saveBuy.setEnabled(false);
        System.out.println(Login.cajaId);
    }
    
    private void getValues(){
        user.setText(Login.userName);
        buyDate.setText(Utils.currentDateFormated());
        amount.requestFocus();
        amount.selectAll();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saveBuy = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buyDate = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Monto");

        saveBuy.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saveBuy.setText("Compra");
        saveBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBuyActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        user.setEditable(false);
        user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Compras desde caja");

        buyDate.setEditable(false);
        buyDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        amount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        amount.setText("0.00");
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Detalle compra");

        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(saveBuy)
                        .addGap(60, 60, 60)
                        .addComponent(cancel)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(buyDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        user.setText("");
        buyDate.setText("");
        amount.setText("");
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void saveBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBuyActionPerformed
        try {
            con = new Conexion();
            float saveAmount = Float.parseFloat(amount.getText());
            if(Login.cajaId != 0) {
                System.out.println(Login.cajaId);
                String save = "INSERT INTO compras_desde_caja (fecha_compra, monto, descripcion, id_caja, id_usuario) VALUES (CURRENT_TIMESTAMP, "+saveAmount+", '"+description.getText()+"', "+Login.cajaId+", "+Login.userId+")";
                con.ejecutar(save);
            } else {
                String getId = "SELECT MAX(id_caja) FROM caja";
                int idAjuste = 0;
                rs = con.Consulta(getId);
                while(rs.next()){
                    idAjuste = rs.getInt("idCaja");
                }
                System.out.println("ajus" + idAjuste);
                String save = "INSERT INTO compras_desde_caja (fecha_compra, monto, descripcion, id_caja, id_usuario) VALUES (CURRENT_TIMESTAMP, "+saveAmount+", '"+description.getText()+"', "+idAjuste+", "+Login.userId+")";
                con.ejecutar(save);
            }
            user.setText("");
            buyDate.setText("");
            amount.setText("");
            con.Cerrar();
            this.dispose();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ComprasDesdeCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveBuyActionPerformed

    private void amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyReleased
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        //    amount.setText(Utils.formatCurrency(amount.getText().length(), amount.getText()));
        //    saveBuy.setEnabled(true);
        //    saveBuy.requestFocusInWindow();
        //}
    }//GEN-LAST:event_amountKeyReleased

    private void descriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyReleased
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            amount.setText(Utils.formatCurrency(amount.getText().length(), amount.getText()));
            saveBuy.setEnabled(true);
            saveBuy.requestFocusInWindow();
        }
    }//GEN-LAST:event_descriptionKeyReleased

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
            java.util.logging.Logger.getLogger(ComprasDesdeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprasDesdeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprasDesdeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprasDesdeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ComprasDesdeCaja dialog = new ComprasDesdeCaja(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField buyDate;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton saveBuy;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
