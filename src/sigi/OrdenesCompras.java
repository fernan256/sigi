package sigi;

import Connection.Conexion;
import Utils.Utils;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrdenesCompras extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j=0; 
    static float total=0;
    public static String sendScanning = null;
    int idProveedor = 0;
    int idUser = Login.userId;
   
    public OrdenesCompras() {
        initComponents();
        fillInProvidersCombo();
        searchScanning.requestFocus();
        searchScanning.selectAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        providers = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsInPurchaseOrder = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
        searchScanning = new javax.swing.JTextField();
        totalPurchase = new javax.swing.JFormattedTextField();
        create = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        providers.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        providers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Proveedor" }));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Seleccionar Proveedor");

        itemsInPurchaseOrder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemsInPurchaseOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Scanning", "Nombre Producto", "Marca", "Precio unitario", "En Stock", "Cantidad Solicitada", "Total", "idArt", "tipoArt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemsInPurchaseOrder);
        if (itemsInPurchaseOrder.getColumnModel().getColumnCount() > 0) {
            itemsInPurchaseOrder.getColumnModel().getColumn(0).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(0).setPreferredWidth(20);
            itemsInPurchaseOrder.getColumnModel().getColumn(1).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(2).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(3).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(4).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(5).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(6).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(7).setResizable(false);
            itemsInPurchaseOrder.getColumnModel().getColumn(8).setMinWidth(0);
            itemsInPurchaseOrder.getColumnModel().getColumn(8).setPreferredWidth(0);
            itemsInPurchaseOrder.getColumnModel().getColumn(8).setMaxWidth(0);
            itemsInPurchaseOrder.getColumnModel().getColumn(9).setMinWidth(0);
            itemsInPurchaseOrder.getColumnModel().getColumn(9).setPreferredWidth(0);
            itemsInPurchaseOrder.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Borrar Campos");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        searchScanning.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        searchScanning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchScanningKeyReleased(evt);
            }
        });

        totalPurchase.setEditable(false);
        totalPurchase.setText("0.00");
        totalPurchase.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        create.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        create.setText("Crear");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Scanning");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setText("TOTAL");

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Eliminar Articulo");
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(25, 25, 25)
                                        .addComponent(searchScanning))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(providers, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addComponent(jButton1)))
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(providers, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchScanning, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        try {
            con = new Conexion();
            String prov = (String) providers.getSelectedItem();
            String sql = "SELECT * FROM proveedores WHERE empresa = '"+prov+"'";
            rs = con.Consulta(sql);
            if(rs.next()){
                idProveedor = rs.getInt("id_proveedor");
            }
            if(idProveedor == 0){
                JOptionPane.showMessageDialog(null, "Se debe seleccionar un Proveedor");
                providers.requestFocus();
            } else {
                String venta = "INSERT INTO  ordenes_compra (id_usuario, id_proveedor, total, fecha_pedido, estado_orden) VALUES ('"+idUser+"', '"+idProveedor+"', '"+totalPurchase.getText()+"', CURRENT_TIMESTAMP,1)";
                con.ejecutar(venta);
                String getIdVenta = "SELECT LAST_INSERT_ID() AS id_oc from ordenes_compra";
                int idOrdenCompra = 0;
                rs = con.Consulta(getIdVenta);
                while(rs.next()){
                    idOrdenCompra = rs.getInt("id_oc");
                }
                j = itemsInPurchaseOrder.getRowCount();
                String auxCantidadSolicitada[] = new String[j];
                String auxIdArt[] = new String[j];
                for (int i=0; i<j; i++) {
                    auxIdArt[i] = itemsInPurchaseOrder.getValueAt(i, 8).toString();
                    auxCantidadSolicitada[i] = itemsInPurchaseOrder.getValueAt(i, 6).toString();
                    venta = "INSERT INTO oc_productos (id_orden_de_compra, id_articulo, cantidad, aceptar_eliminar_producto) VALUES ('"+idOrdenCompra+"', '"+auxIdArt[i]+"', '"+auxCantidadSolicitada[i]+"', 1)";
                    con.ejecutar(venta);
                }
                JOptionPane.showMessageDialog(null, "Orden de Compra N° "+idOrdenCompra+" generada");
                clearOCFields();
            }
            con.Cerrar();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        clearOCFields();
    }//GEN-LAST:event_cancelActionPerformed

    private void searchScanningKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchScanningKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                con = new Conexion();
                String scanningToText = searchScanning.getText();
                String sql = "SELECT t1.id_articulo, t1.scanning, t1.nombre_producto, t1.marca, t1.precio_costo, t1.id_articulo, t1.tipo_articulo_id, t2.stock_min, t2.saldo_stock FROM descripcion_articulos AS t1 INNER JOIN stock AS t2 ON t1.id_articulo = t2.id_articulo WHERE t1.scanning = '"+scanningToText+"'";
                rs = con.Consulta(sql);
                int numRows = 0, articleType = 0;
                String nombre = null, marca= null, idArticulos = null;
                float cantidadInicial = 0;
                float costo_producto = 0;
                while (rs.next()) {
                    numRows++;
                    nombre = rs.getString("nombre_producto");
                    marca = rs.getString("marca");
                    costo_producto = rs.getFloat("precio_costo");
                    cantidadInicial = rs.getFloat("saldo_stock");
                    idArticulos = rs.getString("id_articulo");
                    articleType = rs.getInt("tipo_articulo_id");
                }
                if(numRows == 1) {
                    JFrame cantidadSolicitada = new JFrame("Cantidad Solicitada");
                    String openSales = JOptionPane.showInputDialog(cantidadSolicitada, "Cantidad Solicitada: ", "0");
                    BigDecimal cantiSolicitada = new BigDecimal(openSales);
                    BigDecimal auxTotal = new BigDecimal(BigInteger.ZERO);
                    if(articleType == 1) {
                        auxTotal = cantiSolicitada.multiply(new BigDecimal(costo_producto)).setScale(2, RoundingMode.CEILING);
                    } else {
                        auxTotal = cantiSolicitada.multiply(new BigDecimal(costo_producto)).setScale(2, RoundingMode.CEILING).divide(new BigDecimal(1000));
                    }
                    DefaultTableModel temp = (DefaultTableModel)
                    itemsInPurchaseOrder.getModel();
                    Object nuevo[]= {temp.getRowCount()+1,"",""};
                    temp.addRow(nuevo);
                    String item = Integer.toString (j+1);
                    itemsInPurchaseOrder.setValueAt(item, j, 0);
                    itemsInPurchaseOrder.setValueAt(scanningToText, j, 1);
                    itemsInPurchaseOrder.setValueAt(nombre, j, 2);
                    itemsInPurchaseOrder.setValueAt(marca, j, 3);
                    itemsInPurchaseOrder.setValueAt(costo_producto, j, 4);
                    itemsInPurchaseOrder.setValueAt(cantidadInicial, j, 5);
                    itemsInPurchaseOrder.setValueAt(cantiSolicitada, j, 6);
                    itemsInPurchaseOrder.setValueAt(auxTotal, j, 7);
                    itemsInPurchaseOrder.setValueAt(idArticulos, j, 8);
                    itemsInPurchaseOrder.setValueAt(articleType, j, 9);
                    j++;

                    setTotal();
                    searchScanning.setText("");
                    searchScanning.requestFocus();
                } else {
                    sendScanning = searchScanning.getText();
                    AltaArticuloRapida altaRapida = new AltaArticuloRapida();
                    altaRapida.setVisible(true);
                }
                //con.Cerrar();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchScanningKeyReleased

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel deleteRow = (DefaultTableModel) itemsInPurchaseOrder.getModel();
        int rowSelected = itemsInPurchaseOrder.getSelectedRow();
        deleteRow.removeRow(rowSelected);
        setTotal();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void fillInProvidersCombo() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("");
        providers.setModel(modeloCombo);
        try{                   
            con = new Conexion();
            String sql = "SELECT * FROM proveedores ORDER BY empresa";
            rs = con.Consulta(sql);
            int numRows = 0;
            while (rs.next()) {
                numRows++;
                modeloCombo.addElement(rs.getObject("empresa"));
                providers.setModel(modeloCombo);
                providers.updateUI();
            }
            if(numRows == 0) {
                JOptionPane.showMessageDialog(null, "No hay Proveedores Cargados en el Sistema");
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public void clearOCFields(){
        fillInProvidersCombo();
        searchScanning.setText("");
        totalPurchase.setText("0.00");
        DefaultTableModel eliminarTodo = (DefaultTableModel) itemsInPurchaseOrder.getModel();
        eliminarTodo.setRowCount(0);
        j = 0;
    }
    
    private void setTotal(){
        BigDecimal addResult = new BigDecimal(BigInteger.ZERO);
        BigDecimal addToTotal = new BigDecimal(BigInteger.ZERO);
        String result = null;
        int totalRow= itemsInPurchaseOrder.getRowCount();        
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++) {
            //int typeArticle = Integer.parseInt(itemsInPurchaseOrder.getValueAt(i, 9).toString());
            //if(typeArticle == 1) {
                addToTotal = new BigDecimal(String.valueOf(itemsInPurchaseOrder.getValueAt(i,7).toString()));
            //} else {
//                addToTotal = new BigDecimal(String.valueOf(itemsInPurchaseOrder.getValueAt(i,7).toString()));
//                addToTotal = addToTotal.divide(new BigDecimal(1000));
//            }
            addResult = addResult.add(addToTotal);
            result = addResult.toString();
            totalPurchase.setText(result);
        }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton create;
    private javax.swing.JTable itemsInPurchaseOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox providers;
    private javax.swing.JTextField searchScanning;
    private javax.swing.JFormattedTextField totalPurchase;
    // End of variables declaration//GEN-END:variables

}