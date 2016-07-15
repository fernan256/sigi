package sigi;

import Connection.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AltaModificaionArticulos extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j = 0; 
    public int idArticle = 0;
         
    public AltaModificaionArticulos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scanningToSearch = new javax.swing.JTextField(80);
        articuleName = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        costPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        salesPrice = new javax.swing.JTextField();
        deleteArticule = new javax.swing.JButton();
        changeArticule = new javax.swing.JButton();
        articuleQuantity = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cleanFields = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        articuleBrand = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Scanning");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Cantidad");

        scanningToSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        scanningToSearch.setMaximumSize(null);
        scanningToSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scanningToSearchKeyPressed(evt);
            }
        });

        articuleName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        articuleName.setAutoscrolls(false);

        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        costPrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        costPrice.setAutoscrolls(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Precio de costo");

        salesPrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salesPrice.setAutoscrolls(false);

        deleteArticule.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteArticule.setText("Eliminar");
        deleteArticule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteArticuleActionPerformed(evt);
            }
        });

        changeArticule.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        changeArticule.setText("Modificar");
        changeArticule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeArticuleActionPerformed(evt);
            }
        });

        articuleQuantity.setEditable(false);
        articuleQuantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        articuleQuantity.setAutoscrolls(false);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setText("Marca");

        cleanFields.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cleanFields.setText("Cancelar");
        cleanFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanFieldsActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("Precio de venta ");

        articuleBrand.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        articuleBrand.setAutoscrolls(false);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel18.setText("Nombre del Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(articuleName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scanningToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(costPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(articuleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(articuleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cleanFields, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(changeArticule, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteArticule, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scanningToSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(articuleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(articuleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(articuleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanFields, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeArticule, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteArticule, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (articuleName.getText().equals("")||scanningToSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");
        } else {
            try {
                con = new Conexion();
                String nombre_producto = articuleName.getText();
                String marca = articuleBrand.getText();
                String existencia = articuleQuantity.getText();
                String precio_costo = costPrice.getText();
                String precio_venta = salesPrice.getText();
                String scanning = scanningToSearch.getText();
                int articuloId = 0, stockId = 0;
                String insertArticulos = "INSERT INTO `descripcion_articulos`(`scanning`, `nombre_producto`, `marca`, `precio_costo`, `precio_venta`) VALUES ('"+scanning+"', '"+nombre_producto+"', '"+marca+"', '"+precio_costo+"','"+precio_venta+"')";
                con.ejecutar(insertArticulos);
                String getArticuloId = "SELECT LAST_INSERT_ID() AS id_articulo";
                rs = con.Consulta(getArticuloId);
                while (rs.next()) {
                    articuloId = rs.getInt("id_articulo");
                }
                String sql = "INSERT INTO `stock`(`id_articulo`, `saldo_stock`) VALUES ('"+articuloId+"','"+existencia+"')";
                con.ejecutar(sql);
                String getStockId = "SELECT LAST_INSERT_ID() AS id_stock"; 
                rs = con.Consulta(getStockId);
                while(rs.next()) {
                    stockId = rs.getInt("id_stock");
                }
                String updateArticulos = "UPDATE `descripcion_articulos` SET `stock_id_stock` = "+stockId+" WHERE `id_articulo` = "+articuloId+"";
                con.ejecutar(updateArticulos);          
                JOptionPane.showMessageDialog(null, "Producto: "+nombre_producto+" agregado.");
                clearCrudArticlesFields();
                scanningToSearch.setText("");
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void scanningToSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scanningToSearchKeyPressed
        try {
            con = new Conexion();
            String scanning= scanningToSearch.getText();
            String getArticles = "SELECT * FROM descripcion_articulos WHERE scanning LIKE '"+scanning+"%'";
            rs = con.Consulta(getArticles);
            if(!rs.isBeforeFirst()) {
                clearCrudArticlesFields();
                articuleQuantity.setEditable(true);
            } else {
                while(rs.next()){
                    idArticle = rs.getInt("id_articulo");
                    articuleName.setText(rs.getString("nombre_producto"));
                    articuleBrand.setText(rs.getString("marca"));
                    costPrice.setText(rs.getString("precio_costo"));
                    salesPrice.setText(rs.getString("precio_venta"));
                }
                articuleQuantity.setEditable(false);
                String getSaldo = "SELECT saldo_stock FROM stock WHERE id_articulo = "+idArticle+"";
                rs = con.Consulta(getSaldo);
                while(rs.next()){
                    articuleQuantity.setText(rs.getString("saldo_stock"));
                }
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_scanningToSearchKeyPressed

    private void cleanFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanFieldsActionPerformed
        clearCrudArticlesFields();
        scanningToSearch.setText("");
    }//GEN-LAST:event_cleanFieldsActionPerformed

    private void deleteArticuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteArticuleActionPerformed
        BajaArticulos elimin = new BajaArticulos();
        elimin.setVisible(true);
    }//GEN-LAST:event_deleteArticuleActionPerformed

    private void changeArticuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeArticuleActionPerformed
        try {
            con = new Conexion();   
            String scanning = scanningToSearch.getText();
            String nombre_producto = articuleName.getText();
            String precio_costo = costPrice.getText();
            String precio_venta = salesPrice.getText();
            String update = "UPDATE descripcion_articulos SET scanning='"+scanning+"', nombre_producto='"+nombre_producto+"', precio_costo='"+precio_costo+"', precio_venta='"+precio_venta+"' WHERE id_articulo = '"+idArticle+"'";
            con.ejecutar(update);
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            clearCrudArticlesFields();
            scanningToSearch.setText("");
            con.Cerrar();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changeArticuleActionPerformed
    
    public void clearCrudArticlesFields() {
        articuleName.setText("");
        articuleBrand.setText("");
        articuleQuantity.setText("");
        costPrice.setText("");
        salesPrice.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField articuleBrand;
    private javax.swing.JTextField articuleName;
    private javax.swing.JTextField articuleQuantity;
    private javax.swing.JButton changeArticule;
    private javax.swing.JButton cleanFields;
    private javax.swing.JTextField costPrice;
    private javax.swing.JButton deleteArticule;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField salesPrice;
    private javax.swing.JTextField scanningToSearch;
    // End of variables declaration//GEN-END:variables
}
