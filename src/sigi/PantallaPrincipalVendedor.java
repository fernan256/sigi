package sigi;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import Connection.Conexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PantallaPrincipalVendedor extends javax.swing.JFrame {
    Conexion con;
    ResultSet rs;
    int userId = Login.userId;
    public int IDusuario;
    
    public PantallaPrincipalVendedor() { 
        
        initComponents();
        showUserName.setText("Usuario: "+Login.userName);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);                                   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesManeTree = new javax.swing.JTree();
        moduloVentaVendedor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        showUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        changeMenu = new javax.swing.JMenu();
        changePass = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktopPane.setBackground(new java.awt.Color(188, 186, 186));
        desktopPane.setForeground(new java.awt.Color(255, 255, 255));
        desktopPane.setMaximumSize(new java.awt.Dimension(1680, 960));
        desktopPane.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 1100, 590));

        salesManeTree.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Articulos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Stock");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Importar/Exportar Articulos");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ajustes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Caja");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Cliente");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cuentas Corrientes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Cuentas Corrientes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Devoluciones");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Devolución");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Tickets");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ver/Reimprimir Ticket");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Anular Ticket");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        salesManeTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        salesManeTree.setToolTipText("");
        salesManeTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salesManeTree.setMaximumSize(new java.awt.Dimension(124, 144));
        salesManeTree.setPreferredSize(new java.awt.Dimension(124, 144));
        salesManeTree.setRootVisible(false);
        salesManeTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesManeTreeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(salesManeTree);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 540));

        moduloVentaVendedor.setBackground(new java.awt.Color(255, 255, 255));
        moduloVentaVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carritoVentas.png"))); // NOI18N
        moduloVentaVendedor.setText("Modulo Venta");
        moduloVentaVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moduloVentaVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moduloVentaVendedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        moduloVentaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloVentaVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(moduloVentaVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 400, 65));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.jpg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 61, 58));

        showUserName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        showUserName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(showUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 390, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 243, 253));
        jLabel1.setText("Modulos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 248, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue_3_by_astoyanov.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 900));

        changeMenu.setText("Modificar");

        changePass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        changePass.setText("Contraseña");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });
        changeMenu.add(changePass);

        jMenuBar1.add(changeMenu);

        exitMenu.setText("Salir");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Cerrar Sesión");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        exitMenu.add(exit);

        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    AltaModificaionArticulos objIC1=new AltaModificaionArticulos();
    AbmClientes objIC2=new AbmClientes();
    AjusteCaja objIC3=new AjusteCaja();
    CuentasCorrientes objIC5=new CuentasCorrientes();
    Stock objIC6=new Stock();
    VerReimprimirTickets objIC7 = new VerReimprimirTickets();
    ImportarExportarArticulos objIC8 = new ImportarExportarArticulos();
    
    private void salesManeTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesManeTreeMouseClicked
        
        String menu = salesManeTree.getLastSelectedPathComponent().toString();
        switch(menu) {
            case "ABM Articulos":
                if(objIC1.isShowing() == true){
                    try {
                        objIC1.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipalVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC1.clearCrudArticlesFields();
                    desktopPane.add(objIC1);
                    objIC1.show();
                    objIC1.setSize(desktopPane.getSize());
                }
                break;
            case "Stock":
                if(objIC6.isShowing() == true){
                    try {
                        objIC6.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipalVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC6.clearStockFields();
                    desktopPane.add(objIC6);
                    objIC6.show();
                    objIC6.setSize(desktopPane.getSize());
                }
                break;
            case "Importar/Exportar Articulos":
                if(objIC8.isShowing() == true){
                    try {
                        objIC8.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipalVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC8.cleanImportExportFields();
                    desktopPane.add(objIC8);
                    objIC8.show();
                    objIC8.setSize(desktopPane.getSize());
                }
                break;
            case "ABM Cliente":
                if(objIC2.isShowing() == true){
                    try {
                        objIC2.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipalVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC2.clearCrudCustomersFields();
                    desktopPane.add(objIC2);
                    objIC2.show();
                    objIC2.setSize(desktopPane.getSize());
                }
                break;
            case "ABM Cuentas Corrientes":
                if(objIC5.isShowing() == true){
                    try {
                        objIC5.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipalVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC5.clearCtaCteFields();
                    desktopPane.add(objIC5);
                    objIC5.show();
                    objIC5.setSize(desktopPane.getSize());
                }
                break;
            case "Caja":
                if(objIC3.isShowing() == true){
                    try {
                        objIC3.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipalVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC3.clearAdjustmentPOSFields();
                    desktopPane.add(objIC3);
                    objIC3.show();
                    objIC3.setSize(desktopPane.getSize());
                }
                break;
            case "Devolución":
                Devoluciones devolucion = new Devoluciones(this, true);
                devolucion.setVisible(true);
                break;
            case "Ver/Reimprimir Ticket":
                if(objIC7.isShowing() == true) {
                    try {
                        objIC7.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    objIC7.clearReprintTicket();
                    desktopPane.add(objIC7);
                    objIC7.show();
                    objIC7.setSize(desktopPane.getSize());
                }
                break;
            case "Anular Ticket":
                AnularTicket anular = new AnularTicket(this, true);
                anular.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_salesManeTreeMouseClicked
    
    private void moduloVentaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloVentaVendedorActionPerformed
        try {
            con = new Conexion();
            Login.getStatus();
            if(Login.status == 1 || Login.status == 3) {
                if (userId == Login.compareIds) {
                    switch (Login.status) {                    
                        case 1:
                            JOptionPane.showMessageDialog(null, "La caja ya esta abierta");
                            CierreCaja cierre = new CierreCaja();
                            cierre.setVisible(true);
                            break;
                        case 3:
                            int option = JOptionPane.showOptionDialog(null, "Se había hecho un cierre X de la caja, elegir una opción.", "Caja", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Abrir caja", "Hacer cierre"}, "Abrir caja");
                            if(option == 0) {
                                String updateSalesStatus = "UPDATE caja SET estado = 1 WHERE id_caja = "+Login.cajaId+"";
                                con.ejecutar(updateSalesStatus);
                                moduloVentaVendedor.setEnabled(false);
                                ModuloVenta venta = new ModuloVenta();
                                venta.setVisible(true);
                            } else {
                                CierreZ cierreDelDia = new CierreZ(this, true);
                                cierreDelDia.setVisible(true);
                            }
                            break;
                        default:
                            openPos();
                            break;
                    }
                } else {
                    String getUser = "SELECT nombres, apellidos FROM usuarios WHERE id_usuario = "+Login.compareIds+"";
                    rs = con.Consulta(getUser);
                    String names = null, lastNames = null;
                    while(rs.next()) {
                        names = rs.getString("nombres");
                        lastNames = rs.getString("apellidos");
                    }
                    JOptionPane.showMessageDialog(null, "Se ha hecho la apertura de caja con el usuario: " +  names + " " + lastNames);
                }
            } else {
                openPos();
            }
            con.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipalVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moduloVentaVendedorActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Esta seguro de cerrar la sesion actual?","Cerrar sesión",1)==0){
            this.dispose();
            Login login = new Login();
            Dimension pantall = Toolkit.getDefaultToolkit().getScreenSize();  
            Dimension ventan = login.getSize();  
            login.setLocation((pantall.width - ventan.width) / 2, (pantall.height - ventan.height) / 2);
            login.setVisible(true);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassActionPerformed
        ModificarContrasenia mod = new ModificarContrasenia();
        mod.setVisible(true);
    }//GEN-LAST:event_changePassActionPerformed

    private void openPos () {
        try {
            int openCash = 0;
            String getOpeningCash = "SELECT caja_inicial FROM configuracion_inicial WHERE id_configuracion_inicial = 1"; 
            rs = con.Consulta(getOpeningCash);
            while(rs.next()) {
                openCash = rs.getInt("caja_inicial");
            }
            String apertura = "INSERT INTO caja (fecha_apertura, apertura, fecha_cierre, id_usuario, estado) VALUES (CURRENT_TIMESTAMP, '"+openCash+"', 0, '"+Login.userId+"', 1)";
            con.ejecutar(apertura);

            moduloVentaVendedor.setEnabled(false);
            ModuloVenta venta = new ModuloVenta();
            venta.setVisible(true);
            con.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }                                                        
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipalVendedor().setVisible(true);
                
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu changeMenu;
    private javax.swing.JMenuItem changePass;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JButton moduloVentaVendedor;
    private javax.swing.JTree salesManeTree;
    private javax.swing.JLabel showUserName;
    // End of variables declaration//GEN-END:variables
}
