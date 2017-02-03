package sigi;

import Utils.ExportarExcel;
import Connection.Conexion;
import Utils.Utils;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
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
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ImportarExportarArticulos extends javax.swing.JInternalFrame implements Runnable{
    Conexion con;
    ResultSet rs;
    private int j = 0;
    private static DefaultTableModel importExportModel;
    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    Thread carga;
    Thread carga2;
    public int c1 = 0;
    public int c2 = 0;
    
    public ImportarExportarArticulos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        importExportTable = new javax.swing.JTable();
        exportAll = new javax.swing.JButton();
        importFromExcel = new javax.swing.JButton();
        cleanTable = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        importExportTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        importExportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scanning", "Nombre Articulo", "Marca", "Precio Costo", "Precio Venta", "Stock", "Stock Minimo", "Tipo Articulo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(importExportTable);
        if (importExportTable.getColumnModel().getColumnCount() > 0) {
            importExportTable.getColumnModel().getColumn(0).setResizable(false);
            importExportTable.getColumnModel().getColumn(1).setResizable(false);
            importExportTable.getColumnModel().getColumn(2).setResizable(false);
            importExportTable.getColumnModel().getColumn(3).setResizable(false);
            importExportTable.getColumnModel().getColumn(4).setResizable(false);
            importExportTable.getColumnModel().getColumn(5).setResizable(false);
            importExportTable.getColumnModel().getColumn(6).setResizable(false);
            importExportTable.getColumnModel().getColumn(7).setResizable(false);
        }

        exportAll.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exportAll.setText("Exportar a Excel");
        exportAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportAllActionPerformed(evt);
            }
        });

        importFromExcel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        importFromExcel.setText("Importar de Excel");
        importFromExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFromExcelActionPerformed(evt);
            }
        });

        cleanTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cleanTable.setText("Limpiar Tabla");
        cleanTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanTableActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportAll, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(importFromExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cleanTable)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportAll, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cleanTable, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(importFromExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportAllActionPerformed
         try {
            con = new Conexion();
            String getArticles = "SELECT t1.*, t2.* FROM descripcion_articulos t1 INNER JOIN stock t2 "
                        + "WHERE t1.stock_id_stock = t2.id_stock";
            rs = con.Consulta(getArticles);
            DefaultTableModel temp = (DefaultTableModel) importExportTable.getModel();
            Object nuevo[] = {temp.getRowCount()+1,"",""};
            while(rs.next()){
                temp.addRow(nuevo);
                importExportTable.setValueAt(rs.getString("scanning"), j, 0);
                importExportTable.setValueAt(rs.getString("nombre_producto"), j, 1);
                importExportTable.setValueAt(rs.getString("marca"), j, 2);
                importExportTable.setValueAt(rs.getString("precio_costo"), j, 3);
                importExportTable.setValueAt(rs.getString("precio_venta"), j, 4);
                importExportTable.setValueAt(rs.getInt("saldo_stock"), j, 5);
                importExportTable.setValueAt(rs.getInt("stock_min"), j, 6);
                importExportTable.setValueAt(rs.getInt("tipo_articulo_id"), j, 7);
                j++;
            }
            JFileChooser dialog = new JFileChooser();
            int opcion = dialog.showSaveDialog(ImportarExportarArticulos.this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File dir = dialog.getSelectedFile();
                try {
                    List<JTable> tb = new ArrayList<JTable>();
                    tb.add(importExportTable);
                    ExportarExcel excelExporter = new ExportarExcel(tb, new File(dir.getAbsolutePath() + ".xls"));
                    if (excelExporter.export()) {
                        JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportAllActionPerformed

    private void importFromExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFromExcelActionPerformed
        //FileChooser.showDialog(null, "Importar Hoja ");
        //File file = FileChooser.getSelectedFile();
        //if (!file.getName().endsWith("xls")) {
//            JOptionPane.showMessageDialog(null, "Seleccione un archivo excel...", "Error", JOptionPane.ERROR_MESSAGE);
//        } else {
            carga = new Thread(this);
            carga.start();
//            try {
//                CrearTabla(file);
//            } catch (IOException ex) {
//                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_importFromExcelActionPerformed

    private void cleanTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanTableActionPerformed
        cleanImportExportFields();
    }//GEN-LAST:event_cleanTableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carga = new Thread(this);
        carga2 = new Thread(this);
        
        carga.start();
        carga2.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void CrearTabla(File file) throws IOException {
        Workbook workbook = null;
        importExportModel = new DefaultTableModel();
        importExportModel.addColumn("Scanning");
        importExportModel.addColumn("Nombre Producto");
        importExportModel.addColumn("Marca");
        importExportModel.addColumn("Precio Costo");
        importExportModel.addColumn("Precio Venta");
        importExportModel.addColumn("Stock");
        importExportModel.addColumn("Stock Minimo");
        importExportModel.addColumn("Tipo Articulo");
        this.importExportTable.setModel(importExportModel);
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
                importExportModel.addRow(d);
            }
            int ax = JOptionPane.showConfirmDialog(null, "Confirma guardar datos en la base local?");
            if(ax == JOptionPane.YES_OPTION){
                j = importExportTable.getRowCount();
                if (j==0){
                    JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");
                }else{
                    try {
                        con = new Conexion();
                        String articleName[] = new String[j];
                        String articleBrand[] = new String[j];
                        BigDecimal scanning[] = new BigDecimal[j];
                        int articleType[] = new int[j];
                        BigDecimal costPrice[] = new BigDecimal[j];
                        BigDecimal salesPrice[] = new BigDecimal[j];
                        BigDecimal stock[] = new BigDecimal[j];
                        BigDecimal stockMin[] = new BigDecimal[j];
                        int articuloId = 0, stockId = 0;
                        String insertInToStock;
                        for (int i=0; i<j; i++) {
                            scanning[i] = new BigDecimal(Utils.objectToString(importExportTable.getValueAt(i, 0)));
                            System.out.println(scanning[i]);
                            String searchItems = "SELECT * FROM descripcion_articulos WHERE scanning = '"+scanning[i]+"'";
                            rs = con.Consulta(searchItems);
                            while(rs.next()){
                                if(scanning[i] != null) {
                                    System.out.println("True");
                                }
                            }
                            articleName[i] = Utils.objectToString(importExportTable.getValueAt(i, 1));
                            articleBrand[i]= Utils.objectToString(importExportTable.getValueAt(i, 2));
                            costPrice[i] = new BigDecimal(Utils.objectToString(importExportTable.getValueAt(i, 3)));
                            salesPrice[i] = new BigDecimal(Utils.objectToString(importExportTable.getValueAt(i, 4)));
                            stock[i] = new BigDecimal(Utils.objectToString(importExportTable.getValueAt(i, 5)));
                            stockMin[i] = new BigDecimal(Utils.objectToString(importExportTable.getValueAt(i, 6)));
                            articleType[i] = Integer.parseInt(Utils.objectToString(importExportTable.getValueAt(i, 7)));
                            //String insertArticulos = "INSERT INTO descripcion_articulos (scanning, nombre_producto, marca, precio_costo, precio_venta, tipo_articulo_id) VALUES ('"+scanning[i]+"', '"+articleName[i]+"', '"+articleBrand[i]+"', '"+costPrice[i]+"','"+salesPrice[i]+"', '"+articleType[i]+"')";
                            //con.ejecutar(insertArticulos);
                            //String getArticuloId = "SELECT LAST_INSERT_ID() AS id_articulo";
                            //rs = con.Consulta(getArticuloId);
                            //while (rs.next()) {
//                                articuloId = rs.getInt("id_articulo");
//                            }
//                            insertInToStock = "INSERT INTO stock(id_articulo, saldo_stock, stock_min) VALUES ('"+articuloId+"','"+stock[i]+"', '"+stockMin[i]+"')";
//                            con.ejecutar(insertInToStock);
//                            String getStockId = "SELECT LAST_INSERT_ID() AS id_stock FROM stock"; 
//                            rs = con.Consulta(getStockId);
//                            while(rs.next()) {
//                                stockId = rs.getInt("id_stock");
//                            }
//                            String updateArticulos = "UPDATE descripcion_articulos SET stock_id_stock = "+stockId+" WHERE id_articulo = "+articuloId+"";
//                            con.ejecutar(updateArticulos);
//                            String insertStockMovement = "INSERT INTO movimiento_stock (fecha_movimiento_stock, entrada, stock_id_stock) VALUES (CURRENT_TIMESTAMP, "+stock[i]+", '"+stockId+"')";
//                          con.ejecutar(insertStockMovement);
                        }
                        con.Cerrar();
                    } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            JOptionPane.showMessageDialog(null, "Se guardaron "+j+" productos.");
            }else if(ax == JOptionPane.NO_OPTION)
                JOptionPane.showMessageDialog(null, "Cancelar");
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
    //private static updateArticle(){
       
    //}
    //private static createArticle(){
        
    //}
    public void cleanImportExportFields(){
        DefaultTableModel deleteTable = (DefaultTableModel) importExportTable.getModel();
        deleteTable.setRowCount(0);
        j = 0;
    }
    public void importFile (File file) throws IOException{
        //c1++;
        CrearTabla(file);
    }
    public void corredor2() {
        c2++;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanTable;
    private javax.swing.JButton exportAll;
    private javax.swing.JTable importExportTable;
    private javax.swing.JButton importFromExcel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Thread ct = Thread.currentThread();
 
        if(ct == carga) {
            FileChooser.showDialog(null, "Importar Hoja ");
            File file = FileChooser.getSelectedFile();
            if (!file.getName().endsWith("xls")) {
                JOptionPane.showMessageDialog(null, "Seleccione un archivo excel...", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    CrearTabla(file);
                } catch (IOException ex) {
                    Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        while (ct == carga2) {            
            corredor2();
            System.out.println("Corredor 2: " + c2);
        }
    }
}
