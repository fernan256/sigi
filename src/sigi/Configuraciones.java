package sigi;

import Utils.Utils;
import Connection.Conexion;
import Connection.Conexion_login;
import com.mxrck.autocompleter.TextAutoCompleter;
import Utils.ConfigVar;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sigi.Proveedores.result;

public class Configuraciones extends javax.swing.JInternalFrame {
    Conexion con;
    Conexion_login conUser;
    ResultSet rs;
    int updateId = 0;
    
    public Configuraciones() {
        initComponents();
        getValues();
        iva.insertItemAt("", 0);
        iva.insertItemAt("21.00", 1);
        iva.insertItemAt("10.50", 2);
        typeOfRegistrer.insertItemAt("", 0);
        typeOfRegistrer.insertItemAt("Monotributo", 1);
        typeOfRegistrer.insertItemAt("Responsable Inscripto", 2);
        typeOfRegistrer.insertItemAt("Autónomo", 3);
        companyType.insertItemAt("", 0);
        companyType.insertItemAt("SA", 1);
        companyType.insertItemAt("SRL", 2);
        companyType.insertItemAt("RI", 3);
        companyType.insertItemAt("Monotributista", 4);
        monotributoClass.insertItemAt("", 0);
        monotributoClass.insertItemAt("A", 1);
        monotributoClass.insertItemAt("B", 2);
        monotributoClass.insertItemAt("C", 3);
        userRol.insertItemAt("", 0);
        userRol.insertItemAt("Administrador", 1);
        userRol.insertItemAt("Vendedor", 2);
        searchFc();
        if(firstName.getText().equals("") || lastName.getText().equals("")
            || userName.getText().equals("") ||newPassword.getPassword().equals("") 
            || repeatPassword.getPassword().equals("")
            || userRol.getSelectedItem().equals("")) {
            addNewUser.setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        companyName = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        province = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        otherTelephone = new javax.swing.JTextField();
        saveCompanyData = new javax.swing.JButton();
        cleanData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        editCompanyData = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        companyPostalCode = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        companyAddNumner = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saveFiscalData = new javax.swing.JButton();
        iva = new javax.swing.JComboBox<>();
        typeOfRegistrer = new javax.swing.JComboBox<>();
        companyType = new javax.swing.JComboBox<>();
        monotributoClass = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cuilCuit = new javax.swing.JTextField();
        editFiscalData = new javax.swing.JButton();
        activityInitDate = new com.toedter.calendar.JDateChooser();
        companyIg = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        initialCash = new javax.swing.JTextField();
        printTicket = new javax.swing.JCheckBox();
        saveEditGeneralConfig = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        repeatPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        addNewUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        editUser = new javax.swing.JButton();
        birthDate = new com.toedter.calendar.JDateChooser();
        inDate = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        userAddress = new javax.swing.JTextField();
        userPhone = new javax.swing.JTextField();
        userCel = new javax.swing.JTextField();
        userActive = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        userMail = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        userRol = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        serachUser = new javax.swing.JTextField();

        setClosable(true);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        companyName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        address.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        province.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        department.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        country.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        telephone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        otherTelephone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        saveCompanyData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saveCompanyData.setText("Guardar");
        saveCompanyData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCompanyDataActionPerformed(evt);
            }
        });

        cleanData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cleanData.setText("Borrar");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("Nombre Empresa");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("Dirección");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setText("Provincia");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setText("Departamento");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel16.setText("País");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel17.setText("Teléfono");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel18.setText("Otro teléfeno");

        editCompanyData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        editCompanyData.setText("Editar");
        editCompanyData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCompanyDataActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel32.setText("C.P.");

        companyPostalCode.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel33.setText("Dirección Numero");

        companyAddNumner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveCompanyData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(editCompanyData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cleanData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otherTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyAddNumner, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(797, 797, 797))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(companyAddNumner))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(companyPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(otherTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editCompanyData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveCompanyData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cleanData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Empresa", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("IVA");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Tipo de Registro");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Clase Monotributo");

        saveFiscalData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saveFiscalData.setText("Guardar");
        saveFiscalData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFiscalDataActionPerformed(evt);
            }
        });

        iva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        typeOfRegistrer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        companyType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        monotributoClass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("Tipo Empresa");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel21.setText("CUIL/CUIT");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel22.setText("Fecha Inicio Actividad");

        cuilCuit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        editFiscalData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        editFiscalData.setText("Editar");
        editFiscalData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFiscalDataActionPerformed(evt);
            }
        });

        companyIg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel31.setText("Ingresos Brutos");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel34.setText("Formato del CUIL/CUIT (00-00000000-00)");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel35.setText("Formato Ingresos Brutos (000-000000-0)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveFiscalData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(editFiscalData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(62, 62, 62)
                        .addComponent(companyIg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(activityInitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeOfRegistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel21))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuilCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyType, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monotributoClass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(959, 959, 959))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typeOfRegistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(companyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(monotributoClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(cuilCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel31))
                    .addComponent(companyIg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(activityInitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveFiscalData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editFiscalData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Fiscales", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Inicio de caja");

        initialCash.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        printTicket.setBackground(new java.awt.Color(255, 255, 255));
        printTicket.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        printTicket.setSelected(true);

        saveEditGeneralConfig.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saveEditGeneralConfig.setText("Guardar/Editar");
        saveEditGeneralConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditGeneralConfigActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel28.setText("Imprimir ticket");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveEditGeneralConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel28))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printTicket)
                            .addComponent(initialCash, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1071, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(initialCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printTicket)
                    .addComponent(jLabel28))
                .addGap(36, 36, 36)
                .addComponent(saveEditGeneralConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Configuraciones Generales", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("Nombres*");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Apellidos*");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setText("Nombre de Usuario*");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setText("Contraseña*");

        firstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        userName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setText("Tipo de Usuario*");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setText("Repetir Contraseña*");

        repeatPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        newPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        addNewUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addNewUser.setText("Agregar");
        addNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewUserActionPerformed(evt);
            }
        });

        deleteUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteUser.setText("Borrar");

        editUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        editUser.setText("Editar");
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel20.setText("Fecha Ingreso");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel23.setText("Direccion");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel24.setText("Telefono");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel25.setText("Celular");

        userAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        userPhone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        userCel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        userActive.setBackground(new java.awt.Color(255, 255, 255));
        userActive.setSelected(true);
        userActive.setMaximumSize(new java.awt.Dimension(50, 50));
        userActive.setMinimumSize(new java.awt.Dimension(50, 50));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel29.setText("Activo*");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel27.setText("Mail");

        userMail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel26.setText("Fecha Nacimiento");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel19.setText("Los campos con * son obligatorios");

        userRol.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel30.setText("Buscar Usuario");

        serachUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        serachUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serachUserKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(68, 68, 68)
                        .addComponent(serachUser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(addNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(86, 86, 86)
                                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(userRol, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(119, 119, 119)
                                .addComponent(userActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(48, 48, 48)
                                .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(136, 136, 136)
                                .addComponent(userMail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel20))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userCel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(102, 102, 102)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(782, 782, 782))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel30))
                    .addComponent(serachUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(repeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(userRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(userActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(inDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(userAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(userCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(userMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta-Baja-Modificación Usuarios", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveEditGeneralConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEditGeneralConfigActionPerformed
        try {
            con = new Conexion();
            int printValue = 0;
            if(printTicket.isSelected()) {
                printValue = 1;
            } else {
                printValue = 2;
            }
            String saveValues = "UPDATE configuracion_inicial SET caja_inicial = "+initialCash.getText()+", print_status = "+printValue+"";
            con.ejecutar(saveValues);
            //Login.cashAndPrintStatus();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveEditGeneralConfigActionPerformed

    private void saveCompanyDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCompanyDataActionPerformed
        try {
            con = new Conexion();
            System.out.println(telephone);
            System.out.println(otherTelephone);
            String saveData = "INSERT INTO empresa (id_empresa, nombre, direccion, direccion_numero, telefono, otro_telefono, logo, id_usuario_responsable, departamento, provincia, pais, codigo_postal)"
                                    + "VALUES (1, '"+companyName.getText()+"', '"+address.getText()+"', "+companyAddNumner.getText()+", "+telephone.getText()+", "+otherTelephone.getText()+", 0, "+Login.userId+", '"+department.getText()+"', '"+province.getText()+"', '"+country.getText()+"', "+companyPostalCode.getText()+")";
            con.ejecutar(saveData);
            getValues();
            Login.companyData();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveCompanyDataActionPerformed

    private void saveFiscalDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFiscalDataActionPerformed
        try {
            con = new Conexion();
            
            String initDate = Utils.formatDateForConfig(activityInitDate.getDate());
            String saveData = "INSERT INTO datos_fiscales (id_datos_fiscales, iva, tipo_registro, tipo_empresa, clase_monotributo, cuit_cuil, ingresos_brutos, fecha_inicio_actividad)"
                                    + "VALUES (1, "+iva.getSelectedItem()+", '"+typeOfRegistrer.getSelectedItem()+"', '"+companyType.getSelectedItem()+"', '"+monotributoClass.getSelectedItem()+"', '"+cuilCuit.getText()+"', "+companyIg.getText()+", '"+initDate+"')";
            con.ejecutar(saveData);
            getValues();
            Login.companyData();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveFiscalDataActionPerformed

    private void editFiscalDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFiscalDataActionPerformed
        try {
            con = new Conexion();

            String updateInitDate = Utils.formatDateForConfig(activityInitDate.getDate());
            String saveData = "UPDATE datos_fiscales SET iva = "+iva.getSelectedItem()+", tipo_registro = '"+typeOfRegistrer.getSelectedItem()+"', tipo_empresa = '"+companyType.getSelectedItem()+"', clase_monotributo = '"+monotributoClass.getSelectedItem()+"', cuit_cuil = '"+cuilCuit.getText()+"', ingresos_brutos = '"+companyIg.getText()+"', fecha_inicio_actividad =  '"+updateInitDate+"' WHERE id_datos_fiscales = 1";
            con.ejecutar(saveData);
            getValues();
            Login.companyData();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editFiscalDataActionPerformed

    private void addNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewUserActionPerformed
        if(firstName.getText().equals("") || lastName.getText().equals("")
            || userName.getText().equals("") ||newPassword.getPassword().equals("") 
            || repeatPassword.getPassword().equals("")
            || userRol.getSelectedItem().equals("")) {
            
            JOptionPane.showMessageDialog(null,"No puede dejar espacios sin llenar");
        } else{
            try {
                String salt = ConfigVar.getSalt();
                String newPass = ConfigVar.get_SHA_1_Pass(Arrays.toString(newPassword.getPassword()), salt);
                String repeatPass = ConfigVar.get_SHA_1_Pass(Arrays.toString(repeatPassword.getPassword()), salt);
                if(newPass.equals(repeatPass)) {
                    try {
                        conUser = new Conexion_login();
                        int userActivated = 0;
                        if(userActive.isSelected()) {
                            userActivated = 1;
                        } else {
                            userActivated = 2;
                        }
                                 
                        String sql = "INSERT INTO usuarios (nombres, apellidos, user, password, salt, fecha_ingreso, fecha_nacimiento, direccion, telefono, cel, activo, roles_id_roles) "
                                + "VALUES ('"+firstName.getText()+"', '"+lastName.getText()+"','"+userName.getText()+"','"+newPass+"', '"+salt+"','"+Utils.formatDateForConfig(inDate.getDate())+"', '"+Utils.formatDateForConfig(birthDate.getDate())+"', '"+userAddress.getText()+"', '"+userPhone.getText()+"', '"+userCel.getText()+"', "+userActivated+", '"+userRol.getSelectedIndex()+"')";
                        
                        conUser.ejecutar(sql);

                        JOptionPane.showMessageDialog(null,"Usuario: [ "+userName.getText()+" ] agregado como "+userRol.getSelectedItem()+" ");
                    conUser.Cerrar();
                    clearUserFields();
                    } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                    newPassword.setText("");
                    repeatPassword.setText("");
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addNewUserActionPerformed

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        try {
            String salt = ConfigVar.getSalt();
            String newPass = ConfigVar.get_SHA_1_Pass(Arrays.toString(newPassword.getPassword()), salt);
            String repeatPass = ConfigVar.get_SHA_1_Pass(Arrays.toString(repeatPassword.getPassword()), salt);
            if(newPass.equals(repeatPass)) {
                try {
                    conUser = new Conexion_login();

                    int userActivated = 0;
                    if(userActive.isSelected()) {
                        userActivated = 1;
                    } else {
                        userActivated = 2;
                    }

                    String sql = "UPDATE usuarios SET nombres = '"+firstName.getText()+"', apellidos ='"+lastName.getText()+"', user = '"+userName.getText()+"', password = '"+newPass+"', salt = '"+salt+"', fecha_ingreso = '"+Utils.formatDateForConfig(inDate.getDate())+"', fecha_nacimiento = '"+Utils.formatDateForConfig(birthDate.getDate())+"', direccion = '"+userAddress.getText()+"', telefono = '"+userPhone.getText()+"', cel = '"+userCel.getText()+"', activo = "+userActivated+", roles_id_roles = '"+userRol.getSelectedIndex()+"' WHERE id_usuario = "+updateId+"";

                    conUser.ejecutar(sql);

                    JOptionPane.showMessageDialog(null,"Usuario: [ "+userName.getText()+" ] actualizado");
                    conUser.Cerrar();
                } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                newPassword.setText("");
                repeatPassword.setText("");
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editUserActionPerformed

    private void serachUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serachUserKeyReleased
        int evento=evt.getKeyCode();
        String nom = serachUser.getText();
        addNewUser.setEnabled(false);
        if(evento==10 ){
            try {
                conUser = new Conexion_login();
                String sql ="SELECT * FROM usuarios WHERE user LIKE '"+nom+"%'";
                rs = conUser.Consulta(sql);
                    
                if(rs == null) {
                   JOptionPane.showMessageDialog(null, "No se encontro el proveedor: "+serachUser.getText()+" ");
                }
                while(rs.next()){
                    updateId = rs.getInt("id_usuario");
                    firstName.setText(rs.getString("nombres"));
                    lastName.setText(rs.getString("apellidos"));
                    userName.setText(rs.getString("user"));
                    userCel.setText(rs.getString("cel"));
                    userPhone.setText(rs.getString("telefono"));
                    userAddress.setText(rs.getString("direccion"));
                    userMail.setText(rs.getString("mail"));
                    System.out.println(rs.getString("mail"));
                    userRol.setSelectedIndex(rs.getInt("roles_id_roles"));
                    birthDate.setDate(rs.getDate("fecha_nacimiento"));
                    inDate.setDate(rs.getDate("fecha_ingreso"));
                    if(rs.getInt("activo") == 1) {
                        userActive.setSelected(true);
                    } else {
                        userActive.setSelected(false);
                    }
                }
                conUser.Cerrar();
            }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_serachUserKeyReleased

    private void editCompanyDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCompanyDataActionPerformed
        try {
            con = new Conexion();
            String saveData = "UPDATE empresa SET nombre = '"+companyName.getText()+"', direccion = '"+address.getText()+"', direccion_numero = "+companyAddNumner.getText()+", telefono = "+telephone.getText()+", otro_telefono = "+otherTelephone.getText()+", logo = 0, id_usuario_responsable = "+Login.userId+", departamento = '"+department.getText()+"', provincia = '"+province.getText()+"', pais = '"+country.getText()+"', codigo_postal = "+companyPostalCode.getText()+" WHERE id_empresa = 1";
            con.ejecutar(saveData);
            getValues();
            Login.companyData();
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editCompanyDataActionPerformed
    private void getValues(){
        try {
            con = new Conexion();
            String getInitialConfig = "SELECT * FROM configuracion_inicial";
            rs = con.Consulta(getInitialConfig);
            while(rs.next()) {
                initialCash.setText(rs.getString("caja_inicial"));
                if(rs.getInt("print_status") == 1) {
                    printTicket.setSelected(true);
                } else {
                    printTicket.setSelected(false);
                }
            }
            String getCompanyData = "SELECT * FROM empresa";
            rs = con.Consulta(getCompanyData);
            while(rs.next()) {
                if(rs.getString("nombre") != null) {
                    companyName.setText(rs.getString("nombre"));
                    address.setText(rs.getString("direccion"));
                    telephone.setText(rs.getString("telefono"));
                    otherTelephone.setText(rs.getString("otro_telefono"));
                    department.setText(rs.getString("departamento"));
                    province.setText(rs.getString("provincia"));
                    country.setText(rs.getString("pais"));
                    companyPostalCode.setText(rs.getString("codigo_postal"));
                    companyAddNumner.setText(rs.getString("direccion_numero"));
                    saveCompanyData.setEnabled(false);
                }
            }
            String getFiscalData = "SELECT * FROM datos_fiscales";
            rs = con.Consulta(getFiscalData);
            while(rs.next()) {
                if(rs.getString("cuit_cuil") != null) {
                    iva.setSelectedItem(rs.getString("iva"));
                    typeOfRegistrer.setSelectedItem(rs.getString("tipo_registro"));
                    companyType.setSelectedItem(rs.getString("tipo_empresa"));
                    monotributoClass.setSelectedItem(rs.getString("clase_monotributo"));
                    cuilCuit.setText(rs.getString("cuit_cuil"));
                    activityInitDate.setDate(rs.getDate("fecha_inicio_actividad"));
                    companyIg.setText(rs.getString("ingresos_brutos"));
                    saveFiscalData.setEnabled(false);
                }
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void searchFc(){
        try {
            conUser = new Conexion_login();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(serachUser);
            String sql ="SELECT user FROM usuarios";
            rs = conUser.Consulta(sql);
            while(rs.next()){
                result = rs.getString("user");
                textAutoAcompleter.addItem(result);
            }

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clearUserFields(){
        firstName.setText("") ;
        lastName.setText("");
        userName.setText("");
        newPassword.setText("");
        repeatPassword.setText("");
        userRol.setSelectedIndex(0);
        userActive.setSelected(true);
        userCel.setText("");
        userAddress.setText("");
        userMail.setText("");
        userPhone.setText("");
        addNewUser.setEnabled(true);
        birthDate.setDate(null);
        inDate.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser activityInitDate;
    private javax.swing.JButton addNewUser;
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser birthDate;
    private javax.swing.JButton cleanData;
    private javax.swing.JTextField companyAddNumner;
    private javax.swing.JTextField companyIg;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField companyPostalCode;
    private javax.swing.JComboBox<String> companyType;
    private javax.swing.JTextField country;
    private javax.swing.JTextField cuilCuit;
    private javax.swing.JButton deleteUser;
    private javax.swing.JTextField department;
    private javax.swing.JButton editCompanyData;
    private javax.swing.JButton editFiscalData;
    private javax.swing.JButton editUser;
    private javax.swing.JTextField firstName;
    private com.toedter.calendar.JDateChooser inDate;
    private javax.swing.JTextField initialCash;
    private javax.swing.JComboBox<String> iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JComboBox<String> monotributoClass;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JTextField otherTelephone;
    private javax.swing.JCheckBox printTicket;
    private javax.swing.JTextField province;
    private javax.swing.JPasswordField repeatPassword;
    private javax.swing.JButton saveCompanyData;
    private javax.swing.JButton saveEditGeneralConfig;
    private javax.swing.JButton saveFiscalData;
    private javax.swing.JTextField serachUser;
    private javax.swing.JTextField telephone;
    private javax.swing.JComboBox<String> typeOfRegistrer;
    private javax.swing.JCheckBox userActive;
    private javax.swing.JTextField userAddress;
    private javax.swing.JTextField userCel;
    private javax.swing.JTextField userMail;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userPhone;
    private javax.swing.JComboBox<String> userRol;
    // End of variables declaration//GEN-END:variables
}
