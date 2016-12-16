package sigi;

import Connection.Conexion;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class BajaModificacionOrdenesCompras extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j = 0, i = 0; 
    static int idprovi = 0, idpag = 0;
   
    public BajaModificacionOrdenesCompras() {
        initComponents();
        FillInProviders();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        jBcompra = new javax.swing.JButton();
        getProvider = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchaseDetail = new javax.swing.JTable();
        jLabel72 = new javax.swing.JLabel();
        deletePurchase = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        deleteItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalPurchase = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1500, 960));
        setPreferredSize(getPreferredSize());

        jLabel59.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel59.setText("Proveedor");

        jBcompra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBcompra.setText("Editar");
        jBcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcompraActionPerformed(evt);
            }
        });

        getProvider.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProviderActionPerformed(evt);
            }
        });

        purchaseDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        purchaseDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Articulo", "Scanning", "Nombre Articulo", "Precio Costo", "Cantidad Solicitada", "Subtotal", "Estado Articulo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchaseDetailKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(purchaseDetail);
        if (purchaseDetail.getColumnModel().getColumnCount() > 0) {
            purchaseDetail.getColumnModel().getColumn(0).setResizable(false);
            purchaseDetail.getColumnModel().getColumn(0).setPreferredWidth(15);
            purchaseDetail.getColumnModel().getColumn(1).setResizable(false);
            purchaseDetail.getColumnModel().getColumn(2).setResizable(false);
            purchaseDetail.getColumnModel().getColumn(3).setResizable(false);
            purchaseDetail.getColumnModel().getColumn(4).setResizable(false);
            purchaseDetail.getColumnModel().getColumn(5).setResizable(false);
            purchaseDetail.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel72.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel72.setText("Detalle Compra");

        deletePurchase.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deletePurchase.setText("Eliminar Orden de Compra");
        deletePurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePurchaseActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Orden de Compra", "Fecha de pedido", "Estado de pedido", "Fecha Recibido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(result);
        if (result.getColumnModel().getColumnCount() > 0) {
            result.getColumnModel().getColumn(0).setResizable(false);
            result.getColumnModel().getColumn(0).setPreferredWidth(15);
            result.getColumnModel().getColumn(1).setResizable(false);
            result.getColumnModel().getColumn(2).setResizable(false);
            result.getColumnModel().getColumn(3).setResizable(false);
        }

        deleteItem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteItem.setText("Eliminar Articulo");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("TOTAL ORDEN DE COMPRA");

        totalPurchase.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Borrar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(deleteItem)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel72)
                            .addGap(213, 213, 213)
                            .addComponent(jLabel1)
                            .addGap(22, 22, 22)
                            .addComponent(totalPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel59)
                            .addGap(40, 40, 40)
                            .addComponent(getProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(deletePurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2)))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getProvider, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(deletePurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel72))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalPurchase, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteItem)
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcompraActionPerformed
        clearUpdatePurchaseOrderFields();
    }//GEN-LAST:event_jBcompraActionPerformed

    private void getProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProviderActionPerformed
        try {
            con = new Conexion();
            String prov = (String) getProvider.getSelectedItem();
            String sql = "SELECT * FROM proveedores WHERE empresa LIKE '"+prov+"%'";
            rs = con.Consulta(sql);
            if(rs.next()){
                idprovi=rs.getInt("id_proveedor"); 
            }
            String getOc = "SELECT t1.*, t2.* FROM ordenes_compra t1 INNER JOIN estado_orden_compra t2 ON t2.id_estado_orden_compra = t1.estado_orden "
                             + "WHERE t1.id_proveedor = '"+idprovi+"'";
            rs = con.Consulta(getOc);
            DefaultTableModel fillResultTable = (DefaultTableModel) result.getModel();
            Object resultValues[]= {fillResultTable.getRowCount()+1,"",""};
            while(rs.next()){
                fillResultTable.addRow(resultValues);
                result.setValueAt(rs.getInt("id_ordenes_compra"), j, 0);
                result.setValueAt(rs.getString("fecha_pedido"), j, 1);
                result.setValueAt(rs.getString("descripcion"), j, 2);
                result.setValueAt(rs.getString("fecha_recepcion"), j, 3);
                j++;
            }
            con.Cerrar();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_getProviderActionPerformed

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
        try{
            con = new Conexion();
            DefaultTableModel restorePurchaseTable = (DefaultTableModel) purchaseDetail.getModel();
            restorePurchaseTable.setRowCount(0);
            i = 0;
            int numbersPurchaseOrder = result.getSelectedRow();
            if(numbersPurchaseOrder != -1){
                String purchaseId = result.getValueAt(numbersPurchaseOrder, 0).toString();
                String getPurchaseInfo = "SELECT t1.*, t2.*, t3.*, t4.* FROM oc_productos t1 INNER JOIN descripcion_articulos t2 ON t2.id_articulo = t1.id_articulo "
                                        + "INNER JOIN stock t3 ON t3.id_articulo = t1.id_articulo "
                                        + "INNER JOIN estado_producto_orden_compra t4 ON t4.id_estado_producto = t1.aceptar_eliminar_producto "
                                        + "WHERE t1.id_orden_de_compra = '"+purchaseId+"%'";
                rs = con.Consulta(getPurchaseInfo);
                DefaultTableModel createPurchaseTable = (DefaultTableModel) purchaseDetail.getModel();
                Object purchases[]= {createPurchaseTable.getRowCount()+1,"",""};
                while (rs.next()) {
                    createPurchaseTable.addRow(purchases);
                    purchaseDetail.setValueAt(rs.getInt("id_articulo"), i, 0);
                    purchaseDetail.setValueAt(rs.getString("scanning"), i, 1);
                    purchaseDetail.setValueAt(rs.getString("nombre_producto"), i, 2);
                    purchaseDetail.setValueAt(rs.getFloat("precio_costo"), i, 3);
                    purchaseDetail.setValueAt(rs.getInt("cantidad"), i, 4);
                    purchaseDetail.setValueAt(rs.getInt("cantidad")*rs.getFloat("precio_costo"), i, 5);
                    purchaseDetail.setValueAt(rs.getString("descripcion"), i, 6);
                    i++;
                }
                setTotal();
            }
            con.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resultMouseClicked

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        DefaultTableModel deleteRow = (DefaultTableModel) purchaseDetail.getModel();
        int rowSelected = purchaseDetail.getSelectedRow();
        int idArticle = Integer.parseInt(purchaseDetail.getValueAt(rowSelected, 0).toString());
        deleteRow.removeRow(rowSelected);
        try{
            String updateArticle = "UPDATE oc_productos SET aceptar_eliminar_producto = 3 WHERE id_articulo = "+idArticle+"";
            con.ejecutar(updateArticle);
            con.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(RecepcionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        purchaseDetail.setValueAt("Eliminado", rowSelected, 6);
        setTotal();
    }//GEN-LAST:event_deleteItemActionPerformed

    private void deletePurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePurchaseActionPerformed
        DefaultTableModel deleteRow = (DefaultTableModel) result.getModel();
        int rowSelected = result.getSelectedRow();
        int idPurchaseOrder = Integer.parseInt(result.getValueAt(rowSelected, 0).toString());
        deleteRow.removeRow(rowSelected);
        try{
            String deletePurchaseOrder = "DELETE FROM ordenes_compra WHERE id_ordenes_compra = "+idPurchaseOrder+"";
            con.ejecutar(deletePurchaseOrder);
            String deleteRelatedInfo = "DELETE FROM oc_productos WHERE id_orden_de_compra = "+idPurchaseOrder+"";
            con.ejecutar(deleteRelatedInfo);
            con.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(RecepcionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel restorePurchaseTable = (DefaultTableModel) purchaseDetail.getModel();
        restorePurchaseTable.setRowCount(0);
        i = 0;
    }//GEN-LAST:event_deletePurchaseActionPerformed

    private void purchaseDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchaseDetailKeyReleased
        purchaseDetail.getModel();
        int aux = purchaseDetail.getSelectedRow();
        if (aux != -1) {
            String cantidad = purchaseDetail.getValueAt(aux, 4).toString();
            float cant = Float.parseFloat(cantidad);
            String costo = purchaseDetail.getValueAt(aux, 3).toString();
            float cos = Float.parseFloat(costo);
            float total = cant*cos;
            String tot = Float.toString(total);
            purchaseDetail.setValueAt(tot, aux, 5);
        }
        setTotal();
    }//GEN-LAST:event_purchaseDetailKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearUpdatePurchaseOrderFields();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void FillInProviders() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        try {       
            con = new Conexion();
            String sql = "SELECT * FROM proveedores ORDER BY empresa";
            rs = con.Consulta(sql);
            if(rs==null) {
                JOptionPane.showMessageDialog(null, "No hay proveedores en la base de datos.");
            }
            modeloCombo.addElement("Seleccione Proveedor");
            getProvider.setModel(modeloCombo);
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("empresa"));
                getProvider.setModel(modeloCombo);
                getProvider.updateUI();
            }  
            con.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    public void clearUpdatePurchaseOrderFields(){
        FillInProviders();
        DefaultTableModel restoreResultTable = (DefaultTableModel) result.getModel();
        restoreResultTable.setRowCount(0);
        j = 0;
        DefaultTableModel restorePurchaseTable = (DefaultTableModel) purchaseDetail.getModel();
        restorePurchaseTable.setRowCount(0);
        i = 0;
    }
    
    private void setTotal(){
        BigDecimal addResult = new BigDecimal(BigInteger.ZERO);
        BigDecimal addToTotal = new BigDecimal(BigInteger.ZERO);
        String result = null;
        int totalRow= purchaseDetail.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++) {
            addToTotal= new BigDecimal(String.valueOf(purchaseDetail.getValueAt(i,5).toString()));
            addResult = addResult.add(addToTotal);
            result = addResult.toString();
            totalPurchase.setText(result);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteItem;
    private javax.swing.JButton deletePurchase;
    private javax.swing.JComboBox getProvider;
    private javax.swing.JButton jBcompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable purchaseDetail;
    private javax.swing.JTable result;
    private javax.swing.JTextField totalPurchase;
    // End of variables declaration//GEN-END:variables

}