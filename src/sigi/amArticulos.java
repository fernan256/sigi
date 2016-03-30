/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigi;

import Connection.Conexion;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gustavo
 */
public class amArticulos extends javax.swing.JInternalFrame {
    Conexion con,query;
    ResultSet rs, rs1;
    ResultSet rs2;
    ResultSet rs3;
    ResultSet rs4;
    /**
     * Creates new form amArticulos
     */
    private int limite = 4;
    static int j=0,w=0,jj=0; 
    static String aux3;
    static float total=0;
    static String inv[]=new String[50000];
    static float invT=0;
    public static String id,cad,id_nota;
    String hora,minutos,segundos,ampm;
    Calendar calendario;    
    public static int rowCount, numfac;
    
    public amArticulos() {
        initComponents();
        fillProviders();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTscaning = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jTpreciocosto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTprecioventa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        updateArticle = new javax.swing.JButton();
        jTcantidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        exportToExcel = new javax.swing.JButton();
        provider = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        exportTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Scaning:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTscaning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTscaningKeyPressed(evt);
            }
        });
        getContentPane().add(jTscaning, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 220, -1));
        getContentPane().add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 420, -1));

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        getContentPane().add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 80, 40));
        getContentPane().add(jTpreciocosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 100, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Precio de costo: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Proveedor:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        getContentPane().add(jTprecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 100, -1));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, 40));

        updateArticle.setText("Modificar");
        updateArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateArticleActionPerformed(evt);
            }
        });
        getContentPane().add(updateArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, 40));

        jTcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Nombre del Producto:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, 40));

        jButton4.setText("De Excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, 40));

        exportToExcel.setText("A Excel");
        exportToExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportToExcelActionPerformed(evt);
            }
        });
        getContentPane().add(exportToExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, 40));

        getContentPane().add(provider, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Precio de venta: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        exportTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(exportTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 170, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        //BOTON PARA AGREGAR UN PRODUCTO A LA BASE DE DATOS
        // validaciones para saber que no se deja algun campo en limpio
        if (jTnombre.getText().equals("")||jTscaning.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");
        } else {
            try {
                // se comienza la conexion con la base de datos
                try {
                    con = new Conexion();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //Se obtienen los valores de los jTextField
                String nombre = jTnombre.getText();
                String existencia = jTcantidad.getText();
                String precio = jTpreciocosto.getText();
                String pventa = jTprecioventa.getText();
                String scaning = jTscaning.getText();
                int articuloId = 0, stockId = 0, providerId = 0;
                String nameProvider = provider.getSelectedItem().toString();
                String findProvider = "SELECT id_proveedor FROM proveedores WHERE empresa = '"+nameProvider+"'";
                rs = con.Consulta(findProvider);
                while(rs.next()){
                    providerId = rs.getInt("id_proveedor");
                }
                //Hago el primer INSERT para Articulos
                String insertArticulos = "INSERT INTO `descripcion_articulos`( `scanning`, `proveedores_id_proveedor`, `nombre_producto`, `precio_costo`, `precio_venta`) VALUES ('"+scaning+"', '"+providerId+"','"+nombre+"', '"+precio+"','"+pventa+"')";
                //Ejecuto el query
                con.ejecutar(insertArticulos);
                //Selecciono el ultimo id 
                String getArticuloId = "SELECT LAST_INSERT_ID() AS id_articulo";
                rs = con.Consulta(getArticuloId);
                while (rs.next()) {
                    articuloId = rs.getInt("id_articulo");
                }
                String sql = "INSERT INTO `stock`(`id_articulo`, `saldo_stock`) VALUES ('"+articuloId+"','"+existencia+"')";
                con.ejecutar(sql);
                String getStockId = "SELECT LAST_INSERT_ID() AS id_stock"; 
                rs2 = con.Consulta(getStockId);
                while(rs2.next()) {
                    stockId = rs2.getInt("id_stock");
                }
                String updateArticulos = "UPDATE `descripcion_articulos` SET `stock_id_stock` = "+stockId+" WHERE `id_articulo` = "+articuloId+"";
                con.ejecutar(updateArticulos);          
                JOptionPane.showMessageDialog(null, "Producto: "+nombre+" agregado.");
      
                jTnombre.setText("");
                jTscaning.setText("");
                jTcantidad.setText("");
                jTpreciocosto.setText("");
                jTprecioventa.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jTscaningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTscaningKeyPressed
        
        jTnombre.setText("");
        jTcantidad.setText("");
        jTpreciocosto.setText("");
        jTprecioventa.setText("");
       
        try {
            // se comienza la conexion con la base de datos
            try {
                con = new Conexion();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            int idArticle = 0, idProvider = 0; 
            String scanning= jTscaning.getText();
            String getArticles = "SELECT * FROM descripcion_articulos WHERE scanning LIKE '"+scanning+"%'";
            rs = con.Consulta(getArticles);
            if(rs==null)
            JOptionPane.showMessageDialog(null, "No se encontro el scaning: "+jTscaning.getText()+" en la base de datos.");
            while(rs.next()){
                idArticle = rs.getInt("id_articulo");
                idProvider = rs.getInt("proveedores_id_proveedor");
                jTnombre.setText(rs.getString("nombre_producto"));
                jTpreciocosto.setText(rs.getString("precio_costo"));
                jTprecioventa.setText(rs.getString("precio_venta"));
                
            }
            //System.out.println(idArticle);
            //System.out.println(idProvider);
            String getSaldo = "SELECT saldo_stock FROM stock WHERE id_articulo = "+idArticle+"";
            rs1 = con.Consulta(getSaldo);
            while(rs1.next()){
                //System.out.println();
                jTcantidad.setText(rs1.getString("saldo_stock"));
                //provider.setSelectedItem(rs1.getString("empresa"));
            }
            String getProvider = "SELECT empresa FROM proveedores WHERE id_proveedor = "+idProvider+"";
            rs1 = con.Consulta(getProvider);
            while(rs1.next()){
                //System.out.println(rs1.getString("empresa"));
                //jTcantidad.setText();
                provider.setSelectedItem(rs1.getString("empresa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTscaningKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        total=0;
        jTscaning.setText("");
        jTnombre.setText("");
        jTcantidad.setText("");
        jTpreciocosto.setText("");
        jTprecioventa.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bajaArticulos elimin = new bajaArticulos();
        elimin.setVisible(true);
       //jBvta.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcantidadActionPerformed

    private void updateArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateArticleActionPerformed
         try { 
         
                String scanning = jTscaning.getText();
                String nombre_producto = jTnombre.getText();
                String cantidad = jTcantidad.getText();
                String precio_costo = jTpreciocosto.getText();
                String precio_venta = jTprecioventa.getText();
                String nameProvider = provider.getSelectedItem().toString();
                int providerId = 0;
                
                con = new Conexion();
                String findProvider = "SELECT id_proveedor FROM proveedores WHERE empresa = '"+nameProvider+"'";
                rs = con.Consulta(findProvider);
                while(rs.next()){
                    providerId = rs.getInt("id_proveedor");
                }
            
                System.out.println(cantidad);
                System.out.println(id);
                String update = "UPDATE `descripcion_articulos` SET `scanning`='"+scanning+"', `proveedores_id_proveedor`="+providerId+", `nombre_producto`='"+nombre_producto+"',`precio_costo`='"+precio_costo+"',`precio_venta`='"+precio_venta+"' WHERE id_articulo = '"+id+"'; UPDATE `stock` SET `saldo_stock`='"+cantidad+"' WHERE id_articulo = '"+id+"'";
                con.ejecutar(update);
                JOptionPane.showMessageDialog(null, "Datos Actualizados");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_updateArticleActionPerformed

    private void exportToExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportToExcelActionPerformed
         try {
            // se comienza la conexion con la base de datos
            try {
                con = new Conexion();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlc = "SELECT * FROM descripcion_articulos";
            rs = con.Consulta(sqlc);
            
            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }};
                this.exportTable.setModel(buscar);
                buscar.addColumn("ID Articulos");
                buscar.addColumn("Scaning");
                buscar.addColumn("Nombre Producto");
                buscar.addColumn("Precio Costo");
                buscar.addColumn("Precio Venta");
                int y=0;
                while(rs.next()){

                    Object[] fila = new Object[6];
                    fila[0] = rs.getInt("id_articulo");
                    fila[1] = rs.getString("scanning");
                    fila[2] = rs.getString("nombre_producto");
                    fila[3] = rs.getInt("precio_costo");
                    fila[4] = rs.getInt("precio_vetna");
                    buscar.addRow(fila);
                }
                
		
		// stuff it in a scrollpane with a controlled size.
		JScrollPane scrollPane = new JScrollPane(exportToExcel);		
		scrollPane.setPreferredSize(new Dimension(350, 150));
		
		// pass the scrollpane to the joptionpane.				
		JOptionPane.showMessageDialog(null, scrollPane, "Datos a exportar", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(amArticulos.this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            File dir = dialog.getSelectedFile();

            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(exportTable);
                //-------------------
                export_excel excelExporter = new export_excel(tb, new File(dir.getAbsolutePath() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_exportToExcelActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    private void fillProviders(){
        try {
            // se comienza la conexion con la base de datos
            try {
                con = new Conexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(amArticulos.class.getName()).log(Level.SEVERE, null, ex);
            }
            String getProviders = "SELECT * FROM proveedores";
            rs = con.Consulta(getProviders);
            while(rs.next()){
                String providers = rs.getString("empresa");
                provider.addItem(providers);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable exportTable;
    private javax.swing.JButton exportToExcel;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcantidad;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTpreciocosto;
    private javax.swing.JTextField jTprecioventa;
    private javax.swing.JTextField jTscaning;
    private javax.swing.JComboBox<String> provider;
    private javax.swing.JButton updateArticle;
    // End of variables declaration//GEN-END:variables
}
