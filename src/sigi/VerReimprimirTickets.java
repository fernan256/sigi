package sigi;

import Utils.ImprimirTicket;
import Connection.Conexion;
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

public class VerReimprimirTickets extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    static int j = 0;
    private final ArrayList<String> scanning = new ArrayList<>();
    private final ArrayList<String> salesQuantity = new ArrayList<>();
    private final ArrayList<String> salesPrice = new ArrayList<>();
    private final ArrayList<String> articleName = new ArrayList<>();
    private final ArrayList<String> articleBrand = new ArrayList<>();
    private String ticket = null, salesUserName = null, salesUserLastName = null, ticketBody = "", ticketNumber = null;
    Timestamp saleDate = null;
    private BigDecimal salesTotal = new BigDecimal(BigInteger.ZERO), discount = new BigDecimal(BigInteger.ZERO);
    private int paymentWay = 0, totalAccount = 0;
    private BigDecimal cash = new BigDecimal(BigInteger.ZERO), exchange = new BigDecimal(BigInteger.ZERO);
    
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

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("N° Ticket");

        ticketToSearch.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        ticketToSearch.setForeground(new java.awt.Color(234, 33, 33));
        ticketToSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ticketToSearchKeyReleased(evt);
            }
        });

        showTicket.setColumns(20);
        showTicket.setRows(5);
        jScrollPane1.setViewportView(showTicket);

        printTicket.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        printTicket.setText("Imprimir");
        printTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(ticketToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(printTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ticketToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketToSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ticketToSearchKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
            con = new Conexion();
            String ticketNumber = ticketToSearch.getText();
            String getTicket = "SELECT t1.*, lpad(t1.numero_ticket, 6, 0) ticket_number, t2.*, t3.*, t4.nombres, t4.apellidos FROM detalle_venta t1 JOIN ventas t2 ON t2.id_venta = t1.ventas_id_venta JOIN descripcion_articulos t3 ON t3.id_articulo = t1.id_articulo INNER JOIN usuarios t4 ON t4.id_usuario = t2.id_usuario WHERE t1.numero_ticket = '"+ticketNumber+"'";
            rs = con.Consulta(getTicket);
            
            while(rs.next()){
                j++;
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
                salesUserName = rs.getString("nombres");
                salesUserLastName = rs.getString("apellidos");
                ticketNumber = rs.getString("ticket_number");
                saleDate = rs.getTimestamp("fecha_venta");
            }
            String ticketHeader = "\bFACTURA NO FISCAL"+
                            "\n-----------------------------------------"+
                            "\n"+Login.companyName+
                            "\nCUIT Nro: "+Login.companyCuilCuit+
                            "\n"+Login.companyAddress+" - "+Login.companyDepartment+" - "+Login.companyProvince+
                            "\n-----------------------------------------"+
                            "\nTicket Nro: "+ticketNumber+" \nFecha: "+Utils.formatDate(saleDate)+"\n"+
                            "\n-----------------------------------------"+
                            "\n\bCONSUMIDOR FINAL"+
                            "\n"+
                            "\n-----------------------------------------"+
                            "\nCant./Precio Unit."+
                            "\nDescripción (%IVA)[%BI]\tIMPORTE"+
                            "\n-----------------------------------------";
            for (int i=0;i<j;i++){
                ticketBody = ticketBody + "\n"+salesQuantity.get(i)+" x "+salesPrice.get(i)+
                        "\n"+scanning.get(i).substring(0, 5)+" "+articleName.get(i).substring(0, 4)+" "+articleBrand.get(i).substring(0, 4)+"\t"+(new BigDecimal(salesPrice.get(i)).multiply(new BigDecimal(salesQuantity.get(i)))).setScale(2, RoundingMode.CEILING)+""+
                        "\n...";                        
            }
            if(paymentWay == 1) {
                ticket = ticketHeader + ticketBody +"\nSubtotal \t\t"+salesTotal+
                                    "\nDescuento \t\t"+discount+
                                    "\n\n\bTOTAL \t\t"+salesTotal+
                                    "\n\nRecibi(MOS) "+
                                    "\nSU PAGO \t\t"+cash+
                                    "\nSU VUELTO \t\t"+exchange+
                                    "\n-----------------------------------------"+
                                    "\nLe atendio: "+salesUserName+" "+salesUserLastName+""+
                                    "\n\nGRACIAS POR SU COMPRA."+
                                    "\n-----------------------------------------"+
                                    "\n\bFACTURA NO FISCAL";
            } else{
                //cambiar total de estado cuenta
                ticket = ticketHeader + ticketBody +"\nSubtotal \t\t"+salesTotal+
                                     "\nDescuento \t\t"+discount+
                                     "\n\n\bTOTAL \t\t"+salesTotal+
                                     "\n\nRecibi(MOS)"+
                                     "\nSU PAGO \t\t"+salesTotal+
                                     "\nSU VUELTO \t\t0.00"+
                                     "\n-----------------------------------------"+
                                     "\nCuenta Corriente"+
                                     "\n\bNombre: \t"+VentasCtaCte.clientName+
                                     "\n\bEstado cuenta: \t"+totalAccount+
                                     "\n-----------------------------------------"+
                                     "\nLe atendio: "+salesUserName+" "+salesUserLastName+""+
                                     "\n\nGRACIAS POR SU COMPRA."+
                                     "\n-----------------------------------------"+
                                     "\n\bFACTURA NO FISCAL";
            }
            showTicket.setText(ticket);
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(VerReimprimirTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_ticketToSearchKeyReleased

    private void printTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTicketActionPerformed
        int print = ImprimirTicket.printTicket(ticket);
        if(print == 1) {
            ticket = null;
        } else {
            System.out.println(print);
        }
    }//GEN-LAST:event_printTicketActionPerformed
    
    public void clearReprintTicket(){
        ticketToSearch.setText("");
        showTicket.setText("");
        ticket = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printTicket;
    private javax.swing.JTextArea showTicket;
    private javax.swing.JTextField ticketToSearch;
    // End of variables declaration//GEN-END:variables
}
