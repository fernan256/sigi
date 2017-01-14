package sigi;

import Connection.Conexion;
import Connection.Conexion_login;
import Utils.ImprimirCierre;
import Utils.Utils;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AjusteCaja extends javax.swing.JInternalFrame {
    Conexion con;
    Conexion_login conUser;
    ResultSet rs;
    static float total = 0;
    static int j = 0, k = 0;
    static String result = "", ticketNumberFrom = "", ticketNumberTo = "";
    int idUser = 0, idClosingDay = 0, adjustmentId = 0;
    String ctaCte = "", discounts = "", totalCanceledTickets = "", returns = "", providersPayment = "", cashWithdrawal = "";
    
    public AjusteCaja() {
        initComponents();
        closingDate.requestFocusInWindow();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        closeNumber = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        closingDateResult = new javax.swing.JTable();
        closingDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        adjustmentNumber = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        adjustmentCash = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        adjustmentText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        adjustmentDiference = new javax.swing.JTextField();
        printClosingDay = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Buscar cierre por día");

        systemTotal.setEditable(false);
        systemTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Total del sistema");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Total en la caja");

        endDayTotal.setEditable(false);
        endDayTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Diferencia");

        differences.setEditable(false);
        differences.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AJUSTE");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Descipción de ajuste");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Efectivo");

        adjustmentAmount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        adjustmentAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adjustmentAmountKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
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

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setText("Fecha de cierre");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setText("Apertura de caja");

        closeDate.setEditable(false);
        closeDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        initialMoney.setEditable(false);
        initialMoney.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel8.setText("(Máximo 255 caracteres)");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("Numero de cierre");

        closeNumber.setEditable(false);
        closeNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        description.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptionKeyReleased(evt);
            }
        });

        closingDateResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Cierre", "Fecha Cierre", "Diferencia", "Id Ajuste"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        closingDateResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closingDateResultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(closingDateResult);
        if (closingDateResult.getColumnModel().getColumnCount() > 0) {
            closingDateResult.getColumnModel().getColumn(0).setResizable(false);
            closingDateResult.getColumnModel().getColumn(1).setResizable(false);
            closingDateResult.getColumnModel().getColumn(2).setResizable(false);
            closingDateResult.getColumnModel().getColumn(3).setResizable(false);
        }

        closingDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        closingDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                closingDatePropertyChange(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setText("N° de Ajuste");

        adjustmentNumber.setEditable(false);
        adjustmentNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel16.setText("Ajustado");

        adjustmentCash.setEditable(false);
        adjustmentCash.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel17.setText("Motivo Ajuste");

        adjustmentText.setEditable(false);
        adjustmentText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setText("Diferencia");

        adjustmentDiference.setEditable(false);
        adjustmentDiference.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        printClosingDay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        printClosingDay.setText("Reimprimir Cierre del Día");
        printClosingDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printClosingDayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(closingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(adjustmentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(makeAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(printClosingDay))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(closeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(closeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(systemTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(endDayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(differences, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(initialMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel12)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(adjustmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(adjustmentCash, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adjustmentDiference, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(adjustmentText))))
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addComponent(closingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(jLabel17)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adjustmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adjustmentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(differences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adjustmentCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adjustmentDiference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makeAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printClosingDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            if(idAjuste == 0) {
                System.out.println("Es cero");
            }
            BigDecimal auxEndDayTotal = new BigDecimal(endDayTotal.getText());
            BigDecimal auxDifferences = new BigDecimal(differences.getText());
            BigDecimal auxAdjustmentAmount = new BigDecimal(adjustmentAmount.getText());
            auxEndDayTotal = auxEndDayTotal.add(auxAdjustmentAmount);
            auxDifferences = auxDifferences.add(auxAdjustmentAmount);
            String updateClose = "UPDATE cierre_caja SET ajuste_id = "+idAjuste+", total_real = "+auxEndDayTotal+", diferencia_caja = "+auxDifferences+" WHERE id_cierre_caja = '"+closeNumber.getText()+"'";
            con.ejecutar(updateClose);
            Object[] printOption = {"Imprimir", "Cancelar"};
            int printCloseData = JOptionPane.showOptionDialog(null, "Reimprimir cierre del día con el ajuste correspondiente?", "Ajuste de Caja", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE, null, printOption, printOption[0]);
            if(printCloseData == 0){
                ImprimirCierre.printClosingDay(ticketNumberFrom, ticketNumberTo, String.valueOf(idClosingDay), 
                    String.valueOf(systemTotal.getText()), endDayTotal.getText(), ctaCte, discounts, 
                    totalCanceledTickets, returns, cashWithdrawal, systemTotal.getText(), 
                    endDayTotal.getText(), differences.getText(), adjustmentId, 
                    adjustmentAmount.getText(), adjustmentText.getText(), Utils.currentDateFormated(),
                    providersPayment);
                clearAdjustmentPOSFields();
                makeAdjustment.setEnabled(false);
            } else {
                clearAdjustmentPOSFields();
                makeAdjustment.setEnabled(false);
            }
            con.Cerrar();
        } catch(ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex){
            Logger.getLogger(AjusteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_makeAdjustmentActionPerformed

    private void adjustmentAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adjustmentAmountKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            adjustmentAmount.setText(Utils.formatCurrency(adjustmentAmount.getText().length(), adjustmentAmount.getText()));
            makeAdjustment.setEnabled(true);
            description.requestFocusInWindow();
            description.selectAll();
        }
    }//GEN-LAST:event_adjustmentAmountKeyReleased

    private void closingDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_closingDatePropertyChange
        if(evt.getPropertyName().equals("date") & closingDate.getDate() != null){
            DefaultTableModel deleteTable = (DefaultTableModel) closingDateResult.getModel();
            deleteTable.setRowCount(0);
            k = 0;
            getClosingDateInfo();
        }
    }//GEN-LAST:event_closingDatePropertyChange

    private void closingDateResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closingDateResultMouseClicked
        int fila = closingDateResult.getSelectedRow();
        if(fila != -1) {
            idClosingDay = Integer.parseInt(closingDateResult.getValueAt(fila, 0).toString());
            adjustmentId = Integer.parseInt(closingDateResult.getValueAt(fila, 3).toString());
            getValues(idClosingDay, adjustmentId);
            adjustmentAmount.requestFocusInWindow();
        }
    }//GEN-LAST:event_closingDateResultMouseClicked

    private void printClosingDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printClosingDayActionPerformed
        ImprimirCierre.printClosingDay(ticketNumberFrom, ticketNumberTo, String.valueOf(idClosingDay), 
                    String.valueOf(systemTotal.getText()), endDayTotal.getText(), ctaCte, discounts, 
                    totalCanceledTickets, returns, cashWithdrawal, systemTotal.getText(), 
                    endDayTotal.getText(), differences.getText(), adjustmentId, 
                    adjustmentAmount.getText(), adjustmentText.getText(), Utils.currentDateFormated(),
                    providersPayment);
    }//GEN-LAST:event_printClosingDayActionPerformed

    private void descriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            makeAdjustment.requestFocusInWindow();
        }
    }//GEN-LAST:event_descriptionKeyReleased
   
    public void getValues(int closingDayId, int adjustmentIdValue){
        try {
            con = new Conexion();
            String getCloseInfo = "SELECT t1.*, t2.apertura, t2.id_usuario FROM cierre_caja t1 INNER JOIN caja t2 WHERE t1.id_cierre_caja = "+closingDayId+"";
            rs = con.Consulta(getCloseInfo);
            while(rs.next()) {
                systemTotal.setText(rs.getString("total_calculado"));
                endDayTotal.setText(rs.getString("total_real"));
                differences.setText(rs.getString("diferencia_caja"));
                closeDate.setText(Utils.formatDate(rs.getTimestamp("fecha_cierre")));
                initialMoney.setText(rs.getString("apertura"));
                closeNumber.setText(rs.getString("id_cierre_caja"));
                idUser = rs.getInt("id_usuario");
                ticketNumberFrom = rs.getString("ticket_desde");
                ticketNumberTo = rs.getString("ticket_hasta");
                ctaCte = rs.getString("total_cta_cte");
                discounts = rs.getString("descuentos");
                totalCanceledTickets = rs.getString("anulaciones");
                returns = rs.getString("devoluciones");
                providersPayment = rs.getString("pago_prov_efectivo_caja");
                cashWithdrawal = rs.getString("retiro_efectivo");
            }
            conUser = new Conexion_login();
            String getUserInfo = "SELECT nombres, apellidos FROM usuarios WHERE id_usuario = "+idUser+"";
            rs = conUser.Consulta(getUserInfo);
            while(rs.next()){
                userName.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
            }
            if(adjustmentIdValue != 0) {
                String getAdjustmentInfo = "SELECT * FROM ajuste_caja WHERE id_ajuste_caja = '"+adjustmentIdValue+"'";
                rs = con.Consulta(getAdjustmentInfo);
                while(rs.next()) {
                    adjustmentCash.setText(rs.getString("monto_ajuste"));
                    adjustmentNumber.setText(rs.getString("id_ajuste_caja"));
                    adjustmentText.setText(rs.getString("descripcion"));
                    adjustmentDiference.setText(rs.getString("diferencia"));
                }
            }else{
                adjustmentCash.setText("0.00");
                adjustmentNumber.setText("0");
                adjustmentText.setText("");
                adjustmentDiference.setText("0.00");
            }
            String getTicketRange = "SELECT numero_ticket FROM detalle_venta WHERE fecha_detalle_venta > '"+Utils.formatDateForConfig(closingDate.getDate())+"' AND fecha_detalle_venta < '"+Utils.formatLastMinute(closingDate.getDate())+"'";
            rs = con.Consulta(getTicketRange);
            ArrayList ticketNro = new ArrayList();
            while(rs.next()) {
                ticketNro.add(rs.getString("numero_ticket"));
            }
            if(!ticketNro.isEmpty()) {
                
            } else {
                ticketNumberFrom = "0";
                ticketNumberTo = "0";
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CierreZ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getClosingDateInfo(){
        try{
            con = new Conexion();
            String getPurchaseInfo = "SELECT * FROM cierre_caja WHERE fecha_cierre > '"+Utils.formatDateForConfig(closingDate.getDate())+"' AND fecha_cierre < '"+Utils.formatLastMinute(closingDate.getDate())+"'";
            rs = con.Consulta(getPurchaseInfo);
            DefaultTableModel temporal = (DefaultTableModel)
            closingDateResult.getModel();
            Object showPurchase[]= {temporal.getRowCount()+1,"",""};
            while(rs.next()) {
                temporal.addRow(showPurchase);
                closingDateResult.setValueAt(rs.getInt("id_cierre_caja"), k, 0);
                closingDateResult.setValueAt(rs.getString("fecha_cierre"), k, 1);
                closingDateResult.setValueAt(rs.getString("diferencia_caja"), k, 2);
                closingDateResult.setValueAt(rs.getInt("ajuste_id"), k, 3);
                k++;
            }
            con.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(RecepcionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearAdjustmentPOSFields(){
        userName.setText("");
        closeDate.setText("");
        initialMoney.setText("");
        systemTotal.setText("");
        endDayTotal.setText("");
        differences.setText("");
        closeNumber.setText("");
        adjustmentAmount.setText("");
        description.setText("");
        adjustmentCash.setText("");
        adjustmentNumber.setText("");
        adjustmentText.setText("");
        adjustmentDiference.setText("");
        DefaultTableModel deleteTable = (DefaultTableModel) closingDateResult.getModel();
        deleteTable.setRowCount(0);
        k = 0;
        closingDate.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adjustmentAmount;
    private javax.swing.JTextField adjustmentCash;
    private javax.swing.JTextField adjustmentDiference;
    private javax.swing.JTextField adjustmentNumber;
    private javax.swing.JTextField adjustmentText;
    private javax.swing.JTextField closeDate;
    private javax.swing.JTextField closeNumber;
    private com.toedter.calendar.JDateChooser closingDate;
    private javax.swing.JTable closingDateResult;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeAdjustment;
    private javax.swing.JButton printClosingDay;
    private javax.swing.JTextField systemTotal;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
