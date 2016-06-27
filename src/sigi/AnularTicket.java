package sigi;

import Connection.Conexion;
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
        articles = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalReturn = new javax.swing.JTextField();
        cancelTicket = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("N° Ticket:");

        ticketNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketNumberActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha venta:");

        articles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scanning", "Nombre", "Marca", "Precio", "Cantidad", "Id articulo", "Tipo articulo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(articles);
        if (articles.getColumnModel().getColumnCount() > 0) {
            articles.getColumnModel().getColumn(0).setResizable(false);
            articles.getColumnModel().getColumn(1).setResizable(false);
            articles.getColumnModel().getColumn(2).setResizable(false);
            articles.getColumnModel().getColumn(3).setResizable(false);
            articles.getColumnModel().getColumn(4).setResizable(false);
            articles.getColumnModel().getColumn(5).setMinWidth(0);
            articles.getColumnModel().getColumn(5).setPreferredWidth(0);
            articles.getColumnModel().getColumn(5).setMaxWidth(0);
            articles.getColumnModel().getColumn(6).setMinWidth(0);
            articles.getColumnModel().getColumn(6).setPreferredWidth(0);
            articles.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        jLabel3.setText("Total a devolver:");

        cancelTicket.setText("Anular ticket");
        cancelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTicketActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saleDate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ticketNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(totalReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(cancelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            System.out.println(ticketStatus);
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
                    DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
                        public boolean isCellEditable(int rowIndex, int vColIndex) {
                            return false;
                        }
                    };  this.articles.setModel(buscar);
                    buscar.addColumn("Scanning");
                    buscar.addColumn("Nombre");
                    buscar.addColumn("Marca");
                    buscar.addColumn("Precio");
                    buscar.addColumn("Cantidad");
                    buscar.addColumn("id");
                    buscar.addColumn("tipo");
                    buscar.addColumn("cantidadStock");
                    articles.getColumnModel().getColumn(5).setMinWidth(0);
                    articles.getColumnModel().getColumn(5).setMaxWidth(0);
                    articles.getColumnModel().getColumn(5).setWidth(0);
                    articles.getColumnModel().getColumn(6).setMinWidth(0);
                    articles.getColumnModel().getColumn(6).setMaxWidth(0);
                    articles.getColumnModel().getColumn(6).setWidth(0);
                    articles.getColumnModel().getColumn(7).setMinWidth(0);
                    articles.getColumnModel().getColumn(7).setMaxWidth(0);
                    articles.getColumnModel().getColumn(7).setWidth(0);
                    while (rs.next()) {
                        Object[] fila = new Object[7];
                        fila[0] = rs.getString("scanning");
                        fila[1] = rs.getString("nombre_producto");
                        fila[2] = rs.getString("marca");
                        fila[3] = rs.getBigDecimal("precio_venta");
                        fila[4] = rs.getString("cantidad");
                        fila[5] = rs.getInt("id_articulo");
                        fila[6] = rs.getInt("saldo_stock");
                        buscar.addRow(fila);
                        saleDate.setText(rs.getString("fecha_venta"));
                        totalReturn.setText(rs.getString("total"));
                        idVenta = rs.getInt("id_venta");
                    }   break;
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ticketNumberActionPerformed

    private void cancelTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTicketActionPerformed
        j = articles.getRowCount();
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
                    scanningArticulo[i] = articles.getModel().getValueAt(i, 0).toString();
                    nombreProducto[i] = articles.getModel().getValueAt(i, 1).toString();
                    marcaProducto[i] = articles.getModel().getValueAt(i, 2).toString();
                    precioVenta[i]= new BigDecimal(articles.getModel().getValueAt(i, 3).toString());
                    idArticulos[i] = articles.getModel().getValueAt(i, 5).toString();
                    cantidadVenta[i] = Float.parseFloat(articles.getModel().getValueAt(i, 4).toString());
                    cantidadStock[i] = Float.parseFloat(articles.getModel().getValueAt(i, 6).toString());
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
        DefaultTableModel temp = (DefaultTableModel) articles.getModel();
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
    private javax.swing.JTable articles;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancelTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField saleDate;
    private javax.swing.JTextField ticketNumber;
    private javax.swing.JTextField totalReturn;
    // End of variables declaration//GEN-END:variables
}
