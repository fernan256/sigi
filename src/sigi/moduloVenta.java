/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigi;

import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Gustavo
 */
public class moduloVenta extends javax.swing.JFrame {
Conexion con,query;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    public  int IDusuario;
    
   static float total=0;
   static int j=0;
   public static String id1, id2;
    private static moduloVenta myInstance;
   public moduloVenta() {
        initComponents();
       this.setLocationRelativeTo(null);
     //   this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      //  this.setUndecorated(true);
      //  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTvscaningv = new javax.swing.JTextField();
        jTcant = new javax.swing.JTextField();
        jTdesc = new javax.swing.JTextField();
        jTtotalv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBcerrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        Tlistav = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        printTicket = new javax.swing.JCheckBox();
        jTID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(880, 610));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTvscaningv.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jTvscaningv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvscaningvActionPerformed(evt);
            }
        });
        jTvscaningv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTvscaningvKeyReleased(evt);
            }
        });
        getContentPane().add(jTvscaningv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 289, 60));

        jTcant.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jTcant.setText("1");
        jTcant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTcantKeyPressed(evt);
            }
        });
        getContentPane().add(jTcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 289, 60));

        jTdesc.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jTdesc.setText("0.00");
        jTdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdescKeyPressed(evt);
            }
        });
        getContentPane().add(jTdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 289, 60));

        jTtotalv.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jTtotalv.setForeground(new java.awt.Color(255, 0, 0));
        jTtotalv.setText("0.00");
        getContentPane().add(jTtotalv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 500, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminafila.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 60, 60));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Imprimir");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 80, 60));

        jBcerrar.setBackground(new java.awt.Color(255, 255, 255));
        jBcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.jpg"))); // NOI18N
        jBcerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jBcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 60, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel vta.jpg"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 60, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("SCANING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("CANTIDAD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Tlistav.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad", "Descuento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(Tlistav);

        getContentPane().add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 500, 310));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("DESCUENTO EN $");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("$");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 500, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("RESULTADOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("COMPRA ACTUAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jButton4.setText("Cta Cte");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 80, 60));

        printTicket.setText("Imprimit ticket");
        printTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTicketActionPerformed(evt);
            }
        });
        getContentPane().add(printTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 160, 40));
        getContentPane().add(jTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 30, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcerrarMouseClicked
String ax = JOptionPane.showInputDialog("Ingrese cierre caja: ", "0");
        
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
                    String id = ppal.jTID.getText();
                    String apertura ="INSERT INTO  `sigi`.`caja` (`cierre`, `id_usuario`)VALUES ('"+nom+"', '"+id+"')";
                    
                    con.ejecutar(apertura);

    
                    } catch (SQLException ex) {
                        Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
           this.dispose();
        ppal.jBvta.setEnabled(true); 
} else {
    ax = "0";
    JOptionPane.showMessageDialog(null, "Debe ingresar el conteo de cierre de caja, intente nuevamente. ");
}
    
    }//GEN-LAST:event_jBcerrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)Tlistav.getModel();
        int fila = Tlistav.getSelectedRow();
        if(fila <= 0) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar la fila a eliminar de la tabla COMPRA ACTUAL");
        } else{
            modelo.removeRow(fila);           
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jTcantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcantKeyPressed
if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
jTdesc.requestFocusInWindow();
jTdesc.selectAll();
}//Agregar la modificacion a la BD y limpiar la tabla y el textbox....
                
                //Tproductos.clearSelection();
            
    }//GEN-LAST:event_jTcantKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         total=0;
        jTtotalv.setText("0.00");

        int x =Tlistav.getRowCount()-1;

        {
            try
            {
                DefaultTableModel temp = (DefaultTableModel) Tlistav.getModel();
                while(x>=0){
                    temp.removeRow(x);
                    x--;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){}
        }

        j=0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            //if(JOptionPane.showConfirmDialog(rootPane, "Ya esta listo para imprimir el Ticket?","Imprimir Ticket",1)==0){
            String existe = null;
            int e;
            String articleId = null;
            String ticket = "";
            String ss;
            if (j==0)
            {

                JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");

            }

            else
            {

                try {
                    //se crea la conexion y las consultas
                    con = new Conexion();
                    String pro[] = new String[j],p;
                    String pro2[] = new String[j];
                    int to[] = new int[j];
                    float prec[] = new float[j];
                    Object ex = null,precio=null;
                    Object pros=null;
                    
                    //System.out.println("j:" + j);
                    // se crea la sentecia sql y se ejecuta para hacer la modificacion
                    for (int i=0; i<j; i++) {
                        
                        pros = Tlistav.getValueAt(i, 0);
                        pro[i] = objectToString(pros);
                        p=objectToString(Tlistav.getValueAt(i, 2));
                        prec[i]= Float.parseFloat(p);
                        ex=  Tlistav.getValueAt(i, 3);
                        String xe = objectToString(ex);
                        to[i] = Integer.parseInt(xe);
                        System.out.println("pros: " + pros);
                        System.out.println("pro: " + pro[i]);
                        System.out.println("p: " + p);
                        System.out.println("prec: " + prec[i]);
                        System.out.println("ex: " + ex);
                        System.out.println("xe: " + xe);
                        String sqlc = "SELECT * FROM stock t2 INNER JOIN descripcion_articulos t1 WHERE t1.scanning = '"+pro[i]+"' AND t2.id_stock = t1.stock_id_stock";
                        rs = con.Consulta(sqlc);
                        while(rs.next()){
                            articleId = rs.getString(1);
                            existe = rs.getString(3);
                        }
                        System.out.println("articleID: " + articleId);
                        System.out.println("existe:" + existe);
                        e = Integer.parseInt(existe);
                        // Float k = Float.parseFloat(ex[i]);
                        System.out.println("e: " + e);
                        System.out.println("to: " + to[i]);
                        int t = e - to[i];
                        System.out.println(t);
                        String modifica = "UPDATE  `stock` SET  `saldo_stock` = "+t+" WHERE `id_articulo` ="+articleId+"";
                        con.ejecutar(modifica);

                    }
                    String iduser = ppal.jTID.getText();
                    String t=jTtotalv.getText();
                    float tota = Float.parseFloat(t);
                    String user = "SELECT * FROM usuarios WHERE Id_usuario= '"+iduser+"'";
                    String nombre = null,ap = null;
                    rs = con.Consulta(user);
                    while(rs.next()){
                        nombre = rs.getString(2);
                        ap = rs.getString(3);
                    }
                    
                   
                        Date fecha = new Date();
                        String cadena="Kiosco Minimarket 'La esquina'\nCUIL: xx-xxxxxxxx-x\nSu dirección N°  \nMendoza \nFecha: "+fecha+"\n\nCant.\tProducto\tPrecio\n";
                        String cade="";
                        for (int i=0;i<j;i++){

                            pro2[i]=pro[i];
                            if(pro[i].length()<=8)
                            pro[i]=pro[i]+"     ";
                            if(pro[i].length()>15){
                                pro[i] = pro[i].substring(0, 15);

                            }
                            cade = cade+""+to[i]+"\t"+pro[i]+"\t"+prec[i]*to[i]+"\n";

                        }
                        String efectivo = JOptionPane.showInputDialog(null, "Venta Realizada\nTotal a Cobrar: $"+t+"\nEfectivo Recibido: ");
                        //System.out.println("efectivo: " + efectivo);
                        float efe = Float.parseFloat(efectivo);
                        //System.out.println("efe: " + efe);
                        float cambio = efe - tota;
                        //System.out.println("cambio" + cambio);
                        if(printTicket.isSelected()) {
                            ticket = cadena+cade+"\nTotal: \t$"+jTtotalv.getText()+"\n\tEfectivo: $"+efectivo+"\n\tCambio: $"+cambio+"\n\n    Le atendio: "+nombre+" "+ap+"\n\n    CON EL CORAZON EN LAS MANOS\n    GRACIAS POR SU COMPRA.\n\n\n\n";
                            //Cogemos el servicio de impresión por defecto (impresora por defecto)
                            PrintService service = PrintServiceLookup.lookupDefaultPrintService();
                            //Le decimos el tipo de datos que vamos a enviar a la impresora
                            //Tipo: bytes Subtipo: autodetectado
                            DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
                            //Creamos un trabajo de impresión
                            DocPrintJob pj = service.createPrintJob();
                            //Nuestro trabajo de impresión envía una cadena de texto
                            ss=new String(ticket);
                            byte[] bytes;
                            //Transformamos el texto a bytes que es lo que soporta la impresora
                            bytes=ss.getBytes();
                            //Creamos un documento (Como si fuese una hoja de Word para imprimir)
                            Doc doc=new SimpleDoc(bytes,flavor,null);
                            //PrintRequestAttributeSet aset = new HashPrintRequestHashAttributeSet();
                            //aset.add(MediaSizeName.ISO_A4);
                            //Obligado coger la excepción PrintException
                            //Mandamos a impremir el documento
                            PrintService[] pservices =PrintServiceLookup.lookupPrintServices(flavor, null);
                            pj.print(doc, null);
                            System.out.println(ticket);
                            ticket = "";
                        }
                    System.out.println(ticket);
                    String userId=ppal.jTID.getText();
                    //System.out.println(jTdesc.getText());
                    String venta = "INSERT INTO  `sigi`.`ventas` (`fecha`, `Id_usuario`, `total`, `descuento`, `forma_pago_id_forma_pago`, `iva_id_iva`)VALUES (CURRENT_TIMESTAMP, '"+userId+"', '"+t+"', '"+jTdesc.getText()+"', 0, NULL);";
                    con.ejecutar(venta);
                    
                    String id_venta = "SELECT * FROM `ventas` ORDER BY id_venta DESC LIMIT 1";
                    int id;
                    rs = con.Consulta(id_venta);
                    while(rs.next()){
                        id = rs.getInt("id_venta");
                        id1 = Integer.toString(id);
                    }
                    
                    for(int i=0;i<j;i++){
                        venta = "INSERT INTO `sigi`.`detalle_venta` (`scanning`, `precio`, `cantidad`, `fecha`, `Id_usuario`, `ventas_id_venta`) VALUES ('"+pro2[i]+"', '"+prec[i]+"', '"+to[i]+"', CURRENT_TIMESTAMP, '"+userId+"', '"+id1+"');";
                        con.ejecutar(venta);
                    }
                    JOptionPane.showMessageDialog(null, "Venta Realizada\n\nTotal a Cobrar: $"+t+"\nCambio: $"+cambio);
                    total=0;
                    jTtotalv.setText("0.00");
                    jTdesc.setText("0.00");
                    int x =Tlistav.getRowCount()-1;
                    DefaultTableModel temp = (DefaultTableModel) Tlistav.getModel();
                    while(x>=0){
                        temp.removeRow(x);
                        x--;

                    }

                    j=0;

                } catch (PrintException ex1) {
                    Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex1);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        //}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTvscaningvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvscaningvActionPerformed
  
    }//GEN-LAST:event_jTvscaningvActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTdescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdescKeyPressed
             if(evt.getKeyCode() == KeyEvent.VK_ENTER){   
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }};

            int aux = jTable1.getSelectedRow();
            Integer exist=(Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 3);
            if (aux==-1)
            {

                JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la tabla.");

            }

            else
            {
                String codigo = jTable1.getValueAt(aux, 0).toString();
                String nombre = jTable1.getValueAt(aux, 1).toString();
                String precio = jTable1.getValueAt(aux, 2).toString();
                //System.out.println(precio);
                 float prec = Float.parseFloat(precio);
                 
                String desc = jTdesc.getText();
                float desc1 = Float.parseFloat(desc);
                //  String existString = "30";
                // int exist1 = integer.parseInt(existString);
                //-String exist = Tproductos.getValueAt(aux, 4).toString();
                //String existString = "30";
                //int exist1 = integer.parseInt(existString);
                String aux2 = precio;
                float tot = Float.parseFloat(aux2);
                String cant = jTcant.getText();
                String cant1 = cant;
                int cant2 = Integer.parseInt(cant);

                if (cant2>exist) {

                    JOptionPane.showMessageDialog(null, "verificar cantidad producto.");
                    JOptionPane.showMessageDialog(null, "ingrese nuevamente la cantidad");

                } else{

                    float cantidad = Float.parseFloat(cant1);
                    //exist = exist - cant1;
                    tot=tot*cantidad;
                    total=tot+total-desc1;
                    prec=prec*desc1;
                     String precio1 = String.valueOf(prec);
                    String aux3 = String.valueOf(total);
                    jTtotalv.setText(aux3);

                    DefaultTableModel temp = (DefaultTableModel)
                    Tlistav.getModel();

                    Object nuevo[]= {temp.getRowCount()+1,"",""};
                    temp.addRow(nuevo);
//descuento
                    Tlistav.setValueAt(codigo, j, 0);
                    Tlistav.setValueAt(nombre, j, 1);
                    Tlistav.setValueAt(precio, j, 2);
                    Tlistav.setValueAt(cant1, j, 3);
                    Tlistav.setValueAt(desc, j, 4);
                    j++;//Aumenta el contador

                }
                    
                    jTvscaningv.setText("");
                jTcant.setText("1");
                jTdesc.setText("0.00");
                jTvscaningv.requestFocusInWindow();
                jTable1.setModel(new DefaultTableModel());
                
            }}
    }//GEN-LAST:event_jTdescKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       ctacte ctacte = new ctacte();
         ctacte.setVisible(true);
      // jBvta.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void printTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTicketActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_printTicketActionPerformed

    private void jTvscaningvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTvscaningvKeyReleased
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
                    
                    String nom= jTvscaningv.getText();
                   // String sql ="SELECT * FROM articulos WHERE scanning LIKE '"+nom+"%' AND unidad > 0";
                    String sql =   "SELECT descripcion_articulos.id_articulo, descripcion_articulos.scanning, descripcion_articulos.nombre_producto, descripcion_articulos.precio_venta,  stock.saldo_stock FROM descripcion_articulos INNER JOIN stock ON stock.id_articulo = descripcion_articulos.id_articulo WHERE descripcion_articulos.scanning LIKE '"+nom+"%'";
                    //String sql =   "SELECT descripcion_articulos.id_articulo, descripcion_articulos.scanning, descripcion_articulos.nombre_producto, descripcion_articulos.precio_venta,  stock.saldo_stock FROM descripcion_articulos INNER JOIN stock ON stock.id_articulo = descripcion_articulos.id_articulo WHERE descripcion_articulos.scanning = ?";
                    
                    //rs = con.find(sql, jTvscaningv.getText());
                    
                    rs = con.Consulta(sql);
                    if(rs==null)
                    JOptionPane.showMessageDialog(null, "No se encontro el scanning: "+jTvscaningv.getText()+" en la base de datos.");
                  /*  Integer id;
                   id = rs.getInt("id_articulo");
                   String id1 = id.toString();
                    String sqls ="SELECT * FROM stock WHERE id_articulo LIKE '"+id+"%'";
                    rs2 = con.Consulta(sqls);
                   */
 
                    //prueba 1
                   
                    // fin prueba
                    
                    //Para establecer el modelo al JTable

                    DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTable1.setModel(buscar);
                        buscar.addColumn("Codigo");
                        buscar.addColumn("Nombre Producto");
                        buscar.addColumn("Precio");
                        buscar.addColumn("Cantidad");
                        //Obteniendo la informacion de las columnas que estan siendo consultadas
                      /*  ResultSetMetaData rsMd = rs.getMetaData();
                        //La cantidad de columnas que tiene la consulta
                        int cantidadColumnas = rsMd.getColumnCount();
                        //Establecer como cabezeras el nombre de las colimnas
                        for (int i = 1; i <= cantidadColumnas; i++) {
                            buscar.addColumn(rsMd.getColumnLabel(i));
                        }
*/
                        int y=0;
                        while (rs.next()) {
                            
                           Object[] fila = new Object[4];

                           //for (int i = 0; i < 3; i++) {
//int i = 0;
  //                            fila[i]=rs.getObject(i+1);
                            //Object[] fila = new Object[3];//Creamos un Objeto con tantos parámetros como datos retorne cada fila 
                                              // de la consulta
                fila[0] = rs.getString("scanning");
                fila[1] = rs.getString("nombre_producto");//Lo que hay entre comillas son los campos de la base de datos
                fila[2] = rs.getFloat("precio_venta");
                fila[3] = rs.getInt("saldo_stock");//saldo_stock
                buscar.addRow(fila); // Añade una fila al final del modelo de la tabla
                            //}
                            //buscar.addRow(fila);
                           // for(int l=0;l<7;l++)
                           // buscar.isCellEditable(y, l);
                           // y++;
                       // jTable1.updateUI();
                        }
    
                    } catch (SQLException ex) {
                        Logger.getLogger(moduloVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        jTcant.requestFocusInWindow();
                        jTable1.selectAll();
                        jTcant.selectAll();
                    }
    }//GEN-LAST:event_jTvscaningvKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(moduloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moduloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moduloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moduloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moduloVenta().setVisible(true);
            }
        });
    }
public static moduloVenta getInstance()
{
if (myInstance == null)
myInstance = new moduloVenta();
return myInstance;
}

public String objectToString(Object o) {
        String st;
        st = (String) o;
        return st;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tlistav;
    public javax.swing.JButton jBcerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTID;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTcant;
    private javax.swing.JTextField jTdesc;
    private javax.swing.JTextField jTtotalv;
    private javax.swing.JTextField jTvscaningv;
    private javax.swing.JCheckBox printTicket;
    // End of variables declaration//GEN-END:variables

    public void setId(String id){
        id2 = id;
        jTID.setText(id);
    }
}
