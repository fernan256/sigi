/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigi;

import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sigi.proveedores.estado;

/**
 *
 * @author Gustavo
 */
public class permisos extends javax.swing.JInternalFrame {
Conexion con,query;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    static int j=0,w=0,jj=0,nombre=0; 
    static String aux3;
    static float total=0;
    static String inv[]=new String[50000];
    static float invT=0;
   public static String id,cad,id_sect, rstring, rstring1, rstring2, idfam, idsubfam;
   String hora,minutos,segundos,ampm;
    Calendar calendario;    
public static int rowCount, numfac, rs1,id1;
public static boolean estado;
    /**
     * Creates new form permisos
     */
    public permisos() {
        initComponents();
        llenar_combo_usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCusuario = new javax.swing.JComboBox();
        jBguardar = new javax.swing.JButton();
        jcabmart = new javax.swing.JCheckBox();
        jcordencomp = new javax.swing.JCheckBox();
        jcventas = new javax.swing.JCheckBox();
        jcrrhh = new javax.swing.JCheckBox();
        jcreportes = new javax.swing.JCheckBox();
        jccompras = new javax.swing.JCheckBox();
        jcabmprov = new javax.swing.JCheckBox();
        jcsms = new javax.swing.JCheckBox();
        jcsip = new javax.swing.JCheckBox();
        jcabmcliente = new javax.swing.JCheckBox();
        jcstockyprecio = new javax.swing.JCheckBox();
        jcctacte = new javax.swing.JCheckBox();
        jcfamsubfam = new javax.swing.JCheckBox();
        jcajustecaja = new javax.swing.JCheckBox();
        jcabmusuario = new javax.swing.JCheckBox();
        jcusadm = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setTitle("PERMISOS Y ACCESOS");
        setMaximumSize(new java.awt.Dimension(575, 438));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(575, 438));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        jCusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCusuarioActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jcabmart.setBackground(new java.awt.Color(255, 255, 255));
        jcabmart.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcabmart.setText("ABM Articulos");

        jcordencomp.setBackground(new java.awt.Color(255, 255, 255));
        jcordencomp.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcordencomp.setText("Orden Compra");

        jcventas.setBackground(new java.awt.Color(255, 255, 255));
        jcventas.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcventas.setText("Ventas");

        jcrrhh.setBackground(new java.awt.Color(255, 255, 255));
        jcrrhh.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcrrhh.setText("RRHH");

        jcreportes.setBackground(new java.awt.Color(255, 255, 255));
        jcreportes.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcreportes.setText("Reportes");

        jccompras.setBackground(new java.awt.Color(255, 255, 255));
        jccompras.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jccompras.setText("Compras");

        jcabmprov.setBackground(new java.awt.Color(255, 255, 255));
        jcabmprov.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcabmprov.setText("ABM Proveedores");

        jcsms.setBackground(new java.awt.Color(255, 255, 255));
        jcsms.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcsms.setText("SMS");

        jcsip.setBackground(new java.awt.Color(255, 255, 255));
        jcsip.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcsip.setText("SIP");

        jcabmcliente.setBackground(new java.awt.Color(255, 255, 255));
        jcabmcliente.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcabmcliente.setText("ABM Clientes");

        jcstockyprecio.setBackground(new java.awt.Color(255, 255, 255));
        jcstockyprecio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcstockyprecio.setText("Stock y Precio");

        jcctacte.setBackground(new java.awt.Color(255, 255, 255));
        jcctacte.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcctacte.setText("Cuenta Corriente");

        jcfamsubfam.setBackground(new java.awt.Color(255, 255, 255));
        jcfamsubfam.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcfamsubfam.setText("Famili, Sub Familia");

        jcajustecaja.setBackground(new java.awt.Color(255, 255, 255));
        jcajustecaja.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcajustecaja.setText("Ajuste Caja");

        jcabmusuario.setBackground(new java.awt.Color(255, 255, 255));
        jcabmusuario.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcabmusuario.setText("ABM Usuarios");

        jcusadm.setBackground(new java.awt.Color(255, 255, 255));
        jcusadm.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jcusadm.setText("USUARIO ADMIN");
        jcusadm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcusadmMouseClicked(evt);
            }
        });
        jcusadm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcusadmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcabmprov)
                            .addComponent(jcventas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jccompras, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcabmart, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcabmcliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcstockyprecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcajustecaja, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcordencomp)
                            .addComponent(jcreportes)
                            .addComponent(jcsms)
                            .addComponent(jcsip)
                            .addComponent(jcctacte)
                            .addComponent(jcfamsubfam)
                            .addComponent(jcrrhh)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcusadm)
                    .addComponent(jcabmusuario))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jCusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBguardar))
                .addGap(18, 18, 18)
                .addComponent(jcusadm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcabmart)
                    .addComponent(jcordencomp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcventas)
                    .addComponent(jcrrhh, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jccompras)
                    .addComponent(jcreportes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcabmprov)
                    .addComponent(jcsms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcsip)
                    .addComponent(jcabmcliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcctacte)
                    .addComponent(jcstockyprecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcfamsubfam)
                    .addComponent(jcajustecaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcabmusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
               
        try {
                // se comienza la conexion con la base de datos
                try {
                    con = new Conexion();

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
       String nombre= (String)jCusuario.getSelectedItem();
       
                boolean activo = jcabmart.isSelected();
                String activo1 = Boolean.toString(activo);
                //Pasa un entero 1 o 0 respectivamente
                int activo2 = activo ? 1 : 0;
                
                boolean clien = jcabmcliente.isSelected();
                String clien1 = Boolean.toString(activo);
                //Pasa un entero 1 o 0 respectivamente
                int clien2 = clien ? 1 : 0;
       /*  boolean activo = jCactivo_clie.isSelected();
                String activo1 = Boolean.toString(activo);
                //Pasa un entero 1 o 0 respectivamente
                int activo2 = activo ? 1 : 0;
        */
                 String sql = "UPDATE `permisos` SET `ABM_Articulo` = ('"+activo2+"') `abm_clientes` = ('"+clien2+"') WHERE nombre = '"+nombre+"'";
// `abm_clientes` `stock_precio` `ajuste_caja` `abm_usuarios` `orden_compra` `rrhh` `reportes` `sms` `sip` `ctacte` `familia_subfamilia` 
   /*         jcabmart.disable();
    jcabmcliente.disable();
 jcabmprov.disable();
  jcabmusuario.disable();
jcajustecaja.disable();
    jccompras.disable();
    jcctacte.disable();
    jcfamsubfam.disable();
    jcordencomp.disable();
    jcreportes.disable();
    jcrrhh.disable();
    jcsip.disable();
    jcsms.disable();
    jcstockyprecio.disable();
jcventas.disable();*/
                 
                 
                // funcion para guardar la contraseña son cifrado MD5
                /*  MessageDigest messagedigest = null;

                try {
                    messagedigest = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }

                //  messagedigest.update(contraseña.getBytes());
                String password = new String(messagedigest.digest());
                System.out.println("texto cifrado: " +password); */

                //sentencias sql para insertar los datos en la base de datos

                //funcion para ejecutar la query
                con.ejecutar(sql);

                JOptionPane.showMessageDialog(null, "Permisos modificados.");

                //se obtienen los datos especificos de la consulta
                /*    boolean lleno = rs.next();
                while (rs.next()){
                    id = rs.getString(1);

                }
                int idp = Integer.parseInt(id);

                // se crea y se ejecuta la query para insertar el nuevo usuario y sus datos
                String sqlu = "INSERT INTO usuario VALUES(NULL, '', '"+password+"', '"+idp+"')";

                con.ejecutar(sqlu);
                JOptionPane.showMessageDialog(null, "Se Agrego Usuario:  a la base de datos."); */

                //se limpian los campos de texto para seguir agregando mas datos


            } catch (SQLException ex) {
                Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

        
                
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jCusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCusuarioActionPerformed
        try {
                    // se comienza la conexion con la base de datos
                    try {
                        con = new Conexion();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(permisos.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(permisos.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(permisos.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(permisos.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    String nom= (String)jCusuario.getSelectedItem();
                    String sql ="SELECT * FROM permisos WHERE nombre LIKE '"+nom+"%'";
                    rs = con.Consulta(sql);

                    if(rs==null){
                    JOptionPane.showMessageDialog(null, "Debe asignar permisos al usuario y guardar los cambios.");
                    }
                    //Para establecer el modelo al JTable
//bool ABM_Art = rs.getObject(nom, null)
                   
       /* if (rs.getBoolean("ABM_Articulo") == true){
        jCheckBox1.setSelected(true);
        }else{
            jCheckBox1.setSelected(false);   
                } */
               while(rs.next()){
        String bool= rs.getString("ABM_Articulo");
        int bool1 = Integer.parseInt(bool);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(bool1 == 0){
           jcabmart.setSelected(false);
       }else{
           jcabmart.setSelected(true);
       }
       
       String vta= rs.getString("Ventas");
        int vta1 = Integer.parseInt(vta);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(vta1 == 0){
           jcventas.setSelected(false);
       }else{
           jcventas.setSelected(true);
       }
       String stprec= rs.getString("stock_precio");
        int stprec1 = Integer.parseInt(stprec);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(stprec1 == 0){
           jcstockyprecio.setSelected(false);
       }else{
           jcstockyprecio.setSelected(true);
       }
       String sms= rs.getString("sms");
        int sms1 = Integer.parseInt(sms);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(sms1 == 0){
           jcsms.setSelected(false);
       }else{
           jcsms.setSelected(true);
       }
       String sip= rs.getString("sip");
        int sip1 = Integer.parseInt(sip);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(sip1 == 0){
           jcsip.setSelected(false);
       }else{
           jcsip.setSelected(true);
       }
       String rrhh= rs.getString("rrhh");
        int rrhh1 = Integer.parseInt(rrhh);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(rrhh1 == 0){
           jcrrhh.setSelected(false);
       }else{
           jcrrhh.setSelected(true);
       }
       String rep= rs.getString("reportes");
        int rep1 = Integer.parseInt(rep);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(rep1 == 0){
           jcreportes.setSelected(false);
       }else{
           jcreportes.setSelected(true);
       }
       String oc= rs.getString("orden_compra");
        int oc1 = Integer.parseInt(oc);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(oc1 == 0){
           jcordencomp.setSelected(false);
       }else{
           jcordencomp.setSelected(true);
       }
       String fam= rs.getString("familia_subfamilia");
        int fam1 = Integer.parseInt(fam);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(fam1 == 0){
           jcfamsubfam.setSelected(false);
       }else{
           jcfamsubfam.setSelected(true);
       }
       String ctacte= rs.getString("ctacte");
        int ctacte1 = Integer.parseInt(ctacte);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(ctacte1 == 0){
           jcctacte.setSelected(false);
       }else{
           jcctacte.setSelected(true);
       }
       String comp= rs.getString("Compras");
        int comp1 = Integer.parseInt(comp);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(comp1 == 0){
           jccompras.setSelected(false);
       }else{
           jccompras.setSelected(true);
       }
       String ajuscaja= rs.getString("ajuste_caja");
        int ajuscaja1 = Integer.parseInt(ajuscaja);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(ajuscaja1 == 0){
           jcajustecaja.setSelected(false);
       }else{
           jcajustecaja.setSelected(true);
       }
       String usuario= rs.getString("abm_usuarios");
        int usuario1 = Integer.parseInt(usuario);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(usuario1 == 0){
           jcabmusuario.setSelected(false);
       }else{
           jcabmusuario.setSelected(true);
       }
       String prov= rs.getString("ABM_Prov");
        int prov1 = Integer.parseInt(prov);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(prov1 == 0){
           jcabmprov.setSelected(false);
       }else{
           jcabmprov.setSelected(true);
       }
       String clien= rs.getString("abm_clientes");
        int clien1 = Integer.parseInt(clien);
      //  boolean bool2 = Boolean.parseBoolean(bool1);
       if(clien1 == 0){
           jcabmcliente.setSelected(false);
       }else{
           jcabmcliente.setSelected(true);
       }
    // `abm_clientes` `stock_precio` `ajuste_caja` `abm_usuarios` `orden_compra` `rrhh` `reportes` `sms` `sip` `ctacte` `familia_subfamilia` 
   /*         jcabmart.disable();
    jcabmcliente.disable();
 jcabmprov.disable();
  jcabmusuario.disable();
jcajustecaja.disable();
    jccompras.disable();
    jcctacte.disable();
    jcfamsubfam.disable();
    jcordencomp.disable();
    jcreportes.disable();
    jcrrhh.disable();
    jcsip.disable();
    jcsms.disable();
    jcstockyprecio.disable();
jcventas.disable();*/
       
               }
       
               
               
               
               
                  /*  DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTbuscarprov.setModel(buscar);

                        //Obteniendo la informacion de las columnas que estan siendo consultadas
                        ResultSetMetaData rsMd = rs.getMetaData();
                        //La cantidad de columnas que tiene la consulta
                        int cantidadColumnas = rsMd.getColumnCount();
                        //Establecer como cabezeras el nombre de las colimnas
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
                            for(int l=0;l<7;l++)
                            buscar.isCellEditable(y, l);
                            y++;
                        }*/

                    } catch (SQLException ex) {
                        Logger.getLogger(permisos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 /*   if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        jTbuscarprov.requestFocusInWindow();
                    }*/
    }//GEN-LAST:event_jCusuarioActionPerformed

    private void jcusadmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcusadmActionPerformed
        boolean dif = jcusadm.isSelected();
                String dif1 = Boolean.toString(dif);
                //Pasa un entero 1 o 0 respectivamente
                int dif2 = dif ? 1 : 0;
        if(jcusadm.isSelected()==true){
            jcabmart.disable();
            jcabmart.disable();
    jcabmcliente.disable();
 jcabmprov.disable();
  jcabmusuario.disable();
jcajustecaja.disable();
    jccompras.disable();
    jcctacte.disable();
    jcfamsubfam.disable();
    jcordencomp.disable();
    jcreportes.disable();
    jcrrhh.disable();
    jcsip.disable();
    jcsms.disable();
    jcstockyprecio.disable();
jcventas.disable();

        }else{
                        jcabmart.enable();
            jcabmart.enable();
    jcabmcliente.enable();
 jcabmprov.enable();
  jcabmusuario.enable();
jcajustecaja.enable();
    jccompras.enable();
    jcctacte.enable();
    jcfamsubfam.enable();
    jcordencomp.enable();
    jcreportes.enable();
    jcrrhh.enable();
    jcsip.enable();
    jcsms.enable();
    jcstockyprecio.enable();
jcventas.enable();
        }
        
        
    }//GEN-LAST:event_jcusadmActionPerformed

    private void jcusadmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcusadmMouseClicked
      boolean dif = jcusadm.isSelected();
                String dif1 = Boolean.toString(dif);
                //Pasa un entero 1 o 0 respectivamente
                int dif2 = dif ? 1 : 0;
        if(jcusadm.isSelected()==true){
            jcabmart.disable();
            jcabmart.disable();
    jcabmcliente.disable();
 jcabmprov.disable();
  jcabmusuario.disable();
jcajustecaja.disable();
    jccompras.disable();
    jcctacte.disable();
    jcfamsubfam.disable();
    jcordencomp.disable();
    jcreportes.disable();
    jcrrhh.disable();
    jcsip.disable();
    jcsms.disable();
    jcstockyprecio.disable();
jcventas.disable();

        }else{
                        jcabmart.enable();
            jcabmart.enable();
    jcabmcliente.enable();
 jcabmprov.enable();
  jcabmusuario.enable();
jcajustecaja.enable();
    jccompras.enable();
    jcctacte.enable();
    jcfamsubfam.enable();
    jcordencomp.enable();
    jcreportes.enable();
    jcrrhh.enable();
    jcsip.enable();
    jcsms.enable();
    jcstockyprecio.enable();
jcventas.enable();
        }
    }//GEN-LAST:event_jcusadmMouseClicked
    public void llenar_combo_usuario() {
       DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();//esto es el modelo  
      
       try{
              
               try {
                   
                con = new Conexion();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                }
                String sql = "SELECT * FROM usuarios ORDER BY nombres";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs = con.Consulta(sql);

                    if(rs==null) 
                        JOptionPane.showMessageDialog(null, "No hay usuarios.");
                modeloCombo.addElement("Seleccione usuario");//es el primer registro q mostrara el combo
                jCusuario.setModel(modeloCombo);//con esto lo agregamos al objeto al jcombobox
                
                //while (rs.getBoolean("activo")){
                 while(rs.next()){
                  estado=rs.getBoolean("activo");
                 if(estado == true){
                  
                    modeloCombo.addElement(rs.getObject("nombres"));
                  //  id=(rs.getString("id_usuario")); //Obtengo el ID al momento de seleccionar el usuario****!!!!
                    jCusuario.setModel(modeloCombo);
                //    String valor = rs.getString("empresa");
//---- Aquí recuperas los valores obtenidos y realizas la carga del JCombobox
//---- Previamente debes tener creado el ComboBox: JComboBox combo = new JComboBox();
//jCprov2.addItem(valor); 
                    //jCprov.addItem (rs.getObject("empresa"));
                    jCusuario.updateUI();
              
                }
                 }
            } catch (SQLException ex) {
          Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox jCusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcabmart;
    private javax.swing.JCheckBox jcabmcliente;
    private javax.swing.JCheckBox jcabmprov;
    private javax.swing.JCheckBox jcabmusuario;
    private javax.swing.JCheckBox jcajustecaja;
    private javax.swing.JCheckBox jccompras;
    private javax.swing.JCheckBox jcctacte;
    private javax.swing.JCheckBox jcfamsubfam;
    private javax.swing.JCheckBox jcordencomp;
    private javax.swing.JCheckBox jcreportes;
    private javax.swing.JCheckBox jcrrhh;
    private javax.swing.JCheckBox jcsip;
    private javax.swing.JCheckBox jcsms;
    private javax.swing.JCheckBox jcstockyprecio;
    private javax.swing.JCheckBox jcusadm;
    private javax.swing.JCheckBox jcventas;
    // End of variables declaration//GEN-END:variables
}
