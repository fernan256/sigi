package sigi;

import javax.swing.JOptionPane;
import Connection.Conexion;
import Utils.Utils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class CierreCaja extends javax.swing.JFrame {
    Conexion con;
    ResultSet rs;
    ResultSet rs2;
    
    String userId = Integer.toString(Login.userId);

    public CierreCaja() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cierreX = new javax.swing.JButton();
        cierreZ = new javax.swing.JButton();
        closeWindows = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        openSalesModules = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        cierreX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cierreX.setText("CIERRE (X)");
        cierreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierreXActionPerformed(evt);
            }
        });

        cierreZ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cierreZ.setText("CIERRE (Z)");
        cierreZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierreZActionPerformed(evt);
            }
        });

        closeWindows.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closeWindows.setText("CERRAR");
        closeWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Tipo de cierre (X) es para cierre provisional.");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Tipo de cierre (Z) es para hacer el cierre del día.");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("TIPOS DE CIERRE");

        openSalesModules.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        openSalesModules.setText("IR A VENTAS");
        openSalesModules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSalesModulesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cierreZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cierreX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openSalesModules)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cierreZ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cierreX, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openSalesModules, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowsActionPerformed
        try {
            con = new Conexion();
            int lastStatus = 0, lastUserId = 0;
            String lastOpeningDate = null;
            Date lastOpenDate = null;
            String getOpeningYesterday = "SELECT estado, id_usuario, fecha_apertura FROM caja WHERE estado = 1 OR estado = 3";
            rs = con.Consulta(getOpeningYesterday);
            while(rs.next()) {
                lastStatus = rs.getInt("estado");
                lastUserId = rs.getInt("id_usuario");
                lastOpeningDate = rs.getString("fecha_apertura");
                lastOpenDate = rs.getDate("fecha_apertura");
            }
            switch (lastStatus) {
                case 2:
                    ModuloVenta abrir = new ModuloVenta();
                    abrir.setVisible(true);
                    this.dispose();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "No se ha realizado el cierre de caja correspondiente a la fecha " + Utils.formatDateOnly(lastOpenDate));
                    if(Login.userRol == 1) {
                        PantallaPrincipal.moduloVentaAdmin.setEnabled(true);
                    } else {
                        PantallaPrincipalVendedor.moduloVentaVendedor.setEnabled(true);
                    }
                    this.dispose();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se ha realizado el cierre de caja correspondiente a la fecha " + Utils.formatDateOnly(lastOpenDate));
                    if(Login.userRol == 1) {
                        PantallaPrincipal.moduloVentaAdmin.setEnabled(true);
                    } else {
                        PantallaPrincipalVendedor.moduloVentaVendedor.setEnabled(true);
                    }
                    this.dispose();
                    break;
            }
            con.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_closeWindowsActionPerformed

    private void cierreZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierreZActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea realizar el cierre Z", "Cierre", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if(option == JOptionPane.YES_OPTION){
            CierreZ cierreFinDelDia = new CierreZ(this, true);
            cierreFinDelDia.setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_cierreZActionPerformed

    private void cierreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierreXActionPerformed
        CierreX cierreTemporal = new CierreX(this, true);
        cierreTemporal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cierreXActionPerformed

    private void openSalesModulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSalesModulesActionPerformed
        ModuloVenta ventas = new ModuloVenta();
        ventas.setVisible(true);
        if(Login.userRol == 1) {
            PantallaPrincipal.moduloVentaAdmin.setEnabled(false);
        } else {
            PantallaPrincipalVendedor.moduloVentaVendedor.setEnabled(false);
        }
        this.dispose();
    }//GEN-LAST:event_openSalesModulesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cierreX;
    private javax.swing.JButton cierreZ;
    private javax.swing.JButton closeWindows;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton openSalesModules;
    // End of variables declaration//GEN-END:variables
}
