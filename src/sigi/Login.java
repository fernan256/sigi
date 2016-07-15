package sigi;

import Connection.Conexion;
import Utils.ConfigVar;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Conexion con;
    ResultSet rs;
    String rol;
    public static Conexion con2;
    public static ResultSet rs2;
    public static int userRol;
    public static int userId;
    public static String userName;
    public static int status = 0, compareIds = 0, cajaId = 0, initialCash = 0, printStatus = 0;
    public static String fecha = null, companyName = null, companyCuilCuit = null, companyAddress = null, companyProvince = null, companyDepartment = null, companyCp = null, companyIg = null, companyAddressNumber = null;
    public static Date companyInitActivities = null;
    
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        loginBton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        info = new javax.swing.JMenu();
        acerca = new javax.swing.JMenuItem();

        jLabel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel1.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar al Sistema");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(274, 226));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Usuario");

        loginUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginUserKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Contraseña");

        loginBton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginBton.setText("Ingresar");
        loginBton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginBtonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginBton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(loginBton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        archivo.setText("Archivo");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        jMenuBar1.add(archivo);

        info.setText("Info");

        acerca.setText("Acerca de...");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        info.add(acerca);

        jMenuBar1.add(info);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "\n\n www.systec.com.ar \n Soluciones en Software y WEB\n SiGI V1.0\n\n ");
    }//GEN-LAST:event_acercaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Esta seguro de cerrarla?","Cerrar aplicación",1)==0){
            System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

    private void loginBtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginBtonKeyReleased
        String usuario = loginUser.getText();
        String pass = Arrays.toString(passWord.getPassword());
        String user ="", password="", id="", nombres = "", apellidos = "";
        if(usuario.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
        } else{
            try {
                con = new Conexion();
                String getSalt = "SELECT id_usuario, password, salt FROM usuarios WHERE user = '"+usuario+"'";
                String salt = "";
                rs = con.Consulta(getSalt);
                while(rs.next()){
                    id = rs.getString("id_usuario");
                    salt = rs.getString("salt");
                    password = rs.getString("password");
                }
                if(id.equals("")){
                    JOptionPane.showMessageDialog(null,"Usuario No Encontrado");
                    loginUser.setText("");
                    passWord.setText("");
                    loginUser.requestFocus(true);
                    loginUser.selectAll();
                }else{
                    String comparePass = ConfigVar.get_SHA_1_Pass(pass, salt);
                    if (comparePass.equals(password)) {
                        String getUserInfo = "SELECT nombres, apellidos, user, roles_id_roles FROM usuarios WHERE id_usuario = "+id+"";
                        rs = con.Consulta(getUserInfo);
                        while (rs.next()){       
                            nombres = rs.getString("nombres");
                            apellidos = rs.getString("apellidos");
                            user = rs.getString("user");
                            rol = rs.getString("roles_id_roles");
                        }
                        userId = Integer.parseInt(id);
                        userRol = Integer.parseInt(rol);
                        userName = nombres + " " + apellidos;
                        getStatus();
                        cashAndPrintStatus();
                        companyData();
                        if(userRol==1){
                            PantallaPrincipal inter = new PantallaPrincipal();
                           //JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Ha ingresado como: Administrador");
                            inter.setVisible(true);
                            this.dispose();
                        } else if(userRol==2){
                            PantallaPrincipalVendedor vendorView = new PantallaPrincipalVendedor();
                            //JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Has entrado al sistema como: Vendedor");
                            vendorView.setVisible(true);
                            this.dispose();
                        }
                    } else{
                        JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrecta");
                        loginUser.setText("");
                        passWord.setText("");
                        loginUser.requestFocus(true);
                        loginUser.selectAll();
                    }
                }
                con.Cerrar();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginBtonKeyReleased

    private void loginUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUserKeyReleased
        if((evt.getKeyCode() == KeyEvent.VK_TAB)) {
            passWord.requestFocus(true);
            passWord.selectAll();
        }
    }//GEN-LAST:event_loginUserKeyReleased
    
    public static void getStatus() {
        try {
            con2 = new Conexion();
            String getLastOpening = "SELECT id_caja, estado, id_usuario, fecha_apertura FROM caja WHERE estado = 1 OR estado = 3";
            rs2 = con2.Consulta(getLastOpening);
            int numRows = 0;
            while(rs2.next()) {
                ++numRows;
                status = rs2.getInt("estado");
                compareIds = rs2.getInt("id_usuario");
                fecha = rs2.getString("fecha_apertura");
                cajaId = rs2.getInt("id_caja");
            }
            if(numRows == 0) {
                String getLastOpen = "SELECT MAX(id_caja) AS id FROM caja";
                rs2 = con2.Consulta(getLastOpen);
                int idCaja = 0;
                while(rs2.next()) {
                    idCaja = rs2.getInt("id");
                }
                String getLastStatus = "SELECT id_caja, estado, id_usuario, fecha_apertura FROM caja WHERE id_caja = "+idCaja+"";
                rs2 = con2.Consulta(getLastStatus);
                while(rs2.next()){
                    status = rs2.getInt("estado");
                    compareIds = rs2.getInt("id_usuario");
                    fecha = rs2.getString("fecha_apertura");
                }
            }
            con2.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void cashAndPrintStatus(){
        try{
            con2 = new Conexion();
            String getInitialConfig = "select * from configuracion_inicial";
            rs2 = con2.Consulta(getInitialConfig);
            while(rs2.next()){
                initialCash = rs2.getInt("caja_inicial");
                printStatus = rs2.getInt("print_status");
            }
            con2.Cerrar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void companyData() throws ClassNotFoundException{
        try {
            con2 = new Conexion();
            String getTicketInfo = "select t1.nombre, t1.direccion, t1.direccion_numero, t1.departamento, t1.provincia, t1.codigo_postal, t2.cuit_cuil, t2.ingresos_brutos, t2.fecha_inicio_actividad from empresa t1 inner join datos_fiscales t2 where t1.id_empresa = 1 AND t2.id_datos_fiscales = 1";
            rs2 = con2.Consulta(getTicketInfo);
            while(rs2.next()) {
                companyName = rs2.getString("nombre");
                companyAddress = rs2.getString("direccion");
                companyDepartment= rs2.getString("departamento");
                companyCuilCuit = rs2.getString("cuit_cuil");
                companyProvince = rs2.getString("provincia");
                companyCp = rs2.getString("codigo_postal");
                companyIg = rs2.getString("ingresos_brutos");
                companyInitActivities = rs2.getDate("fecha_inicio_actividad");
                companyAddressNumber = rs2.getString("direccion_numero");
            }
            con2.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
    * @param args the command line arguments
    */
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acerca;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenu info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBton;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables

}
