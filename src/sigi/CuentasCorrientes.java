package sigi;

import Connection.Conexion;
import com.mxrck.autocompleter.TextAutoCompleter;
import Utils.Utils;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CuentasCorrientes extends javax.swing.JInternalFrame {
    
    Conexion con;
    ResultSet rs;
    static int j=0;
    static String result;
    public static String id, sum, res;
    public static boolean estado;
    String clienteId = "";

    public CuentasCorrientes() {
        initComponents();
        searchUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        newImport = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalDue = new javax.swing.JTextField();
        totalPaid = new javax.swing.JTextField();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(880, 610));

        jLabel1.setText("Buscar cliente:");

        searchUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchUserKeyReleased(evt);
            }
        });

        jScrollPane1.setMinimumSize(new java.awt.Dimension(880, 610));

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        accountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accountTable);

        jLabel2.setText("Pago de deuda recibido");

        newImport.setText("0.00");
        newImport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newImportKeyReleased(evt);
            }
        });

        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Total a pagar");

        jLabel4.setText("Total pagado");

        totalDue.setEditable(false);
        totalDue.setText("0.00");

        totalPaid.setEditable(false);
        totalPaid.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 707, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(save)
                        .addGap(25, 25, 25)
                        .addComponent(cancel)
                        .addGap(0, 512, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(totalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(totalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72)
                        .addComponent(newImport, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(totalDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(cancel))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
     
        try {
            con = new Conexion();

            BigDecimal paiment = new BigDecimal(newImport.getText());
            BigDecimal currentBalance = new BigDecimal(totalDue.getText());
            System.out.println(paiment);
            System.out.println(currentBalance);
            BigDecimal resultado = currentBalance.subtract(paiment);
            System.out.println(resultado);
            System.out.println(clienteId);
            String updateAccount = "INSERT INTO cuentas_corrientes (fecha_cta_cte, total, resta, clientes_id_clientes, usuarios_id_usuario, ventas_id_venta) VALUES (CURRENT_TIMESTAMP, '"+resultado+"', '"+newImport.getText()+"', "+clienteId+", "+Login.userId+", 0)";
            con.ejecutar(updateAccount);
            JOptionPane.showMessageDialog(null, "Operaci�n realizada, saldo actual: "+resultado+".");
            getValues();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void accountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTableMouseClicked
        int Opcion=this.accountTable.getSelectedRow();
        id =  accountTable.getValueAt(Opcion,0).toString();
        try {
            con = new Conexion();

            String nom= searchUser.getText();
            String sql ="SELECT * FROM cuentas_corrientes WHERE clientes_id_clientes LIKE '"+id+"%' AND (select max(fecha_cta_cte) from cuenta_corriente)";
            rs = con.Consulta(sql);
            if(rs==null) {
                JOptionPane.showMessageDialog(null, "No hay registro en la base de datos");
            }
            while (rs.next()) {
                String fecha;
                fecha  = rs.getString("fecha_cta_cte");
                String saldo;
                saldo = rs.getString("total");
                String id;
                id = rs.getString("id_cuenta_corriente");
            }
            DefaultTableModel temp = (DefaultTableModel) accountTable.getModel();

            Object nuevo[] = {temp.getRowCount()+1,"",""};
            temp.addRow(nuevo);
            int showTicket = this.accountTable.getSelectedRow();
            System.out.println(showTicket);
            if(showTicket == 1) {
                JOptionPane.showConfirmDialog(null, estado);
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_accountTableMouseClicked

    private void searchUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUserKeyReleased
        int evento=evt.getKeyCode();
        String nom = searchUser.getText();
        j = 0;
        if(evento==10 ){
            DefaultTableModel eliminarTodo = (DefaultTableModel) accountTable.getModel();
            eliminarTodo.setRowCount(0);
            eliminarTodo.setColumnCount(0);
            j = 0;
            try {
                con = new Conexion();

                String [] stringParts = nom.split(",");
                String names = stringParts[0];
                String lastNames = stringParts[1].substring(1);
                String getClientId = "SELECT * FROM clientes WHERE nombres = '"+names+"' AND apellidos = '"+lastNames+"'";
                rs = con.Consulta(getClientId);

                while(rs.next()){
                    clienteId =  rs.getString("id_clientes");
                }
                getValues();
                newImport.requestFocus();
                newImport.selectAll();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }//GEN-LAST:event_searchUserKeyReleased

    private void newImportKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newImportKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            save.requestFocus();
        }
    }//GEN-LAST:event_newImportKeyReleased

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        clearCtaCteFields();
    }//GEN-LAST:event_cancelActionPerformed

    public void searchUsers(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(searchUser);
            String sql ="SELECT id_clientes, nombres, apellidos FROM clientes";
            rs = con.Consulta(sql);
            while(rs.next()){
                String nombreApellido = rs.getString("nombres")+", "+rs.getString("apellidos");
                result = nombreApellido;
                textAutoAcompleter.addItem(result);
            }            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void getValues(){
        DefaultTableModel eliminarTodo = (DefaultTableModel) accountTable.getModel();
        eliminarTodo.setColumnCount(0);
        eliminarTodo.setRowCount(0);
        try{
            String getAccount = "SELECT * FROM cuentas_corrientes WHERE clientes_id_clientes = ? ORDER BY fecha_cta_cte DESC";
            rs = con.find(getAccount, clienteId);
            DefaultTableModel temp = (DefaultTableModel) accountTable.getModel();
            temp.addColumn("Fecha");
            temp.addColumn("Comprado");
            temp.addColumn("Nro Ticket");
            temp.addColumn("Pagado");
            temp.addColumn("Totales");
            Object[] fila = new Object[5];                
            while(rs.next()) {
                fila[0] = Utils.formatDateWithMonths(rs.getTimestamp("fecha_cta_cte"));
                fila[1] = rs.getFloat("suma");
                fila[2] = rs.getInt("numero_ticket");
                fila[3] = rs.getFloat("resta");
                fila[4] = rs.getFloat("total");
                temp.addRow(fila);
            }
            String getDue = "SELECT total FROM cuentas_corrientes WHERE clientes_id_clientes = ?";
            rs = con.find(getDue, clienteId);
            while(rs.next()){
                totalDue.setText(rs.getString("total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CuentasCorrientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearCtaCteFields(){
        searchUser.setText("");
        DefaultTableModel eliminarTodo = (DefaultTableModel) accountTable.getModel();
        eliminarTodo.setColumnCount(0);
        eliminarTodo.setRowCount(0);
        totalDue.setText("0.00");
        totalPaid.setText("0.00");
        newImport.setText("0.00");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTable;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newImport;
    private javax.swing.JButton save;
    private javax.swing.JTextField searchUser;
    private javax.swing.JTextField totalDue;
    private javax.swing.JTextField totalPaid;
    // End of variables declaration//GEN-END:variables
}