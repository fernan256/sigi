package sigi;

import Utils.ExportarExcel;
import Utils.Utils;
import Connection.Conexion;
import com.mxrck.autocompleter.TextAutoCompleter;
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
    final JTable exportImportTable = new JTable();
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
        clearFields = new javax.swing.JButton();
        changeData = new javax.swing.JButton();
        delete = new javax.swing.JButton();
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

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel57.setText("Buscar por nombre");

        jLabel47.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel47.setText("Nombre *");

        name.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel48.setText("Apellido *");

        lastName.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel55.setText("Celular");

        jLabel49.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel49.setText("Fecha de nacimiento");

        cellPhone.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel53.setText("Dirección");

        address.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel54.setText("Estado Cuenta");

        activo_cliente.setBackground(new java.awt.Color(255, 255, 255));
        activo_cliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        activo_cliente.setText("Activo");

        ctaCte_cliente.setBackground(new java.awt.Color(255, 255, 255));
        ctaCte_cliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ctaCte_cliente.setText("Activa");

        jLabel56.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel56.setText("Mail");

        email.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        create.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        create.setText("Crear");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        clearFields.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clearFields.setText("Borrar Campos");
        clearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsActionPerformed(evt);
            }
        });

        changeData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        changeData.setText("Modificar");
        changeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDataActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        delete.setText("Eliminar");

        searchUser.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        searchUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchUserKeyReleased(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel58.setText("Telefono");

        telephone.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Cuenta Corriente");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Provincia");

        province.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("Departemaento");

        department.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Fecha de Alta");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel2.setText("(Checkbox tildado indica activo, sin tildar inactivo)");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel6.setText("(Checkbox tildado indica activo, sin tildar inactivo)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(signUpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel49)
                        .addGap(15, 15, 15)
                        .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(changeData, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(clearFields))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addComponent(activo_cliente))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ctaCte_cliente))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(104, 104, 104)
                                .addComponent(email))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(telephone))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(department))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(71, 71, 71)
                                .addComponent(address))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(72, 72, 72)
                                .addComponent(name))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(10, 10, 10)
                                .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(32, 32, 32)
                                .addComponent(cellPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lastName))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(province, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))))))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel57))
                    .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel55)
                                .addComponent(cellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel58))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activo_cliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel54)))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctaCte_cliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(signUpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUserKeyReleased
        String nom = searchUser.getText();
        if (nom.equals("")) {
            create.setEnabled(true);
            clearCrudCustomersFields();
        } else {
            create.setEnabled(false);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                con = new Conexion();
                String [] stringParts = nom.split(",");
                String names = stringParts[0];
                String lastNames = stringParts[1].substring(1);
                String getClient ="SELECT * FROM clientes WHERE nombres = '"+names+"' AND apellidos = '"+lastNames+"'";
                rs = con.Consulta(getClient);
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
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchUserKeyReleased

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
                con.Cerrar();
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changeDataActionPerformed

    private void clearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsActionPerformed
        clearCrudCustomersFields();
    }//GEN-LAST:event_clearFieldsActionPerformed

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
                String sql = "INSERT INTO clientes (nombres, apellidos, direccion, provincia, departamento, telefono, celular, mail, fecha_alta, fecha_nac, activo, ctacte) "
                + "   VALUES ('"+nombres+"', '"+apellidos+"', "+direccion+", "+provincia+", "+departamento+", "+telefono+", "+cel+", "+mail+", '"+Utils.formatDateForConfig(signUpDate.getDate())+"', '"+Utils.formatDateForConfig(birthDate.getDate())+"', "+activo+", "+ctaCte+")";
                con.ejecutar(sql);
                con.Cerrar();
                JOptionPane.showMessageDialog(null, "Cliente: "+nombres+", "+apellidos+" agregado.");
                clearCrudCustomersFields();
                searchUsers();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_createActionPerformed
    public void searchUsers(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(searchUser);
            String sql ="SELECT nombres, apellidos FROM clientes";
            rs = con.Consulta(sql);
            while(rs.next()){
                String nombreApellido = rs.getString("nombres")+", "+rs.getString("apellidos");
                result = nombreApellido;
                textAutoAcompleter.addItem(result);
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CrearTabla(File file) throws IOException {
        Workbook workbook = null;
        modelo = new DefaultTableModel();
        modelo.addColumn("nombres");
        modelo.addColumn("apellidos");
        modelo.addColumn("direccion");
        modelo.addColumn("provincia");
        modelo.addColumn("departamento");
        modelo.addColumn("celular");
        modelo.addColumn("telefono");
        modelo.addColumn("mail");
        modelo.addColumn("fecha_alta");
        modelo.addColumn("fecha_nac");
        modelo.addColumn("activo");
        modelo.addColumn("ctacte");
        this.exportImportTable.setModel(modelo);
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
                modelo.addRow(d);
            }
            int ax = JOptionPane.showConfirmDialog(null, "Confirma guardar datos en la base local?");
            if(ax == JOptionPane.YES_OPTION){
                j = exportImportTable.getRowCount();
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
                            nombres[i] = Utils.objectToString(exportImportTable.getValueAt(i, 0).toString());
                            apellidos[i] = Utils.objectToString(exportImportTable.getValueAt(i, 1).toString());
                            direccion[i]= Utils.objectToString(exportImportTable.getValueAt(i, 2).toString());
                            provincia[i]= Utils.objectToString(exportImportTable.getValueAt(i, 3).toString());
                            departamento[i]= Utils.objectToString(exportImportTable.getValueAt(i, 4).toString());
                            celular[i] = Utils.objectToString(exportImportTable.getValueAt(i, 5).toString());
                            telefono[i] = Utils.objectToString(exportImportTable.getValueAt(i, 6).toString());
                            mail[i] = Utils.objectToString(exportImportTable.getValueAt(i, 7).toString());
                            fecha_alta[i] = Utils.objectToString(exportImportTable.getValueAt(i, 8).toString());
                            fecha_nac[i] = Utils.objectToString(exportImportTable.getValueAt(i, 9).toString());
                            activo[i] = Utils.objectToString(exportImportTable.getValueAt(i, 10).toString());
                            ctacte[i] = Utils.objectToString(exportImportTable.getValueAt(i, 11).toString());

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
                searchUsers();
            }else if(ax == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Cancelar");
            }                
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
        department.setText("");
        cellPhone.setText("");
        email.setText("");
        signUpDate.setDate(null);
        birthDate.setDate(null);
        activo_cliente.setSelected(false);
        ctaCte_cliente.setSelected(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activo_cliente;
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser birthDate;
    private javax.swing.JTextField cellPhone;
    private javax.swing.JButton changeData;
    private javax.swing.JButton clearFields;
    private javax.swing.JButton create;
    private javax.swing.JCheckBox ctaCte_cliente;
    private javax.swing.JButton delete;
    private javax.swing.JTextField department;
    private javax.swing.JTextField email;
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
    // End of variables declaration//GEN-END:variables
}
