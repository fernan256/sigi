package sigi;

import Connection.Conexion;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class Stock extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j = 0;
    private int auxiliarValue = 0, adjustmentValue = 0, resultValue = 0, idArticulo = 0, stockMinToSave = 0;
    private String result = null;
    JTable viewCriticStock = new JTable();
    
    public Stock() {
        initComponents();
        searchScannings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        minStock = new javax.swing.JFormattedTextField();
        actualStock = new javax.swing.JFormattedTextField();
        updateMinStock = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addStock = new javax.swing.JFormattedTextField();
        addToStock = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fitValue = new javax.swing.JFormattedTextField();
        fitDescription = new javax.swing.JTextField();
        fitStock = new javax.swing.JButton();
        showArticles = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        cleanfields = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        stockId = new javax.swing.JTextField();
        getScanningToSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Codigo de producto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Nombre");

        productName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Stock actual");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Stock Minimo");

        minStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        actualStock.setEditable(false);
        actualStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        actualStock.setToolTipText("");
        actualStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        updateMinStock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        updateMinStock.setText("Modificar Stock Mínimo");
        updateMinStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMinStockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Agregar stock");

        addStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        addToStock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addToStock.setText("Agregar");
        addToStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToStockActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Ajuste");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Descripción ajuste");

        fitValue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        fitDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        fitStock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fitStock.setText("Ajuste");
        fitStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitStockActionPerformed(evt);
            }
        });

        showArticles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        showArticles.setText("Ver Stock Crítico");
        showArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showArticlesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Marca");

        brand.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cleanfields.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cleanfields.setText("Borrar Campos");
        cleanfields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanfieldsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("ID Stock");

        stockId.setEditable(false);
        stockId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        getScanningToSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getScanningToSearchKeyReleased(evt);
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
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(minStock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addToStock, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(updateMinStock))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fitValue, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fitDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(fitStock, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(345, 345, 345))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cleanfields)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actualStock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(brand, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(getScanningToSearch))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(getScanningToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addToStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fitValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fitDescription)
                    .addComponent(fitStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanfields, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showArticlesActionPerformed
        try {            
            con = new Conexion();
            String getCritialStock =  "SELECT t1.id_articulo, t1.scanning, t1.nombre_producto, t2.stock_min, t2.saldo_stock FROM descripcion_articulos t1 INNER JOIN stock t2 ON t2.id_articulo = t1.id_articulo WHERE t2.saldo_stock <= t2.stock_min";
            rs = con.Consulta(getCritialStock);
            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
            viewCriticStock.setModel(buscar);
            buscar.addColumn("ID Articulos");
            buscar.addColumn("Scaning");
            buscar.addColumn("Nombre Producto");
            buscar.addColumn("Stock");
            buscar.addColumn("Stock Minimo");
            while(rs.next()){
                Object[] fila = new Object[5];
                fila[0] = rs.getString("id_articulo");
                fila[1] = rs.getString("scanning");
                fila[2] = rs.getString("nombre_producto");
                fila[3] = rs.getInt("saldo_stock");
                fila[4] = rs.getInt("stock_min");
                buscar.addRow(fila);
            }
            JScrollPane scrollPane = new JScrollPane(viewCriticStock);
            scrollPane.setPreferredSize(new Dimension(650, 550));
            JOptionPane.showMessageDialog(null, scrollPane, "Datos a exportar", JOptionPane.PLAIN_MESSAGE);
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showArticlesActionPerformed

    private void updateMinStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMinStockActionPerformed
        try {
            con = new Conexion();
            stockMinToSave = Integer.parseInt(minStock.getText());
            String updateMinimunStock = "UPDATE stock SET stock_min = "+stockMinToSave+" WHERE id_articulo LIKE '"+idArticulo+"'";
            con.ejecutar(updateMinimunStock);
            fillFields();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateMinStockActionPerformed

    private void fitStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitStockActionPerformed
        try {
            con = new Conexion();
            auxiliarValue = Integer.parseInt(actualStock.getText());
            adjustmentValue = Integer.parseInt(fitValue.getText());
            resultValue = auxiliarValue - adjustmentValue;
            String saveFitStock = "UPDATE stock SET saldo_stock = "+resultValue+" WHERE id_articulo ="+idArticulo+"";
            con.ejecutar(saveFitStock);
            String insertStockMovement = "INSERT INTO movimiento_stock (fecha_movimiento_stock, salida, stock_id_stock) VALUES (CURRENT_TIMESTAMP, "+adjustmentValue+", '"+stockId.getText()+"')";
            con.ejecutar(insertStockMovement);
            String saveFitDescription = "INSERT INTO detalle_ajuste_stock (descripcion, fecha_ajuste, cantidad_ajustada, stock_id_stock) VALUES ('"+fitDescription.getText()+"', CURRENT_TIMESTAMP, "+adjustmentValue+", "+idArticulo+")";
            con.ejecutar(saveFitDescription);
            fitValue.setText("");
            fitDescription.setText("");
            fillFields();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fitStockActionPerformed

    private void addToStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToStockActionPerformed
        try {
            con = new Conexion();
            auxiliarValue = Integer.parseInt(actualStock.getText());
            adjustmentValue = Integer.parseInt(addStock.getText());
            resultValue = auxiliarValue + adjustmentValue;
            String updateStockStatus = "UPDATE stock SET saldo_stock = "+resultValue+" WHERE id_articulo = "+idArticulo+"";
            con.ejecutar(updateStockStatus);
            String insertStockMovement = "INSERT INTO movimiento_stock (fecha_movimiento_stock, entrada, stock_id_stock) VALUES (CURRENT_TIMESTAMP, "+adjustmentValue+", '"+stockId.getText()+"')";
            con.ejecutar(insertStockMovement);
            addStock.setText("");
            fillFields();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addToStockActionPerformed

    private void cleanfieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanfieldsActionPerformed
        clearStockFields();
    }//GEN-LAST:event_cleanfieldsActionPerformed

    private void getScanningToSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getScanningToSearchKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fillFields();
        }
    }//GEN-LAST:event_getScanningToSearchKeyReleased

    public void searchScannings(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(getScanningToSearch);
            String sql ="SELECT scanning FROM descripcion_articulos";
            rs = con.Consulta(sql);
            while(rs.next()){
                result = rs.getString("scanning");
                textAutoAcompleter.addItem(result);
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillFields(){
        try {
            con = new Conexion();
            String scanning = getScanningToSearch.getText();
            String findArticulo ="SELECT t1.*, t2.* FROM descripcion_articulos t1 INNER JOIN stock t2 ON t2.id_articulo = t1.id_articulo WHERE t1.scanning = '"+scanning+"'";
            rs = con.Consulta(findArticulo);
            while(rs.next()){
                productName.setText(rs.getString("nombre_producto"));
                actualStock.setText(rs.getString("saldo_stock"));
                idArticulo = rs.getInt("id_articulo");
                minStock.setText(rs.getString("stock_min"));
                brand.setText(rs.getString("marca"));
                stockId.setText(rs.getString("id_stock"));
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void clearStockFields() {
        getScanningToSearch.setText("");
        productName.setText("");
        actualStock.setText("");
        minStock.setText("");
        addStock.setText("");
        fitValue.setText("");
        fitDescription.setText("");
        brand.setText("");
        stockId.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField actualStock;
    private javax.swing.JFormattedTextField addStock;
    private javax.swing.JButton addToStock;
    private javax.swing.JTextField brand;
    private javax.swing.JButton cleanfields;
    private javax.swing.JTextField fitDescription;
    private javax.swing.JButton fitStock;
    private javax.swing.JFormattedTextField fitValue;
    private javax.swing.JTextField getScanningToSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField minStock;
    private javax.swing.JTextField productName;
    private javax.swing.JButton showArticles;
    private javax.swing.JTextField stockId;
    private javax.swing.JButton updateMinStock;
    // End of variables declaration//GEN-END:variables
}
