package sigi;

import Connection.Conexion;
import Utils.Utils;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FaltanteStock extends javax.swing.JDialog {
    Conexion con;
    ResultSet rs;
    int j = 0;
    BigDecimal cantidadProducto = BigDecimal.ZERO;
    static BigDecimal auxiliarTotal = BigDecimal.ZERO;
    String cantidad = "1";
    static BigDecimal total = BigDecimal.ZERO;
    String userId = Integer.toString(Login.userId);
    int idVenta = 0;
    
    public FaltanteStock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        saleDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showStockTable = new javax.swing.JTable();
        takeOut = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        showStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Fecha Venta");

        saleDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        showStockTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scanning", "Nombre", "Marca", "Precio Costo", "Cantidad", "idArticulo", "tipoArticulo", "cantidadStock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(showStockTable);
        if (showStockTable.getColumnModel().getColumnCount() > 0) {
            showStockTable.getColumnModel().getColumn(0).setResizable(false);
            showStockTable.getColumnModel().getColumn(1).setResizable(false);
            showStockTable.getColumnModel().getColumn(2).setResizable(false);
            showStockTable.getColumnModel().getColumn(3).setResizable(false);
            showStockTable.getColumnModel().getColumn(4).setResizable(false);
            showStockTable.getColumnModel().getColumn(5).setMinWidth(0);
            showStockTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            showStockTable.getColumnModel().getColumn(5).setMaxWidth(0);
            showStockTable.getColumnModel().getColumn(6).setMinWidth(0);
            showStockTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            showStockTable.getColumnModel().getColumn(6).setMaxWidth(0);
            showStockTable.getColumnModel().getColumn(7).setMinWidth(0);
            showStockTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            showStockTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        takeOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        takeOut.setText("Sacar faltante");
        takeOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeOutActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        showStock.setText("Ver Faltantes");
        showStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(saleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(takeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(showStock, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showStock)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(saleDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void takeOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeOutActionPerformed
        j = showStockTable.getRowCount();
        if(j==0) {
            JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");
        } else {
            try {
                con = new Conexion();
                String nombreProducto[] = new String[j], marcaProducto [] = new String[j], scanningArticulo[] = new String[j], idArticulos[] = new String[j];
                float cantidadVenta[] = new float[j], cantidadStock[] = new float[j], nuevoStock[] = new float[j];
                BigDecimal precioVenta[] = new BigDecimal[j];
                int guardarStock[] = new int[j];

                for (int i=0; i<j; i++) {
                    scanningArticulo[i] = showStockTable.getModel().getValueAt(i, 0).toString();
                    nombreProducto[i] = showStockTable.getModel().getValueAt(i, 1).toString();
                    marcaProducto[i] = showStockTable.getModel().getValueAt(i, 2).toString();
                    precioVenta[i]= new BigDecimal(showStockTable.getModel().getValueAt(i, 3).toString());
                    idArticulos[i] = showStockTable.getModel().getValueAt(i, 5).toString();
                    cantidadVenta[i] = Float.parseFloat(showStockTable.getModel().getValueAt(i, 4).toString());
                    cantidadStock[i] = Float.parseFloat(showStockTable.getModel().getValueAt(i, 7).toString());
                    nuevoStock[i] = cantidadStock[i] + cantidadVenta[i];
                    guardarStock[i] = (int)nuevoStock[i];
                    String updateStock = "UPDATE stock SET saldo_stock = "+guardarStock[i]+" WHERE id_articulo ="+idArticulos[i]+"";
                    con.ejecutar(updateStock);
                }
                //String cancelThisTicket = "INSERT INTO anular_ticket (id_usuario, fecha_anular_ticket, total, numero_ticket, ventas_id_venta) VALUES ('"+userId+"', CURRENT_TIMESTAMP, '"+totalReturn.getText()+"', "+ticketNumber.getText()+", "+idVenta+")";
                //con.ejecutar(cancelThisTicket);
                //String updateVentaStatus = "UPDATE detalle_venta SET estado_venta_id_estado_venta = 3 WHERE ventas_id_venta = "+idVenta+"";
                //con.ejecutar(updateVentaStatus);

                //JOptionPane.showMessageDialog(null, "Anular ticket\n\nTotal a devolver: $"+totalReturn.getText());
                cleanForm();
                con.Cerrar();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex1) {
                Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex1);
            } 
        }
    }//GEN-LAST:event_takeOutActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        cleanForm();
    }//GEN-LAST:event_cancelActionPerformed

    private void showStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStockActionPerformed
        try {
                con = new Conexion();
                String showFaltante = "SELECT stock.*, descripcion_articulos.* FROM stock JOIN descripcion_articulos ON descripcion_articulos.id_articulo = stock.id_articulo WHERE saldo_stock = 0";
                rs = con.Consulta(showFaltante);
                DefaultTableModel temp = (DefaultTableModel)
                showStockTable.getModel();
                Object nuevo[]= {temp.getRowCount()+1,"",""};
                while (rs.next()) {
                    temp.addRow(nuevo);
                    showStockTable.setValueAt(rs.getString("scanning"), j, 0);
                    showStockTable.setValueAt(rs.getString("nombre_producto"), j, 1);
                    showStockTable.setValueAt(rs.getString("marca"), j, 2);
                    showStockTable.setValueAt(rs.getFloat("precio_venta"), j, 3);
                    showStockTable.setValueAt(rs.getInt("saldo_stock"), j, 4);
                    showStockTable.setValueAt(rs.getInt("tipo_articulo_id"), j, 5);
                    showStockTable.setValueAt(rs.getInt("id_articulo"), j, 6);
                    showStockTable.setValueAt(rs.getInt("id_stock"), j, 7);
                    j++;
                }
                cleanForm();
                con.Cerrar();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex1) {
                Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex1);
            }
    }//GEN-LAST:event_showStockActionPerformed
    private void cleanForm(){
        saleDate.setText("");
        DefaultTableModel temp = (DefaultTableModel) showStockTable.getModel();
        temp.setRowCount(0);
        j=0;
        this.dispose();
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
            java.util.logging.Logger.getLogger(FaltanteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaltanteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaltanteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaltanteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FaltanteStock dialog = new FaltanteStock(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField saleDate;
    private javax.swing.JButton showStock;
    private javax.swing.JTable showStockTable;
    private javax.swing.JButton takeOut;
    // End of variables declaration//GEN-END:variables
}
