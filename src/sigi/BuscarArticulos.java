package sigi;

import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BuscarArticulos extends javax.swing.JDialog {
    
    Conexion con;
    ResultSet rs;
    public static int fillInTable = 0;
    private int j = 0;
    public BuscarArticulos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Nombre Articulo");

        productName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productNameKeyReleased(evt);
            }
        });

        resultTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scanning", "Nombre Producto", "Marca", "Precio", "Stock", "tipoArticulo", "idArticulo", "idStock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
            resultTable.getColumnModel().getColumn(2).setResizable(false);
            resultTable.getColumnModel().getColumn(3).setResizable(false);
            resultTable.getColumnModel().getColumn(4).setResizable(false);
            resultTable.getColumnModel().getColumn(5).setMinWidth(0);
            resultTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            resultTable.getColumnModel().getColumn(5).setMaxWidth(0);
            resultTable.getColumnModel().getColumn(6).setMinWidth(0);
            resultTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            resultTable.getColumnModel().getColumn(6).setMaxWidth(0);
            resultTable.getColumnModel().getColumn(7).setMinWidth(0);
            resultTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            resultTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productNameKeyReleased
        try {
            con = new Conexion();
            System.out.println(productName.getText());
            if(productName.getText().length()>= 4) {
                String sql = "SELECT t1.*, t2.stock_min, t2.saldo_stock, t2.id_stock FROM descripcion_articulos AS t1 INNER JOIN stock AS t2 ON t1.id_articulo = t2.id_articulo WHERE t1.nombre_producto LIKE '"+productName.getText()+"%' OR t1.scanning LIKE '"+productName.getText()+"%'";
                rs = con.Consulta(sql);
                DefaultTableModel temp = (DefaultTableModel)
                resultTable.getModel();
                Object nuevo[]= {temp.getRowCount()+1,"",""};
                while (rs.next()) {
                    temp.addRow(nuevo);
                    resultTable.setValueAt(rs.getString("scanning"), j, 0);
                    resultTable.setValueAt(rs.getString("nombre_producto"), j, 1);
                    resultTable.setValueAt(rs.getString("marca"), j, 2);
                    resultTable.setValueAt(rs.getFloat("precio_venta"), j, 3);
                    resultTable.setValueAt(rs.getInt("saldo_stock"), j, 4);
                    resultTable.setValueAt(rs.getInt("tipo_articulo_id"), j, 5);
                    resultTable.setValueAt(rs.getInt("id_articulo"), j, 6);
                    resultTable.setValueAt(rs.getInt("id_stock"), j, 7);
                    j++;
                }
                con.Cerrar();
            } else {
                DefaultTableModel temporal = (DefaultTableModel)
                resultTable.getModel();
                int rowCount = temporal.getRowCount();
                //Remove rows one by one from the end of the table
                for (int i = rowCount - 1; i >= 0; i--) {
                    temporal.removeRow(i);
                }
                j = 0;
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            resultTable.selectAll();
        }
    }//GEN-LAST:event_productNameKeyReleased

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        int aux = resultTable.getSelectedRow();
        if (aux != -1) {
            ModuloVenta.codigo = resultTable.getValueAt(aux, 0).toString();
            ModuloVenta.nombre = resultTable.getValueAt(aux, 1).toString();
            ModuloVenta.marca = resultTable.getValueAt(aux, 2).toString();
            ModuloVenta.precio = new BigDecimal (resultTable.getValueAt(aux, 3).toString());
            ModuloVenta.cantidadEnStock = new BigDecimal (resultTable.getValueAt(aux, 4).toString());
            ModuloVenta.tipo = (int) resultTable.getValueAt(aux, 5);
            ModuloVenta.articleId = resultTable.getValueAt(aux, 6).toString();
            ModuloVenta.stockId = (int) resultTable.getValueAt(aux, 7);
            fillInTable = 1;
            this.dispose();
        }
    }//GEN-LAST:event_resultTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarArticulos dialog = new BuscarArticulos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField productName;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
