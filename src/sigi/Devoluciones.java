package sigi;

import Connection.Conexion;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sigi.ModuloVenta.articleId;
import static sigi.ModuloVenta.descuento;
import static sigi.ModuloVenta.getTotalVentas;

public class Devoluciones extends javax.swing.JDialog {
    Conexion con;
    ResultSet rs;
    int j = 0;
    BigDecimal cantidadProducto = BigDecimal.ZERO;
    static BigDecimal auxiliarTotal = BigDecimal.ZERO;
    String cantidad = "1";
    static BigDecimal total = BigDecimal.ZERO;
    String userId = Integer.toString(Login.userId);
    public Devoluciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        scanning = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        accept = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnReason = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        returnTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Scanning");

        scanning.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        scanning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scanningKeyReleased(evt);
            }
        });

        productTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scanning", "Nombe producto", "Marca", "Precio", "Cantidad", "Cantidad", "Tipo", "ArticuloId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
            productTable.getColumnModel().getColumn(5).setMinWidth(0);
            productTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            productTable.getColumnModel().getColumn(5).setMaxWidth(0);
            productTable.getColumnModel().getColumn(6).setMinWidth(0);
            productTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            productTable.getColumnModel().getColumn(6).setMaxWidth(0);
            productTable.getColumnModel().getColumn(7).setMinWidth(0);
            productTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            productTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        accept.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accept.setText("Aceptar");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Productos");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Motivo devolución");

        returnReason.setColumns(20);
        returnReason.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        returnReason.setRows(5);
        jScrollPane2.setViewportView(returnReason);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Total");

        returnTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(50, 50, 50)
                                .addComponent(scanning, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(returnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scanning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(returnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scanningKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scanningKeyReleased
        this.setFocusable(true);
        if((evt.getKeyCode() == KeyEvent.VK_C) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            String cantidadString = JOptionPane.showInputDialog("Cantidad", "0");
            if(cantidadString != null) {
                cantidad = cantidadString;
            }
        }
        if((evt.getKeyCode() == KeyEvent.VK_D) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            String descuentoString = JOptionPane.showInputDialog("Descuento", "0.00");
            if(descuentoString != null) {
                descuento = descuentoString;
            }
        }
        if((evt.getKeyCode() == KeyEvent.VK_P) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            String cantidadString = JOptionPane.showInputDialog("Cantidad", "0");
            if(cantidadString != null) {
                int cant = Integer.parseInt(cantidadString);
                float aux = (float)cant / 1000;
                cantidad = Float.toString(aux);
            }
        }
        try {
            try {
                con = new Conexion();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
            }

            String searchScanning= scanning.getText();
            int tipo = 0;
            //String sql = "SELECT descripcion_articulos.id_articulo, descripcion_articulos.scanning, descripcion_articulos.nombre_producto, descripcion_articulos.marca, descripcion_articulos.precio_venta, descripcion_articulos.tipo_articulo_id, stock.saldo_stock FROM descripcion_articulos INNER JOIN stock ON stock.id_articulo = descripcion_articulos.id_articulo WHERE descripcion_articulos.scanning = '"+searchScanning+"%'";
            String sql = "SELECT descripcion_articulos.id_articulo, descripcion_articulos.scanning, descripcion_articulos.nombre_producto, descripcion_articulos.marca, descripcion_articulos.precio_venta, descripcion_articulos.tipo_articulo_id, stock.saldo_stock FROM descripcion_articulos INNER JOIN stock ON stock.id_articulo = descripcion_articulos.id_articulo WHERE descripcion_articulos.scanning = ?";
            rs = con.find(sql, searchScanning);
            //rs = con.Consulta(sql);
            if(rs==null) {
                JOptionPane.showMessageDialog(null, "No se encontro el scanning: "+scanning.getText()+" en la base de datos.");
            }
            String codigo = "";
            String nombre = "", marca = "";
            BigDecimal precio = BigDecimal.ZERO;
            int numberOfRows = 0;
            while (rs.next()) {
                ++numberOfRows;
                articleId = rs.getString("id_articulo");
                tipo = rs.getInt("tipo_articulo_id");
                codigo = rs.getString("scanning");
                nombre = rs.getString("nombre_producto");
                marca = rs.getString("marca");
                precio = rs.getBigDecimal("precio_venta");
            }
            if(numberOfRows == 1){
                cantidadProducto = new BigDecimal(cantidad);
                auxiliarTotal = precio;
                String cantidadMostrar;
                if(tipo == 2) {
                    float cantidadTipo = Float.parseFloat(cantidad);
                    float auxiliarTipo =  (float)cantidadTipo * 1000;
                    cantidad = Float.toString(cantidadTipo);
                    cantidadMostrar = Float.toString(auxiliarTipo) + " Gr.";
                } else {
                    cantidadMostrar = cantidad + " Unid.";
                }
                auxiliarTotal = auxiliarTotal.multiply(cantidadProducto).setScale(2, RoundingMode.CEILING);
                total = auxiliarTotal.add(total).setScale(2, RoundingMode.CEILING);
                String aux3 = String.valueOf(total);
                returnTotal.setText(aux3);

                DefaultTableModel temp = (DefaultTableModel) productTable.getModel();

                Object nuevo[] = {temp.getRowCount()+1,"",""};
                temp.addRow(nuevo);
                //descuento
                productTable.setValueAt(codigo, j, 0);
                productTable.setValueAt(nombre, j, 1);
                productTable.setValueAt(marca, j, 2);
                productTable.setValueAt(precio, j, 3);
                productTable.setValueAt(cantidadMostrar, j, 4);
                //productTable.setValueAt(descuento, j, 5);
                productTable.setValueAt(cantidad, j, 5);
                //productTable.setValueAt(cantidadEnStock, j, 7);
                productTable.setValueAt(tipo, j, 6);
                productTable.setValueAt(articleId, j, 7);
                j++;//Aumenta el contador
                scanning.setText("");
                cantidad = "1";
                scanning.requestFocus();
            }
            con.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_scanningKeyReleased

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        
        String efectivo = ""; 
        BigDecimal pagoEfectivo = BigDecimal.ZERO;
        BigDecimal cambio = BigDecimal.ZERO;
        BigDecimal totalAccount = BigDecimal.ZERO;
        getTotalVentas = new BigDecimal(returnTotal.getText());
        if(j==0) {
            JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");
        } else {
                try {
                    con = new Conexion();
                    //String nombreProducto [] = new String[j], marcaProducto [] = new String[j];
                    float cantidadVenta[] = new float[j];                
                    float cantidadStock[] = new float[j];
                    BigDecimal precioVenta[] = new BigDecimal[j];
                    //String scanningArticulo[] = new String[j];
                    int tipoArticulo[] = new int[j];
                    String idArticulos[] = new String[j];

                    for (int i=0; i<j; i++) {
                        precioVenta[i]= new BigDecimal(productTable.getValueAt(i, 3).toString());
                        cantidadStock[i] = Float.parseFloat(productTable.getValueAt(i, 5).toString());
                        tipoArticulo[i] = Integer.parseInt(productTable.getValueAt(i, 6).toString());
                        idArticulos[i] = productTable.getValueAt(i, 7).toString();
                        
                        String devoluciones = "INSERT INTO devoluciones (cantidad, descripcion_articulos_id_articulo, motivo, valor_devuelto, fecha_devolucion, id_usuario) VALUES ("+cantidadStock[i]+", "+idArticulos[i]+", '"+returnReason.getText()+"', "+returnTotal.getText()+", CURRENT_TIMESTAMP, "+userId+")";
                        con.ejecutar(devoluciones);
                    }                    
                    clear();
                    con.Cerrar();
                    this.dispose();
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex1) {
                    Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex1);
                }
        }
    }//GEN-LAST:event_acceptActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        clear();
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Devoluciones dialog = new Devoluciones(new javax.swing.JFrame(), true);
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
    
    private void clear(){
        total = BigDecimal.ZERO;
        scanning.setText("");                
        scanning.requestFocus();
        returnTotal.setText("0.00");
        DefaultTableModel temp = (DefaultTableModel) productTable.getModel();
        temp.setRowCount(0);
        j=0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable productTable;
    private javax.swing.JTextArea returnReason;
    private javax.swing.JTextField returnTotal;
    private javax.swing.JTextField scanning;
    // End of variables declaration//GEN-END:variables
}
