package sigi;

import Connection.Conexion;
import Utils.Utils;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public final class Stock extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j = 0;
    private static DefaultTableModel modelo;
    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    JTable exports = new JTable();
    private int auxiliarValue = 0, adjustmentValue = 0, resultValue = 0, idArticulo = 0, stockMinToSave = 0;
    private String result = null;
    
    public Stock() {
        initComponents();
        searchScannings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scannign = new javax.swing.JFormattedTextField();
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
        exportAll = new javax.swing.JButton();
        importFromXls = new javax.swing.JButton();
        showArticles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        cleanfields = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        stockId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Codigo de producto");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        scannign.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        scannign.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scannignKeyReleased(evt);
            }
        });

        productName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("Stock actual");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setText("Stock Minimo");

        minStock.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        actualStock.setEditable(false);
        actualStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        actualStock.setToolTipText("");
        actualStock.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        updateMinStock.setText("Modificar Stock Mínimo");
        updateMinStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMinStockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("Agregar stock");

        addStock.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        addToStock.setText("Agregar");
        addToStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToStockActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setText("Ajuste");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("Descripción ajuste");

        fitValue.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        fitDescription.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        fitStock.setText("Ajuste");
        fitStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitStockActionPerformed(evt);
            }
        });

        exportAll.setText("Exportar Stock completo");
        exportAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportAllActionPerformed(evt);
            }
        });

        importFromXls.setText("Importar Stock completo");
        importFromXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFromXlsActionPerformed(evt);
            }
        });

        showArticles.setText("Ver Stock critico");
        showArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showArticlesActionPerformed(evt);
            }
        });

        showTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(showTable);

        jLabel5.setText("Marca");

        brand.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        cleanfields.setText("Borrar campos");
        cleanfields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanfieldsActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scannign, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fitValue, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(fitDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fitStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(actualStock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(minStock, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(updateMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(addToStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(importFromXls, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(exportAll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cleanfields))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scannign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(minStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateMinStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToStock))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fitValue)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fitDescription)
                        .addComponent(fitStock)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showArticles)
                    .addComponent(importFromXls, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exportAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cleanfields)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showArticlesActionPerformed
        try {            
            con = new Conexion();
            String sqlc =  "SELECT descripcion_articulos.scanning, descripcion_articulos.nombre_producto, descripcion_articulos.precio_costo,  stock.stock_min, stock.saldo_stock, descripcion_articulos.id_articulo FROM descripcion_articulos INNER JOIN stock ON stock.id_articulo = descripcion_articulos.id_articulo WHERE saldo_stock <= stock_min";
            rs = con.Consulta(sqlc);
            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
            this.showTable.setModel(buscar);
            buscar.addColumn("ID Articulos");
            buscar.addColumn("Scaning");
            buscar.addColumn("Nombre Producto");
            buscar.addColumn("Costo");
            buscar.addColumn("cantidad");
            buscar.addColumn("Stock minimo");
            while(rs.next()){
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("id_articulo");
                fila[1] = rs.getString("scanning");
                fila[2] = rs.getString("nombre_producto");
                fila[3] = rs.getInt("precio_costo");
                fila[4] = rs.getInt("saldo_stock");
                fila[5] = rs.getInt("stock_min");
                buscar.addRow(fila);
            }
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
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateMinStockActionPerformed

    private void scannignKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scannignKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fillFields();
        }
    }//GEN-LAST:event_scannignKeyReleased

    private void importFromXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFromXlsActionPerformed
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
    }//GEN-LAST:event_importFromXlsActionPerformed

    private void exportAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportAllActionPerformed
        try {
            con = new Conexion();
            String sqlc = "SELECT t1.id_articulo, t1.scanning, "
            + "t1.nombre_producto, t1.precio_costo, "
            + "t2.saldo_stock, t2.stock_min "
            + "FROM descripcion_articulos AS t1 INNER JOIN stock AS t2 "
            + "WHERE t1.stock_id_stock = t2.id_stock";
            rs = con.Consulta(sqlc);

            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
            this.exports.setModel(buscar);
            buscar.addColumn("ID Articulos");
            buscar.addColumn("Scaning");
            buscar.addColumn("Nombre Producto");
            buscar.addColumn("Costo");
            buscar.addColumn("cantidad");
            buscar.addColumn("Stock minimo");
            while(rs.next()){
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("id_articulo");
                fila[1] = rs.getString("scanning");
                fila[2] = rs.getString("nombre_producto");
                fila[3] = rs.getInt("precio_costo");
                fila[4] = rs.getInt("saldo_stock");
                fila[5] = rs.getInt("stock_min");
                buscar.addRow(fila);
            }
            JScrollPane scrollPane = new JScrollPane(exports);
            scrollPane.setPreferredSize(new Dimension(650, 550));
            JOptionPane.showMessageDialog(null, scrollPane, "Datos a exportar", JOptionPane.PLAIN_MESSAGE);
            JFileChooser dialog = new JFileChooser();
            int opcion = dialog.showSaveDialog(Stock.this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File dir = dialog.getSelectedFile();
                try {
                    List<JTable> tb = new ArrayList<JTable>();
                    tb.add(exports);
                    ExportarExcel excelExporter = new ExportarExcel(tb, new File(dir.getAbsolutePath() + ".xls"));
                    if (excelExporter.export()) {
                        JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportAllActionPerformed

    private void fitStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitStockActionPerformed
        try {
            con = new Conexion();
            auxiliarValue = Integer.parseInt(actualStock.getText());
            adjustmentValue = Integer.parseInt(fitValue.getText());
            resultValue = auxiliarValue - adjustmentValue;
            String saveFitStock = "UPDATE stock SET saldo_stock = "+resultValue+" WHERE id_articulo ="+idArticulo+"";
            con.ejecutar(saveFitStock);
            String insertStockMovement = "INSERT INTO movimiento_stock (fecha_movimiento_stock, salida, stock_id_stock) VALUES ("+adjustmentValue+", CURRENT_TIMESTAMP, '"+stockId.getText()+"')";
            con.ejecutar(insertStockMovement);
            String saveFitDescription = "INSERT INTO detalle_ajuste_stock (descripcion, fecha_ajuste, cantidad_ajustada, stock_id_stock) VALUES ('"+fitDescription.getText()+"', CURRENT_TIMESTAMP, "+adjustmentValue+", "+idArticulo+")";
            con.ejecutar(saveFitDescription);
            fitValue.setText("");
            fitDescription.setText("");
            fillFields();
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
            String insertStockMovement = "INSERT INTO movimiento_stock (fecha_movimiento_stock, entrada, stock_id_stock) VALUES ("+adjustmentValue+", CURRENT_TIMESTAMP, '"+stockId.getText()+"')";
            con.ejecutar(insertStockMovement);
            addStock.setText("");
            fillFields();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addToStockActionPerformed

    private void cleanfieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanfieldsActionPerformed
        clearStockFields();
    }//GEN-LAST:event_cleanfieldsActionPerformed
  
    public void CrearTabla(File file) throws IOException {
        Workbook workbook = null;
        modelo = new DefaultTableModel();
        modelo.addColumn("ID Articulos");
        modelo.addColumn("Scaning");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Costo");
        modelo.addColumn("cantidad");
        modelo.addColumn("Stock minimo");
        this.showTable.setModel(modelo);
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
                j = showTable.getRowCount();
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
                        
                        String pro[] = new String[100],p;
                        int to[] = new int[100];
                        String cant[] = new String[100];
                        Object ex = null;
                        Object pros=null;
                        for (int i=0; i<j; i++) {
                            pros = showTable.getValueAt(i, 0);
                            pro[i] = Utils.objectToString(pros);
                            p=Utils.objectToString(showTable.getValueAt(i, 4));
                            cant[i]= Utils.objectToString(p);
                            ex=  showTable.getValueAt(i, 5);
                            String xe = Utils.objectToString(ex);
                            to[i] = Integer.parseInt(xe);
                            String sqlc = "SELECT * FROM stock WHERE id_articulo = '"+pro[i]+"'";
                            rs = con.Consulta(sqlc);
                            while(rs.next()){
                                ID = rs.getString(2);
                            }
                            String modifica = "UPDATE  `stock` SET `saldo_stock` = '"+cant[i]+"', `stock_min` = '"+ex+"' WHERE `id_articulo` ='"+ID+"'";
                            con.ejecutar(modifica);
                        }j=0;
                    } catch (SQLException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }  
            JOptionPane.showMessageDialog(null, "Datos guardados");
            }else if(ax == JOptionPane.NO_OPTION)
                JOptionPane.showMessageDialog(null, "Cancelar");
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
    
    public void searchScannings(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(scannign);
            String sql ="SELECT scanning FROM descripcion_articulos";
            rs = con.Consulta(sql);
            while(rs.next()){
                result = rs.getString("scanning");
                textAutoAcompleter.addItem(result);
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillFields(){
        try {
            con = new Conexion();
            String scanning = scannign.getText();
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
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void clearStockFields() {
        scannign.setText("");
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
    private javax.swing.JButton exportAll;
    private javax.swing.JTextField fitDescription;
    private javax.swing.JButton fitStock;
    private javax.swing.JFormattedTextField fitValue;
    private javax.swing.JButton importFromXls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField minStock;
    private javax.swing.JTextField productName;
    private javax.swing.JFormattedTextField scannign;
    private javax.swing.JButton showArticles;
    private javax.swing.JTable showTable;
    private javax.swing.JTextField stockId;
    private javax.swing.JButton updateMinStock;
    // End of variables declaration//GEN-END:variables
}
