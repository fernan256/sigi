package sigi;

import Connection.Conexion;
import Utils.Utils;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.*;
import jxl.read.biff.BiffException;

public class AltaModificaionArticulos extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j = 0; 
    public int idArticle = 0;
    private static DefaultTableModel modelo;
    private Vector columna = new Vector();
    private Vector filas = new Vector();
         
    public AltaModificaionArticulos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTscanning = new javax.swing.JTextField(80);
        jTnombre_producto = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jTprecio_costo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTprecio_venta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        updateArticle = new javax.swing.JButton();
        jTcantidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        importFromExcel = new javax.swing.JButton();
        exportToExcel = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        exportTable = new javax.swing.JTable();
        jTmarca = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Scanning:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jTscanning.setMaximumSize(null);
        jTscanning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTscanningKeyPressed(evt);
            }
        });
        getContentPane().add(jTscanning, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 290, -1));

        jTnombre_producto.setAutoscrolls(false);
        getContentPane().add(jTnombre_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 290, -1));

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        getContentPane().add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, 30));

        jTprecio_costo.setAutoscrolls(false);
        getContentPane().add(jTprecio_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 100, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Precio de costo: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jTprecio_venta.setAutoscrolls(false);
        getContentPane().add(jTprecio_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 100, -1));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 130, 30));

        updateArticle.setText("Modificar");
        updateArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateArticleActionPerformed(evt);
            }
        });
        getContentPane().add(updateArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 130, 30));

        jTcantidad.setEditable(false);
        jTcantidad.setAutoscrolls(false);
        getContentPane().add(jTcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 100, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Marca:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 130, 30));

        importFromExcel.setText("Importar de Excel");
        importFromExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFromExcelActionPerformed(evt);
            }
        });
        getContentPane().add(importFromExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 170, 40));

        exportToExcel.setText("Exportar a Excel");
        exportToExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportToExcelActionPerformed(evt);
            }
        });
        getContentPane().add(exportToExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 160, 40));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Precio de venta: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        exportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(exportTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 810, 240));

        jTmarca.setAutoscrolls(false);
        getContentPane().add(jTmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText("Nombre del Producto:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        if (jTnombre_producto.getText().equals("")||jTscanning.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");
        } else {
            try {
                try {
                    con = new Conexion();
                } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
                }
                String nombre_producto = jTnombre_producto.getText();
                String marca = jTmarca.getText();
                String existencia = jTcantidad.getText();
                String precio_costo = jTprecio_costo.getText();
                String precio_venta = jTprecio_venta.getText();
                String scanning = jTscanning.getText();
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
                jTscanning.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jTscanningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTscanningKeyPressed
        try {
            try {
                con = new Conexion();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            String scanning= jTscanning.getText();
            String getArticles = "SELECT * FROM descripcion_articulos WHERE scanning LIKE '"+scanning+"%'";
            rs = con.Consulta(getArticles);
            if(!rs.isBeforeFirst()) {
                clearCrudArticlesFields();
                jTcantidad.setEditable(true);
            } else {
                while(rs.next()){
                    idArticle = rs.getInt("id_articulo");
                    jTnombre_producto.setText(rs.getString("nombre_producto"));
                    jTmarca.setText(rs.getString("marca"));
                    jTprecio_costo.setText(rs.getString("precio_costo"));
                    jTprecio_venta.setText(rs.getString("precio_venta"));
                }
                jTcantidad.setEditable(false);
                String getSaldo = "SELECT saldo_stock FROM stock WHERE id_articulo = "+idArticle+"";
                rs = con.Consulta(getSaldo);
                while(rs.next()){
                    jTcantidad.setText(rs.getString("saldo_stock"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTscanningKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearCrudArticlesFields();
        jTscanning.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BajaArticulos elimin = new BajaArticulos();
        elimin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateArticleActionPerformed
        try { 
            try {
            con = new Conexion();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
            }   
            String scanning = jTscanning.getText();
            String nombre_producto = jTnombre_producto.getText();
            String precio_costo = jTprecio_costo.getText();
            String precio_venta = jTprecio_venta.getText();
            
            String update = "UPDATE descripcion_articulos SET scanning='"+scanning+"', nombre_producto='"+nombre_producto+"', precio_costo='"+precio_costo+"', precio_venta='"+precio_venta+"' WHERE id_articulo = '"+idArticle+"'";
            con.ejecutar(update);
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            clearCrudArticlesFields();
            jTscanning.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateArticleActionPerformed

    private void exportToExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportToExcelActionPerformed
        try {
            try {
                con = new Conexion();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlc = "SELECT * FROM descripcion_articulos";
            rs = con.Consulta(sqlc);
            
            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
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
                fila[4] = rs.getInt("precio_venta");
                buscar.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(AltaModificaionArticulos.this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File dir = dialog.getSelectedFile();
            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(exportTable);
                ExportarExcel excelExporter = new ExportarExcel(tb, new File(dir.getAbsolutePath() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_exportToExcelActionPerformed

    private void importFromExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFromExcelActionPerformed
        JFileChooser examinar = new JFileChooser();
        examinar.setFileFilter(new FileNameExtensionFilter("Archivo Excel", "xls"));
        int opcion = examinar.showSaveDialog(AltaModificaionArticulos.this);
        File archivoExcel = null;
        if (opcion == JFileChooser.APPROVE_OPTION) {
            archivoExcel = examinar.getSelectedFile().getAbsoluteFile();
            try {
                CrearTabla(archivoExcel);
            } catch(IOException ex) {
                Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }
        }
    }//GEN-LAST:event_importFromExcelActionPerformed
    
    public void CrearTabla(File file) throws IOException {
        Workbook workbook = null;
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Marca");
        modelo.addColumn("Peso");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Scaning");
        modelo.addColumn("Precio Costo");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Tipo Articulo");
        this.exportTable.setModel(modelo);
        try {
            workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
            columna.clear();
            for (int i = 0; i < sheet.getColumns(); i++) {
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents());
            }
            filas.clear();
            for (int j = 1; j < sheet.getRows(); j++) {
                Vector d = new Vector();
                for (int i = 0; i < sheet.getColumns(); i++) {
                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                modelo.addRow(d);
            }
            int ax = JOptionPane.showConfirmDialog(null, "Confirma guardar datos en la base local?");
            if(ax == JOptionPane.YES_OPTION){
                j = exportTable.getRowCount();
                String ID = null;
                if (j==0){
                    JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");
                }else{
                    try {
                        try {
                            con = new Conexion();
                        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        String nombreProducto[] = new String[j];
                        String marca[] = new String[j];
                        String scanning;
                        String precioCosto, precioVenta;
                        String tipoArticulo[] = new String[j];
                        double scanningDouble[] = new double[j];
                        float precioVentaFlo[] = new float[j];
                        float precioCostoFlo[] = new float[j];
                        String cantidad[] = new String[j];
                        int articuloId = 0, stockId = 0;
                        String insertInToStock;
                        //Object nombreProductoObj = null, marcaObj = null, scanningObj = null, precioCostoObj = null, precioVentaObj = null, pesoObj = null;
                        for (int i=0; i<j; i++) {
                           // nombreProductoObj = exportTable.getValueAt(i, 0);
                            nombreProducto[i] = Utils.objectToString(exportTable.getValueAt(i, 0));
                            //marcaObj = exportTable.getValueAt(i, 1);
                            marca[i] = Utils.objectToString(exportTable.getValueAt(i, 1));
                            //cantidadInicial=objectToString(exportTable.getValueAt(i, 3));
                            cantidad[i]= Utils.objectToString(exportTable.getValueAt(i, 2));
                            //scanningObj = exportTable.getValueAt(i, 4);
                            scanning = Utils.objectToString(exportTable.getValueAt(i, 3));
                            //precioCostoObj = exportTable.getValueAt(i, 5);
                            precioCosto = Utils.objectToString(exportTable.getValueAt(i, 4));
                            //precioVentaObj =  exportTable.getValueAt(i, 6);
                            precioVenta = Utils.objectToString(exportTable.getValueAt(i, 5));
                            tipoArticulo[i] = Utils.objectToString(exportTable.getValueAt(i, 6));
                            precioVentaFlo[i] = Float.parseFloat(precioVenta);
                            scanningDouble[i] = Double.parseDouble(scanning);
                            precioCostoFlo[i] = Float.parseFloat(precioCosto);

                            String insertArticulos = "INSERT INTO `descripcion_articulos`(`scanning`, `nombre_producto`, `marca`, `precio_costo`, `precio_venta`, `tipo_articulo_id`) VALUES ('"+scanningDouble[i]+"', '"+nombreProducto[i]+"', '"+ marca[i]+"', '"+precioCostoFlo[i]+"','"+precioVentaFlo[i]+"', '"+tipoArticulo[i]+"')";
                            con.ejecutar(insertArticulos);
                            String getArticuloId = "SELECT LAST_INSERT_ID() AS id_articulo";
                            rs = con.Consulta(getArticuloId);
                            while (rs.next()) {
                                articuloId = rs.getInt("id_articulo");
                            }
                            insertInToStock = "INSERT INTO `stock`(`id_articulo`, `saldo_stock`) VALUES ('"+articuloId+"','"+cantidad[i]+"')";
                            con.ejecutar(insertInToStock);
                            String getStockId = "SELECT LAST_INSERT_ID() AS id_stock"; 
                            rs = con.Consulta(getStockId);
                            while(rs.next()) {
                                stockId = rs.getInt("id_stock");
                            }
                            String updateArticulos = "UPDATE `descripcion_articulos` SET `stock_id_stock` = "+stockId+" WHERE `id_articulo` = "+articuloId+"";
                            con.ejecutar(updateArticulos);          
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }  
            JOptionPane.showMessageDialog(null, "Se guardaron "+j+" registros");
            j=0;
            }else if(ax == JOptionPane.NO_OPTION)
                JOptionPane.showMessageDialog(null, "Cancelar");
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
    public void clearCrudArticlesFields() {
        jTnombre_producto.setText("");
        jTmarca.setText("");
        jTcantidad.setText("");
        jTprecio_costo.setText("");
        jTprecio_venta.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable exportTable;
    private javax.swing.JButton exportToExcel;
    private javax.swing.JButton importFromExcel;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcantidad;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTnombre_producto;
    private javax.swing.JTextField jTprecio_costo;
    private javax.swing.JTextField jTprecio_venta;
    private javax.swing.JTextField jTscanning;
    private javax.swing.JButton updateArticle;
    // End of variables declaration//GEN-END:variables
}
