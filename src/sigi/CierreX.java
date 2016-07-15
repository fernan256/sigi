package sigi;

import Connection.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CierreX extends javax.swing.JDialog {
    Conexion con;
    ResultSet rs;
    int idCaja = 0;
    
    public CierreX(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        userName.setText(Login.userName);
        this.setLocationRelativeTo(null);
        getValues();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        closeX = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        openDate = new javax.swing.JTextField();
        openingCash = new javax.swing.JTextField();
        totalCash = new javax.swing.JTextField();
        ctaCte = new javax.swing.JTextField();
        returns = new javax.swing.JTextField();
        totalCanceledTickets = new javax.swing.JTextField();
        ticketNumberFrom = new javax.swing.JTextField();
        providersPayments = new javax.swing.JTextField();
        discounts = new javax.swing.JTextField();
        ticketNumberTo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cierre X     ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Fecha apertura");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Inicio de caja");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Totales del día");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Efectivo");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Cuenta corrientes");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Devoluciones");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Anulaciones");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Pagos a proveedores");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Descuentos");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("Numeros de tickets");

        closeX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closeX.setText("Cierre X");
        closeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeXActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        userName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        openDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        openingCash.setEditable(false);
        openingCash.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        openingCash.setText("0.00");

        totalCash.setEditable(false);
        totalCash.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalCash.setText("0.00");

        ctaCte.setEditable(false);
        ctaCte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ctaCte.setText("0.00");

        returns.setEditable(false);
        returns.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        returns.setText("0.00");

        totalCanceledTickets.setEditable(false);
        totalCanceledTickets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalCanceledTickets.setText("0.00");

        ticketNumberFrom.setEditable(false);
        ticketNumberFrom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketNumberFrom.setText("0");

        providersPayments.setEditable(false);
        providersPayments.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        providersPayments.setText("0.00");

        discounts.setEditable(false);
        discounts.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        discounts.setText("0.00");

        ticketNumberTo.setEditable(false);
        ticketNumberTo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketNumberTo.setText("0");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("Desde");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setText("Hasta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(openDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(31, 31, 31)))
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(returns, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(totalCash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(25, 25, 25)
                                                        .addComponent(jLabel7))
                                                    .addComponent(totalCanceledTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(providersPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ticketNumberFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ticketNumberTo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(84, 84, 84)
                                        .addComponent(openingCash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ctaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(closeX, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(openingCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(totalCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctaCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(returns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(totalCanceledTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(providersPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketNumberFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticketNumberTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeX, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        CierreCaja cerrarCaja = new CierreCaja();
        cerrarCaja.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void closeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeXActionPerformed
        try {
            con = new Conexion();
            String xClose = "update caja set estado = 3 where id_caja = "+idCaja+"";
            con.ejecutar(xClose);
            String saveXClose = "INSERT INTO cierre_caja (id_caja, fecha_cierre, id_usuario, id_tipo_cierre, total_calculado, total_real, diferencia_caja, devoluciones, anulaciones, pago_prov_efectivo_caja, descuentos, ticket_desde, ticket_hasta) VALUES ("+idCaja+", CURRENT_TIMESTAMP, "+Login.userId+", 3, '"+totalCash.getText()+"', '"+totalCash.getText()+"', 0, '"+returns.getText()+"', '"+totalCanceledTickets.getText()+"', '"+providersPayments.getText()+"', '"+discounts.getText()+"', '"+ticketNumberFrom.getText()+"', '"+ticketNumberTo.getText()+"')";
            con.ejecutar(saveXClose);
            con.Cerrar();
            PantallaPrincipalVendedor.moduloVentaVendedor.setEnabled(true);
            this.dispose();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CierreX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_closeXActionPerformed
    
    public void getValues(){
        try {
            con = new Conexion();
            String fecha = null;
            float auxSystemTotal = 0, auxCancels = 0, auxReturns = 0, totales = 0, auxInitialDay = 0, auxCtaCte = 0, auxDiscounts = 0;
            String getLastOpen = "SELECT id_caja, fecha_apertura FROM caja";
            rs = con.Consulta(getLastOpen);
            while (rs.next()) {
                fecha = rs.getString("fecha_apertura");
                idCaja = rs.getInt("id_caja");
            }
            String openinigDate = fecha.substring(0, fecha.length() - 2);
            String getSystemTotal = "SELECT SUM(total) suma_total FROM ventas WHERE fecha_venta > ('"+openinigDate+"') AND fecha_venta < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getSystemTotal);
            while(rs.next()) {
                auxSystemTotal = rs.getFloat("suma_total");
            }
            String getDiscounts = "SELECT SUM(descuento) total_discounts FROM ventas WHERE fecha_venta > ('"+openinigDate+"') AND fecha_venta < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getDiscounts);
            while(rs.next()) {
                auxDiscounts = rs.getFloat("total_discounts");
            }
             if(auxDiscounts != 0) {
                discounts.setText(Float.toString(auxDiscounts));
            } else {
                discounts.setText("0.00");
            }   
            String getTotalcancels = "SELECT SUM(total) total_anulaciones FROM anular_ticket WHERE fecha_anular_ticket > ('"+openinigDate+"') AND fecha_anular_ticket < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTotalcancels);
            while(rs.next()) {
                auxCancels = rs.getFloat("total_anulaciones");
            }
            if(auxCancels != 0) {
                totalCanceledTickets.setText(Float.toString(auxCancels));
            } else {
                totalCanceledTickets.setText("0.00");
            }
            String getTotalReturns = "SELECT SUM(valor_devuelto) total_devoluciones FROM devoluciones WHERE fecha_devolucion > ('"+openinigDate+"') AND fecha_devolucion < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTotalReturns);
            while(rs.next()) {
                auxReturns = rs.getFloat("total_devoluciones");
            }
            if(auxReturns != 0){
                returns.setText(Float.toString(auxReturns));
            } else {
                returns.setText("0.00");
            }
            System.out.println(openinigDate);
            String getOpeningInfo = "SELECT * FROM caja WHERE fecha_apertura >= ('"+openinigDate+"') AND fecha_apertura < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getOpeningInfo);
            String dateToFormat = null;
            while(rs.next()) {
                dateToFormat = rs.getString("fecha_apertura");
                openingCash.setText(rs.getString("apertura"));
                auxInitialDay = rs.getFloat("apertura");
            }
            //LocalDateTime date = LocalDateTime.parse(dateToFormat, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            //String newDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            //String s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(fecha2);
            openDate.setText(openinigDate);
            String getCtaCteTotal = "SELECT SUM(total) ctaCte_total FROM ventas WHERE fecha_venta > ('"+openinigDate+"') AND fecha_venta < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59') AND forma_pago_id_forma_pago = 2";
            rs = con.Consulta(getCtaCteTotal);
            while(rs.next()) {
                auxCtaCte = rs.getFloat("ctaCte_total");
            }
            if(auxCtaCte != 0) {
                ctaCte.setText(Float.toString(auxCtaCte));
            } else {
                ctaCte.setText("0.00");
            }
            totalCash.setText(String.format(Locale.ENGLISH, "%.2f", auxSystemTotal));
            String getTicketRange = "SELECT numero_ticket FROM detalle_venta WHERE fecha_detalle_venta > ('"+openinigDate+"') AND fecha_detalle_venta < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTicketRange);
            ArrayList ticketNro = new ArrayList();
            while(rs.next()) {
                ticketNro.add(rs.getString("numero_ticket"));
            }
            ticketNumberFrom.setText(ticketNro.get(0).toString());
            ticketNumberTo.setText(ticketNro.get(ticketNro.size() - 1).toString());
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CierreZ.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CierreX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CierreX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CierreX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CierreX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CierreX dialog = new CierreX(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton closeX;
    private javax.swing.JTextField ctaCte;
    private javax.swing.JTextField discounts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField openDate;
    private javax.swing.JTextField openingCash;
    private javax.swing.JTextField providersPayments;
    private javax.swing.JTextField returns;
    private javax.swing.JTextField ticketNumberFrom;
    private javax.swing.JTextField ticketNumberTo;
    private javax.swing.JTextField totalCanceledTickets;
    private javax.swing.JTextField totalCash;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
