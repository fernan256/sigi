package sigi;
import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BajaArticulos extends javax.swing.JFrame {
    Conexion con;
    ResultSet rs;
    static float total = 0;
    static int j = 0;
    public static int id1;
    public static String id;
    
    public BajaArticulos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchScanning = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jBeliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        searchScanning.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        searchScanning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchScanningKeyPressed(evt);
            }
        });

        resultTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        resultTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(resultTable);

        jBeliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Ingresar Codigo de producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(searchScanning, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addComponent(jBeliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchScanning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBeliminar)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchScanningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchScanningKeyPressed
        try {
            con = new Conexion();
            String nom= searchScanning.getText();
            String sql ="SELECT * FROM descripcion_articulos WHERE scanning LIKE '"+nom+"%' AND unidad > 0";
            rs = con.Consulta(sql);

            DefaultTableModel buscar = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
            this.resultTable.setModel(buscar);
            buscar.addColumn("ID");
            buscar.addColumn("Nombre Producto");
            buscar.addColumn("Precio");
            buscar.addColumn("Cantidad");
            int y=0;
            while (rs.next()) {
                Object[] fila = new Object[4];
                fila[0] = rs.getInt("id_articulo");    
                fila[1] = rs.getString("nombre_producto");
                fila[2] = rs.getDouble("precio_venta");
                fila[3] = rs.getInt("unidad");
                buscar.addRow(fila);
            }
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                searchScanning.requestFocusInWindow();
                resultTable.selectAll();
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BajaArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchScanningKeyPressed

    private void resultTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultTableKeyPressed
        int evento=evt.getKeyCode();
        if(evento==10 ){
            DefaultTableModel modelo = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex, int vColIndex) {
                    return false;
                }
            };
            int aux = resultTable.getSelectedRow();
            if(aux == -1){
                JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la tabla.");
            }
            String bool;
            int Opcion=this.resultTable.getSelectedRow();
            id =  resultTable.getValueAt(Opcion,0).toString(); 
        }
    }//GEN-LAST:event_resultTableKeyPressed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        try {
            con = new Conexion();
            String sql = "DELETE FROM `descripcion_articulos` WHERE id_articulo='"+id+"'";

            con.ejecutar(sql);

            JOptionPane.showMessageDialog(null, "Articulo eliminado.");
            
            searchScanning.setText("");
            resultTable.setModel(new DefaultTableModel());
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BajaArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }
        };
        int aux = resultTable.getSelectedRow();
        if(aux == -1){
            JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la tabla.");
        }
        int Opcion=this.resultTable.getSelectedRow();
        id =  resultTable.getValueAt(Opcion,0).toString();
    }//GEN-LAST:event_resultTableMouseClicked

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
            java.util.logging.Logger.getLogger(BajaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable resultTable;
    private javax.swing.JTextField searchScanning;
    // End of variables declaration//GEN-END:variables
}
