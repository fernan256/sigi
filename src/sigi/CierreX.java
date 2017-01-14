package sigi;

import Connection.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cierre X     ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 36;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 1, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Fecha apertura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Inicio de caja");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Totales del día");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 25, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Efectivo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Cuenta corrientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 36;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 24, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Devoluciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Anulaciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Pagos a proveedores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 25, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Descuentos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 25, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("Numeros de tickets");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 25, 0, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        closeX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closeX.setText("Cierre X");
        closeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeXActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 103;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 21, 12, 0);
        getContentPane().add(closeX, gridBagConstraints);

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 74;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 208;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 12, 0);
        getContentPane().add(cancel, gridBagConstraints);

        userName.setEditable(false);
        userName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 133;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        getContentPane().add(userName, gridBagConstraints);

        openDate.setEditable(false);
        openDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        getContentPane().add(openDate, gridBagConstraints);

        openingCash.setEditable(false);
        openingCash.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        openingCash.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        getContentPane().add(openingCash, gridBagConstraints);

        totalCash.setEditable(false);
        totalCash.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalCash.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        getContentPane().add(totalCash, gridBagConstraints);

        ctaCte.setEditable(false);
        ctaCte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ctaCte.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 149;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 209;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 52);
        getContentPane().add(ctaCte, gridBagConstraints);

        returns.setEditable(false);
        returns.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        returns.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        getContentPane().add(returns, gridBagConstraints);

        totalCanceledTickets.setEditable(false);
        totalCanceledTickets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalCanceledTickets.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        getContentPane().add(totalCanceledTickets, gridBagConstraints);

        ticketNumberFrom.setEditable(false);
        ticketNumberFrom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketNumberFrom.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 1, 0, 0);
        getContentPane().add(ticketNumberFrom, gridBagConstraints);

        providersPayments.setEditable(false);
        providersPayments.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        providersPayments.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 18, 0, 0);
        getContentPane().add(providersPayments, gridBagConstraints);

        discounts.setEditable(false);
        discounts.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        discounts.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 19, 0, 0);
        getContentPane().add(discounts, gridBagConstraints);

        ticketNumberTo.setEditable(false);
        ticketNumberTo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketNumberTo.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 38;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        getContentPane().add(ticketNumberTo, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("Desde");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        getContentPane().add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setText("Hasta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 16, 0, 0);
        getContentPane().add(jLabel14, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        CierreCaja cerrarCaja = new CierreCaja();
        cerrarCaja.setVisible(true);
        if(Login.userRol == 1) {
            PantallaPrincipal.moduloVentaAdmin.setEnabled(false);
        } else {
            PantallaPrincipalVendedor.moduloVentaVendedor.setEnabled(false);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void closeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeXActionPerformed
        try {
            con = new Conexion();
            Login.getStatus();
            String xClose = "update caja set estado = 3 where id_caja = "+idCaja+"";
            con.ejecutar(xClose);
            String saveXClose = "INSERT INTO cierre_caja (id_caja, fecha_cierre, id_usuario, id_tipo_cierre, total_calculado, total_real, diferencia_caja, devoluciones, anulaciones, pago_prov_efectivo_caja, descuentos, ticket_desde, ticket_hasta) VALUES ("+idCaja+", CURRENT_TIMESTAMP, "+Login.userId+", 3, '"+totalCash.getText()+"', '"+totalCash.getText()+"', 0, '"+returns.getText()+"', '"+totalCanceledTickets.getText()+"', '"+providersPayments.getText()+"', '"+discounts.getText()+"', '"+ticketNumberFrom.getText()+"', '"+ticketNumberTo.getText()+"')";
            con.ejecutar(saveXClose);
            con.Cerrar();
            if(Login.userRol == 1) {
                PantallaPrincipal.moduloVentaAdmin.setEnabled(true);
            } else {
                PantallaPrincipalVendedor.moduloVentaVendedor.setEnabled(true);
            }
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
            System.out.println(openinigDate);
            String getSystemTotal = "SELECT SUM(total) suma_total FROM ventas WHERE fecha_venta > ('"+openinigDate+"') AND fecha_venta < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59') AND forma_pago_id_forma_pago = 1";
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
            String getOpeningInfo = "SELECT * FROM caja WHERE fecha_apertura >= ('"+openinigDate+"') AND fecha_apertura < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getOpeningInfo);
            String dateToFormat = null;
            while(rs.next()) {
                dateToFormat = rs.getString("fecha_apertura");
                openingCash.setText(rs.getString("apertura"));
                auxInitialDay = rs.getFloat("apertura");
            }
            openDate.setText(openinigDate);
            String getCtaCteTotal = "SELECT SUM(total) ctaCte_total FROM ventas WHERE fecha_venta > ('"+openinigDate+"') AND fecha_venta < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59') AND forma_pago_id_forma_pago = 2";
            rs = con.Consulta(getCtaCteTotal);
            while(rs.next()) {
                auxCtaCte = rs.getFloat("ctaCte_total");
            }
            if(auxCtaCte != 0) {
                ctaCte.setText(String.format(Locale.ENGLISH, "%.2f", auxCtaCte));
            } else {
                ctaCte.setText("0.00");
            }
            System.out.println(auxSystemTotal);
            System.out.println(totalCash.toString().format(Locale.ENGLISH, "%.2f", auxSystemTotal));
            totalCash.setText(String.format(Locale.ENGLISH, "%.2f", auxSystemTotal));
            String getTicketRange = "SELECT numero_ticket FROM detalle_venta WHERE fecha_detalle_venta > ('"+openinigDate+"') AND fecha_detalle_venta < date_format('"+openinigDate+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTicketRange);
            ArrayList ticketNro = new ArrayList();
            while(rs.next()) {
                ticketNro.add(rs.getString("numero_ticket"));
            }
            if(!ticketNro.isEmpty()){
                ticketNumberFrom.setText(ticketNro.get(0).toString());
                ticketNumberTo.setText(ticketNro.get(ticketNro.size() - 1).toString());
            }else {
                ticketNumberFrom.setText("000");
                ticketNumberTo.setText("000");
            }
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
