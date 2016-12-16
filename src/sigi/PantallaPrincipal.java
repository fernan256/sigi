
package sigi;

import sigi.reports.ReportesVentas;
import Connection.Conexion;
import Connection.Conexion_login;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sigi.reports.ReporteDetalleVentas;
import sigi.reports.ReporteStock;

public class PantallaPrincipal extends javax.swing.JFrame {
    Conexion_login con_login;
    Conexion con;
    ResultSet rs;
    static int j=0; 
    static float total=0;
    int userId = Login.userId;
    private Dimension dim;
    
    public PantallaPrincipal() {         
        initComponents();
        showAdminName.setText("Admin: "+Login.userName);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        moduloVentaAdmin = new javax.swing.JButton();
        openHelp = new javax.swing.JButton();
        showAdminName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        changePasswordMenu = new javax.swing.JMenu();
        changePassword = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setName("pantallaPrincipal"); // NOI18N
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        desktopPane.setBackground(new java.awt.Color(188, 186, 186));
        desktopPane.setForeground(new java.awt.Color(255, 255, 255));
        desktopPane.setMaximumSize(new java.awt.Dimension(1680, 960));
        desktopPane.setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane);
        desktopPane.setBounds(240, 90, 740, 590);

        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Articulos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Stock");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Importar/Exportar Articulos");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ordenes de Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Orden de Compra");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Recepci�n Orden de Compra");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("BM Orden de Compra");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ajustes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Caja");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Cliente");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Importar/Exportar Clientes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Proveedor");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cuentas Corrientes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ABM Cuentas Corrientes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Tickets");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ver/Reimprimir Ticket");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Anular Ticket");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reportes Ventas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Detalle Ventas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reporte Stock");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Configuraciones");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Administrar BD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Configuracion Sistema");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTree1.setRootVisible(false);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 210, 540);

        moduloVentaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        moduloVentaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carritoVentas.png"))); // NOI18N
        moduloVentaAdmin.setText("Modulo Ventas");
        moduloVentaAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moduloVentaAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moduloVentaAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        moduloVentaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloVentaAdminActionPerformed(evt);
            }
        });
        getContentPane().add(moduloVentaAdmin);
        moduloVentaAdmin.setBounds(20, 5, 400, 65);

        openHelp.setBackground(new java.awt.Color(255, 255, 255));
        openHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.jpg"))); // NOI18N
        openHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openHelpActionPerformed(evt);
            }
        });
        getContentPane().add(openHelp);
        openHelp.setBounds(920, 10, 61, 58);

        showAdminName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        showAdminName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(showAdminName);
        showAdminName.setBounds(520, 30, 390, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 243, 253));
        jLabel1.setText("Modulos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 100, 248, 29);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue_3_by_astoyanov.png"))); // NOI18N
        backgroundImage.setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(-60, 0, 1130, 768);

        changePasswordMenu.setText("Modificar");

        changePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        changePassword.setText("Contrase�a");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        changePasswordMenu.add(changePassword);

        jMenuBar1.add(changePasswordMenu);

        exitMenu.setText("Salir");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Cerrar Sesi�n");
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
    
    BajaModificacionOrdenesCompras objIC1 = new BajaModificacionOrdenesCompras();
    AltaModificaionArticulos objIC2 = new AltaModificaionArticulos();
    BajaArticulos objIC3 = new BajaArticulos();
    AbmClientes objIC4 = new AbmClientes();
    AjusteCaja objIC5 = new AjusteCaja();
    BuscarFacturas objIC7 = new BuscarFacturas();
    Configuraciones objIC8 = new Configuraciones();
    CuentasCorrientes objIC9 = new CuentasCorrientes();
    OrdenesCompras objIC11 = new OrdenesCompras();
    Proveedores objIC13 = new Proveedores();
    Stock objIC14 = new Stock();
    ReportesVentas objIC15 = new ReportesVentas();
    BackupBd objIC16 = new BackupBd();
    VerReimprimirTickets objIC18 = new VerReimprimirTickets();
    RecepcionOrdenCompra objIC19 = new RecepcionOrdenCompra();
    ReporteDetalleVentas objIC20 = new ReporteDetalleVentas();
    ReporteStock objIC21 = new ReporteStock();
    ImportarExportarArticulos objIC22 = new ImportarExportarArticulos();
    ImportarExportarClientes objIC23 = new ImportarExportarClientes();

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        //Evitar el java.lang.NullPointerException del jtree cuando se hace clic fuera del mismo
        String menu = jTree1.getLastSelectedPathComponent().toString();
        switch(menu) {
            case "ABM Articulos":
                if(objIC2.isShowing() == true){
                    try {
                        objIC2.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC2.clearCrudArticlesFields();
                    desktopPane.add(objIC2);
                    objIC2.show();
                    objIC2.setSize(desktopPane.getSize());
                }
                break;
            case "Stock":
                if(objIC14.isShowing() == true){
                    try {
                        objIC14.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC14.clearStockFields();
                    desktopPane.add(objIC14);
                    objIC14.show();
                    objIC14.setSize(desktopPane.getSize());
                }
                break;
            case "Importar/Exportar Articulos":
                if(objIC22.isShowing() == true){
                    try {
                        objIC22.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC22.cleanImportExportFields();
                    desktopPane.add(objIC22);
                    objIC22.show();
                    objIC22.setSize(desktopPane.getSize());
                }
                break;
            case "Orden de Compra":
                if(objIC11.isShowing() == true){
                    try {
                        objIC11.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC11.clearOCFields();
                    desktopPane.add(objIC11);
                    objIC11.show();
                    objIC11.setSize(desktopPane.getSize());
                }
                break;
            case "Recepci�n Orden de Compra":
                if(objIC19.isShowing() == true){
                    try {
                        objIC19.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC19.clearReceptionPurchaseOrderFields();
                    desktopPane.add(objIC19);
                    objIC19.show();
                    objIC19.setSize(desktopPane.getSize());
                }
                break;
            case "BM Orden de Compra":
                if(objIC1.isShowing() == true){
                    try {
                        objIC1.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC1.clearUpdatePurchaseOrderFields();
                    desktopPane.add(objIC1);
                    objIC1.show();
                    objIC1.setSize(desktopPane.getSize());
                }
                break;
            case "Caja":
                if(objIC5.isShowing() == true){
                    try {
                        objIC5.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC5.clearAdjustmentPOSFields();
                    desktopPane.add(objIC5);
                    objIC5.show();
                    objIC5.setSize(desktopPane.getSize());
                }
                break;
            case "ABM Cliente":
                if(objIC4.isShowing() == true){
                    try {
                        objIC4.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC4.clearCrudCustomersFields();
                    desktopPane.add(objIC4);
                    objIC4.show();
                    objIC4.setSize(desktopPane.getSize());
                }
                break;
            case "Importar/Exportar Clientes":
                if(objIC23.isShowing() == true){
                    try {
                        objIC23.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC23.cleanImportExportClientsFields();
                    desktopPane.add(objIC23);
                    objIC23.show();
                    objIC23.setSize(desktopPane.getSize());
                }
                break;
            case "ABM Proveedor":
                if(objIC13.isShowing() == true){
                    try {
                        objIC13.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC13.clearSuppliersFields();
                    desktopPane.add(objIC13);
                    objIC13.show();
                    objIC13.setSize(desktopPane.getSize());
                }
                break;
            case "ABM Cuentas Corrientes":
                if(objIC9.isShowing() == true){
                    try {
                        objIC9.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC9.clearCtaCteFields();
                    desktopPane.add(objIC9);
                    objIC9.show();
                    objIC9.setSize(desktopPane.getSize());
                }
                break;
            case "Ver/Reimprimir Ticket":
                if(objIC18.isShowing() == true) {
                    try {
                        objIC18.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    objIC18.clearReprintTicket();
                    desktopPane.add(objIC18);
                    objIC18.show();
                    objIC18.setSize(desktopPane.getSize());
                }
                break;
            case "Anular Ticket":
                AnularTicket anular = new AnularTicket(this, true);
                anular.setVisible(true);
                break;
            case "Reportes Ventas":
                if(objIC15.isShowing() == true){
                    try {
                        objIC15.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC15.clearSalesReportFields();
                    desktopPane.add(objIC15);
                    objIC15.show();
                    objIC15.setSize(desktopPane.getSize());
                }
                break;
            case "Reporte Stock":
                if(objIC21.isShowing() == true){
                    try {
                        objIC21.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC21.clearStockReportFields();
                    desktopPane.add(objIC21);
                    objIC21.show();
                    objIC21.setSize(desktopPane.getSize());
                }
                break;
            case "Detalle Ventas":
                if(objIC20.isShowing() == true){
                    try {
                        objIC20.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC20.clearSalesDetailReportFields();
                    desktopPane.add(objIC20);
                    objIC20.show();
                    objIC20.setSize(desktopPane.getSize());
                }
                break;
            case "Administrar BD":
                if(objIC16.isShowing() == true){
                    try {
                        objIC16.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC16.clearBackUpFields();
                    desktopPane.add(objIC16);
                    objIC16.show();
                    objIC16.setSize(desktopPane.getSize());
                }
                break;
            case "Configuracion Sistema":
                if(objIC8.isShowing() == true){
                    try {
                        objIC8.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    objIC8.clearUserFields();
                    desktopPane.add(objIC8);
                    objIC8.show();
                    objIC8.setSize(desktopPane.getSize());
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jTree1MouseClicked
        
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
            moduloVentaAdmin.setEnabled(false);
            ModuloVenta venta = new ModuloVenta();
            venta.setVisible(true);
            con.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
        }                                                        
    }
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Esta seguro de cerrar la sesion actual?","Cerrar sesi�n",1)==0){
            this.dispose();
            Login login = new Login();
            Dimension pantall = Toolkit.getDefaultToolkit().getScreenSize();  
            Dimension ventan = login.getSize();  
            login.setLocation((pantall.width - ventan.width) / 2, (pantall.height - ventan.height) / 2);
            login.setVisible(true);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        ModificarContrasenia mod = new ModificarContrasenia();
        mod.setVisible(true);
    }//GEN-LAST:event_changePasswordActionPerformed

    private void moduloVentaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloVentaAdminActionPerformed
        try {
            con = new Conexion();
            con_login = new Conexion_login();
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
                            PantallaPrincipal.moduloVentaAdmin.setEnabled(false);
                            int option = JOptionPane.showOptionDialog(null, "Se hab�a hecho un cierre X de la caja, elegir una opci�n.", "Caja", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Abrir caja", "Hacer cierre"}, "Abrir caja");
                            if(option == 0) {
                                String updateSalesStatus = "UPDATE caja SET estado = 1 WHERE id_caja = "+Login.cajaId+"";
                                con.ejecutar(updateSalesStatus);
                                moduloVentaAdmin.setEnabled(false);
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
                    rs = con_login.Consulta(getUser);
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
            con_login.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moduloVentaAdminActionPerformed

    private void openHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openHelpActionPerformed
        AyudaAdmin help = new AyudaAdmin(this, true);
        help.setVisible(true);
    }//GEN-LAST:event_openHelpActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
                
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JMenuItem changePassword;
    private javax.swing.JMenu changePasswordMenu;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    public static javax.swing.JButton moduloVentaAdmin;
    private javax.swing.JButton openHelp;
    private javax.swing.JLabel showAdminName;
    // End of variables declaration//GEN-END:variables
  
}
