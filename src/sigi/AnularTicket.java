package sigi;

import Connection.Conexion;
import Utils.Utils;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AnularTicket extends javax.swing.JDialog {
    Conexion con;
    ResultSet rs;
    int j = 0;
    BigDecimal cantidadProducto = BigDecimal.ZERO;
    static BigDecimal auxiliarTotal = BigDecimal.ZERO;
    String cantidad = "1";
    static BigDecimal total = BigDecimal.ZERO;
    String userId = Integer.toString(Login.userId);
    int idVenta = 0;
    
    public AnularTicket(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ticketNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saleDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showArticles = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalReturn = new javax.swing.JTextField();
        cancelTicket = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("N° Ticket");

        ticketNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketNumberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Fecha Venta");

        saleDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        showArticles.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showArticles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scanning", "Nombre", "Marca", "Precio", "Cantidad", "idArticulo", "tipoArticulo", "cantidadStock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(showArticles);
        if (showArticles.getColumnModel().getColumnCount() > 0) {
            showArticles.getColumnModel().getColumn(0).setResizable(false);
            showArticles.getColumnModel().getColumn(1).setResizable(false);
            showArticles.getColumnModel().getColumn(2).setResizable(false);
            showArticles.getColumnModel().getColumn(3).setResizable(false);
            showArticles.getColumnModel().getColumn(4).setResizable(false);
            showArticles.getColumnModel().getColumn(5).setMinWidth(0);
            showArticles.getColumnModel().getColumn(5).setPreferredWidth(0);
            showArticles.getColumnModel().getColumn(5).setMaxWidth(0);
            showArticles.getColumnModel().getColumn(6).setMinWidth(0);
            showArticles.getColumnModel().getColumn(6).setPreferredWidth(0);
            showArticles.getColumnModel().getColumn(6).setMaxWidth(0);
            showArticles.getColumnModel().getColumn(7).setMinWidth(0);
            showArticles.getColumnModel().getColumn(7).setPreferredWidth(0);
            showArticles.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("TOTAL DEVOLUCIÓN");

        totalReturn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cancelTicket.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancelTicket.setText("Anular ticket");
        cancelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTicketActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(totalReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saleDate, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(ticketNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(cancelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ticketNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(saleDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketNumberActionPerformed
        try {
            con = new Conexion();
            int ticketStatus = 0;
            
            String validateTicket = "SELECT estado_venta_id_estado_venta FROM detalle_venta WHERE numero_ticket="+ticketNumber.getText()+"";
            rs = con.Consulta(validateTicket);

            while (rs.next()) {
                ticketStatus = rs.getInt("estado_venta_id_estado_venta");
            }
            switch (ticketStatus) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El ticket " +ticketNumber.getText()+ " todavia no fue procesado.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El ticket " +ticketNumber.getText()+ " ya fue anulado");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El ticket " +ticketNumber.getText()+ " tuvo un error al procesar");
                    break;
                default:
                    String getTicket = "SELECT * FROM detalle_venta INNER JOIN ventas INNER JOIN descripcion_articulos INNER JOIN stock WHERE detalle_venta.numero_ticket = "+ticketNumber.getText()+" AND detalle_venta.ventas_id_venta = ventas.id_venta AND detalle_venta.id_articulo = descripcion_articulos.id_articulo AND stock.id_articulo = descripcion_articulos.id_articulo";
                    rs = con.Consulta(getTicket);
                    DefaultTableModel temp = (DefaultTableModel)
                    showArticles.getModel();
                    Object nuevo[]= {temp.getRowCount()+1,"",""};
                    while (rs.next()) {
                        temp.addRow(nuevo);
                        showArticles.setValueAt(rs.getString("scanning"), j, 0);
                        showArticles.setValueAt(rs.getString("nombre_producto"), j, 1);
                        showArticles.setValueAt(rs.getString("marca"), j, 2);
                        showArticles.setValueAt(rs.getBigDecimal("precio_venta"), j, 3);
                        showArticles.setValueAt(rs.getString("cantidad"), j, 4);
                        showArticles.setValueAt(rs.getInt("id_articulo"), j, 5);
                        showArticles.setValueAt(rs.getInt("tipo_articulo_id"), j, 6);
                        showArticles.setValueAt(rs.getInt("saldo_stock"), j, 7);
                        saleDate.setText(Utils.formatDate(rs.getTimestamp("fecha_venta")));
                        totalReturn.setText(rs.getString("total"));
                        idVenta = rs.getInt("id_venta");
                    }   break;
            }
            con.Cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ticketNumberActionPerformed

    private void cancelTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTicketActionPerformed
        //System.out.println(Login.userRol);
        //if(Login.userRol != 1) {
        //}
        j = showArticles.getRowCount();
        if(j==0) {
            JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");
        } else {
            try {
                con = new Conexion();
                String nombreProducto[] = new String[j], marcaProducto [] = new String[j], scanningArticulo[] = new String[j], idArticulos[] = new String[j];
                float cantidadVenta[] = new float[j], cantidadStock[] = new float[j], nuevoStock[] = new float[j];
                BigDecimal precioVenta[] = new BigDecimal[j];
                int guardarStock[] = new int[j];

                for (int i=0; i<j; i++) {
                    scanningArticulo[i] = showArticles.getModel().getValueAt(i, 0).toString();
                    nombreProducto[i] = showArticles.getModel().getValueAt(i, 1).toString();
                    marcaProducto[i] = showArticles.getModel().getValueAt(i, 2).toString();
                    precioVenta[i]= new BigDecimal(showArticles.getModel().getValueAt(i, 3).toString());
                    idArticulos[i] = showArticles.getModel().getValueAt(i, 5).toString();
                    cantidadVenta[i] = Float.parseFloat(showArticles.getModel().getValueAt(i, 4).toString());
                    cantidadStock[i] = Float.parseFloat(showArticles.getModel().getValueAt(i, 7).toString());
                    nuevoStock[i] = cantidadStock[i] + cantidadVenta[i];
                    guardarStock[i] = (int)nuevoStock[i];
                    String updateStock = "UPDATE stock SET saldo_stock = "+guardarStock[i]+" WHERE id_articulo ="+idArticulos[i]+"";
                    con.ejecutar(updateStock);
                }
                String cancelThisTicket = "INSERT INTO anular_ticket (id_usuario, fecha_anular_ticket, total, numero_ticket, ventas_id_venta) VALUES ('"+userId+"', CURRENT_TIMESTAMP, '"+totalReturn.getText()+"', "+ticketNumber.getText()+", "+idVenta+")";
                con.ejecutar(cancelThisTicket);
                String updateVentaStatus = "UPDATE detalle_venta SET estado_venta_id_estado_venta = 3 WHERE ventas_id_venta = "+idVenta+"";
                con.ejecutar(updateVentaStatus);

                JOptionPane.showMessageDialog(null, "Anular ticket\n\nTotal a devolver: $"+totalReturn.getText());
                cleanForm();
                con.Cerrar();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex1) {
                Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex1);
            } 
        }
    }//GEN-LAST:event_cancelTicketActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        cleanForm();
    }//GEN-LAST:event_cancelActionPerformed
    private void cleanForm(){
        ticketNumber.setText("");
        saleDate.setText("");
        totalReturn.setText("0.00");
        DefaultTableModel temp = (DefaultTableModel) showArticles.getModel();
        temp.setRowCount(0);
        j=0;
        this.dispose();
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
            java.util.logging.Logger.getLogger(AnularTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnularTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnularTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnularTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AnularTicket dialog = new AnularTicket(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField saleDate;
    private javax.swing.JTable showArticles;
    private javax.swing.JTextField ticketNumber;
    private javax.swing.JTextField totalReturn;
    // End of variables declaration//GEN-END:variables
}
