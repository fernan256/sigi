package sigi;

import Utils.ExportarExcel;
import Connection.Conexion;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.io.IOException;
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

public class Proveedores extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j = 0; 
    static String result;
    static float total = 0;
    public static String id;
    public static boolean estado;
    private static DefaultTableModel modelo;
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    private static int tabla_ancho = 0;
    private static int tabla_alto = 0;

    public Proveedores() {
        initComponents();
        searchItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newProviderName = new javax.swing.JTextField();
        newProviderLastname = new javax.swing.JTextField();
        newCompanyName = new javax.swing.JTextField();
        newProviderAddress = new javax.swing.JTextField();
        newProviderEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        providerArticleDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        newProvider = new javax.swing.JButton();
        cleanFields = new javax.swing.JButton();
        deleteProvider = new javax.swing.JButton();
        newProviderActive = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        newProviderPhone = new javax.swing.JFormattedTextField();
        newProviderCelphone = new javax.swing.JFormattedTextField();
        newProviderFax = new javax.swing.JFormattedTextField();
        modifieProvider = new javax.swing.JButton();
        newProviderCuilCuit = new javax.swing.JFormattedTextField();
        exportToXls = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchProvider = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        newProviderName.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        newProviderLastname.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        newCompanyName.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        newProviderAddress.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        newProviderEmail.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        providerArticleDescription.setColumns(20);
        providerArticleDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        providerArticleDescription.setRows(5);
        jScrollPane1.setViewportView(providerArticleDescription);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Descripción de productos");

        newProvider.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        newProvider.setText("Crear");
        newProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProviderActionPerformed(evt);
            }
        });

        cleanFields.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cleanFields.setText("Borrar");
        cleanFields.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanFieldsMouseClicked(evt);
            }
        });

        deleteProvider.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteProvider.setText("Eliminar");
        deleteProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProviderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("Empresa");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Celular");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setText("Fax");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setText("Mail");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setText("Cuit/Cuil");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("Buscar");

        newProviderPhone.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        newProviderCelphone.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        newProviderFax.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        modifieProvider.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modifieProvider.setText("Modificar");
        modifieProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifieProviderActionPerformed(evt);
            }
        });

        newProviderCuilCuit.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        exportToXls.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exportToXls.setText("A XLS");
        exportToXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportToXlsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Activo/Inactivo");

        searchProvider.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        searchProvider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchProviderKeyReleased(evt);
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
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(newProviderFax, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newProviderCelphone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newProviderPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(newProviderCuilCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(newProviderLastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(newProviderName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newCompanyName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newProviderAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newProviderEmail, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(searchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(newProviderActive))
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newProvider)
                                .addGap(18, 18, 18)
                                .addComponent(cleanFields)
                                .addGap(18, 18, 18)
                                .addComponent(deleteProvider)
                                .addGap(18, 18, 18)
                                .addComponent(modifieProvider)
                                .addGap(18, 18, 18)
                                .addComponent(exportToXls)))
                        .addGap(0, 322, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newProviderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(searchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newProviderLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newProviderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(newProviderPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(newProviderCelphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(newProviderFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newProviderEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(newProviderCuilCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newProviderActive)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newProvider)
                    .addComponent(cleanFields)
                    .addComponent(deleteProvider)
                    .addComponent(modifieProvider)
                    .addComponent(exportToXls))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProviderActionPerformed
        if (newCompanyName.getText().equals("")||newProviderPhone.getText().equals("")||newProviderAddress.getText().equals("")||newProviderEmail.getText().equals("")||newProviderCuilCuit.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Los campos empresa, telefono, dirección y mail deben estar completos");
        }else{
            try {
                con = new Conexion();
                String nomb = newProviderName.getText();
                String apellido = newProviderLastname.getText();
                String empresa = newCompanyName.getText();
                String direccion = newProviderAddress.getText();
                String telefono = newProviderPhone.getText();
                String celular = newProviderCelphone.getText();
                String fax = newProviderFax.getText();
                String mail = newProviderEmail.getText();
                String cuit = newProviderCuilCuit.getText();
                String descrip = providerArticleDescription.getText();
                boolean activo = newProviderActive.isSelected();
                int activo2 = activo ? 1 : 0;
                String sql = "INSERT INTO proveedores (nombre, apellido, direccion, mail, telefono, cel, empresa, descripcion, activo, fax, cuit) VALUES ('"+nomb+"','"+apellido+"','"+direccion+"','"+mail+"','"+telefono+"','"+celular+"','"+empresa+"','"+descrip+"','"+activo2+"','"+fax+"','"+cuit+"')";
                con.ejecutar(sql);
                JOptionPane.showMessageDialog(null, "Proveedor: "+empresa+" agregado.");
                searchItems();
                clearSuppliersFields();
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_newProviderActionPerformed

    private void deleteProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProviderActionPerformed
        try {
            con = new Conexion();
            String empresa = newCompanyName.getText();
            String sql = "DELETE FROM `proveedores` WHERE id_proveedor='"+id+"'";
            con.ejecutar(sql);
            JOptionPane.showMessageDialog(null, "Proveedor: "+empresa+" eliminado.");
            clearSuppliersFields();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteProviderActionPerformed

    private void cleanFieldsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanFieldsMouseClicked
        clearSuppliersFields();
    }//GEN-LAST:event_cleanFieldsMouseClicked

    private void modifieProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifieProviderActionPerformed
        try {
            con = new Conexion();
            String nomb = newProviderName.getText();
            String apellido = newProviderLastname.getText();
            String empresa = newCompanyName.getText();
            String direccion = newProviderAddress.getText();
            String telefono = newProviderPhone.getText();
            String celular = newProviderCelphone.getText();
            String fax = newProviderFax.getText();
            String mail = newProviderEmail.getText();
            String cuit = newProviderCuilCuit.getText();
            String descrip = providerArticleDescription.getText();
            boolean activo = newProviderActive.isSelected();
            int activo2 = activo ? 1 : 0;
            String modifica = "UPDATE proveedores SET nombre = '"+nomb+"', apellido = '"+apellido+"', direccion = '"+direccion+"', cel = '"+celular+"', mail = '"+mail+"', empresa = '"+empresa+"', activo = '"+activo2+"', cuit = '"+cuit+"', fax = '"+fax+"', descripcion = '"+descrip+"', empresa = '"+empresa+"', telefono = '"+telefono+"' WHERE id_proveedor = '"+id+"'";
            con.ejecutar(modifica);
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            con.Cerrar();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifieProviderActionPerformed

    private void exportToXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportToXlsActionPerformed
        try {
            con = new Conexion();    
            String getAllProviders = "SELECT * FROM proveedores";
            rs = con.Consulta(getAllProviders);
            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
            proveedoresTabla.setModel(buscar);
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                buscar.addColumn(rsMd.getColumnLabel(i));
            }
            int y=0;
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                buscar.addRow(fila);
                for(int l=0;l<7;l++){
                    buscar.isCellEditable(y, l);
                    y++;
                }
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(Proveedores.this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File dir = dialog.getSelectedFile();
            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(proveedoresTabla);
                ExportarExcel excelExporter = new ExportarExcel(tb, new File(dir.getAbsolutePath() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_exportToXlsActionPerformed

    private void searchProviderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchProviderKeyReleased
        int evento=evt.getKeyCode();
        String nom = searchProvider.getText();
                 
        if(evento==10 ){
            String bool;
            try {
                con = new Conexion();
                String sql ="SELECT * FROM proveedores WHERE empresa LIKE '"+nom+"%'";
                rs = con.Consulta(sql);    
                if(rs == null) {
                    JOptionPane.showMessageDialog(null, "No se encontro el proveedor: "+searchProvider.getText()+" ");
                }
                while(rs.next()){       
                    id =  rs.getString("id_proveedor");
                    this.newProviderName.setText(rs.getString("nombre"));
                    this.newProviderLastname.setText(rs.getString("apellido"));
                    this.newProviderAddress.setText(rs.getString("direccion"));
                    this.newProviderEmail.setText(rs.getString("mail"));
                    this.newProviderPhone.setText(rs.getString("telefono"));
                    this.newProviderCelphone.setText(rs.getString("cel"));
                    this.newCompanyName.setText(rs.getString("empresa"));
                    this.providerArticleDescription.setText(rs.getString("descripcion"));
                    this.newProviderFax.setText(rs.getString("fax"));
                    this.newProviderCuilCuit.setText(rs.getString("cuit")); 
                    if(rs.getInt("activo") == 1) {
                        bool = "true";
                    } else {
                        bool = "false";
                    }
                    String bool1 = bool;
                    boolean bool2 = Boolean.parseBoolean(bool1);
                    if(bool2==true){
                        newProviderActive.setSelected(true);
                    }else{
                        newProviderActive.setSelected(false);
                    }
                }
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchProviderKeyReleased
    
    public void searchItems(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(searchProvider);
            String sql ="SELECT empresa FROM proveedores";
            rs = con.Consulta(sql);
            while(rs.next()){
                result = rs.getString("empresa");
                textAutoAcompleter.addItem(result);
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CrearTabla(File file) throws IOException {
        Workbook workbook = null;
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DNI");
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
        } catch (BiffException e) {
            e.printStackTrace();
        } 
    }  

    public void clearSuppliersFields(){
        newProviderActive.setSelected(true);
        newProviderName.setText("");
        newProviderLastname.setText("");
        newCompanyName.setText("");
        newProviderAddress.setText("");
        newProviderPhone.setText("");
        newProviderCelphone.setText("");
        newProviderFax.setText("");
        newProviderEmail.setText("");
        newProviderCuilCuit.setText("");
        providerArticleDescription.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanFields;
    private javax.swing.JButton deleteProvider;
    private javax.swing.JButton exportToXls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifieProvider;
    private javax.swing.JTextField newCompanyName;
    private javax.swing.JButton newProvider;
    private javax.swing.JCheckBox newProviderActive;
    private javax.swing.JTextField newProviderAddress;
    private javax.swing.JFormattedTextField newProviderCelphone;
    private javax.swing.JFormattedTextField newProviderCuilCuit;
    private javax.swing.JTextField newProviderEmail;
    private javax.swing.JFormattedTextField newProviderFax;
    private javax.swing.JTextField newProviderLastname;
    private javax.swing.JTextField newProviderName;
    private javax.swing.JFormattedTextField newProviderPhone;
    private javax.swing.JTextArea providerArticleDescription;
    private javax.swing.JTextField searchProvider;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JTable proveedoresTabla;
}
