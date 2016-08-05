package sigi;

import Utils.ImprimirTicket;
import Utils.Utils;
import Connection.Conexion;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModuloVenta extends javax.swing.JFrame {
    Conexion con;
    ResultSet rs;
    ResultSet rs2;
    String userRole = Integer.toString(Login.userRol);
    String userId = Integer.toString(Login.userId);
    static BigDecimal total = BigDecimal.ZERO;
    int j = 0;
    String id2;
    public static String saleId; 
    public static String descuento = "0.00";
    public String cantidad = "1";
    static BigDecimal auxiliarTotal = BigDecimal.ZERO;
    static BigDecimal descuentoAuxiliar = BigDecimal.ZERO;
    static BigDecimal cantidadSolicitada = BigDecimal.ZERO;
    public static BigDecimal getTotalVentas;
    public static String articleId = null;
    public static String sendTotalVentas;
    public static String clientIDM = "";
    public static int activate = 0;
    public static int tipo = 0;
    public static String codigo = "";
    public static String nombre = "", marca = "";
    public static BigDecimal precio = BigDecimal.ZERO;
    public static BigDecimal cantidadEnStock = BigDecimal.ZERO;
    public static int stockId = 0;
    
    public ModuloVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scanning = new javax.swing.JTextField();
        totalVentas = new javax.swing.JTextField();
        eliminarFila = new javax.swing.JButton();
        printTicket = new javax.swing.JButton();
        closeDay = new javax.swing.JButton();
        borrarTodo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ctaCte = new javax.swing.JButton();
        returns = new javax.swing.JButton();
        cancelTicket = new javax.swing.JButton();
        cashWithdrawal = new javax.swing.JButton();
        searchArticles = new javax.swing.JButton();
        printTicketFont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(880, 610));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scanning.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        scanning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scanningKeyReleased(evt);
            }
        });
        getContentPane().add(scanning, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 390, 60));

        totalVentas.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        totalVentas.setForeground(new java.awt.Color(255, 0, 0));
        totalVentas.setText("0.00");
        getContentPane().add(totalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 500, 60));

        eliminarFila.setBackground(new java.awt.Color(255, 255, 255));
        eliminarFila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/removeItem.png"))); // NOI18N
        eliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFilaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 60, 60));

        printTicket.setBackground(new java.awt.Color(231, 224, 224));
        printTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/printTicket.png"))); // NOI18N
        printTicket.setBorderPainted(false);
        printTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTicketActionPerformed(evt);
            }
        });
        getContentPane().add(printTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 80, 60));

        closeDay.setBackground(new java.awt.Color(255, 255, 255));
        closeDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        closeDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDayActionPerformed(evt);
            }
        });
        getContentPane().add(closeDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 60, 60));

        borrarTodo.setBackground(new java.awt.Color(255, 255, 255));
        borrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emptyCart.png"))); // NOI18N
        borrarTodo.setBorderPainted(false);
        borrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(borrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 60, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SCANING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Precio", "Cantidad", "Descuento", "Sub Total", "Cantidad venta", "Cantidad stock", "Tipo articulo", "Id Articulo", "id stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompras.getTableHeader().setReorderingAllowed(false);
        jScrollPane18.setViewportView(tablaCompras);
        if (tablaCompras.getColumnModel().getColumnCount() > 0) {
            tablaCompras.getColumnModel().getColumn(0).setResizable(false);
            tablaCompras.getColumnModel().getColumn(1).setResizable(false);
            tablaCompras.getColumnModel().getColumn(2).setResizable(false);
            tablaCompras.getColumnModel().getColumn(3).setResizable(false);
            tablaCompras.getColumnModel().getColumn(4).setResizable(false);
            tablaCompras.getColumnModel().getColumn(5).setResizable(false);
            tablaCompras.getColumnModel().getColumn(6).setResizable(false);
            tablaCompras.getColumnModel().getColumn(7).setMinWidth(0);
            tablaCompras.getColumnModel().getColumn(7).setPreferredWidth(0);
            tablaCompras.getColumnModel().getColumn(7).setMaxWidth(0);
            tablaCompras.getColumnModel().getColumn(8).setMinWidth(0);
            tablaCompras.getColumnModel().getColumn(8).setPreferredWidth(0);
            tablaCompras.getColumnModel().getColumn(8).setMaxWidth(0);
            tablaCompras.getColumnModel().getColumn(9).setMinWidth(0);
            tablaCompras.getColumnModel().getColumn(9).setPreferredWidth(0);
            tablaCompras.getColumnModel().getColumn(9).setMaxWidth(0);
            tablaCompras.getColumnModel().getColumn(10).setMinWidth(0);
            tablaCompras.getColumnModel().getColumn(10).setPreferredWidth(0);
            tablaCompras.getColumnModel().getColumn(10).setMaxWidth(0);
            tablaCompras.getColumnModel().getColumn(11).setMinWidth(0);
            tablaCompras.getColumnModel().getColumn(11).setPreferredWidth(0);
            tablaCompras.getColumnModel().getColumn(11).setMaxWidth(0);
        }
        tablaCompras.getAccessibleContext().setAccessibleParent(scanning);

        getContentPane().add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 850, 310));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("$");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("COMPRA ACTUAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        ctaCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cta_cte.png"))); // NOI18N
        ctaCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctaCteActionPerformed(evt);
            }
        });
        getContentPane().add(ctaCte, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 80, 60));

        returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/returns.png"))); // NOI18N
        returns.setText("Devoluciones");
        returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnsActionPerformed(evt);
            }
        });
        getContentPane().add(returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, -1, -1));

        cancelTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelTicket.png"))); // NOI18N
        cancelTicket.setText("Anular Ticket");
        cancelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTicketActionPerformed(evt);
            }
        });
        getContentPane().add(cancelTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, -1, -1));

        cashWithdrawal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cahsPayment.png"))); // NOI18N
        cashWithdrawal.setText("Retiro");
        cashWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashWithdrawalActionPerformed(evt);
            }
        });
        getContentPane().add(cashWithdrawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, -1));

        searchArticles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/searchArt.png"))); // NOI18N
        searchArticles.setText("Buscar Articulos");
        searchArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchArticlesActionPerformed(evt);
            }
        });
        getContentPane().add(searchArticles, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 220, 60));

        printTicketFont.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        getContentPane().add(printTicketFont, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 50, 10));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void eliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFilaActionPerformed
        DefaultTableModel eliminarFilaModel = (DefaultTableModel)tablaCompras.getModel();
        int fila = tablaCompras.getSelectedRow();
        if(fila != -1) {
            BigDecimal restarDescuento = new BigDecimal(tablaCompras.getValueAt(fila, 5).toString());
            int restarTipo = Integer.parseInt(tablaCompras.getValueAt(fila, 9).toString());
            BigDecimal restarPrecio = new BigDecimal(tablaCompras.getValueAt(fila, 3).toString());
            float restarCantidad;
            if(restarTipo == 1) {
                restarCantidad = Float.parseFloat(tablaCompras.getValueAt(fila, 7).toString());
            } else {
                restarCantidad = Float.parseFloat(tablaCompras.getValueAt(fila, 7).toString()) * 1000;
            }
            auxiliarTotal = restarPrecio;
            cantidadSolicitada = new BigDecimal(restarCantidad);
            auxiliarTotal = auxiliarTotal.multiply(cantidadSolicitada).setScale(2, RoundingMode.CEILING);
            total = total.subtract(auxiliarTotal).subtract(restarDescuento).setScale(2, RoundingMode.CEILING);
            String totalAString = String.valueOf(total);
            totalVentas.setText(totalAString);
            if(fila < 0) {
                JOptionPane.showMessageDialog(null, "Se debe seleccionar la fila a eliminar de la tabla COMPRA ACTUAL");
            } else{
                eliminarFilaModel.removeRow(fila);           
            }
            scanning.setText("");
            scanning.requestFocus();
            j = fila - 1;
        } else {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar la fila a eliminar");
        }
    }//GEN-LAST:event_eliminarFilaActionPerformed

    private void borrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTodoActionPerformed
        total = BigDecimal.ZERO;
        totalVentas.setText("0.00");
        descuento = "0.00";
        cantidad = "1";
        scanning.setText("");                
        scanning.requestFocus();
        DefaultTableModel eliminarTodo = (DefaultTableModel) tablaCompras.getModel();
        eliminarTodo.setRowCount(0);
        j = 0;
    }//GEN-LAST:event_borrarTodoActionPerformed

    private void printTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTicketActionPerformed
        salesFunction(1);
    }//GEN-LAST:event_printTicketActionPerformed
    
    private void ctaCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctaCteActionPerformed
        sendTotalVentas = totalVentas.getText();
        VentasCtaCte cta = new VentasCtaCte(this, true);
        cta.setVisible(true);
        if(VentasCtaCte.value == 1) {
            salesFunction(2);
        } else {
        }
    }//GEN-LAST:event_ctaCteActionPerformed
    
    private void scanningKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scanningKeyReleased
        this.setFocusable(true);
        String cantidadString = "";
        String descuentoString = "";
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_F1:
                salesFunction(1);
                break;
            case KeyEvent.VK_F2:
                sendTotalVentas = totalVentas.getText();
                VentasCtaCte cta = new VentasCtaCte(this, true);
                cta.setVisible(true);
                if(VentasCtaCte.value == 1) {
                    salesFunction(2);
                } else {
                }   
                break;
            case KeyEvent.VK_F3:
                cantidadString = JOptionPane.showInputDialog("Cantidad", "0");
                if(cantidadString != null) {
                    cantidad = cantidadString;
                }
                break;
            case KeyEvent.VK_F5:
                descuentoString = JOptionPane.showInputDialog("Descuento", "0.00");
                if(descuentoString != null) {
                    descuento = Utils.formatCurrency(descuentoString.length(), descuentoString);
                }
                break;
            case KeyEvent.VK_F4:
                cantidadString = JOptionPane.showInputDialog("Peso", "0");
                if(cantidadString != null) {
                    int cant = Integer.parseInt(cantidadString);
                    float aux = (float)cant / 1000;
                    cantidad = Float.toString(aux);
                }
                break;
            default:
                break;
        }
        try {
            con = new Conexion();
            String searchScanning= scanning.getText();
            String getArticlesDescription = "SELECT descripcion_articulos.id_articulo, descripcion_articulos.scanning, descripcion_articulos.nombre_producto, descripcion_articulos.marca, descripcion_articulos.precio_venta, descripcion_articulos.tipo_articulo_id, stock.saldo_stock, stock.id_stock FROM descripcion_articulos INNER JOIN stock ON stock.id_articulo = descripcion_articulos.id_articulo WHERE descripcion_articulos.scanning = ?";
            rs = con.find(getArticlesDescription, searchScanning);
            int numberOfRows = 0;
            while (rs.next()) {
                ++numberOfRows;
                articleId = rs.getString("id_articulo");
                tipo = rs.getInt("tipo_articulo_id");
                codigo = rs.getString("scanning");
                nombre = rs.getString("nombre_producto");
                marca = rs.getString("marca");
                precio = rs.getBigDecimal("precio_venta");
                cantidadEnStock = rs.getBigDecimal("saldo_stock");
                stockId = rs.getInt("id_stock");
            }
            if(numberOfRows == 1){
                fillInTableData();
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_scanningKeyReleased

    private void closeDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDayActionPerformed
        CierreCaja tipoCierre = new CierreCaja();
        tipoCierre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeDayActionPerformed

    private void returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnsActionPerformed
        Devoluciones devolucion = new Devoluciones(this, true);
        devolucion.setVisible(true);
    }//GEN-LAST:event_returnsActionPerformed

    private void cancelTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTicketActionPerformed
        AnularTicket anular = new AnularTicket(this, true);
        anular.setVisible(true);
    }//GEN-LAST:event_cancelTicketActionPerformed

    private void cashWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashWithdrawalActionPerformed
        RetiroDinero retiro = new RetiroDinero(this, true);
        retiro.setVisible(true);
    }//GEN-LAST:event_cashWithdrawalActionPerformed

    private void searchArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchArticlesActionPerformed
        BuscarArticulos searchArt = new BuscarArticulos(this, true);
        searchArt.setVisible(true);
        if(BuscarArticulos.fillInTable == 1){
            fillInTableData();
            BuscarArticulos.fillInTable = 0;
        }
    }//GEN-LAST:event_searchArticlesActionPerformed
      
    public void salesFunction(int saleTypo) {
        String ticket = "";
        String ticketNumber = "";
        String cash = ""; 
        BigDecimal cashPayment = BigDecimal.ZERO;
        BigDecimal exchange = BigDecimal.ZERO;
        BigDecimal totalAccount = BigDecimal.ZERO;
        int paymentType = 1;
        String salto = System.getProperty("line.separator");
        getTotalVentas = new BigDecimal(totalVentas.getText());
        if(j==0) {
            JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");
        } else {
            if(saleTypo == 1) {
                cash = JOptionPane.showInputDialog(null, "Total a Cobrar: $"+getTotalVentas+"\nEfectivo Recibido: ");
                cash = Utils.formatCurrency(cash.length(), cash);
            }
            if(saleTypo == 2 || cash != null) {
                try {
                    con = new Conexion();
                    String nombreProducto [] = new String[j], marcaProducto [] = new String[j];
                    BigDecimal cantidadVenta[] = new BigDecimal[j];                
                    BigDecimal cantidadStock[] = new BigDecimal[j];
                    BigDecimal precioVenta[] = new BigDecimal[j];
                    BigDecimal subTotal[] = new BigDecimal[j];
                    String scanningArticulo[] = new String[j];
                    int tipoArticulo[] = new int[j];
                    int guardarStock[] = new int[j];
                    BigDecimal nuevoStock[] = new BigDecimal[j];
                    String idArticulos[] = new String[j];
                    String stockIdToSave [] = new String[j];
                    BigDecimal discount [] = new BigDecimal[j];
                    int ctaCteId = 0;
                    for (int i=0; i<j; i++) {
                        scanningArticulo[i] = tablaCompras.getValueAt(i, 0).toString();
                        nombreProducto[i] = tablaCompras.getValueAt(i, 1).toString();
                        marcaProducto[i] = tablaCompras.getValueAt(i, 2).toString();
                        precioVenta[i]= new BigDecimal(tablaCompras.getValueAt(i, 3).toString());
                        subTotal[i]= new BigDecimal(tablaCompras.getValueAt(i, 6).toString());
                        cantidadStock[i] = new BigDecimal(tablaCompras.getValueAt(i, 8).toString());
                        tipoArticulo[i] = Integer.parseInt(tablaCompras.getValueAt(i, 9).toString());
                        idArticulos[i] = tablaCompras.getValueAt(i, 10).toString();
                        stockIdToSave[i] = tablaCompras.getValueAt(i, 11).toString();
                        discount[i] = new BigDecimal(tablaCompras.getValueAt(i, 5).toString());
                        if(tipoArticulo[i] == 1) {
                            cantidadVenta[i] = new BigDecimal(tablaCompras.getValueAt(i, 7).toString());
                        } else {
                            cantidadVenta[i] = new BigDecimal(tablaCompras.getValueAt(i, 7).toString()).multiply(new BigDecimal(1000)).setScale(0);
                        }
                        nuevoStock[i] = cantidadStock[i].subtract(cantidadVenta[i]);
                        guardarStock[i] = Integer.parseInt(nuevoStock[i].toString());
                        String updateStockStatus = "UPDATE stock SET saldo_stock = "+guardarStock[i]+" WHERE id_articulo ="+idArticulos[i]+"";
                        con.ejecutar(updateStockStatus);
                        String insertStockMovement = "INSERT INTO movimiento_stock (fecha_movimiento_stock, salida, stock_id_stock) VALUES (CURRENT_TIMESTAMP, "+cantidadVenta[i]+", "+stockIdToSave[i]+")";
                        con.ejecutar(insertStockMovement);
                        discount[i] = discount[i].add(discount[i]);
                        descuento = discount[i].toString();
                    }
                    if(saleTypo == 2) {
                        paymentType = 2;
                        ctaCteId = Integer.parseInt(VentasCtaCte.clienteId);
                    }
                    String insertSale = "INSERT INTO ventas (fecha_venta, id_usuario, total, descuento, forma_pago_id_forma_pago, iva_id_iva) VALUES (CURRENT_TIMESTAMP, '"+userId+"', '"+getTotalVentas+"', '"+descuento+"', "+paymentType+", NULL)";
                    con.ejecutar(insertSale);

                    String getIdVenta = "SELECT LAST_INSERT_ID() AS id_venta, fecha_venta from ventas";
                    int id = 0;
                    Timestamp saleDateToSave = null;
                    rs = con.Consulta(getIdVenta);
                    while(rs.next()){
                        id = rs.getInt("id_venta");
                        saleDateToSave = rs.getTimestamp("fecha_venta");
                        saleId = Integer.toString(id);
                    }
                    String updateTicketNumber = "UPDATE numero_ticket SET numero_ticket = numero_ticket + 1 WHERE id_numero = 1";
                    con.ejecutar(updateTicketNumber);
                    String getTicketNumber = "SELECT lpad(numero_ticket, 6, 0) ticket_number FROM numero_ticket";
                    rs = con.Consulta(getTicketNumber);
                    while(rs.next()) {
                        ticketNumber = rs.getString("ticket_number");
                    }
                    for(int i=0;i<j;i++){
                        String insertSaleDetail = "INSERT INTO detalle_venta (id_articulo, precio_venta_articulo, cantidad, sub_total, fecha_detalle_venta, id_usuario, ventas_id_venta, numero_ticket) VALUES ('"+idArticulos[i]+"', '"+precioVenta[i]+"', '"+cantidadVenta[i]+"', '"+subTotal[i]+"', '"+saleDateToSave+"', '"+userId+"', '"+saleId+"', "+ticketNumber+")";
                        con.ejecutar(insertSaleDetail);
                    }
                    if(saleTypo == 2) {
                        BigDecimal auxAccount;
                        if(VentasCtaCte.accountStatus.isEmpty()){
                            auxAccount = new BigDecimal(BigInteger.ZERO);
                        }else{
                            auxAccount = new BigDecimal(VentasCtaCte.accountStatus);
                        }
                        BigDecimal totalSalesToAdd = new BigDecimal(sendTotalVentas);
                        totalAccount = auxAccount.add(totalSalesToAdd).subtract(descuentoAuxiliar);
                        String insertCtaCte = "INSERT INTO cuentas_corrientes (fecha_cta_cte, total, suma, clientes_id_clientes, usuarios_id_usuario, ventas_id_venta, numero_ticket) VALUES ('"+saleDateToSave+"', "+totalAccount+", "+totalSalesToAdd+", "+clientIDM+", "+userId+", "+saleId+", "+ticketNumber+")";
                        con.ejecutar(insertCtaCte);
                        String getCurrentAccountId = "SELECT LAST_INSERT_ID() AS id_cuenta_corriente from cuentas_corrientes";
                        rs = con.Consulta(getCurrentAccountId);
                        while(rs.next()){
                            ctaCteId = rs.getInt("id_cuenta_corriente");
                        }
                    }
                    String ticketHeader = "FACTURA NO FISCAL"+
                                    salto+"--------------------------------"+
                                    salto+Login.companyName+
                                    salto+"C.U.I.T.: "+Login.companyCuilCuit+
                                    salto+"Ing. Brutos: "+Login.companyIg+
                                    salto+Login.companyAddress+" N° "+Login.companyAddressNumber+
                                    salto+Login.companyDepartment+" - "+Login.companyProvince+" - "+Login.companyCp+
                                    salto+"Inicio Actividades: "+Utils.formatDateOnly(Login.companyInitActivities)+
                                    salto+"--------------------------------"+
                                    salto+"Ticket Nro: "+ticketNumber+
                                    salto+"Fecha: "+Utils.currentDateFormated()+
                                    salto+"--------------------------------"+
                                    salto+"CONSUMIDOR FINAL"+
                                    salto+"--------------------------------"+
                                    salto+"Cant./Precio Unit."+
                                    salto+"Descripcion (%IVA)[%BI]\tIMPORTE"+
                                    salto+"--------------------------------";
                    String ticketBody="";
                    BigDecimal price = new BigDecimal(BigInteger.ZERO);
                    BigDecimal compareDiscount = new BigDecimal(0.00).setScale(2, RoundingMode.CEILING);
                    for (int i=0;i<j;i++){
                        discount[i] = new BigDecimal(tablaCompras.getValueAt(i, 5).toString());
                        if(tipoArticulo[i] == 1){
                             price = precioVenta[i].multiply(cantidadVenta[i]).setScale(2, RoundingMode.CEILING);
                        } else {
                            price = precioVenta[i].multiply(cantidadVenta[i]).divide(new BigDecimal(1000)).setScale(2, RoundingMode.CEILING);
                        }
                        if(discount[i].equals(compareDiscount)) {
                            ticketBody = ticketBody+salto+cantidadVenta[i]+" x "+precioVenta[i]+
                                salto+scanningArticulo[i]+" "+nombreProducto[i].substring(0, 4)+" "+marcaProducto[i].substring(0, 4)+"\t"+price+""+
                                salto+"...";
                        } else {
                            ticketBody = ticketBody+salto+cantidadVenta[i]+" x "+precioVenta[i]+
                                salto+scanningArticulo[i]+" "+nombreProducto[i].substring(0, 4)+" "+marcaProducto[i].substring(0, 4)+"\t"+price+""+
                                salto+"BONIFICACION\t\t-"+discount[i]+
                                salto+"...";
                        }
                    }
                    if (saleTypo == 1) {
                        cashPayment = new BigDecimal(cash);
                    }
                    if(cashPayment.equals(BigDecimal.ZERO)) {
                        cashPayment = getTotalVentas;
                    }
                    exchange = cashPayment.subtract(getTotalVentas).setScale(2, RoundingMode.CEILING);
                    if(saleTypo == 1) {
                        ticket = ticketHeader+ticketBody+
                                            salto+salto+"TOTAL \t\t\t"+totalVentas.getText()+
                                            salto+salto+"Recibi(MOS) "+
                                            salto+"SU PAGO \t\t"+cash+
                                            salto+"Su vuelto \t\t"+exchange+
                                            salto+"--------------------------------"+
                                            salto+"Lo atendio: "+Login.userName+
                                            salto+salto+"GRACIAS POR SU COMPRA."+
                                            salto+"--------------------------------"+
                                            salto+"FACTURA NO FISCAL";
                        JOptionPane.showMessageDialog(null, "Venta Realizada"+salto+salto+"Total a Cobrar: $ "+getTotalVentas+salto+"Cambio: $ "+exchange);
                    } else{
                        //cambiar total de estado cuenta
                        ticket = ticketHeader+ticketBody+
                                            salto+salto+"TOTAL \t\t\t"+totalVentas.getText()+
                                            salto+salto+"Recibi(MOS)"+
                                            salto+salto+"SU PAGO \t\t"+totalVentas.getText()+
                                            salto+"Su vuelto \t\t"+exchange+
                                            salto+"-----------------------------------------"+
                                            salto+"Cuenta Corriente"+
                                            salto+"Nombre: \t"+VentasCtaCte.clientName+
                                            salto+"Estado cuenta: \t"+totalAccount+
                                            salto+"-----------------------------------------"+
                                            salto+"Lo atendio: "+Login.userName+
                                            salto+salto+"GRACIAS POR SU COMPRA."+
                                            salto+"-----------------------------------------"+
                                            salto+"FACTURA NO FISCAL";
                        JOptionPane.showMessageDialog(null, "Venta Realizada"+salto+salto+"Total a Cobrar: $ "+getTotalVentas+salto+"Cambio: $ 0.00");
                    }
                    if(Login.printStatus == 1) {
                        printTicketFont.setText(ticket);
                        int print = ImprimirTicket.printTicket(printTicketFont.getText());
                        if(print == 1) {
                            ticket = null;
                        } else {
                            System.out.println(print);
                        }
                    }
                    String salesDone = "UPDATE detalle_venta SET estado_venta_id_estado_venta = 2, pago_con = "+cashPayment+", vuelto = "+exchange+", cuenta_corriente_id = "+ctaCteId+" WHERE ventas_id_venta = "+saleId;
                    con.ejecutar(salesDone);
                    total = BigDecimal.ZERO;
                    scanning.setText("");
                    scanning.requestFocus();
                    totalVentas.setText("0.00");
                    descuento = "0.00";
                    DefaultTableModel temp = (DefaultTableModel) tablaCompras.getModel();
                    temp.setRowCount(0);
                    j=0;
                    con.Cerrar();
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex1) {
                    Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        }
    }
    
    public void fillInTableData(){
        descuentoAuxiliar = new BigDecimal(descuento);
        auxiliarTotal = precio;
        cantidadSolicitada = new BigDecimal(cantidad);
        String cantidadMostrar;
        if (cantidadSolicitada.compareTo(cantidadEnStock) == 1) {
            JOptionPane.showMessageDialog(null, "Verificar stock para producto " + nombre);
        } else {
            if(tipo == 2) {
                float cantidadTipo = Float.parseFloat(cantidad);
                float auxiliarTipo =  (float)cantidadTipo * 1000;
                cantidad = Float.toString(cantidadTipo);
                cantidadMostrar = Float.toString(auxiliarTipo) + " Gr.";
            } else {
                cantidadMostrar = cantidad + " Unid.";
            }
            auxiliarTotal = auxiliarTotal.multiply(cantidadSolicitada).setScale(2, RoundingMode.CEILING);
            total = auxiliarTotal.add(total).subtract(descuentoAuxiliar).setScale(2, RoundingMode.CEILING);
            String aux3 = String.valueOf(total);
            totalVentas.setText(aux3);

            DefaultTableModel temp = (DefaultTableModel) tablaCompras.getModel();
            Object nuevo[] = {temp.getRowCount()+1,"",""};
            temp.addRow(nuevo);
            tablaCompras.setValueAt(codigo, j, 0);
            tablaCompras.setValueAt(nombre, j, 1);
            tablaCompras.setValueAt(marca, j, 2);
            tablaCompras.setValueAt(precio, j, 3);
            tablaCompras.setValueAt(cantidadMostrar, j, 4);
            tablaCompras.setValueAt(descuento, j, 5);
            tablaCompras.setValueAt(auxiliarTotal, j, 6);
            tablaCompras.setValueAt(cantidad, j, 7);
            tablaCompras.setValueAt(cantidadEnStock, j, 8);
            tablaCompras.setValueAt(tipo, j, 9);
            tablaCompras.setValueAt(articleId, j, 10);
            tablaCompras.setValueAt(stockId, j, 11);
            j++;
        }
        scanning.setText("");
        cantidad = "1";
        descuento = "0.00";
        scanning.requestFocus();
    }
    
   
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloVenta().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarTodo;
    private javax.swing.JButton cancelTicket;
    private javax.swing.JButton cashWithdrawal;
    public javax.swing.JButton closeDay;
    private javax.swing.JButton ctaCte;
    private javax.swing.JButton eliminarFila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JButton printTicket;
    private javax.swing.JLabel printTicketFont;
    private javax.swing.JButton returns;
    private javax.swing.JTextField scanning;
    private javax.swing.JButton searchArticles;
    private javax.swing.JTable tablaCompras;
    private javax.swing.JTextField totalVentas;
    // End of variables declaration//GEN-END:variables
  
}
