package sigi;

import Utils.ImprimirTicket;
import Connection.Conexion;
import Connection.Conexion_login;
import Utils.Utils;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VerReimprimirTickets extends javax.swing.JInternalFrame {
    Conexion con;
    Conexion_login conUser;
    ResultSet rs;
    static int j = 0;
    private final ArrayList<String> scanning = new ArrayList<>();
    private final ArrayList<String> salesQuantity = new ArrayList<>();
    private final ArrayList<String> salesPrice = new ArrayList<>();
    private final ArrayList<String> articleName = new ArrayList<>();
    private final ArrayList<String> articleBrand = new ArrayList<>();
    private String clientName = null, ticket = null, salesUserName = null, salesUserLastName = null, ticketBody = "", ticketNumber = null;
    Timestamp saleDate = null;
    private BigDecimal salesTotal = new BigDecimal(BigInteger.ZERO), discount = new BigDecimal(BigInteger.ZERO);
    private int paymentWay = 0, articleType = 0, currentAccountId = 0;
    private float totalAccount = 0;
    private BigDecimal cash = new BigDecimal(BigInteger.ZERO), exchange = new BigDecimal(BigInteger.ZERO), price = new BigDecimal(BigInteger.ZERO);
    private String salto = System.getProperty("line.separator");
    private int saleUserId = 0;
    
    public VerReimprimirTickets() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ticketToSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTicket = new javax.swing.JTextArea();
        printTicket = new javax.swing.JButton();
        cleanFields = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ticketStatus = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("N° Ticket");

        ticketToSearch.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ticketToSearch.setForeground(new java.awt.Color(234, 33, 33));
        ticketToSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ticketToSearchKeyReleased(evt);
            }
        });

        showTicket.setColumns(20);
        showTicket.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showTicket.setRows(5);
        jScrollPane1.setViewportView(showTicket);

        printTicket.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        printTicket.setText("Imprimir");
        printTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTicketActionPerformed(evt);
            }
        });

        cleanFields.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cleanFields.setText("Limpiar");
        cleanFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanFieldsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(printTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cleanFields, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ticketStatus, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ticketToSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ticketToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ticketStatus))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanFields, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketToSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ticketToSearchKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
            con = new Conexion();
            conUser = new Conexion_login();
            ticketNumber = ticketToSearch.getText();
            String getTicket = "SELECT t1.*, lpad(t1.numero_ticket, 6, 0) ticket_number, t2.*, t3.*, t4.* FROM detalle_venta t1 JOIN ventas t2 ON t2.id_venta = t1.ventas_id_venta JOIN descripcion_articulos t3 ON t3.id_articulo = t1.id_articulo JOIN estado_venta t4 ON t4.id_estado_venta = t1.estado_venta_id_estado_venta WHERE t1.numero_ticket = '"+ticketNumber+"'";
            rs = con.Consulta(getTicket);
            int numRows = 0;
            while(rs.next()){
                numRows++;
                j++;
                saleUserId = rs.getInt("id_usuario");
                paymentWay = rs.getInt("forma_pago_id_forma_pago");
                scanning.add(rs.getString("scanning"));
                salesQuantity.add(rs.getString("cantidad"));
                salesPrice.add(rs.getString("precio_venta"));
                articleName.add(rs.getString("nombre_producto"));
                articleBrand.add(rs.getString("marca"));
                salesTotal = rs.getBigDecimal("total");
                discount = rs.getBigDecimal("descuento");
                cash = rs.getBigDecimal("pago_con");
                exchange = rs.getBigDecimal("vuelto");
                ticketNumber = rs.getString("ticket_number");
                saleDate = rs.getTimestamp("fecha_venta");
                articleType = rs.getInt("tipo_articulo_id");
                currentAccountId = rs.getInt("cuenta_corriente_id");
                ticketStatus.setText(rs.getString("descripcion"));
            }
            String getSaleUser = "SELECT nombres, apellidos FROM usuarios WHERE id_usuario = '"+saleUserId+"'";
            rs = conUser.Consulta(getSaleUser);
            while(rs.next()){
                salesUserName = rs.getString("nombres");
                salesUserLastName = rs.getString("apellidos");
            }
            if(paymentWay == 2) {
                String getClientStatus = "SELECT t1.total, t1.clientes_id_clientes, t2.id_clientes, t2.nombres, t2.apellidos FROM cuentas_corrientes t1 JOIN clientes t2 ON t2.id_clientes = t1.clientes_id_clientes WHERE t1.id_cuenta_corriente = "+currentAccountId+"";
                rs = con.Consulta(getClientStatus);
                while(rs.next()){
                    clientName = rs.getString("nombres") + " " + rs.getString("apellidos");
                    totalAccount = rs.getFloat("total");
                }
            }
            if(numRows != 0){
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
                                salto+"Fecha: "+Utils.formatDate(saleDate)+
                                salto+"--------------------------------"+
                                salto+"CONSUMIDOR FINAL"+
                                salto+"--------------------------------"+
                                salto+"Cant./Precio Unit."+
                                salto+"Descripcion (%IVA)[%BI]\tIMPORTE"+
                                salto+"--------------------------------";
                for (int i=0;i<j;i++){
                    if(articleType != 2){
                        price = new BigDecimal(salesPrice.get(i)).multiply(new BigDecimal(salesQuantity.get(i))).setScale(2, RoundingMode.CEILING);
                    } else {
                        price = new BigDecimal(salesPrice.get(i)).multiply(new BigDecimal(salesQuantity.get(i))).divide(new BigDecimal(1000)).setScale(2, RoundingMode.CEILING);
                    }
                    if(discount != new BigDecimal(0.00).setScale(2, RoundingMode.CEILING)) {
                        if(articleName.get(i).length() > 4 && articleBrand.get(i).length() > 4) {
                            ticketBody = ticketBody+salto+salesQuantity.get(i)+" x "+salesPrice.get(i)+
                                   salto+scanning.get(i)+" "+articleName.get(i).substring(0, 4)+" "+articleBrand.get(i).substring(0, 4)+"\t"+price+""+
                                   salto+"...";
                        } else {
                            ticketBody = ticketBody+salto+salesQuantity.get(i)+" x "+salesPrice.get(i)+
                                   salto+scanning.get(i)+" "+articleName.get(i)+" "+articleBrand.get(i)+"\t"+price+""+
                                   salto+"...";
                        }
                    } else {
                        if(articleName.get(i).length() > 4 && articleBrand.get(i).length() > 4) {
                            ticketBody = ticketBody+salto+salesQuantity.get(i)+" x "+salesPrice.get(i)+
                                salto+scanning.get(i)+" "+articleName.get(i).substring(0, 4)+" "+articleBrand.get(i).substring(0, 4)+"\t"+price+""+
                                salto+"BONIFICACION\t\t-"+discount+
                                salto+"...";
                        } else {
                            ticketBody = ticketBody+salto+salesQuantity.get(i)+" x "+salesPrice.get(i)+
                                salto+scanning.get(i)+" "+articleName.get(i)+" "+articleBrand.get(i)+"\t"+price+""+
                                salto+"BONIFICACION\t\t-"+discount+
                                salto+"...";
                        }
                    }                 
                }
                if(paymentWay == 1) {
                    ticket = ticketHeader + ticketBody +salto+salto+"TOTAL \t\t"+salesTotal+
                                                salto+salto+"Recibi(MOS) "+
                                                salto+"SU PAGO \t\t"+cash+
                                                salto+"Su vuelto \t\t"+exchange+
                                                salto+"--------------------------------"+
                                                salto+"Lo atendio: "+salesUserName+" "+salesUserLastName+
                                                salto+salto+"GRACIAS POR SU COMPRA."+
                                                salto+"--------------------------------"+
                                                salto+"FACTURA NO FISCAL";
                } else{
                    //cambiar total de estado cuenta
                    ticket = ticketHeader + ticketBody +
                                        salto+salto+"TOTAL \t\t"+salesTotal+
                                        salto+salto+"Recibi(MOS)"+
                                        salto+salto+"SU PAGO \t\t"+salesTotal+
                                        salto+"Su vuelto \t\t"+exchange+
                                        salto+"-----------------------------------------"+
                                        salto+"Cuenta Corriente"+
                                        salto+"Nombre: \t"+clientName+
                                        salto+"Estado cuenta: \t"+totalAccount+
                                        salto+"-----------------------------------------"+
                                        salto+"Lo atendio: "+salesUserName+" "+salesUserLastName+
                                        salto+salto+"GRACIAS POR SU COMPRA."+
                                        salto+"-----------------------------------------"+
                                        salto+"FACTURA NO FISCAL";
                }
                showTicket.setText(ticket);
            }else{
                JOptionPane.showMessageDialog(null, "El ticket N° "+ticketNumber+" ingresado no existe");
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(VerReimprimirTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_ticketToSearchKeyReleased

    private void printTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTicketActionPerformed
        int print = ImprimirTicket.printTicket(ticket);
        if(print == 1) {
            ticket = null;
            clearReprintTicket();
        } else {
            System.out.println(print);
        }
    }//GEN-LAST:event_printTicketActionPerformed

    private void cleanFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanFieldsActionPerformed
        clearReprintTicket();
    }//GEN-LAST:event_cleanFieldsActionPerformed
    
    public void clearReprintTicket(){
        ticketToSearch.setText("");
        showTicket.setText("");
        ticketStatus.setText("");
        ticket = null;
        ticketToSearch.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanFields;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printTicket;
    private javax.swing.JTextArea showTicket;
    private javax.swing.JTextField ticketStatus;
    private javax.swing.JTextField ticketToSearch;
    // End of variables declaration//GEN-END:variables
}
