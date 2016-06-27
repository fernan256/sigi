package sigi;

import Utils.Utils;
import Connection.Conexion;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.util.ArrayList;    
import java.util.List;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AbmClientes extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static String result;
    private String id;
    private int j = 0;
    private boolean estado;
    final JTable exportTable = new JTable();


 private static DefaultTableModel modelo;

    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    private static int tabla_ancho = 0;
    private static int tabla_alto = 0;
    public AbmClientes() {
        initComponents();
        searchUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        cellPhone = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        activo_cliente = new javax.swing.JCheckBox();
        ctaCte_cliente = new javax.swing.JCheckBox();
        jLabel56 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        changeData = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        toXls = new javax.swing.JButton();
        searchUser = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        birthDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        province = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        signUpDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        importFromXls = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel57.setText("Buscar por nombre");

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel47.setText("Nombre *");

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel48.setText("Apellido *");

        jLabel55.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel55.setText("Celular");

        jLabel49.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel49.setText("Fecha de nacimiento");

        jLabel53.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel53.setText("Dirección");

        jLabel54.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel54.setText("Estado Cuenta");

        activo_cliente.setBackground(new java.awt.Color(255, 255, 255));
        activo_cliente.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        activo_cliente.setText("Activo");

        ctaCte_cliente.setBackground(new java.awt.Color(255, 255, 255));
        ctaCte_cliente.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        ctaCte_cliente.setText("Activa");

        jLabel56.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel56.setText("Mail");

        create.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        create.setText("Crear");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        changeData.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        changeData.setText("Modificar");
        changeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDataActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        delete.setText("Eliminar");

        toXls.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        toXls.setText("A XLS");
        toXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toXlsActionPerformed(evt);
            }
        });

        searchUser.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        searchUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchUserKeyReleased(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel58.setText("Telefono");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("Cuenta Corriente");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("Provincia");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setText("Departemaento");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Fecha de Alta");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setText("(Checckbox tildado indica activo, sin tildar inactivo)");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel6.setText("(Checckbox tildado indica activo, sin tildar inactivo)");

        importFromXls.setText("Importar de Excel");
        importFromXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFromXlsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toXls, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(importFromXls))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel53)
                                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addComponent(activo_cliente))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(signUpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(38, 38, 38)
                                .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ctaCte_cliente))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel55))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel53)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel55)
                    .addComponent(cellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(activo_cliente)
                    .addComponent(jLabel3)
                    .addComponent(ctaCte_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(jLabel1))
                    .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toXls, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importFromXls))
                .addContainerGap(264, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        if (name.getText().equals("")||lastName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan Datos, los campos con * son obligatorios");
        } else {
            try {
                con = new Conexion();

                String nombres = name.getText();
                String apellidos = lastName.getText();
                String direccion = isEmptyFc(address.getText());
                String telefono = isEmptyFc(telephone.getText());
                String cel = isEmptyFc(cellPhone.getText());
                String mail = isEmptyFc(email.getText());
                String provincia = isEmptyFc(province.getText());
                String departamento = isEmptyFc(department.getText());
                boolean valorActivo = activo_cliente.isSelected();
                int activo = valorActivo ? 1 : 0;
                boolean valorCtaCte = ctaCte_cliente.isSelected();
                int ctaCte = valorCtaCte ? 1 : 0;
                String sql = "INSERT INTO clientes (nombres, apellidos, direccion, provincia, departemento, telefono, celular, mail, fecha_alta, fecha_nac, activo, ctacte) "
                        + "   VALUES ('"+nombres+"', '"+apellidos+"', "+direccion+", "+provincia+", "+departamento+", "+telefono+", "+cel+", "+mail+", '"+Utils.formatDateForConfig(signUpDate.getDate())+"', '"+Utils.formatDateForConfig(birthDate.getDate())+"', "+activo+", "+ctaCte+")";
                con.ejecutar(sql);

                JOptionPane.showMessageDialog(null, "Cliente: "+nombres+", "+apellidos+" agregado.");
                clearCrudCustomersFields();
                searchUsers();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_createActionPerformed
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        clearCrudCustomersFields();
    }//GEN-LAST:event_cancelActionPerformed

    private void changeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDataActionPerformed

        if (name.getText().equals("")||lastName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");
        } else {
            String nombres = name.getText();
            String apellidos = lastName.getText();
            String direccion = isEmptyFc(address.getText());
            String telefono = isEmptyFc(telephone.getText());
            String cel = isEmptyFc(cellPhone.getText());
            String mail = isEmptyFc(email.getText());
            String provincia = isEmptyFc(province.getText());
            String departamento = isEmptyFc(department.getText());
            boolean valorActivo = activo_cliente.isSelected();
            int activo = valorActivo ? 1 : 0;
            boolean valorCtaCte = ctaCte_cliente.isSelected();
            int ctaCte = valorCtaCte ? 1 : 0;
            try {
                con = new Conexion();
                int id2 = Integer.parseInt(id);
                String modifica = "UPDATE clientes SET nombres = '"+nombres+"', apellidos = '"+apellidos+"', direccion = "+direccion+", provincia = "+provincia+" , departamento = "+departamento+", telefono = "+telefono+", celular = "+cel+", mail = "+mail+", fecha_alta = '"+Utils.formatDateForConfig(signUpDate.getDate())+"', fecha_nac = '"+Utils.formatDateForConfig(birthDate.getDate())+"', activo = '"+activo+"', ctacte = '"+ctaCte+"' WHERE id_clientes = '"+id2+"'";
                con.ejecutar(modifica);
                JOptionPane.showMessageDialog(null, "Datos Actualizados");

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changeDataActionPerformed

    private void toXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toXlsActionPerformed
        try {
            try {
                con = new Conexion();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AltaModificaionArticulos.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlc = "SELECT * FROM clientes";
            rs = con.Consulta(sqlc);
            
            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
            this.exportTable.setModel(buscar);
            buscar.addColumn("ID Clientes");
            buscar.addColumn("Nombres");
            buscar.addColumn("Apellidos");
            buscar.addColumn("Dirección");
            buscar.addColumn("Provincia");
            buscar.addColumn("Celular");
            buscar.addColumn("Telefono");
            buscar.addColumn("Mail");
            buscar.addColumn("Fecha Nacimiento");
            buscar.addColumn("Fecha Alta");
            buscar.addColumn("Activo");
            buscar.addColumn("Cuenta Corriente");
            int y=0;
            while(rs.next()){
                Object[] fila = new Object[12];
                fila[0] = rs.getInt("id_clientes");
                fila[1] = rs.getString("nombres");
                fila[2] = rs.getString("apellidos");
                fila[3] = rs.getString("direccion");
                fila[4] = rs.getString("provincia");
                fila[5] = rs.getString("celular");
                fila[6] = rs.getString("telefono");
                fila[7] = rs.getString("mail");
                fila[8] = rs.getString("fecha_nac");
                fila[9] = rs.getString("fecha_alta");
                fila[10] = rs.getString("activo");
                fila[11] = rs.getString("ctacte");
                buscar.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(AbmClientes.this);
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
    }//GEN-LAST:event_toXlsActionPerformed

    private void searchUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUserKeyReleased
        int evento=evt.getKeyCode();
        String nom = searchUser.getText();
        if (nom.equals("")) {
            create.setEnabled(true);
            clearCrudCustomersFields();
        } else {
            create.setEnabled(false);
        }
        if(evento==10 ){
            try {
                    try {
                        con = new Conexion();

                    } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String [] stringParts = nom.split(",");
                    String names = stringParts[0];
                    String lastNames = stringParts[1].substring(1);
                    String sql ="SELECT * FROM clientes WHERE nombres = '"+names+"' AND apellidos = '"+lastNames+"'";
                    rs = con.Consulta(sql);
                    
                    if(rs == null) {
                       JOptionPane.showMessageDialog(null, "No se encontro el proveedor: "+searchUser.getText()+" ");
                    }
                    while(rs.next()){
                       
                        id =  rs.getString("id_clientes");
                        this.name.setText(rs.getString("nombres"));
                        this.lastName.setText(rs.getString("apellidos"));
                        this.address.setText(rs.getString("direccion"));
                        this.email.setText(rs.getString("mail"));
                        this.telephone.setText(rs.getString("telefono"));
                        this.cellPhone.setText(rs.getString("celular"));
                        if(rs.getInt("activo") == 1) {
                            activo_cliente.setSelected(true);
                        } else {
                            activo_cliente.setSelected(false);
                        }
                        birthDate.setDate(rs.getDate("fecha_nac"));
                        if(rs.getInt("ctacte") == 1){
                            ctaCte_cliente.setSelected(true);
                        }else {
                            ctaCte_cliente.setSelected(false);
                        }
                    }

                    } catch (SQLException ex) {
                        Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                    }
         
            }
    }//GEN-LAST:event_searchUserKeyReleased

    private void importFromXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFromXlsActionPerformed
        JFileChooser examinar = new JFileChooser();
        examinar.setFileFilter(new FileNameExtensionFilter("Archivo Excel", "xls"));
        int opcion = examinar.showSaveDialog(AbmClientes.this);
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
    }//GEN-LAST:event_importFromXlsActionPerformed
    public void searchUsers(){
        try {
            try {
                con = new Conexion();

            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(searchUser);
            String sql ="SELECT nombres, apellidos FROM clientes";
            rs = con.Consulta(sql);
            while(rs.next()){
                String nombreApellido = rs.getString("nombres")+", "+rs.getString("apellidos");
                result = nombreApellido;
                textAutoAcompleter.addItem(result);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void CrearTabla(File file) throws IOException {

        Workbook workbook = null;
        modelo = new DefaultTableModel();
        
        modelo.addColumn("nombres");
        modelo.addColumn("apellidos");
        modelo.addColumn("direccion");
        modelo.addColumn("mail");
        modelo.addColumn("telefono");
        modelo.addColumn("celular");
        modelo.addColumn("fecha_alta");
        modelo.addColumn("fecha_nac");
        modelo.addColumn("activo");
        modelo.addColumn("ctacte");
        //this.jTtabla_clie.setModel(modelo);
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
                //filas.add(d);
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

                        for (int i=0; i<j; i++) {
                            nombreProducto[i] = Utils.objectToString(exportTable.getValueAt(i, 0));
                            marca[i] = Utils.objectToString(exportTable.getValueAt(i, 1));
                            cantidad[i]= Utils.objectToString(exportTable.getValueAt(i, 2));
                            scanning = Utils.objectToString(exportTable.getValueAt(i, 3));
                            precioCosto = Utils.objectToString(exportTable.getValueAt(i, 4));
                            precioVenta = Utils.objectToString(exportTable.getValueAt(i, 5));
                            tipoArticulo[i] = Utils.objectToString(exportTable.getValueAt(i, 6));
                            precioVentaFlo[i] = Float.parseFloat(precioVenta);
                            scanningDouble[i] = Double.parseDouble(scanning);
                            precioCostoFlo[i] = Float.parseFloat(precioCosto);

                            String insertArticulos = "INSERT INTO clientes(`scanning`, `nombre_producto`, `marca`, `precio_costo`, `precio_venta`, `tipo_articulo_id`) VALUES ('"+scanningDouble[i]+"', '"+nombreProducto[i]+"', '"+ marca[i]+"', '"+precioCostoFlo[i]+"','"+precioVentaFlo[i]+"', '"+tipoArticulo[i]+"')";
                            con.ejecutar(insertArticulos);    
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
            e.printStackTrace(System.out);
        } 
    }  
    
    public String isEmptyFc(String e){
        if(e.equals("")) {
            e = null;
            return e;
        }
        return "'" +e+"'";
    }
    public void clearCrudCustomersFields(){
        name.setText("");
        lastName.setText("");
        address.setText("");
        telephone.setText("");
        cellPhone.setText("");
        email.setText("");
        birthDate.setDate(null);
        activo_cliente.setSelected(false);
        ctaCte_cliente.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activo_cliente;
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser birthDate;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cellPhone;
    private javax.swing.JButton changeData;
    private javax.swing.JButton create;
    private javax.swing.JCheckBox ctaCte_cliente;
    private javax.swing.JButton delete;
    private javax.swing.JTextField department;
    private javax.swing.JTextField email;
    private javax.swing.JButton importFromXls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField name;
    private javax.swing.JTextField province;
    private javax.swing.JTextField searchUser;
    private com.toedter.calendar.JDateChooser signUpDate;
    private javax.swing.JTextField telephone;
    private javax.swing.JButton toXls;
    // End of variables declaration//GEN-END:variables
}
