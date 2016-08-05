package sigi;

import Utils.ExportarExcel;
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
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ImportarExportarClientes extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    private int j = 0;
    private static DefaultTableModel importExportModel;
    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    
    public ImportarExportarClientes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exportAll = new javax.swing.JButton();
        importFromExcel = new javax.swing.JButton();
        cleanTable = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        importExportClientTable = new javax.swing.JTable();

        setClosable(true);

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

        importExportClientTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        importExportClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Direccion", "Provincia", "Departamento", "Celular", "Telefono", "Mail", "Fecha Alta", "Fecha Nacimiento", "Activo", "Cuenta Corriente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(importExportClientTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(exportAll, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(importFromExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cleanTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportAll, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(importFromExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cleanTable, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportAllActionPerformed
        try {
            con = new Conexion();
            String getAllClients = "SELECT * FROM clientes";
            rs = con.Consulta(getAllClients);
            DefaultTableModel temp = (DefaultTableModel) importExportClientTable.getModel();
            Object nuevo[] = {temp.getRowCount()+1,"",""};
            while(rs.next()){
                temp.addRow(nuevo);
                importExportClientTable.setValueAt(rs.getString("nombres"), j, 0);
                importExportClientTable.setValueAt(rs.getString("apellidos"), j, 1);
                importExportClientTable.setValueAt(rs.getString("direccion"), j, 2);
                importExportClientTable.setValueAt(rs.getString("provincia"), j, 3);
                importExportClientTable.setValueAt(rs.getString("departamento"), j, 4);
                importExportClientTable.setValueAt(rs.getString("celular"), j, 5);
                importExportClientTable.setValueAt(rs.getString("telefono"), j, 6);
                importExportClientTable.setValueAt(rs.getString("mail"), j, 7);
                importExportClientTable.setValueAt(rs.getString("fecha_alta"), j, 8);
                importExportClientTable.setValueAt(rs.getString("fecha_nac"), j, 9);
                importExportClientTable.setValueAt(rs.getString("activo"), j, 10);
                importExportClientTable.setValueAt(rs.getString("ctacte"), j, 11);
                j++;
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(ImportarExportarClientes.this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File dir = dialog.getSelectedFile();
            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(importExportClientTable);
                ExportarExcel excelExporter = new ExportarExcel(tb, new File(dir.getAbsolutePath() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_exportAllActionPerformed

    private void importFromExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFromExcelActionPerformed
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
    }//GEN-LAST:event_importFromExcelActionPerformed

    private void cleanTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanTableActionPerformed
        cleanImportExportClientsFields();
    }//GEN-LAST:event_cleanTableActionPerformed
    
    public void CrearTabla(File file) throws IOException {
        Workbook workbook = null;
        importExportModel = new DefaultTableModel();
        importExportModel.addColumn("nombres");
        importExportModel.addColumn("apellidos");
        importExportModel.addColumn("direccion");
        importExportModel.addColumn("provincia");
        importExportModel.addColumn("departamento");
        importExportModel.addColumn("celular");
        importExportModel.addColumn("telefono");
        importExportModel.addColumn("mail");
        importExportModel.addColumn("fecha_alta");
        importExportModel.addColumn("fecha_nac");
        importExportModel.addColumn("activo");
        importExportModel.addColumn("ctacte");
        this.importExportClientTable.setModel(importExportModel);
        try {
            workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
            columna.clear();
            for (int i = 0; i < sheet.getColumns(); i++) {
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents());
            }
            filas.clear();
            for (int k = 1; k < sheet.getRows(); k++) {
                Vector d = new Vector();
                for (int i = 0; i < sheet.getColumns(); i++) {
                    Cell cell = sheet.getCell(i, k);
                    d.add(cell.getContents());
                }
                d.add("\n");
                importExportModel.addRow(d);
            }
            int ax = JOptionPane.showConfirmDialog(null, "Confirma guardar datos en la base local?");
            if(ax == JOptionPane.YES_OPTION){
                j = importExportClientTable.getRowCount();
                if (j==0){
                    JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");
                }else{
                    try {
                        con = new Conexion();                        
                        String nombres[] = new String[j];
                        String apellidos[] = new String[j];
                        String direccion[] = new String[j];
                        String provincia[] = new String[j];
                        String departamento[] = new String[j];
                        String mail[] = new String[j];
                        String telefono[] = new String[j];
                        String celular[] = new String[j];
                        String fecha_alta[] = new String[j];
                        String fecha_nac[] = new String[j];
                        String activo[] = new String[j];
                        String ctacte[] = new String[j];
                        for (int i=0; i<j; i++) {
                            nombres[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 0).toString());
                            apellidos[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 1).toString());
                            direccion[i]= Utils.objectToString(importExportClientTable.getValueAt(i, 2).toString());
                            provincia[i]= Utils.objectToString(importExportClientTable.getValueAt(i, 3).toString());
                            departamento[i]= Utils.objectToString(importExportClientTable.getValueAt(i, 4).toString());
                            celular[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 5).toString());
                            telefono[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 6).toString());
                            mail[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 7).toString());
                            fecha_alta[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 8).toString());
                            fecha_nac[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 9).toString());
                            activo[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 10).toString());
                            ctacte[i] = Utils.objectToString(importExportClientTable.getValueAt(i, 11).toString());

                            String insertArticulos = "INSERT INTO clientes (nombres, apellidos, direccion, provincia, departamento, celular, telefono, mail, fecha_alta, fecha_nac, activo, ctacte) "
                                                    + "VALUES ('"+nombres[i]+"', '"+apellidos[i]+"', '"+ direccion[i]+"', '"+provincia[i]+"','"+departamento[i]+"', '"+celular[i]+"',"
                                                    + "'"+telefono[i]+"', '"+mail[i]+"',  '"+fecha_alta[i]+"', '"+fecha_nac[i]+"', '"+activo[i]+"', '"+ctacte[i]+"')";
                            con.ejecutar(insertArticulos);
                        }
                        con.Cerrar();
                    } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }  
                JOptionPane.showMessageDialog(null, "Se guardaron "+j+" registros");
                j=0;
            }else if(ax == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Cancelar");
            }                
        } catch (BiffException e) {
            e.printStackTrace(System.out);
        } 
    }
    
    public void cleanImportExportClientsFields(){
        DefaultTableModel deleteTable = (DefaultTableModel) importExportClientTable.getModel();
        deleteTable.setRowCount(0);
        j = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanTable;
    private javax.swing.JButton exportAll;
    private javax.swing.JTable importExportClientTable;
    private javax.swing.JButton importFromExcel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
