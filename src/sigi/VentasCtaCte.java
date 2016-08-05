package sigi;

import Connection.Conexion;
import Utils.Utils;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VentasCtaCte extends javax.swing.JDialog {
    Conexion con;
    ResultSet rs;
    static String names, lastNames;
    String userId = Integer.toString(Login.userId);
    public static int ventaRealizada;
    int suma = 0, resta = 0;
    String  total = "", fecha = "";
    public static String clienteId = null, clientName = null;
    public static String accountStatus = "";
    public static int value;
    Date showLastUpdateDate;
    /**
     * Creates new form VentasCtaCte
     * @param parent
     * @param modal
     */
    public VentasCtaCte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        searchClients();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        account = new javax.swing.JTextField();
        lastUpdate = new javax.swing.JTextField();
        totalSale = new javax.swing.JTextField();
        sales = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Estado cuenta");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Ultima actualización");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Total venta");

        search.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        account.setEditable(false);
        account.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lastUpdate.setEditable(false);
        lastUpdate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        totalSale.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        sales.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sales.setText("Vender");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalSale, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        ModuloVenta.clientIDM = clienteId;
        value = 1;
        this.dispose();
    }//GEN-LAST:event_salesActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        int evento=evt.getKeyCode();
        String nombre = search.getText();
        
        if(evento==10 ){
            try {
                con = new Conexion();
                String [] stringParts = nombre.split(",");
                String name = stringParts[0];
                String lastName = stringParts[1].replaceAll("\\s+", "");
                String getClientID = "SELECT id_clientes FROM clientes WHERE nombres LIKE '%"+name+"' AND apellidos LIKE '%"+lastName+"'";
                rs = con.Consulta(getClientID);
                while(rs.next()){
                    clienteId = rs.getString("id_clientes");
                }
                String getCtaCte = "SELECT t1.* FROM cuentas_corrientes t1 WHERE fecha_cta_cte IN (SELECT t2.fecha_cta_cte FROM cuentas_corrientes t2 WHERE clientes_id_clientes = ?)";
                rs = con.find(getCtaCte, clienteId);
                int rows = 0;
                while(rs.next()){
                    rows++;
                    total = rs.getString("total");
                    suma = rs.getInt("suma");
                    resta = rs.getInt("resta");
                    fecha = rs.getString("fecha_cta_cte");
                    showLastUpdateDate = rs.getTimestamp("fecha_cta_cte");
                }
                String getClientName = "SELECT nombres, apellidos FROM clientes WHERE id_clientes = ?";
                rs = con.find(getClientName, clienteId);
                while(rs.next()) {
                    clientName = rs.getString("nombres")+" "+rs.getString("apellidos");
                }
                if(rows != 0){
                    account.setText(total);
                    lastUpdate.setText(Utils.formatDate(showLastUpdateDate));
                }else {
                    account.setText("0.00");
                    lastUpdate.setText("");
                }
                accountStatus = total;
                totalSale.setText(ModuloVenta.sendTotalVentas);
                sales.requestFocus();
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }//GEN-LAST:event_searchKeyReleased

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Cancelar();
        cleanFields();
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed
    public static void Cancelar(){
        value = 2;
    }
    public final void searchClients(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(search);
            String sql ="SELECT id_clientes, nombres, apellidos FROM clientes";
            rs = con.Consulta(sql);
            while(rs.next()){
                names = rs.getString("nombres");
                lastNames = rs.getString("apellidos");
                textAutoAcompleter.addItem(names + ", " + lastNames);
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cleanFields(){
        search.setText("");
        account.setText("");
        totalSale.setText("");
    }
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
            java.util.logging.Logger.getLogger(VentasCtaCte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasCtaCte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasCtaCte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasCtaCte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentasCtaCte dialog = new VentasCtaCte(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField account;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lastUpdate;
    private javax.swing.JButton sales;
    private javax.swing.JTextField search;
    private javax.swing.JTextField totalSale;
    // End of variables declaration//GEN-END:variables

}
