package sigi;

import Utils.ImprimirTicket;
import Utils.Utils;
import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CierreZ extends javax.swing.JDialog {
    Conexion con;
    ResultSet rs;
    int idCaja = 0;
    String closeTicket = null;
    float auxSystemTotal = 0;
    BigDecimal auxWithdrawal = BigDecimal.ZERO;

    public CierreZ(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getValues();
        userName.setText(Login.userName);
        cash.requestFocusInWindow();
        cash.selectAll();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        ctaCte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        returns = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        providersPayments = new javax.swing.JTextField();
        totalEndDay = new javax.swing.JTextField();
        differences = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        systemTotal = new javax.swing.JTextField();
        closeDay = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        totalCanceledTickets = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        openDate = new javax.swing.JTextField();
        initialMoney = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        discounts = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ticketNumberFrom = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ticketNumberTo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cashWithdrawal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cierre X");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Cierre Z");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Usuario");

        userName.setEditable(false);
        userName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Totales Caja");

        cash.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cash.setText("0.00");
        cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashKeyReleased(evt);
            }
        });

        ctaCte.setEditable(false);
        ctaCte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ctaCte.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Efectivo");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Cuenta Corriente");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Devoluciones");

        returns.setEditable(false);
        returns.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        returns.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Pago a proveedor con efectivo de la caja");

        providersPayments.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        providersPayments.setText("0.00");
        providersPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                providersPaymentsKeyReleased(evt);
            }
        });

        totalEndDay.setEditable(false);
        totalEndDay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalEndDay.setText("0.00");

        differences.setEditable(false);
        differences.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        differences.setText("0.00");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Total fin del día");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Total diferencia");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Total del sistema");

        systemTotal.setEditable(false);
        systemTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        closeDay.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        closeDay.setText("Cierre caja");
        closeDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDayActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Anulaciones");

        totalCanceledTickets.setEditable(false);
        totalCanceledTickets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalCanceledTickets.setText("0.00");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("Inicio de caja");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("Fecha apertura");

        openDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        initialMoney.setEditable(false);
        initialMoney.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        initialMoney.setText("0.00");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setText("Descuentos");

        discounts.setEditable(false);
        discounts.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        discounts.setText("0.00");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setText("Rango Tickets");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setText("Desde");

        ticketNumberFrom.setEditable(false);
        ticketNumberFrom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketNumberFrom.setText("0");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setText("Hasta");

        ticketNumberTo.setEditable(false);
        ticketNumberTo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketNumberTo.setText("0");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel18.setText("(Ingresar efectivo sin inicio de caja)");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel19.setText("Retiros de Caja");

        cashWithdrawal.setEditable(false);
        cashWithdrawal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cashWithdrawal.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(openDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(initialMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(ticketNumberTo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalEndDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(differences, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(systemTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(ticketNumberFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addComponent(providersPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(returns, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalCanceledTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(discounts, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(cashWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(closeDay, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(openDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(initialMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ticketNumberFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(ticketNumberTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctaCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel14)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCanceledTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cashWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(providersPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(differences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(systemTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeDay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("cierreX");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDayActionPerformed
        Object[] options = {"Aceptar", "Cancelar"};
        String salto = System.getProperty("line.separator");
        int dataCorrect = JOptionPane.showOptionDialog(null, "Los datos del cierre son correctos?", "Cierre Z", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if(dataCorrect == 0){
            try{
                con = new Conexion();
                float compare = Float.parseFloat(differences.getText());
                if(compare < 0 || compare > 0) {
                    JOptionPane.showMessageDialog(null, "El cierre dio una diferencia de " +compare+ " debe realizar el ajuste correspondiente en el modulo Ajuste de Caja");
                }
                String saveClosingDay = "INSERT INTO cierre_caja (id_caja, fecha_cierre, id_usuario, id_tipo_cierre, total_calculado, total_real, diferencia_caja, devoluciones, anulaciones, pago_prov_efectivo_caja, descuentos, ticket_desde, ticket_hasta, retiro_efectivo) "
                        + "             VALUES ("+idCaja+", CURRENT_TIMESTAMP, "+Login.userId+", 2, '"+systemTotal.getText()+"', '"+totalEndDay.getText()+"', '"+differences.getText()+"', '"+returns.getText()+"', '"+totalCanceledTickets.getText()+"', '"+providersPayments.getText()+"', '"+discounts.getText()+"', '"+ticketNumberFrom.getText()+"', '"+ticketNumberTo.getText()+"', '"+cashWithdrawal.getText()+"')";
                con.ejecutar(saveClosingDay);
                String getLastClose = "SELECT LAST_INSERT_ID() AS cierre_caja FROM cierre_caja";
                int cierre_numero = 0;
                rs = con.Consulta(getLastClose);
                while (rs.next()) {
                    cierre_numero = rs.getInt("cierre_caja");
                }
                String updateCaja = "UPDATE caja SET fecha_cierre = CURRENT_TIME, cierre_numero = "+cierre_numero+", estado = 2 WHERE id_caja = "+idCaja+"";
                con.ejecutar(updateCaja);
                if(Login.userRol == 1) {
                    PantallaPrincipal.moduloVentaAdmin.setEnabled(true);
                } else if (Login.userRol == 2) {
                    PantallaPrincipalVendedor.moduloVentaVendedor.setEnabled(true);
                }
                String ticketHeader = ""+Login.companyName+
                                salto+"C.U.I.T.: "+Login.companyCuilCuit+
                                salto+"Ing. Brutos: "+Login.companyIg+
                                salto+Login.companyAddress+" N° "+Login.companyAddressNumber+
                                salto+Login.companyDepartment+" - "+Login.companyProvince+" - "+Login.companyCp+
                                salto+"Inicio Actividades: "+Utils.formatDateOnly(Login.companyInitActivities)+
                                salto+"--------------------------------"+
                                salto+"Cierre Nro: "+cierre_numero+
                                salto+"Fecha: "+Utils.currentDateFormated()+
                                salto+"--------------------------------";
                closeTicket = ticketHeader+salto+"Usuario: "+Login.userName+
                              salto+"--------------------------------"+
                              salto+"\t"+"TICKETS EMITIDOS"+
                              salto+"  Desde:\t\t"+ticketNumberFrom.getText()+
                              salto+"  Hasta:\t\t"+ticketNumberTo.getText()+
                              salto+salto+"  TOTAL TICKETS:\t"+auxSystemTotal+
                              salto+"--------------------------------"+
                              salto+"\t"+"MOVIMIENTOS DE CAJA"+
                              salto+salto+"  Efectivo:\t\t"+cash.getText()+
                              salto+"  Cuentas Corrientes:\t"+ctaCte.getText()+
                              salto+"  Descuentos:\t\t"+discounts.getText()+
                              salto+"  Anulaciones:\t\t"+totalCanceledTickets.getText()+
                              salto+"  Devoluciones:\t\t"+returns.getText()+
                              salto+"  Retiro Efectivo:\t"+cashWithdrawal.getText()+
                              salto+"--------------------------------"+
                              salto+"\t"+"TOTALES"+
                              salto+salto+"  Total del sistema:\t"+systemTotal.getText()+
                              salto+"  Recuento de Caja:\t"+totalEndDay.getText()+
                              salto+"  Diferencia:\t\t"+differences.getText()+"";
                
                Object[] printOption = {"Imprimir", "Guardar"};
                int printCloseData = JOptionPane.showOptionDialog(null, closeTicket, "Cierre Z", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE, null, printOption, printOption[0]);
                if(printCloseData == 0){
                    int print = ImprimirTicket.printTicket(closeTicket);
                    if(print == 1){
                        closeTicket = "";
                    } else {
                        System.out.println(print);
                    }
                } else {
                    JFileChooser dialog = new JFileChooser();
                    int save = dialog.showSaveDialog(CierreZ.this);
                    if (save == JFileChooser.APPROVE_OPTION) {
                        File dir = dialog.getSelectedFile().getAbsoluteFile();
                        try{
                            FileWriter saveFile = new FileWriter(dir+".txt");
                            BufferedWriter bw = new BufferedWriter(saveFile);
                            PrintWriter wr = new PrintWriter(bw);  
                            wr.write(closeTicket);
                            wr.close();
                            bw.close();
                        } catch (IOException ex) {
                            Logger.getLogger(CierreZ.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                cash.setText("0.00");
                providersPayments.setText("0.00");
                totalEndDay.setText("0.00");
                differences.setText("0.00");
                con.Cerrar();
                this.dispose();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(CierreZ.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el efectivo contado en la caja, en la opción efectivo, presionar ENTER. \nLuego si se ha realizado algún pago a proveedores con efectivo de la caja ingresarlo y presionar ENTER.");
            cash.requestFocusInWindow();
            cash.selectAll();
        }
    }//GEN-LAST:event_closeDayActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        CierreCaja cerrarCaja = new CierreCaja();
        cerrarCaja.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void providersPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_providersPaymentsKeyReleased
        if((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            if(cash.getText().equals("0.00")) {
                closeDay.requestFocusInWindow();
            } else {
                BigDecimal auxCash = new BigDecimal(cash.getText());
                BigDecimal auxProvidersPayment = new BigDecimal(providersPayments.getText());
                BigDecimal total = BigDecimal.ZERO, totalSystem = BigDecimal.ZERO, totalDifference = BigDecimal.ZERO;
                BigDecimal auxiliarSytesmTotal = new BigDecimal(systemTotal.getText());
                total = auxCash.add(auxWithdrawal).subtract(auxProvidersPayment).setScale(2, RoundingMode.CEILING);
                totalSystem = auxiliarSytesmTotal.subtract(auxProvidersPayment).setScale(2, RoundingMode.CEILING);
                totalEndDay.setText(total.toString());
                systemTotal.setText(totalSystem.toString());
                totalEndDay.requestFocusInWindow();
                totalDifference = total.subtract(totalSystem);
                differences.setText(totalDifference.toString());
                closeDay.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_providersPaymentsKeyReleased

    private void cashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!cash.getText().equals("0.00")){
                String convertCash = Utils.formatCurrency(cash.getText().length(), cash.getText());
                cash.setText(convertCash);
            }
            providersPayments.requestFocusInWindow();
            providersPayments.selectAll();
        }
    }//GEN-LAST:event_cashKeyReleased
     
    public void getValues(){
        try {
            con = new Conexion();
            
            String openDatePos = null;
            Date openDateAsDate = null;
            float auxCancels = 0, auxReturns = 0, totales = 0, auxCtaCte = 0, auxDiscounts = 0;
            String getLastOpen = "SELECT id_caja, fecha_apertura FROM caja WHERE estado = ?";
            rs = con.find(getLastOpen, "1");
            while (rs.next()) {
                openDatePos = rs.getString("fecha_apertura");
                openDateAsDate = rs.getDate("fecha_apertura");
                idCaja = rs.getInt("id_caja");
            }            
            String h = openDatePos.substring(0, openDatePos.length() - 2);
            String getSystemTotal = "SELECT SUM(total) suma_total FROM ventas WHERE fecha_venta > '"+h+"' AND fecha_venta < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getSystemTotal);
            while(rs.next()) {
                auxSystemTotal = rs.getFloat("suma_total");
            }
            String getTotalcancels = "SELECT SUM(total) total_anulaciones FROM anular_ticket WHERE fecha_anular_ticket > '"+h+"' AND fecha_anular_ticket < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTotalcancels);
            while(rs.next()) {
                auxCancels = rs.getFloat("total_anulaciones");
            }
            if(auxCancels != 0) {
                totalCanceledTickets.setText(Float.toString(auxCancels));
            } else {
                totalCanceledTickets.setText("0.00");
            }
            String getDiscounts = "SELECT SUM(descuento) total_discounts FROM ventas WHERE fecha_venta > '"+h+"' AND fecha_venta < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getDiscounts);
            while(rs.next()) {
                auxDiscounts = rs.getFloat("total_discounts");
            }
            if(auxDiscounts != 0) {
                discounts.setText(Float.toString(auxDiscounts));
            } else {
                discounts.setText("0.00");
            }            
            String getTotalReturns = "SELECT SUM(valor_devuelto) total_devoluciones FROM devoluciones WHERE fecha_devolucion > '"+h+"' AND fecha_devolucion < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTotalReturns);
            while(rs.next()) {
                auxReturns = rs.getFloat("total_devoluciones");
            }
            if(auxReturns != 0){
                returns.setText(Float.toString(auxReturns));
            } else {
                returns.setText("0.00");
            }
            String getOpeningInfo = "SELECT * FROM caja WHERE fecha_apertura >= '"+h+"' AND fecha_apertura < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getOpeningInfo);
            while(rs.next()) {
                initialMoney.setText(rs.getString("apertura"));
            }
            String s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(openDateAsDate);
            openDate.setText(h);
            String getCtaCteTotal = "SELECT SUM(total) ctaCte_total FROM ventas WHERE fecha_venta > '"+h+"' AND fecha_venta < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59') AND forma_pago_id_forma_pago = 2";
            rs = con.Consulta(getCtaCteTotal);
            String cta = "";
            while(rs.next()) {
                auxCtaCte = rs.getFloat("ctaCte_total");
            }
            if(auxCtaCte != 0) {
                ctaCte.setText(Float.toString(auxCtaCte));
            } else {
                ctaCte.setText("0.00");
            }
            totales = auxSystemTotal - auxReturns - auxCancels - auxCtaCte;
            systemTotal.setText(String.format(Locale.ENGLISH, "%.2f", totales));
            String getTicketRange = "SELECT numero_ticket FROM detalle_venta WHERE fecha_detalle_venta > ('"+h+"') AND fecha_detalle_venta < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getTicketRange);
            ArrayList ticketNro = new ArrayList();
            while(rs.next()) {
                ticketNro.add(rs.getString("numero_ticket"));
            }
            if(!ticketNro.isEmpty()) {
                ticketNumberFrom.setText(ticketNro.get(0).toString());
                ticketNumberTo.setText(ticketNro.get(ticketNro.size() - 1).toString());
            } else {
                Object[] options = {"OK"};
                JOptionPane.showOptionDialog(null, "No se ha realizado ninguna venta", "Aviso", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                ticketNumberFrom.setText("0");
                ticketNumberTo.setText("0");
            }
            String getWithdrawalTotal = "SELECT SUM(monto_retirado) suma_total FROM retiro_dinero WHERE fecha_retiro > '"+h+"' AND fecha_retiro < date_format(CURRENT_TIMESTAMP, '%Y-%m-%d 23:59:59')";
            rs = con.Consulta(getWithdrawalTotal);
            while(rs.next()) {
                if(rs.getInt("suma_total") != 0) {
                    auxWithdrawal = rs.getBigDecimal("suma_total");
                    cashWithdrawal.setText(rs.getString("suma_total"));
                } else {
                    cashWithdrawal.setText("0.00");
                }
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CierreZ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cash;
    private javax.swing.JTextField cashWithdrawal;
    private javax.swing.JButton closeDay;
    private javax.swing.JTextField ctaCte;
    private javax.swing.JTextField differences;
    private javax.swing.JTextField discounts;
    private javax.swing.JTextField initialMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField openDate;
    private javax.swing.JTextField providersPayments;
    private javax.swing.JTextField returns;
    private javax.swing.JTextField systemTotal;
    private javax.swing.JTextField ticketNumberFrom;
    private javax.swing.JTextField ticketNumberTo;
    private javax.swing.JTextField totalCanceledTickets;
    private javax.swing.JTextField totalEndDay;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
