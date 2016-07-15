package sigi.reports;

import Connection.Conexion;
import Utils.Utils;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sigi.Login;

public class ReporteStock extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    private int j = 0, numRows = 0;
    
    public ReporteStock() {
        initComponents();
        searchProducts();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchArticle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        articleName = new javax.swing.JTextField();
        articleBrand = new javax.swing.JTextField();
        idStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        articleMovements = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Sacar reporte Stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Movimiento Stock");

        searchArticle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchArticle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchArticleKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Buscar Articulo");

        articleName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        articleBrand.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        idStock.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        articleMovements.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        articleMovements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Stock", "Fecha Movimiento", "Entrada", "Salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(articleMovements);
        if (articleMovements.getColumnModel().getColumnCount() > 0) {
            articleMovements.getColumnModel().getColumn(0).setResizable(false);
            articleMovements.getColumnModel().getColumn(1).setResizable(false);
            articleMovements.getColumnModel().getColumn(2).setResizable(false);
            articleMovements.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Reporte Saldo Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100)
                        .addComponent(searchArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(articleName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(articleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(idStock, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(searchArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(articleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            con = new Conexion();
            Map parameter = new HashMap();
            parameter.put("companyName", Login.companyName);
            parameter.put("todaysDate", Utils.currentDateWithMonth());
            String pathW = "C:\\Users\\Diego\\Documents\\NetBeansProjects\\SIGI\\src\\sigi\\reports\\stockReport.jasper";
            JasperReport jr = null;
            jr = (JasperReport) JRLoader.loadObjectFromFile(pathW);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, con.getConextion());
            JasperViewer.viewReport(jp, false);
            con.Cerrar();
        } catch (JRException | SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ReportesVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchArticleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchArticleKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                con = new Conexion();
                String getSearch = "select t1.*, t2.*, t3.* from descripcion_articulos t1 "
                                    + "inner join stock t2 on t2.id_stock = t1.stock_id_stock "
                                    + "inner join movimiento_stock t3 on t3.stock_id_stock = t1.stock_id_stock "
                                    + "where scanning = '"+searchArticle.getText()+"'";
                rs = con.Consulta(getSearch);
                DefaultTableModel temp = (DefaultTableModel)
                articleMovements.getModel();

                Object nuevo[]= {temp.getRowCount()+1,"",""};
                while(rs.next()){
                    numRows++;
                    articleName.setText(rs.getString("nombre_producto"));
                    articleBrand.setText(rs.getString("marca"));
                    idStock.setText(rs.getString("id_stock"));
                    temp.addRow(nuevo);
                    articleMovements.setValueAt(rs.getInt("id_stock"), j, 0);
                    articleMovements.setValueAt(rs.getString("fecha_movimiento_stock"), j, 1);
                    articleMovements.setValueAt(rs.getInt("entrada"), j, 2);
                    articleMovements.setValueAt(rs.getInt("salida"), j, 3);
                    j++;
                }
                if(numRows == 0){
                    JOptionPane.showMessageDialog(null, "El articulo "+searchArticle.getText()+" no tiene movimientos");
                }
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(ReporteStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchArticleKeyReleased
    
    public final void searchProducts(){
        try {
            con = new Conexion();
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(searchArticle);
            String sql ="SELECT * FROM descripcion_articulos";
            rs = con.Consulta(sql);
            while(rs.next()){
                textAutoAcompleter.addItem(rs.getString("scanning"));
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ReporteStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearStockReportFields(){
        searchArticle.setText("");
        articleName.setText("");
        idStock.setText("");
        DefaultTableModel eliminarTodo = (DefaultTableModel) articleMovements.getModel();
        eliminarTodo.setRowCount(0);
        j = 0;
        numRows = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField articleBrand;
    private javax.swing.JTable articleMovements;
    private javax.swing.JTextField articleName;
    private javax.swing.JTextField idStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchArticle;
    // End of variables declaration//GEN-END:variables
}
