package sigi;

import Connection.Conexion;
import Utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RecepcionOrdenCompra extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    int j = 0;
    public RecepcionOrdenCompra() {
        initComponents();
        paymentType.insertItemAt("", 0);
        paymentType.insertItemAt("Efectivo", 1);
        paymentType.insertItemAt("Cuena Corriente", 2);
        Date date = new Date();
        receptionDate.setDate(date);
        acceptReception.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        providorName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        receptionDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        paymentType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        orderDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsPurchaseOrder = new javax.swing.JTable();
        deleteItem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totalPurchase = new javax.swing.JTextField();
        acceptReception = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        orderPurchaseDate = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        purchaseResult = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        purchaseOrderNumber = new javax.swing.JTextField();

        setClosable(true);

        jLabel2.setText("Proveedor");

        jLabel3.setText("Fecha Recepción");

        jLabel4.setText("Forma de Pago");

        jLabel5.setText("Fecha de Pedido");

        orderDate.setEditable(false);

        jLabel6.setText("Articulos");

        itemsPurchaseOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Scanning", "Nombre Producto", "Marca", "Precio unitario", "En Stock", "Cantidad Solicitada", "Total", "idArt", "idStock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsPurchaseOrder.getTableHeader().setReorderingAllowed(false);
        itemsPurchaseOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemsPurchaseOrderKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(itemsPurchaseOrder);
        if (itemsPurchaseOrder.getColumnModel().getColumnCount() > 0) {
            itemsPurchaseOrder.getColumnModel().getColumn(0).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(0).setPreferredWidth(30);
            itemsPurchaseOrder.getColumnModel().getColumn(1).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(2).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(3).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(4).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(5).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(6).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(7).setResizable(false);
            itemsPurchaseOrder.getColumnModel().getColumn(8).setMinWidth(0);
            itemsPurchaseOrder.getColumnModel().getColumn(8).setPreferredWidth(0);
            itemsPurchaseOrder.getColumnModel().getColumn(8).setMaxWidth(0);
            itemsPurchaseOrder.getColumnModel().getColumn(9).setMinWidth(0);
            itemsPurchaseOrder.getColumnModel().getColumn(9).setPreferredWidth(0);
            itemsPurchaseOrder.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        deleteItem.setText("Eliminar ITEM");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });

        jLabel7.setText("TOTAL DE OC");

        acceptReception.setText("RECEPCION");
        acceptReception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptReceptionActionPerformed(evt);
            }
        });

        jLabel8.setText("Buscar por fecha");

        orderPurchaseDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                orderPurchaseDatePropertyChange(evt);
            }
        });

        purchaseResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° OC", "Nombre Empresa", "Fecha Pedido", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseResultMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(purchaseResult);
        if (purchaseResult.getColumnModel().getColumnCount() > 0) {
            purchaseResult.getColumnModel().getColumn(0).setResizable(false);
            purchaseResult.getColumnModel().getColumn(0).setPreferredWidth(15);
            purchaseResult.getColumnModel().getColumn(1).setResizable(false);
            purchaseResult.getColumnModel().getColumn(2).setResizable(false);
            purchaseResult.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("N° Orden de Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(paymentType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(receptionDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(providorName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderDate, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(purchaseOrderNumber))
                        .addGap(203, 203, 203))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(87, 87, 87)
                                .addComponent(deleteItem)
                                .addGap(74, 74, 74)
                                .addComponent(acceptReception)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel7)
                                .addGap(62, 62, 62)
                                .addComponent(totalPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 81, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(orderPurchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(orderPurchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(providorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(purchaseOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(receptionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(paymentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteItem)
                            .addComponent(jLabel7)
                            .addComponent(totalPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acceptReception))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        DefaultTableModel deleteRow = (DefaultTableModel) itemsPurchaseOrder.getModel();
        int rowSelected = itemsPurchaseOrder.getSelectedRow();
        int idArticle = Integer.parseInt(itemsPurchaseOrder.getValueAt(rowSelected, 8).toString());
        deleteRow.removeRow(rowSelected);
        try{
            String updateArticle = "UPDATE oc_productos SET aceptar_eliminar_producto = 3 WHERE id_articulo = "+idArticle+"";
            con.ejecutar(updateArticle);
            con.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(RecepcionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTotal();
    }//GEN-LAST:event_deleteItemActionPerformed

    private void itemsPurchaseOrderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemsPurchaseOrderKeyReleased
        itemsPurchaseOrder.getModel();
        int aux = itemsPurchaseOrder.getSelectedRow();
        if (aux != -1) {
            String cantidad = itemsPurchaseOrder.getValueAt(aux, 6).toString();
            float cant = Float.parseFloat(cantidad);
            String costo = itemsPurchaseOrder.getValueAt(aux, 4).toString();
            float cos = Float.parseFloat(costo);
            float total = cant*cos;
            String tot = Float.toString(total);
            itemsPurchaseOrder.setValueAt(tot, aux, 7);
        }
        setTotal();
    }//GEN-LAST:event_itemsPurchaseOrderKeyReleased

    private void orderPurchaseDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_orderPurchaseDatePropertyChange
        if(evt.getPropertyName().equals("date")){
            DefaultTableModel eliminarTodo = (DefaultTableModel) purchaseResult.getModel();
            eliminarTodo.setRowCount(0);
            j = 0;
            getPurchaseFromDB();
        }
    }//GEN-LAST:event_orderPurchaseDatePropertyChange

    private void purchaseResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseResultMouseClicked
        try {   
            DefaultTableModel eliminarTodo = (DefaultTableModel) itemsPurchaseOrder.getModel();
            eliminarTodo.setRowCount(0);
            j = 0;
            con = new Conexion();
            int numbersPurchaseOrder = purchaseResult.getSelectedRow();
            if(numbersPurchaseOrder != -1){
                String purchaseId = purchaseResult.getValueAt(numbersPurchaseOrder, 0).toString();
                String getPurchaseOrder = "SELECT t1.*, t2.empresa, t3.*, t4.*, t5.* FROM ordenes_compra t1 "
                                        + "JOIN proveedores t2 ON t2.id_proveedor = t1.id_proveedor "
                                        + "JOIN oc_productos t3 ON t3.id_orden_de_compra = t1.id_ordenes_compra "
                                        + "JOIN descripcion_articulos t4 ON t4.id_articulo = t3.id_articulo "
                                        + "JOIN stock t5 ON t5.id_stock = t4.stock_id_stock "
                                        + "WHERE t1.id_ordenes_compra = '"+purchaseId+"' "
                                        + "AND t3.aceptar_eliminar_producto = 1";
                rs = con.Consulta(getPurchaseOrder);
                while(rs.next()){
                    providorName.setText(rs.getString("empresa"));
                    orderDate.setText(Utils.formatDateWithMonths(rs.getDate("fecha_pedido")));
                    purchaseOrderNumber.setText(rs.getString("id_ordenes_compra"));

                    BigDecimal auxTotal = null;
                    DefaultTableModel temp = (DefaultTableModel)
                    itemsPurchaseOrder.getModel();

                    Object nuevo[]= {temp.getRowCount()+1,"",""};
                    temp.addRow(nuevo);
                    String item = Integer.toString (j+1);
                    itemsPurchaseOrder.setValueAt(item, j, 0);
                    itemsPurchaseOrder.setValueAt(rs.getString("scanning"), j, 1);
                    itemsPurchaseOrder.setValueAt(rs.getString("nombre_producto"), j, 2);
                    itemsPurchaseOrder.setValueAt(rs.getString("marca"), j, 3);
                    itemsPurchaseOrder.setValueAt(rs.getFloat("precio_costo"), j, 4);
                    itemsPurchaseOrder.setValueAt(rs.getInt("saldo_stock"), j, 5);
                    itemsPurchaseOrder.setValueAt(rs.getInt("cantidad"), j, 6);
                    itemsPurchaseOrder.setValueAt((rs.getBigDecimal("precio_costo").multiply(rs.getBigDecimal("cantidad"))).setScale(2, RoundingMode.CEILING), j, 7);
                    itemsPurchaseOrder.setValueAt(rs.getInt("id_articulo"), j, 8);
                    itemsPurchaseOrder.setValueAt(rs.getInt("id_stock"), j, 9);
                    j++;
                }
                setTotal();
                acceptReception.setEnabled(true);
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(RecepcionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_purchaseResultMouseClicked

    private void acceptReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptReceptionActionPerformed
        if(paymentType.getSelectedItem() == null || paymentType.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una forma de pago");
            paymentType.requestFocus();
        } else {
            try {
                Integer oldStockBalance [] = new Integer[j];
                Integer quantityRequested [] = new Integer[j];
                Integer newStockBalance [] = new Integer[j];
                Integer idUpdateArt [] = new Integer[j];
                Integer stockIdToMovement [] = new Integer[j];
                for(int i = 0; i<j; i++){
                    idUpdateArt[i] = Integer.parseInt(itemsPurchaseOrder.getValueAt(i, 8).toString());
                    oldStockBalance[i] = Integer.parseInt(itemsPurchaseOrder.getValueAt(i, 5).toString());
                    quantityRequested[i] = Integer.parseInt(itemsPurchaseOrder.getValueAt(i, 6).toString());
                    newStockBalance[i] = oldStockBalance[i] + quantityRequested[i];
                    stockIdToMovement [i] = Integer.parseInt(itemsPurchaseOrder.getValueAt(i, 9).toString());
                    String updateStock = "UPDATE stock SET saldo_stock = "+newStockBalance[i]+" WHERE id_articulo ="+idUpdateArt[i]+"";
                    con.ejecutar(updateStock);
                    String insertStockMovement = "INSERT INTO (fecha_movimiento_stock, entrada, stock_id_stock) VALUES ("+quantityRequested[i]+", CURRENT_TIMESTAMP, '"+stockIdToMovement[i]+"')";
                    con.ejecutar(insertStockMovement);
                    String updateArticle = "UPDATE oc_productos SET aceptar_eliminar_producto = 2 WHERE id_articulo = "+idUpdateArt[i]+" AND id_orden_de_compra = '"+purchaseOrderNumber.getText()+"'";
                    con.ejecutar(updateArticle);
                }
                String updatePurchaseOrder = "UPDATE ordenes_compra SET total = '"+totalPurchase.getText()+"', fecha_recepcion = '"+Utils.formatDateForConfig(receptionDate.getDate())+"', fecha_de_pago = '"+Utils.formatDateForConfig(receptionDate.getDate())+"', forma_pago_id_forma_pago = "+paymentType.getSelectedIndex()+", estado_orden = 3 WHERE id_ordenes_compra = '"+purchaseOrderNumber.getText()+"'";
                con.ejecutar(updatePurchaseOrder);
                con.Cerrar();
                clearReceptionPurchaseOrderFields();
            } catch (SQLException ex) {
               Logger.getLogger(RecepcionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_acceptReceptionActionPerformed
    
    private void setTotal(){
        BigDecimal addResult = new BigDecimal(BigInteger.ZERO);
        BigDecimal addToTotal = new BigDecimal(BigInteger.ZERO);
        String result = null;
        int totalRow= itemsPurchaseOrder.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++) {
            addToTotal= new BigDecimal(String.valueOf(itemsPurchaseOrder.getValueAt(i,7).toString()));
            addResult = addResult.add(addToTotal);
            result = addResult.toString();
            totalPurchase.setText(result);
        }
    }
    
    private void getPurchaseFromDB(){
        try{
            con = new Conexion();
            String getPurchaseInfo = "SELECT t1.id_ordenes_compra, t1.id_proveedor, t1.fecha_pedido, t1.estado_orden, t2.empresa, t3.descripcion FROM ordenes_compra t1 INNER JOIN proveedores t2 ON t2.id_proveedor = t1.id_proveedor INNER JOIN estado_orden_compra t3 ON t3.id_estado_orden_compra = t1.estado_orden WHERE t1.fecha_pedido >= date_format('"+Utils.formatDateForConfig(orderPurchaseDate.getDate())+"', '%Y-%m-%d 00:00:00') AND t1.fecha_pedido < date_format('"+Utils.formatDateForConfig(orderPurchaseDate.getDate())+"', '%Y-%m-%d 23:59:59') AND estado_orden = 1";
            rs = con.Consulta(getPurchaseInfo);
            while(rs.next()) {
                DefaultTableModel temporal = (DefaultTableModel)
                purchaseResult.getModel();

                Object showPurchase[]= {temporal.getRowCount()+1,"",""};
                temporal.addRow(showPurchase);
                purchaseResult.setValueAt(rs.getInt("id_ordenes_compra"), j, 0);
                purchaseResult.setValueAt(rs.getString("empresa"), j, 1);
                purchaseResult.setValueAt(rs.getString("fecha_pedido"), j, 2);
                purchaseResult.setValueAt(rs.getString("descripcion"), j, 3);
                j++;
            }
            con.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(RecepcionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearReceptionPurchaseOrderFields(){
        DefaultTableModel deleteItemsTable = (DefaultTableModel) itemsPurchaseOrder.getModel();
        deleteItemsTable.setRowCount(0);
        DefaultTableModel deletePurchaseResult = (DefaultTableModel) purchaseResult.getModel();
        deletePurchaseResult.setRowCount(0);
        j = 0;
        getPurchaseFromDB();
        receptionDate.setDate(null);
        paymentType.setSelectedIndex(0);
        providorName.setText("");
        orderDate.setText("");
        purchaseOrderNumber.setText("");
        totalPurchase.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptReception;
    private javax.swing.JButton deleteItem;
    private javax.swing.JTable itemsPurchaseOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField orderDate;
    private com.toedter.calendar.JDateChooser orderPurchaseDate;
    private javax.swing.JComboBox<String> paymentType;
    private javax.swing.JTextField providorName;
    private javax.swing.JTextField purchaseOrderNumber;
    private javax.swing.JTable purchaseResult;
    private com.toedter.calendar.JDateChooser receptionDate;
    private javax.swing.JTextField totalPurchase;
    // End of variables declaration//GEN-END:variables
}
