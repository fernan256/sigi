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
        llenar_combo_prov();
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(1500, 960));
        setPreferredSize(getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setText("Proveedor");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jBcompra.setText("Editar");
        jBcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcompraActionPerformed(evt);
            }
        });
        getContentPane().add(jBcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 140, 30));

        getProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProviderActionPerformed(evt);
            }
        });
        getContentPane().add(getProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 290, -1));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 800, 200));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setText("Detalle compra:");
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        deletePurchase.setText("Eliminar Orden de Compra");
        deletePurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePurchaseActionPerformed(evt);
            }
        });
        getContentPane().add(deletePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 210, 30));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 800, 160));

        deleteItem.setText("Eliminar Articulo");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        getContentPane().add(deleteItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        jLabel1.setText("TOTAL ORDEN DE COMPRA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));
        getContentPane().add(totalPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 170, -1));

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
    
    public void llenar_combo_prov() {
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
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    public void clearUpdatePurchaseOrderFields(){
        llenar_combo_prov();
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