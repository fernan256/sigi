/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigi;

import Connection.Conexion;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import java.io.IOException;              //Para exportar e importar
import java.util.ArrayList;    //Para exportar e importar
import java.util.List;     //Para exportar e importar
import java.util.Vector;          //Para exportar e importar
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Gustavo
 */
public class proveedores extends javax.swing.JInternalFrame {
Conexion con,query;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    static int j=0,w=0,jj=0,nombre=0; 
    static String aux3;
    static String result;
    static float total=0;
    static String inv[]=new String[50000];
    static float invT=0;
   public static String id,cad,id_sect, rstring, rstring1, rstring2, idfam, idsubfam;
   String hora,minutos,segundos,ampm;
    Calendar calendario;    
public static int rowCount, numfac, rs1,id1;
public static boolean estado;

 private static DefaultTableModel modelo;

//para exportar
    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    private static int tabla_ancho = 0;
    private static int tabla_alto = 0;

    /**
     * Creates new form proveedores
     */
    public proveedores() {
        initComponents();
        searchItems();
        
    //    llenar_combo_familia();
    //    llenar_combo_subfamilia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTnomb = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTempresa = new javax.swing.JTextField();
        jTdireccion = new javax.swing.JTextField();
        jTmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jBcrear = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jCactivo = new javax.swing.JCheckBox();
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
        jTtelefono = new javax.swing.JFormattedTextField();
        jTcelular = new javax.swing.JFormattedTextField();
        jTfax = new javax.swing.JFormattedTextField();
        Jbmodificar = new javax.swing.JButton();
        jTcuit = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTdescripcion.setColumns(20);
        jTdescripcion.setRows(5);
        jScrollPane1.setViewportView(jTdescripcion);

        jLabel1.setText("Descripción de productos");

        jBcrear.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jBcrear.setText("Crear");
        jBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearActionPerformed(evt);
            }
        });

        jBborrar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jBborrar.setText("Borrar");
        jBborrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBborrarMouseClicked(evt);
            }
        });

        jBeliminar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jCactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCactivoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Empresa");

        jLabel6.setText("Dirección");

        jLabel7.setText("Telefono");

        jLabel8.setText("Celular");

        jLabel9.setText("Fax");

        jLabel10.setText("Mail");

        jLabel11.setText("Cuit/Cuil");

        jLabel12.setText("Buscar");

        Jbmodificar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        Jbmodificar.setText("Modificar");
        Jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbmodificarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton1.setText("A XLS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Activo/Inactivo");

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTfax, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTcelular, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTtelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTcuit, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTnomb, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCactivo))
                                .addContainerGap(444, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTmail, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBcrear)
                                .addGap(18, 18, 18)
                                .addComponent(jBborrar)
                                .addGap(18, 18, 18)
                                .addComponent(jBeliminar)
                                .addGap(18, 18, 18)
                                .addComponent(Jbmodificar)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))))
                        .addGap(0, 119, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTfax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTcuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCactivo)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcrear)
                    .addComponent(jBborrar)
                    .addComponent(jBeliminar)
                    .addComponent(Jbmodificar)
                    .addComponent(jButton1))
                .addContainerGap(522, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed
                            //BOTON PARA AGREGAR UN PRODUCTO A LA BASE DE DATOS

        //int aux=0;

        // validaciones para saber que no se deja algun campo en limpio
        if (jTempresa.getText().equals("")||jTtelefono.getText().equals("")||jTdireccion.getText().equals("")||jTmail.getText().equals("")||jTcuit.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Los campos empresa, telefono, dirección y mail deben estar completos");

        }

        else
   
      
        {
            try {
                // se comienza la conexion con la base de datos
                try {
                    con = new Conexion();

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
                //se obtienen los valores de los jTextField
                
                //obtengo los combos de sector, familia, subfamilia
                /*    String sec = (String) jCsector.getSelectedItem(); 
                    String sql1 = "SELECT id_sector FROM sector WHERE nombre LIKE '"+sec+"'";
                    rs = con.Consulta(sql1); 
                    rs.next();
                    int id = rs.getInt("id_sector");*/
                  /*  String fam = (String) jCfamilia.getSelectedItem(); 
                    String sql2 = "SELECT id_familia FROM familia WHERE nombre LIKE '"+fam+"'";
                    rs = con.Consulta(sql2); 
                    rs.next();
                    int idfam = rs.getInt("id_familia");
                    String subfam = (String) jCsub_familia.getSelectedItem(); 
                    String sql3 = "SELECT id_subfamilia FROM subfamilia WHERE nombre LIKE '"+subfam+"'";
                    rs = con.Consulta(sql3); 
                    rs.next();
                    int idsubfam = rs.getInt("id_subfamilia");*/
                    
                   // rs1 = rs.getInt("id_sector");
             //       rstring = Integer.toString(id);
                  //  rstring1 = Integer.toString(idfam);
                  //  rstring2 = Integer.toString(idsubfam);
                    //jLabel1.setText(rstring);
                String nomb = jTnomb.getText();
                String apellido = jTapellido.getText();
                String empresa = jTempresa.getText();
                String direccion = jTdireccion.getText();
                String telefono = jTtelefono.getText();
                String celular = jTcelular.getText();
                String fax = jTfax.getText();
                String mail = jTmail.getText();
                String cuit = jTcuit.getText();
                String descrip = jTdescripcion.getText();
                
            boolean activo = jCactivo.isSelected();
                //String activo1 = Boolean.toString(activo);    
               //Pasa un entero 1 o 0 respectivamente
                int activo2 = activo ? 1 : 0;
          
                //sentencias sql para insertar los datos en la base de datos
                String sql = "INSERT INTO `proveedores`(`nombre`, `apellido`, `direccion`, `mail`, `telefono`, `cel`, `empresa`, `descripcion`, `activo`, `fax`, `cuit`) VALUES ('"+nomb+"','"+apellido+"','"+direccion+"','"+mail+"','"+telefono+"','"+celular+"','"+empresa+"','"+descrip+"','"+activo2+"','"+fax+"','"+cuit+"')";

                //funcion para ejecutar la query
                con.ejecutar(sql);

                JOptionPane.showMessageDialog(null, "Proveedor: "+empresa+" agregado.");
                searchItems();
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
              
                jCactivo.setSelected(true);
               jTnomb.setText("");
               jTapellido.setText("");
                jTempresa.setText("");
                jTdireccion.setText("");
                jTtelefono.setText("");
              jTcelular.setText("");
          jTfax.setText("");
              jTmail.setText("");
               jTcuit.setText("");
                jTdescripcion.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jBcrearActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
            
          
            try {
                // se comienza la conexion con la base de datos
                try {
                    con = new Conexion();

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
                //se obtienen los valores de los jTextField

                String empresa = jTempresa.getText();
              
            
              
                //sentencias sql para insertar los datos en la base de datos
                String sql = "DELETE FROM `proveedores` WHERE id_proveedor='"+id+"'";

                //funcion para ejecutar la query
                con.ejecutar(sql);

                JOptionPane.showMessageDialog(null, "Proveedor: "+empresa+" eliminado.");

                //se obtienen los datos especificos de la consulta
             

                //se limpian los campos de texto para seguir agregando mas datos
                jCactivo.setSelected(true);
               jTnomb.setText("");
               jTapellido.setText("");
                jTempresa.setText("");
                jTdireccion.setText("");
                jTtelefono.setText("");
              jTcelular.setText("");
              jTfax.setText("");
              jTmail.setText("");
               jTcuit.setText("");
                jTdescripcion.setText("");


            } catch (SQLException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBborrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBborrarMouseClicked
               
        jCactivo.setSelected(true);
                jTnomb.setText("");
                jTapellido.setText("");
                jTempresa.setText("");
                jTdireccion.setText("");
                jTtelefono.setText("");
                jTcelular.setText("");
                jTfax.setText("");
                jTmail.setText("");
                jTcuit.setText("");
                jTdescripcion.setText("");
    }//GEN-LAST:event_jBborrarMouseClicked

    private void JbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbmodificarActionPerformed
               //BOTON PARA MODIFICAR LOS DATOS DE UN PRODUCTO EN LA BASE DE DATOS
 try { 
         /* String sec = (String) jCsector.getSelectedItem(); 
                    String sql1 = "SELECT id_sector FROM sector WHERE nombre LIKE '"+sec+"'";
                    rs2 = con.Consulta(sql1);
                    rs2.next();
                    id1 = rs2.getInt("id_sector");*/
              /*  String fam = (String) jCfamilia.getSelectedItem(); 
               } catch (SQLException ex) {
        Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
    }     String sql2 = "SELECT id_familia FROM familia WHERE nombre LIKE '"+fam+"'";
                    rs = con.Consulta(sql2); 
                    rs.next();
                    int idfam = rs.getInt("id_familia");
                    String subfam = (String) jCsub_familia.getSelectedItem(); 
                    String sql3 = "SELECT id_subfamilia FROM subfamilia WHERE nombre LIKE '"+subfam+"'";
                    rs = con.Consulta(sql3); 
                    rs.next();
                    int idsubfam = rs.getInt("id_subfamilia");*/
                  //  String id2 = (id1);
                   // rs1 = rs.getInt("id_sector");
                  //  rstring1 = Integer.toString(idfam);
                  //  rstring2 = Integer.toString(idsubfam);
                    //jLabel1.setText(rstring);
                String nomb = jTnomb.getText();
                String apellido = jTapellido.getText();
                String empresa = jTempresa.getText();
                String direccion = jTdireccion.getText();
                String telefono = jTtelefono.getText();
                String celular = jTcelular.getText();
                String fax = jTfax.getText();
                String mail = jTmail.getText();
                String cuit = jTcuit.getText();
                String descrip = jTdescripcion.getText();
                
            boolean activo = jCactivo.isSelected();
                //String activo1 = Boolean.toString(activo);    
               //Pasa un entero 1 o 0 respectivamente
                int activo2 = activo ? 1 : 0;
              
                //sentencias sql para insertar los datos en la base de datos

       
                //se crea la conexion y las consultas
                con = new Conexion();
                //String sql ="SELECT id_clientes FROM productos WHERE nombre LIKE '%"+nombapell+"%'";
                
                // se crea la sentecia sql y se ejecuta para hacer la modificacion

                String modifica = "UPDATE `proveedores` SET `nombre`='"+nomb+"',`apellido`='"+apellido+"',`direccion`='"+direccion+"',`cel`='"+celular+"',`mail`='"+mail+"',`empresa`='"+empresa+"',`activo`='"+activo2+"',`cuit`='"+cuit+"',`fax`='"+fax+"',`descripcion`='"+descrip+"',`empresa`='"+empresa+"',`telefono`='"+telefono+"' WHERE id_proveedor = '"+id+"'";
                con.ejecutar(modifica);
                JOptionPane.showMessageDialog(null, "Datos Actualizados");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }//GEN-LAST:event_JbmodificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            // se comienza la conexion con la base de datos
            try {
                con = new Conexion();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql ="SELECT * FROM proveedores";
            rs = con.Consulta(sql);
            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }};
            System.out.println(this);
            this.proveedoresTabla.setModel(buscar);

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
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(proveedores.this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            File dir = dialog.getSelectedFile();

            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(proveedoresTabla);
                //-------------------
                export_excel excelExporter = new export_excel(tb, new File(dir.getAbsolutePath() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void searchItems(){
        try {
            // se comienza la conexion con la base de datos
            try {
                con = new Conexion();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }

            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(search);
            String sql ="SELECT empresa FROM proveedores";
            rs = con.Consulta(sql);
            while(rs.next()){
                result = rs.getString("empresa");
                textAutoAcompleter.addItem(result);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jCactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCactivoActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        int evento=evt.getKeyCode();
        String nom = search.getText();
                 
        if(evento==10 ){
            String bool;
            try {
                    // se comienza la conexion con la base de datos
                    try {
                        con = new Conexion();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    
                    String sql ="SELECT * FROM proveedores WHERE empresa LIKE '"+nom+"%'";
                    rs = con.Consulta(sql);
                    
                    if(rs == null) {
                       JOptionPane.showMessageDialog(null, "No se encontro el proveedor: "+search.getText()+" ");
                    }
                    while(rs.next()){
                       
                        id =  rs.getString("id_proveedor");
                        this.jTnomb.setText(rs.getString("nombre"));
                        this.jTapellido.setText(rs.getString("apellido"));
                        this.jTdireccion.setText(rs.getString("direccion"));
                        this.jTmail.setText(rs.getString("mail"));
                        this.jTtelefono.setText(rs.getString("telefono"));
                        this.jTcelular.setText(rs.getString("cel"));
                        this.jTempresa.setText(rs.getString("empresa"));
                        this.jTdescripcion.setText(rs.getString("descripcion"));
                        this.jTfax.setText(rs.getString("fax"));
                        this.jTcuit.setText(rs.getString("cuit")); 
                        if(rs.getInt("activo") == 1) {
                            bool = "true";
                        } else {
                            bool = "false";
                        }
                        String bool1 = bool;
                        boolean bool2 = Boolean.parseBoolean(bool1);
                        System.out.println(bool2);
                        if(bool2==true){
                            jCactivo.setSelected(true);
                        }else{
                            jCactivo.setSelected(false);
                        }
                    }
                    System.out.println(result);

                    } catch (SQLException ex) {
                        Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
                    }
         
            }
    }//GEN-LAST:event_searchKeyReleased
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
                //filas.add(d);
                modelo.addRow(d);
            }
    
        } catch (BiffException e) {
            e.printStackTrace();
        } 
}  
    
        
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbmodificar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBcrear;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCactivo;
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
    private javax.swing.JTextField jTapellido;
    private javax.swing.JFormattedTextField jTcelular;
    private javax.swing.JFormattedTextField jTcuit;
    private javax.swing.JTextArea jTdescripcion;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTempresa;
    private javax.swing.JFormattedTextField jTfax;
    private javax.swing.JTextField jTmail;
    private javax.swing.JTextField jTnomb;
    private javax.swing.JFormattedTextField jTtelefono;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JTable proveedoresTabla;
}