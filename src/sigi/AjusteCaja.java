package sigi;

import Connection.Conexion;
import Connection.Conexion_login;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AjusteCaja extends javax.swing.JInternalFrame {
    Conexion con;
    Conexion_login conUser;
    ResultSet rs;
    static float total = 0;
    static int j = 0;
    static String result;
    int idUser = 0;
    
    public AjusteCaja() {
        initComponents();
        searchClosignDates();
        dates.requestFocusInWindow();
        dates.selectAll();
        makeAdjustment.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        systemTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endDayTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        differences = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adjustmentAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        makeAdjustment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        closeDate = new javax.swing.JTextField();
        initialMoney = new javax.swing.JTextField();
        dates = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        closeNumber = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Buscar cierre por día");

        systemTotal.setEditable(false);
        systemTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Total del sistema");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Total en la caja");

        endDayTotal.setEditable(false);
        endDayTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Diferencia");

        differences.setEditable(false);
        differences.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Ajuste");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Descipción de ajuste");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Efectivo");

        adjustmentAmount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        adjustmentAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjustmentAmountActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Usuario del día");

        userName.setEditable(false);
        userName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        makeAdjustment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        makeAdjustment.setText("Realizar Ajuste");
        makeAdjustment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeAdjustmentActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Fecha de cierre");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Efectivo apertura de caja");

        closeDate.setEditable(false);
        closeDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        initialMoney.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        dates.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dates.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                datesKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel8.setText("(Máximo 255 caracteres)");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("Numero de cierre");

        closeNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        description.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel13.setText("-----------------------------------------------------");

        jLabel14.setText("------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(dates, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel12)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(closeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(initialMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(systemTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(endDayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(differences, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(adjustmentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(makeAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(systemTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(differences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(adjustmentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(makeAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datesKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                con = new Conexion();
                String getDate = dates.getText();
                String searchDate = getDate.substring(0, getDate.length() - 2);
                getValues(searchDate);
                adjustmentAmount.requestFocusInWindow();
                adjustmentAmount.selectAll();
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(AjusteCaja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_datesKeyReleased
    
    private void makeAdjustmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeAdjustmentActionPerformed
        try {
            con = new Conexion();
            String saveAdjustment = "INSERT INTO ajuste_caja (fecha_ajuste, diferencia, monto_ajuste, descripcion, cierre_caja_id_cierre_caja) VALUES (CURRENT_TIMESTAMP, '"+differences.getText()+"', '"+adjustmentAmount.getText()+"', '"+description.getText()+"', '"+closeNumber.getText()+"')";
            con.ejecutar(saveAdjustment);
            String getIdVenta = "SELECT LAST_INSERT_ID() AS id_ajuste from ajuste_caja";
            int idAjuste = 0;
            rs = con.Consulta(getIdVenta);
            while(rs.next()){
                idAjuste = rs.getInt("id_ajuste");
            }
            System.out.println(idAjuste);
            String updateClose = "UPDATE cierre_caja SET ajuste_id = "+idAjuste+" WHERE id_cierre_caja = '"+closeNumber.getText()+"'";
            con.ejecutar(updateClose);
            clearAdjustmentPOSFields();
            makeAdjustment.setEnabled(false);
            con.Cerrar();
        } catch(ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex){
            Logger.getLogger(AjusteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_makeAdjustmentActionPerformed

    private void adjustmentAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjustmentAmountActionPerformed
        float adjustmentExist = Float.parseFloat(adjustmentAmount.getText());
        if(adjustmentExist != 0.00) {
            makeAdjustment.setEnabled(true);
            description.requestFocusInWindow();
            description.selectAll();
        }
    }//GEN-LAST:event_adjustmentAmountActionPerformed
   
    public void searchClosignDates(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(dates);
            String searchDates = "select fecha_cierre from cierre_caja order by fecha_cierre desc";
            rs = con.Consulta(searchDates);
            while(rs.next()){
                result = rs.getString("fecha_cierre");
                textAutoAcompleter.addItem(result);
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getValues(String fecha){
        try {
            con = new Conexion();
            String getCloseInfo = "SELECT t1.*, t2.apertura, t2.id_usuario FROM cierre_caja t1 INNER JOIN caja t2 WHERE t1.fecha_cierre > date_format('"+fecha+"', '%Y-%m-%d 00:00:00') AND t1.fecha_cierre < date_format('"+fecha+"', '%Y-%m-%d 23:59:59') AND t1.id_cierre_caja = t2.cierre_numero";
            rs = con.Consulta(getCloseInfo);
            while(rs.next()) {
                systemTotal.setText(rs.getString("total_calculado"));
                endDayTotal.setText(rs.getString("total_real"));
                differences.setText(rs.getString("diferencia_caja"));
                closeDate.setText(rs.getString("fecha_cierre"));
                initialMoney.setText(rs.getString("apertura"));
                closeNumber.setText(rs.getString("id_cierre_caja"));
                idUser = rs.getInt("id_usuario");
            }
            conUser = new Conexion_login();
            String getUserInfo = "SELECT nombres, apellidos FROM usuarios WHERE id_usuario = "+idUser+"";
            rs = conUser.Consulta(getUserInfo);
            while(rs.next()){
                userName.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
            }
            String getTicketRange = "SELECT numero_ticket FROM detalle_venta WHERE fecha_detalle_venta > date_format('"+fecha+"', '%Y-%m-%d 00:00:00') AND fecha_detalle_venta < date_format('"+fecha+"', '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTicketRange);
            ArrayList ticketNro = new ArrayList();
            while(rs.next()) {
                ticketNro.add(rs.getString("numero_ticket"));
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CierreZ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clearAdjustmentPOSFields(){
        dates.setText("");
        userName.setText("");
        closeDate.setText("");
        initialMoney.setText("");
        systemTotal.setText("");
        endDayTotal.setText("");
        differences.setText("");
        closeNumber.setText("");
        adjustmentAmount.setText("");
        description.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adjustmentAmount;
    private javax.swing.JTextField closeDate;
    private javax.swing.JTextField closeNumber;
    private javax.swing.JTextField dates;
    private javax.swing.JTextField description;
    private javax.swing.JTextField differences;
    private javax.swing.JTextField endDayTotal;
    private javax.swing.JTextField initialMoney;
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
    private javax.swing.JButton makeAdjustment;
    private javax.swing.JTextField systemTotal;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
