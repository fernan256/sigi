package sigi;

import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VerPrecios extends javax.swing.JDialog {
    
    Conexion con;
    ResultSet rs;
    public static int fillInTable = 0;
    private int j = 0;
    public VerPrecios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Nombre Articulo");

        productName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        productName.setForeground(new java.awt.Color(246, 17, 17));
        productName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productNameKeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        resultTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(resultTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(392, 392, 392))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productNameKeyReleased
        try {
            con = new Conexion();
            if(productName.getText().length()>= 2) {
                String sql = "SELECT t1.*, t2.stock_min, t2.saldo_stock, t2.id_stock FROM descripcion_articulos AS t1 INNER JOIN stock AS t2 ON t1.id_articulo = t2.id_articulo WHERE t1.nombre_producto LIKE '"+productName.getText()+"%' OR t1.scanning LIKE '"+productName.getText()+"%'";
                rs = con.Consulta(sql);
                /*DefaultTableModel temp = (DefaultTableModel)
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
                }*/
                DefaultTableModel buscar = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int vColIndex) {
                        return false;
                    }
                };
                this.resultTable.setModel(buscar);
                buscar.addColumn("Scaning");
                buscar.addColumn("Nombre Producto");
                buscar.addColumn("Marca");
                buscar.addColumn("Precio Venta");
                buscar.addColumn("Saldo Stock");
                buscar.addColumn("Tipo articulo id");
                buscar.addColumn("Id articulo");
                buscar.addColumn("Id stock");
                while (rs.next()) {
                    Object[] fila = new Object[8];
                    fila[0] = rs.getString("scanning");
                    fila[1] = rs.getString("nombre_producto");
                    fila[2] = rs.getString("marca");
                    fila[3] = rs.getFloat("precio_venta");
                    fila[4] = rs.getInt("saldo_stock");
                    fila[5] = rs.getInt("tipo_articulo_id");
                    fila[6] = rs.getInt("id_articulo");
                    fila[7] = rs.getInt("id_stock");
                    buscar.addRow(fila);
                }
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    //searchScanning.requestFocusInWindow();
                    resultTable.selectAll();
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        /*int aux = resultTable.getSelectedRow();
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
        }*/
    }//GEN-LAST:event_resultTableMouseClicked

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
            java.util.logging.Logger.getLogger(VerPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerPrecios dialog = new VerPrecios(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField productName;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
