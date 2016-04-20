/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigi;
/*
 * Fichero: PruebaJTree.java
 * Autor: Chuidiang
 * Fecha: 27/02/07 22:19
 */
//package chuidiang.ejemplos;
import Connection.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import Connection.Conexion;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.util.*;
import javax.print.PrintException;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTextField;
import java.lang.Object;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Clase de ejemplo sencillo de uso del JTree
 *
 * @author Chuidiang
 */

/**
 *
 * @author Gustavo
 */
public class ppal extends javax.swing.JFrame {
    Conexion con,query;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
   public  int IDusuario;
    public int priorityLevel;
    String id2="";
    /**
     * Creates new form ppal
     */

   // private JLabel jLabel17;
    private Object txtestatus;
    private JLabel jLabel20;
    private JLabel jLabel6;
    private JLabel jLabel21;
    private JTextField txtapellidom;
    private JTextField txtapellidop;
    private JTextField txtdireccion;
    private JTextField txtciudad;
    private JLabel jLabel24;
    private int limite = 4;
    static int j=0,w=0,jj=0; 
    static String aux3;
    static float total=0;
    static String inv[]=new String[50000];
    static float invT=0;
   public static String id,cad,id_nota;
   String hora,minutos,segundos,ampm;
    Calendar calendario;    
    Thread h1;
    public static int rowCount, numfac;
    public static boolean ABM_Articulo;
     public ppal() {
         System.out.println(priorityLevel);
      //System.out.println(IDusuario);
      if(IDusuario != 0) {
          System.out.println(IDusuario);
          String ax = JOptionPane.showInputDialog("Ingrese apertura caja: ", "0");
        
int ax1 = Integer.parseInt(ax);
if(ax1 > 0){
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

                    String nom= ax;
                    String id = jTID.getText();
                    String apertura ="INSERT INTO  `sigi`.`caja` (`apertura`, `id_usuario`)VALUES ('"+nom+"', '"+id+"')";
                    
                    con.ejecutar(apertura);

    
                    } catch (SQLException ex) {
                        Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
        moduloVenta vta = new moduloVenta();
         vta.setVisible(true);
       jBvta.setEnabled(false);   
} else {
    ax = "0";
    JOptionPane.showMessageDialog(null, "Debe ingresar el conteo de apertura de caja, intente nuevamente. ");
}
      } else{
            initComponents();
       //     h1 = new Thread(this);
//            h1.start();
            
                    this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            
          
//            aux = Integer.parseInt(cad);
 // ---------------- para realizar la muestra del mensaje:-----------------------------------           
           Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        String año1 = Integer.toString(año);
        int mes = (fecha.get(Calendar.MONTH)+1);
        String mes1 = Integer.toString(mes);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String dia1 = Integer.toString(dia);
        String fechaact = año1+"-"+mes1+"-"+dia1;
                                   //  rs2 = con.Consulta(sql1);
                                   
                                        //while(rs2.next()){
                                          //  ABM_Articulo= rs2.getBoolean("ABM_Articulo");
        
   // jTvscaningv.requestFocusInWindow();
   // jTcierre.setEnabled(false);
   // jBcierre.setEnabled(false);        
                                    
     }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jBvta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ctacte = new javax.swing.JButton();
        lbHora1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setForeground(new java.awt.Color(255, 255, 255));
        desktopPane.setMaximumSize(new java.awt.Dimension(1680, 960));
        desktopPane.setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Articulos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Stock");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Compra");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("OC");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Facturas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ajustes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Caja");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Venta");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Cliente");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Proveedor");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cuentas Corrientes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administrar BD");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTree1.setRootVisible(false);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jBvta.setBackground(new java.awt.Color(255, 255, 255));
        jBvta.setText("VTA");
        jBvta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBvta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBvta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBvta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBvtaMouseClicked(evt);
            }
        });
        jBvta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvtaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.jpg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("USUARIO");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setText("ID Admin:");

        jTID.setEditable(false);
        jTID.setBackground(new java.awt.Color(255, 255, 255));
        jTID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Modulos");

        ctacte.setText("ctacte");
        ctacte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctacteActionPerformed(evt);
            }
        });

        lbHora1.setText("HORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBvta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(ctacte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbHora1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBvta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctacte, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHora1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Compras objIC=new Compras();

altaModificaionArticulos objIC1=new altaModificaionArticulos();
bajaArticulos objIC20=new bajaArticulos();
abmclientes objIC3=new abmclientes();
//abmusuario objIC4=new abmusuario();
ajusteCaja objIC5=new ajusteCaja();
ajusteVenta objIC6=new ajusteVenta();
buscarfacturas objIC9=new buscarfacturas();
cliente objIC10=new cliente();
configsoft objIC11=new configsoft();
ctacte objIC12=new ctacte();
estadocuentas objIC13=new estadocuentas();
importarexportar objIC15=new importarexportar();
oc objIC16=new oc();
permisos objIC17=new permisos();
proveedores objIC19=new proveedores();
reportes objIC26=new reportes();
stock objIC25=new stock();

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        
        String menu = jTree1.getLastSelectedPathComponent().toString();
        if(menu.equals("ABM Compra")){
           if(objIC.isShowing()){
        	//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC);
                objIC.show();
                objIC.setSize(desktopPane.getSize());
            }
        } 
        if(menu.equals("ABM Articulos") ){
            if(objIC1.isShowing()){
                //mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC1);
                objIC1.show();
                objIC1.setSize(desktopPane.getSize());
            }
        }
        if(menu.equals("ABM Cliente")){
            if(objIC3.isShowing()){
                //mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC3);
                objIC3.show();
                objIC3.setSize(desktopPane.getSize());
            }
        } 
        if(menu.equals("Stock")){
            if(objIC25.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC25);
                objIC25.show();
                objIC25.setSize(desktopPane.getSize());
            }
        }
        if(menu.equals("Cuentas Corrientes")){
            if(objIC12.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC12);
                objIC12.show();
                objIC12.setSize(desktopPane.getSize());
            }
        }
        if(menu.equals("OC")){
            if(objIC16.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC16);
                objIC16.show();
                objIC3.setSize(desktopPane.getSize());
            }
        } 
        if(menu.equals("ABM Proveedor")){
            if(objIC19.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC19);
                objIC19.show();
                objIC19.setSize(desktopPane.getSize());
            }
        } 
        if(menu.equals("Permisos")){
            if(objIC17.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC17);
                objIC17.show();
                //objIC17.setSize(desktopPane.getSize());
            }
        } 
        if(menu.equals("Buscar Facturas")){
            if(objIC9.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC9);
                objIC9.show();
                //objIC17.setSize(desktopPane.getSize());
            }
        } 
        if(menu.equals("Caja")){
            if(objIC5.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC5);
                objIC5.show();
                //objIC17.setSize(desktopPane.getSize());
            }
        }
        if(menu.equals("Reportes")){
            if(objIC26.isShowing()){
		//mensaje de que está abierto si se desea
            }else{
                desktopPane.add(objIC26);
                objIC26.show();
                objIC26.setSize(desktopPane.getSize());
            }
        }
    }//GEN-LAST:event_jTree1MouseClicked
    
    private void jBvtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvtaActionPerformed
 /*       
        moduloVenta vta = new moduloVenta();
         vta.setVisible(true);
       jBvta.setEnabled(false);*/
    }//GEN-LAST:event_jBvtaActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        abmusuario1 showAbmUser = new abmusuario1();
         showAbmUser.setVisible(true);
      // jBvta.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ctacteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctacteActionPerformed
        ctacte showCtacte = new ctacte();
        showCtacte.setVisible(true);
    }//GEN-LAST:event_ctacteActionPerformed

    private void jBvtaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBvtaMouseClicked

String ax = JOptionPane.showInputDialog("Ingrese apertura caja: ", "0");
        
int ax1 = Integer.parseInt(ax);
if(ax1 > 0){
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

                    String nom= ax;
                    String id = jTID.getText();
                    String apertura ="INSERT INTO  `sigi`.`caja` (`apertura`, `id_usuario`)VALUES ('"+nom+"', '"+id+"')";
                    
                    con.ejecutar(apertura);

    
                    } catch (SQLException ex) {
                        Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
        moduloVenta vta = new moduloVenta();
         vta.setVisible(true);
       jBvta.setEnabled(false);   
} else {
    ax = "0";
    JOptionPane.showMessageDialog(null, "Debe ingresar el conteo de apertura de caja, intente nuevamente. ");
}
    }//GEN-LAST:event_jBvtaMouseClicked

    /**
     * @param args the command line arguments
     */
  /*  public void calcula () {        
    Calendar calendario1 = new GregorianCalendar();
    Date fechaHoraActual = new Date();


    calendario1.setTime(fechaHoraActual);
    ampm = calendario1.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";

    if(ampm.equals("PM")){
         int h = calendario1.get(Calendar.HOUR_OF_DAY);
         hora = h>9?""+h:"0"+h;
    }else{
         hora = calendario1.get(Calendar.HOUR_OF_DAY)>9?""+calendario1.get(Calendar.HOUR_OF_DAY):"0"+calendario1.get(Calendar.HOUR_OF_DAY);            
    }
    minutos = calendario1.get(Calendar.MINUTE)>9?""+calendario1.get(Calendar.MINUTE):"0"+calendario1.get(Calendar.MINUTE);
    segundos = calendario1.get(Calendar.SECOND)>9?""+calendario1.get(Calendar.SECOND):"0"+calendario1.get(Calendar.SECOND); 
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         // Construccion del arbol
             
    
        /* Create and display the form */
     /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ppal().setVisible(true);

            }
        });
    }
    */
public void setId(String id){
    id2 = id;
    jTID.setText(id);
  
}

/*public void setC(){
        try {
           // int q=0;
            rs=con.Consulta("SELECT * FROM usuarios WHERE nivel = '1' OR nivel = '0'");
            while(rs.next()){
                jCuser.addItem(rs.getString(5));
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
        }

}*/
public void getT(String cad){
    aux3 = cad;
    System.out.println(aux3);
}

public void setT(String cad){
        String aux2 = cad;

}

public String getId(){
    cad = jTID.getText();
    return cad;
}
public void setNivel(int nivel) {
    priorityLevel = nivel;
}

public String objectToString(Object o) {
        String st;
        st = (String) o;
        return st;
    }
public int getFactura(){
        return rowCount;
}

public int getNumFac(){
        return numfac;
}

public void calcula () {        
    Calendar calendario1 = new GregorianCalendar();
    Date fechaHoraActual = new Date();


    calendario1.setTime(fechaHoraActual);
    ampm = calendario1.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";

    if(ampm.equals("PM")){
         int h = calendario1.get(Calendar.HOUR_OF_DAY);
         hora = h>9?""+h:"0"+h;
    }else{
         hora = calendario1.get(Calendar.HOUR_OF_DAY)>9?""+calendario1.get(Calendar.HOUR_OF_DAY):"0"+calendario1.get(Calendar.HOUR_OF_DAY);            
    }
    minutos = calendario1.get(Calendar.MINUTE)>9?""+calendario1.get(Calendar.MINUTE):"0"+calendario1.get(Calendar.MINUTE);
    segundos = calendario1.get(Calendar.SECOND)>9?""+calendario1.get(Calendar.SECOND):"0"+calendario1.get(Calendar.SECOND); 
}


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ppal().setVisible(true);
                
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ctacte;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jBvta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField jTID;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lbHora1;
    // End of variables declaration//GEN-END:variables
/*public void setId(String id){
    id2 = id;
    jTID.setText(id);
  
}
public void setC(){
        try {
           // int q=0;
            rs=con.Consulta("SELECT * FROM usuarios WHERE nivel = '1' OR nivel = '0'");
            while(rs.next()){
                jCuser.addItem(rs.getString(5));
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ppal.class.getName()).log(Level.SEVERE, null, ex);
        }

}*/
   public void run() {
        Thread ct = Thread.currentThread();
         while(ct == h1) {   
          calcula();
         // lbHora.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
          lbHora1.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
         // lbHora2.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
          try {
              
           Thread.sleep(1000);
          }catch(InterruptedException e) {}
         }
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
