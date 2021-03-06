package sigi;
import Connection.Conexion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
//import static sigi.OrdenesCompras.idpag;
//import static sigi.OrdenesCompras.idprovi;
import static sigi.OrdenesCompras.j;

public class BuscarFacturas extends javax.swing.JInternalFrame {
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
    public static String id,cad,id_nota;
    String hora,minutos,segundos,ampm;
    Calendar calendario;    
    public static int rowCount, numfac, idoc, idusuario;
    private int idProviders = 0;

//public class BuscarFacturas extends javax.swing.JInternalFrame {

    public BuscarFacturas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane19 = new javax.swing.JScrollPane();
        Tlistac = new javax.swing.JTable();
        jTbusc_com = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTtabla_com = new javax.swing.JTable();
        jCusuario = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCprov2 = new javax.swing.JComboBox();
        jLabel59 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tlistac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "N� Factura", "Orden Compra", "Total", "Proveedor", "Descripci�n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane19.setViewportView(Tlistac);

        getContentPane().add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 890, 130));

        jTbusc_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbusc_comActionPerformed(evt);
            }
        });
        jTbusc_com.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbusc_comKeyPressed(evt);
            }
        });
        getContentPane().add(jTbusc_com, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 296, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("Buscar factura");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTtabla_com.setName(""); // NOI18N
        jTtabla_com.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTtabla_comMouseClicked(evt);
            }
        });
        jTtabla_com.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTtabla_comKeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(jTtabla_com);

        getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 890, 120));

        jCusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jCusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("USUARIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Desde");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Hasta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jCprov2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCprov2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCprov2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("Proveedor");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        getContentPane().add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));
        getContentPane().add(toDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTbusc_comKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbusc_comKeyPressed
       try {
                    // se comienza la conexion con la base de datos
                    try {
                        con = new Conexion();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    String nom= jTbusc_com.getText();
                    //String estado = "0";
                    String sql ="SELECT * FROM compras WHERE numero_factura LIKE '"+nom+"%'";
                    // revisar consulta :  String sql ="SELECT * FROM ordenes_compra WHERE id_ordenes_compra LIKE '"+nom+"%' AND finalizada = '"+estado+"'";
                    
                    rs = con.Consulta(sql);

                    if(rs==null)
                    JOptionPane.showMessageDialog(null, "No se encontro el factura proveedor: "+jTbusc_com.getText()+".");
 
                        int y=0;
                        while (rs.next()) {
                            
                         
               // jTefect1.setText(rs.getString("total")); //Lo que hay entre comillas son los campos de la base de datos
             
        //  String venta = "INSERT INTO  `sigi`.`ordenes_compra` (`id_usuario` ,`id_proveedor` ,`total` ,`fecha_estimada_recepcion`, `id_forma_pago`, `fecha_de_pago`, `condición_de_entrega`, `aprovado`)VALUES "       
                           
                        }
    // busco los articulos que debe entregar el proveedor+++++++++++++++++++++++
                
                    if(rs==null)
                    JOptionPane.showMessageDialog(null, "No se encontro el sector: "+nom+" en la base de datos.");

                    //Para establecer el modelo al JTable

                    DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTtabla_com.setModel(buscar);

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
                        Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /*if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        jTarticcomp.requestFocusInWindow();
                    }*/
                
                   /* if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    //    jTcant.requestFocusInWindow();
                      //  jTbuscar.selectAll();
                    //    jTcant.selectAll();
                    }*/

    }//GEN-LAST:event_jTbusc_comKeyPressed

    private void jTtabla_comMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtabla_comMouseClicked
        // TODO add your handling code here:
        int Opcion=this.jTtabla_com.getSelectedRow();
        //muestra el no. de renglon
        // JOptionPane.showMessageDialog(rootPane,Opcion);
        id =  jTtabla_com.getValueAt(Opcion,0).toString();
       /* this.jTnfact.setText(this.jTtabla_com.getValueAt(Opcion, 2).toString());
        this.jToc.setText(this.jTtabla_com.getValueAt(Opcion, 3).toString());
        this.jTefect.setText(this.jTtabla_com.getValueAt(Opcion, 4).toString());
        this.jTprovcomp.setText(this.jTtabla_com.getValueAt(Opcion, 5).toString());
        this.jTdetallecompra.setText(this.jTtabla_com.getValueAt(Opcion, 6).toString());
        jTnfact.setEnabled(false);
        jToc.setEnabled(false);
        jTefect.setEnabled(false);
        jTprovcomp.setEnabled(false);
        jTdetallecompra.setEnabled(false);*/
        //this.jTprov_mail.setText(this.jTtabla_com.getValueAt(Opcion, 5).toString());
        //VER   int activ = this.jTtabla_prov.getSelectedRows(Opcion, 6).toString();        // TODO add your handling code here:
        
        try {
                    // se comienza la conexion con la base de datos
                    try {
                        con = new Conexion();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(OrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //String nom= jTbusc_com.getText();
                    //String estado = "0";
                    String sql ="SELECT * FROM detalle_compra WHERE compras_id_compras LIKE '"+id+"%'";
                    // revisar consulta :  String sql ="SELECT * FROM ordenes_compra WHERE id_ordenes_compra LIKE '"+nom+"%' AND finalizada = '"+estado+"'";
                    
                    rs = con.Consulta(sql);

                    if(rs==null)
                    JOptionPane.showMessageDialog(null, "No se encontro el factura proveedor: "+jTbusc_com.getText()+".");
 
                        int y=0;
                        while (rs.next()) {
                            
                         
               // jTefect1.setText(rs.getString("total")); //Lo que hay entre comillas son los campos de la base de datos
             
        //  String venta = "INSERT INTO  `sigi`.`ordenes_compra` (`id_usuario` ,`id_proveedor` ,`total` ,`fecha_estimada_recepcion`, `id_forma_pago`, `fecha_de_pago`, `condición_de_entrega`, `aprovado`)VALUES "       
                           
                        }
    // busco los articulos que debe entregar el proveedor+++++++++++++++++++++++
                
                    if(rs==null)
                    JOptionPane.showMessageDialog(null, "No existe dato en la base de datos.");

                    //Para establecer el modelo al JTable

                    DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTtabla_com.setModel(buscar);

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
                        Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_jTtabla_comMouseClicked

    private void jTtabla_comKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtabla_comKeyPressed
        // TODO add your handling code here:
        int evento=evt.getKeyCode();

        if(evento==10 ){
            //DefaultTableModel modelo = new DefaultTableModel();
            //        this.Tlista.setModel(modelo);

            DefaultTableModel modelo = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }};

                int aux = jTtabla_com.getSelectedRow();
                if (aux==-1)
                {

                    JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la tabla.");

                }

                /*   else
                {

                    String nombre = jTtabla_prov.getValueAt(aux, 1).toString();
                    String precio = jTtabla_prov.getValueAt(aux, 2).toString();

                    String aux2 = precio;
                    float tot = Float.parseFloat(aux2);
                    String cant = JOptionPane.showInputDialog("Cantidad: ");

                    float cantidad = Float.parseFloat(cant);
                    tot=tot*cantidad;
                    total=tot+total;
                    String aux3 = String.valueOf(total);
                    jTtotal.setText(aux3);
                    DefaultTableModel temp = (DefaultTableModel)
                    Tlista.getModel();
                    Object nuevo[]= {temp.getRowCount()+1,"",""};
                    temp.addRow(nuevo);

                    Tlista.setValueAt(nombre, j, 0);
                    Tlista.setValueAt(precio, j, 1);
                    Tlista.setValueAt(cant, j, 2);
                    j++;//Aumenta el contador

                }
                */
            }
    }//GEN-LAST:event_jTtabla_comKeyPressed

    private void jTbusc_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbusc_comActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbusc_comActionPerformed

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
                idProviders=rs.getInt("proveedores_id_proveedor");
            }
            String sqlp = "SELECT * FROM compras WHERE id_proveedor LIKE '"+idProviders+"%'";

            //funcion para ejecutar la query
            // con.Consulta(sql);
            rs2 = con.Consulta(sqlp);
            DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTtabla_com.setModel(buscar);

                        //Obteniendo la informacion de las columnas que estan siendo consultadas
                        ResultSetMetaData rsMd = rs2.getMetaData();
                        //La cantidad de columnas que tiene la consulta
                        int cantidadColumnas = rsMd.getColumnCount();
                        //Establecer como cabezeras el nombre de las colimnas
                        for (int i = 1; i <= cantidadColumnas; i++) {
                            buscar.addColumn(rsMd.getColumnLabel(i));
                        }

                        int y=0;
                        while (rs2.next()) {
                            Object[] fila = new Object[cantidadColumnas];

                            for (int i = 0; i < cantidadColumnas; i++) {

                                fila[i]=rs2.getObject(i+1);

                            }
                            buscar.addRow(fila);
                            for(int l=0;l<7;l++)
                            buscar.isCellEditable(y, l);
                            y++;
                        }

                    
                //fin  de tabla

            }catch (ClassNotFoundException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jCprov2ActionPerformed

    private void jCdesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCdesdeActionPerformed
       
        //String fd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jCdesde.getDate());
        //String fh = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jChasta.getDate());
        
        try {
            //se crea la conexion y las consultas
            con = new Conexion();
            ///Incerto datos en la tabla de las ordenes_compra
           // String usuario = (String) jCusuario.getSelectedItem();
          /*  String sql = "SELECT * FROM usuario WHERE empresa LIKE '"+usuario+"%'";

            //funcion para ejecutar la query
            // con.Consulta(sql);
            rs = con.Consulta(sql);
            if(rs.next()){
              idusuario=rs.getInt("id_usuario");
            }*/
            //String sqlp = "SELECT * FROM compras WHERE fecha BETWEEN '"+fd+"' AND '"+fh+"'";

            //funcion para ejecutar la query
            // con.Consulta(sql);
            //rs = con.Consulta(sqlp);
            DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTtabla_com.setModel(buscar);

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

                    
                //fin  de tabla

            }catch (ClassNotFoundException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_jCdesdeActionPerformed

    private void jCusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCusuarioActionPerformed
      try {
            //se crea la conexion y las consultas
            con = new Conexion();
            ///Incerto datos en la tabla de las ordenes_compra
            String usuario = (String) jCusuario.getSelectedItem();
            String sql = "SELECT * FROM usuario WHERE empresa LIKE '"+usuario+"%'";

            //funcion para ejecutar la query
            // con.Consulta(sql);
            rs = con.Consulta(sql);
            if(rs.next()){
              idusuario=rs.getInt("id_usuario");
            }
            String sqlp = "SELECT * FROM compras WHERE id_usuario LIKE '"+idusuario+"%'";

            //funcion para ejecutar la query
            // con.Consulta(sql);
            rs2 = con.Consulta(sqlp);
            DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTtabla_com.setModel(buscar);

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

                    
                //fin  de tabla

            }catch (ClassNotFoundException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jCusuarioActionPerformed

    private void jChastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChastaActionPerformed
 //String fd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jCdesde.getDate());
//        String fh = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jChasta.getDate());
        
        try {
            //se crea la conexion y las consultas
            con = new Conexion();
            ///Incerto datos en la tabla de las ordenes_compra
           // String usuario = (String) jCusuario.getSelectedItem();
          /*  String sql = "SELECT * FROM usuario WHERE empresa LIKE '"+usuario+"%'";

            //funcion para ejecutar la query
            // con.Consulta(sql);
            rs = con.Consulta(sql);
            if(rs.next()){
              idusuario=rs.getInt("id_usuario");
            }*/
            //String sqlp = "SELECT * FROM compras WHERE fecha BETWEEN '"+fd+"' AND '"+fh+"'";

            //funcion para ejecutar la query
            // con.Consulta(sql);
            //rs = con.Consulta(sqlp);
            DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }};
                        this.jTtabla_com.setModel(buscar);

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

                    
                //fin  de tabla

            }catch (ClassNotFoundException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jChastaActionPerformed
//-----------combos-------------------------
    public void llenar_combo_prov() {
       DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();//esto es el modelo  
      
       try{
              
               try {
                   
                con = new Conexion();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
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
          Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
    }  
//-----------combos-------------------------
    public void llenar_combo_usuarios() {
       DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();//esto es el modelo  
      
       try{
              
               try {
                   
                con = new Conexion();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
                }
                String sql = "SELECT * FROM usuarios ORDER BY user";

                    //funcion para ejecutar la query
                   // con.Consulta(sql);
                     rs = con.Consulta(sql);

                    if(rs==null) 
                        JOptionPane.showMessageDialog(null, "No hay proveedores en la base de datos.");
                modeloCombo.addElement("Seleccione Proveedor");//es el primer registro q mostrara el combo
                jCprov2.setModel(modeloCombo);//con esto lo agregamos al objeto al jcombobox
                while (rs.next()) {
                    modeloCombo.addElement(rs.getObject("user"));
                    
                    jCprov2.setModel(modeloCombo);
                //    String valor = rs.getString("empresa");
//---- Aquí recuperas los valores obtenidos y realizas la carga del JCombobox
//---- Previamente debes tener creado el ComboBox: JComboBox combo = new JComboBox();
//jCprov2.addItem(valor); 
                    //jCprov.addItem (rs.getObject("empresa"));
                    jCprov2.updateUI();
                }
           
            
            } catch (SQLException ex) {
          Logger.getLogger(BajaModificacionOrdenesCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void clearSearchBillsFields(){
        fromDate.setDate(null);
        toDate.setDate(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tlistac;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JComboBox jCprov2;
    private javax.swing.JComboBox jCusuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JTextField jTbusc_com;
    private javax.swing.JTable jTtabla_com;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}
