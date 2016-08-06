package sigi.reports;

import Connection.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sigi.Login;
import Utils.Utils;
import java.io.InputStream;
import static net.sf.jasperreports.repo.RepositoryUtil.getInputStream;

public class ReporteDetalleVentas extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    public ReporteDetalleVentas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        reportesVentas = new javax.swing.JButton();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Fecha Desde");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Reportes Detalle Ventas");

        reportesVentas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reportesVentas.setText("Reportes Ventas");
        reportesVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesVentasActionPerformed(evt);
            }
        });

        fromDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        toDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Fecha Hasta");

        jTextField1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextField1.setText("En este modulo se podrán obtener los reportes de detalles de ventas parar el rango de fecha.");
        jTextField1.setBorder(null);

        jTextField2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextField2.setText("Al generar el reporte se visualizaran los detalles de ventas.");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(reportesVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(reportesVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportesVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesVentasActionPerformed
        try {
            con = new Conexion();
            Map parameter = new HashMap();
            parameter.put("companyName", Login.companyName);
            parameter.put("fromDate", Utils.formatDate(fromDate.getDate()));
            parameter.put("toDate", Utils.formatDate(toDate.getDate()));
            parameter.put("todaysDate", Utils.currentDateWithMonth());            
            //String pathW = "C:\\Users\\Diego\\Documents\\NetBeansProjects\\SIGI\\src\\sigi\\reports\\salesDetail.jasper";
            JasperReport jr = null;
//            jr = (JasperReport) JRLoader.loadObjectFromFile(pathW);
//            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, con.getConextion());
//            JasperViewer.viewReport(jp, false);
            InputStream resource = getInputStream("C:/reports/salesDetail.jasper");
            //jr = (JasperReport) JRLoader.loadObjectFromFile(pathW);
            //JasperReport jp = JasperCompileManager.compileReport(getClass().getResourceAsStream("reports/totalSalesReport.jasper"));
            jr = (JasperReport) JRLoader.loadObject(resource);
            //JasperReport jr = JasperCompileManager.compileReport( "sigi\\reports\\totalSalesReport.jasper");
            //JasperPrint jp = JasperFillManager.fillReport(jr, parameter, con.getConextion());
            //JasperViewer jv = new JasperViewer( jp, false );
            //jv.viewReport( jp, false );
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, con.getConextion());
            JasperViewer.viewReport(jp, false);
            con.Cerrar();
        } catch (JRException | SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ReportesVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reportesVentasActionPerformed
    public void clearSalesDetailReportFields(){
        fromDate.setDate(null);
        toDate.setDate(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton reportesVentas;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}
