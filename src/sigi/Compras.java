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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.print.PrintException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import static sigi.oc.idpag;
import static sigi.oc.idprovi;
import static sigi.oc.j;
/**
 *
 * @author Gustavo
 */
public class Compras extends javax.swing.JInternalFrame {
Conexion con,query;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    ResultSet rs4;
    private int limite = 4;
    static int j=0,w=0,jj=0; 
    static String aux3;
    static float total=0;
    static String inv[]=new String[50000];
    static float invT=0;
   public static String id,cad,id_nota, caja;
   String hora,minutos,segundos,ampm;
    Calendar calendario;    
public static int rowCount, numfac, idoc;


    /**
     * Creates new form Compras
     */

    public Compras() {
        initComponents();
       // this.setLocationRelativeTo(null);
     llenar_combo_prov();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTnfact = new javax.swing.JTextField();
        jToc = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTdetallecompra = new javax.swing.JTextArea();
        jBcompra = new javax.swing.JButton();
        jCprov2 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTarticcomp = new javax.swing.JTable();
        jLabel72 = new javax.swing.JLabel();
        jCpag = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jTefect1 = new javax.swing.JTextField();
        jCfechapago = new org.freixas.jcalendar.JCalendarCombo();
        jCpagocaja = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(1500, 960));
        setPreferredSize(getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setText("Proveedor");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setText("Fecha pago");
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("N° Factura");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(jTnfact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 290, -1));

        jToc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTocKeyPressed(evt);
            }
        });
        getContentPane().add(jToc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 290, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setText("N° Orden Comp.");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setText("Descripción de compra:");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTdetallecompra.setColumns(20);
        jTdetallecompra.setRows(5);
        jScrollPane15.setViewportView(jTdetallecompra);

        getContentPane().add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 800, 60));

        jBcompra.setText("Aceptar");
        jBcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcompraActionPerformed(evt);
            }
        });
        getContentPane().add(jBcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 140, 30));

        jCprov2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCprov2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCprov2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, -1));

        jTarticcomp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTarticcomp);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 800, 160));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setText("Detalle compra:");
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jCpag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCpagFocusGained(evt);
            }
        });
        getContentPane().add(jCpag, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 100, -1));

        jButton1.setText("Borrar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 130, 30));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setText("Pago total");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(jTefect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));
        getContentPane().add(jCfechapago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jCpagocaja.setText("Pago de caja");
        getContentPane().add(jCpagocaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcompraActionPerformed
         int e;
        String existe = null;
            String ID = null;
            String ticket;
            String ss;
        try {
                    //se crea la conexion y las consultas
                    con = new Conexion();
                    ///Incerto datos en la tabla de las ordenes_compra
                     String prov = (String) jCprov2.getSelectedItem();
                    String sql = "SELECT * FROM proveedores WHERE empresa LIKE '"+prov+"%'";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs = con.Consulta(sql);
                     if(rs.next()){
                   idprovi=rs.getInt("id_proveedor");
                     
                     }
                      String pag = (String) jCpag.getSelectedItem();
                    String sqlp = "SELECT * FROM forma_pago WHERE nombre LIKE '"+pag+"%'";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs2 = con.Consulta(sqlp);
                     if(rs2.next()){
                   idpag=rs2.getInt("id_forma_pago");
                     
                     }
                   String idprov = Integer.toString(idprovi);
                    String iduser = ppal.jTID.getText();
                   String total = jTefect1.getText();
                 ///obtener la fecha con el formato correcto para la base mysql 
                 String fp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jCfechapago.getDate());
                 //String fe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jCfechaentrega.getDate());
                   String idoc = jToc.getText();
                  String nrofact=jTnfact.getText();
                 //  String condent=jTdetallecompra.getText();
                   boolean pagocaja = jCpagocaja.isSelected();
                  // int pagocaja2 = pagocaja ? 1 : 0;
                   if(pagocaja = true){
                        caja = jTefect1.getText();
                   }
                   
                  boolean finalizado = true;
                   int finalizado2 = finalizado ? 1 : 0;
                    String venta = "INSERT INTO  `sigi`.`compras` (`id_usuario` ,`proveedores_id_proveedor` ,`total` ,`fecha`, `id_forma_pago`, `numero_factura`, `ordenes_compra_id_ordenes_compra`, `finalizada`, `pago_de_caja`)VALUES "
                            + "('"+iduser+"' ,  '"+idprov+"', '"+total+"', '"+fp+"', '"+idpag+"', '"+nrofact+"', '"+idoc+"', '"+finalizado2+"', '"+caja+"');";
                    con.ejecutar(venta);
                     String oc = "UPDATE `ordenes_compra` SET  `finalizada` = "+finalizado2+" WHERE `id_ordenes_compra` = '"+idoc+"'"; 
                       con.ejecutar(oc);
                    ///Fin ordenes_compra
                    
                    String pro[] = new String[100],p;
                    String pro2[] = new String[100];
                    String cos1 = "0";
                    String cant1= "0";
                    String scan1 = "0";
                    Object scan;
                    Object cos;
                    Object cant;
                    int to[] = new int[100];
                    float prec[] = new float[100];
                    Object ex = null,precio=null;
                    Object pros=null;

                    // se crea la sentecia sql y se ejecuta para hacer la modificacion
                    for (int i=0; i<j; i++) {
                        scan = jTarticcomp.getValueAt(i, 2);
                        scan1 = objectToString(scan);
                        pros = jTarticcomp.getValueAt(i, 3);
                        String pro1 = objectToString(pros);
                        p=objectToString(jTarticcomp.getValueAt(i, 1));
                        prec[i]= Float.parseFloat(p);
                        ex=  jTarticcomp.getValueAt(i, 2);
                        String xe = objectToString(ex);
                     //   to[i] = Integer.parseInt(xe);
                        cos = jTarticcomp.getValueAt(i, 3);
                        cos1 = objectToString(cos);
                        cant = jTarticcomp.getValueAt(i, 4);
                        cant1 = objectToString(cant);
                        int cant2 = Integer.parseInt(cant1);
                       //// actualizo el stcok
                        String sqlstk = "SELECT stock.saldo_stock stock.id_stock FROM stock INNER JOIN articulos ON articulos.id_articulo = stock.id_articulo WHERE scanning = '"+scan1+"' ";
                     // Sentencia OK!!   SELECT stock.saldo_stock FROM stock INNER JOIN articulos ON articulos.id_articulo = stock.id_articulo WHERE scanning = 2147483647
                        rs4 = con.Consulta(sqlstk);
                        while(rs4.next()){
                            String saldo = rs4.getString("saldo_stock");
                            String idstk = rs4.getString("id_stock");
                          //  existe = rs.getString(5);
                            int saldo1 = Integer.parseInt(saldo);
                            int nuevostock = saldo1 + cant2;
                            String stk = objectToString(nuevostock);
                            
                            String stock = "UPDATE `stock` SET  `saldo_stock` = "+stk+" WHERE `id_stock` = '"+idstk+"'"; 
                       con.ejecutar(stock);
                      
                        }
                        
                       
                        ///fin actualiza stcok
                        String sqlc = "SELECT * FROM `compras` ORDER BY id_ordenes_compra DESC LIMIT 1";
                        // System.out.println("antes");
                        rs3 = con.Consulta(sqlc);
                        // System.out.println("despues");
                        while(rs3.next()){
                            ID = rs3.getString("id_compras");
                          //  existe = rs.getString(5);

                        }
                       
                        venta = "INSERT INTO `detalle_compras` (`compras_id_compras`, `scaning_producto`, `nombre_producto`, `cantidad`, `costo`) VALUES ('"+ID+"', '"+scan1+"', '"+pros+"', '"+cant1+"', '"+cos1+"');";
                        con.ejecutar(venta);}
/*
                        e = Integer.parseInt(existe);
                        // Float k = Float.parseFloat(ex[i]);
                        int t = e - to[i];

                        String modifica = "UPDATE  `articulos` SET  `existencia` = "+t+" WHERE `id_producto` ="+ID+"";
                        con.ejecutar(modifica);

                    }*/
                    //////                FileOutputStream os = null;
                    //////                try {
                        //////                    os = new FileOutputStream("ticket.txt");
                        //////                } catch (FileNotFoundException ex1) {
                        //////                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex1);
                        //////                }
                    //////                  PrintStream ps = new PrintStream(os);
               /*     String iduser = ppal.jTID.getText();
                 //   String t=jToc.getText();
                  //  float tota = Float.parseFloat(t);
                    String user = "SELECT * FROM usuarios WHERE Id_usuario= '"+iduser+"'";
                    String nombre = null,ap = null;
                    rs = con.Consulta(user);
                    while(rs.next()){
                        nombre = rs.getString(2);
                        ap = rs.getString(3);
                    }
                   String prov = (String) jCprov2.getSelectedItem();
                   String fp = (String) jCfechapago.getSelectedItem();
                   String fe = (String) jCfechaentrega.getSelectedItem();
                   String condent=jTcondentrega.getText();
                    boolean activo = jCpend.isSelected();
                   int activo2 = activo ? 1 : 0;
                    String id34=ppal.jTID.getText();
                  
                    //String venta = "INSERT INTO `ventas`(`total`, `id_usuario`) VALUES (,'"+t+"','"+id34+"')";
                //    String venta = "INSERT INTO  `sigi`.`ordenes_compra` (`id_ventas` ,`total` ,`fecha` ,`Id_usuario`)VALUES (NULL ,  '"+t+"', CURRENT_TIMESTAMP ,  '"+id34+"');";
                //    con.ejecutar(venta);
                    for(int i=0;i<j;i++){
                     String   venta = "INSERT INTO `sigi`.`oc_productos` (`scanning_producto`, `nombre_producto`, `cantidad`, `costo`) VALUES ('"+pro2[i]+"', '"+prec[i]+"', '"+to[i]+"', '"+cant1+"', '"+cos1+"');";
                        con.ejecutar(venta);
                    }
                   */
JOptionPane.showMessageDialog(null, "Compra finalizada.");
                }catch (ClassNotFoundException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                }
   // jToc.setModel(new DefaultTableModel());
    jTefect1.setText("0.0");
    llenar_combo_prov();
     int x =jTarticcomp.getRowCount()-1;

        {
            try
            {
                DefaultTableModel temp = (DefaultTableModel) jTarticcomp.getModel();
                while(x>=0){
                    temp.removeRow(x);
                    x--;
                }
            }
            catch(ArrayIndexOutOfBoundsException d){}
        }

        j=0;
        
    
    jToc.setText("");
    //jCpend.setSelected(false);
    llenar_forma_pago();

    }//GEN-LAST:event_jBcompraActionPerformed

    private void jCprov2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCprov2ActionPerformed
        
        try {
                    //se crea la conexion y las consultas
                    con = new Conexion();
                    ///Incerto datos en la tabla de las ordenes_compra
                     String prov = (String) jCprov2.getSelectedItem();
                    String sql = "SELECT * FROM proveedores WHERE empresa LIKE '"+prov+"%'";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs = con.Consulta(sql);
                    if(rs.next()){
                        idprovi=rs.getInt("id_proveedor"); 
                    }
                    String sqlp = "SELECT * FROM ordenes_compra WHERE id_proveedor LIKE '"+idprovi+"%' ORDER BY fecha_alta DESC LIMIT 1";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs2 = con.Consulta(sqlp);
                     if(rs2.next()){
                   
                   int pago=rs2.getInt("total");
                   String pago1 = Integer.toString(pago);
                   jTefect1.setText(pago1);
                   idoc=rs2.getInt("id_ordenes_compra");
                   String idoc1 = Integer.toString(idoc);
                   jToc.setText(idoc1);                   
                   String idformpag = rs2.getString("id_forma_pago");
                   
                   //llenar el como con la forma de pago correcta
                   String sqlfp = "SELECT * FROM forma_pago WHERE id_forma_pago LIKE '"+idformpag+"%'";
                   rs3 = con.Consulta(sqlfp);
                   DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
                   if(rs3.next()){
                       modeloCombo.addElement(rs3.getObject("nombre"));
                    
                    jCpag.setModel(modeloCombo);
                  
                   }// fin llenar combo
                   
                     }
                 // completo el table con los datos de los productos desde la tabla oc productos
                   String sqlart = "SELECT * FROM oc_productos WHERE id_orden_de_compra = '"+idoc+"%'";
                   rs4 = con.Consulta(sqlart);
                    DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTarticcomp.setModel(buscar);
                        buscar.addColumn("Scanning");
                        buscar.addColumn("Nombre Producto");
                        buscar.addColumn("Precio Costo");
                        buscar.addColumn("Cantidad");
                        while (rs4.next()) {
                            
                           Object[] fila = new Object[4];

                           //for (int i = 0; i < 3; i++) {
//int i = 0;
  //                            fila[i]=rs.getObject(i+1);
                            //Object[] fila = new Object[3];//Creamos un Objeto con tantos parámetros como datos retorne cada fila 
                                              // de la consulta
                fila[0] = rs4.getInt("scaning_producto"); //Lo que hay entre comillas son los campos de la base de datos
                fila[1] = rs4.getString("nombre_producto");
                fila[2] = rs4.getInt("costo");
                fila[3] = rs4.getInt("cantidad");
                buscar.addRow(fila); // Añade una fila al final del modelo de la tabla
                            //}
                            //buscar.addRow(fila);
                           // for(int l=0;l<7;l++)
                           // buscar.isCellEditable(y, l);
                           // y++;
                        //jTbuscar.updateUI();
                        }
    
                     
                    
                   
                   //fin  de tabla

                }catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }//GEN-LAST:event_jCprov2ActionPerformed

    private void jCpagFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCpagFocusGained
llenar_forma_pago();

    }//GEN-LAST:event_jCpagFocusGained

    private void jTocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTocKeyPressed
       try {
                    // se comienza la conexion con la base de datos
                    try {
                        con = new Conexion();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    String nom= jToc.getText();
                    String estado = "0";
                    String sql ="SELECT * FROM ordenes_compra WHERE id_ordenes_compra LIKE '"+nom+"%'";
                    // revisar consulta :  String sql ="SELECT * FROM ordenes_compra WHERE id_ordenes_compra LIKE '"+nom+"%' AND finalizada = '"+estado+"'";
                    
                    rs = con.Consulta(sql);

                    if(rs==null)
                    JOptionPane.showMessageDialog(null, "No se encontro el OC: "+jToc.getText()+" en la base de datos.");
 
                        int y=0;
                        while (rs.next()) {
                            
                         
                jTefect1.setText(rs.getString("total")); //Lo que hay entre comillas son los campos de la base de datos
             
        //  String venta = "INSERT INTO  `sigi`.`ordenes_compra` (`id_usuario` ,`id_proveedor` ,`total` ,`fecha_estimada_recepcion`, `id_forma_pago`, `fecha_de_pago`, `condición_de_entrega`, `aprovado`)VALUES "       
                           
                        }
    // busco los articulos que debe entregar el proveedor+++++++++++++++++++++++
                          try {
                    // se comienza la conexion con la base de datos
                    try {
                        con = new Conexion();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
                    }

                   
                    String sql1 ="SELECT * FROM oc_productos WHERE id_orden_de_compra LIKE '"+nom+"'";
                    rs = con.Consulta(sql1);
                    if(rs==null)
                    JOptionPane.showMessageDialog(null, "No se encontro el sector: "+nom+" en la base de datos.");

                    //Para establecer el modelo al JTable

                    DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTarticcomp.setModel(buscar);

                        //Obteniendo la informacion de las columnas que estan siendo consultadas
                        ResultSetMetaData rsMd = rs.getMetaData();
                        //La cantidad de columnas que tiene la consulta
                        int cantidadColumnas = rsMd.getColumnCount();
                        //Establecer como cabezeras el nombre de las colimnas
                        for (int i = 1; i <= cantidadColumnas; i++) {
                            buscar.addColumn(rsMd.getColumnLabel(i));
                        }

                        //int y=0;
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
                        Logger.getLogger(abmclientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /*if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        jTarticcomp.requestFocusInWindow();
                    }*/
                    } catch (SQLException ex) {
                        Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   /* if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    //    jTcant.requestFocusInWindow();
                      //  jTbuscar.selectAll();
                    //    jTcant.selectAll();
                    }*/
    }//GEN-LAST:event_jTocKeyPressed
    
    
    //-----------combos-------------------------
    public void llenar_combo_prov() {
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
                String sql = "SELECT * FROM proveedores ORDER BY empresa";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs = con.Consulta(sql);

                    if(rs==null) 
                        JOptionPane.showMessageDialog(null, "No hay proveedores en la base de datos.");
                modeloCombo.addElement("Seleccione Proveedor");//es el primer registro q mostrara el combo
                jCprov2.setModel(modeloCombo);//con esto lo agregamos al objeto al jcombobox
                while (rs.next()) {
                    modeloCombo.addElement(rs.getObject("empresa"));
                    
                    jCprov2.setModel(modeloCombo);
                //    String valor = rs.getString("empresa");
//---- Aquí recuperas los valores obtenidos y realizas la carga del JCombobox
//---- Previamente debes tener creado el ComboBox: JComboBox combo = new JComboBox();
//jCprov2.addItem(valor); 
                    //jCprov.addItem (rs.getObject("empresa"));
                    jCprov2.updateUI();
                }
           
            
            } catch (SQLException ex) {
          Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
    }  

    public void llenar_forma_pago() {
       DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();//esto es el modelo  
      
       try{
              
               try {
                   
                con = new Conexion();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
                }
                String sql = "SELECT * FROM forma_pago";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs = con.Consulta(sql);

                    if(rs==null) 
                        JOptionPane.showMessageDialog(null, "Error");
                modeloCombo.addElement("Forma Pago");//es el primer registro q mostrara el combo
                jCpag.setModel(modeloCombo);//con esto lo agregamos al objeto al jcombobox
                while (rs.next()) {
                    modeloCombo.addElement(rs.getObject("nombre"));
                    
                    jCpag.setModel(modeloCombo);
                //    String valor = rs.getString("empresa");
//---- Aquí recuperas los valores obtenidos y realizas la carga del JCombobox
//---- Previamente debes tener creado el ComboBox: JComboBox combo = new JComboBox();
//jCprov2.addItem(valor); 
                    //jCprov.addItem (rs.getObject("empresa"));
                    //jCformapago.updateUI();
                }
           
            
            } catch (SQLException ex) {
          Logger.getLogger(oc.class.getName()).log(Level.SEVERE, null, ex);
            }
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcompra;
    private javax.swing.JButton jButton1;
    private org.freixas.jcalendar.JCalendarCombo jCfechapago;
    private javax.swing.JComboBox jCpag;
    private javax.swing.JCheckBox jCpagocaja;
    private javax.swing.JComboBox jCprov2;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTarticcomp;
    private javax.swing.JTextArea jTdetallecompra;
    private javax.swing.JTextField jTefect1;
    private javax.swing.JTextField jTnfact;
    private javax.swing.JTextField jToc;
    // End of variables declaration//GEN-END:variables

public String objectToString(Object o) {
        String st;
        st = (String) o;
        return st;
    }
}