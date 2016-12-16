package sigi;

import Connection.Conexion;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class BackupBd extends javax.swing.JInternalFrame {
    Conexion con;
    ResultSet rs;
    JFileChooser chooser = new JFileChooser();
    Conexion mysql;
    String user = "root";
    String password = "dedox132";
    String bd = "sigi";
    String backup = "";
    String dbName = "sigi";
    private String fecha;
    
    public BackupBd() {
        initComponents();
        Calendar c = Calendar.getInstance();
        fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respaldoBd = new javax.swing.JButton();
        restaurarBd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        restoreRout = new javax.swing.JTextField();
        examinFile = new javax.swing.JButton();
        saveRoute = new javax.swing.JTextField();
        selectFolder = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        respaldoBd.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        respaldoBd.setText("Respaldar BD");
        respaldoBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respaldoBdActionPerformed(evt);
            }
        });

        restaurarBd.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        restaurarBd.setText("Restaurar BD");
        restaurarBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarBdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Respaldo y Restauración Base de Datos");

        restoreRout.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        examinFile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        examinFile.setText("...");
        examinFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinFileActionPerformed(evt);
            }
        });

        saveRoute.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        selectFolder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectFolder.setText("...");
        selectFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(restoreRout)
                            .addComponent(saveRoute, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(examinFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(respaldoBd, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(restaurarBd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respaldoBd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectFolder)
                    .addComponent(saveRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examinFile)
                    .addComponent(restaurarBd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restoreRout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(459, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respaldoBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respaldoBdActionPerformed
       createBackup();
    }//GEN-LAST:event_respaldoBdActionPerformed

    private void restaurarBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarBdActionPerformed
        if(restoreRout.getText().length() > 0){
            try{
                File f;
                f = new File(restoreRout.getText());
                String path = f.getAbsolutePath();
                Object[] options = {"Aceptar", "Cancelar"};
                int routeToRestore = JOptionPane.showOptionDialog(null, "Confirmar Base de Datos: "+restoreRout.getText(), "Restaurar Base de Datos", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if(routeToRestore == 0){
                    //mysql.Comandos("drop table ajuste_caja, anular_ticket, caja, cierre_caja, cuentas_corrientes, clientes, movimiento_stock, oc_productos, ordenes_compra, devoluciones, detalle_ajuste_stock, detalle_venta, ventas, descripcion_articulos, stock, proveedores, retiro_dinero;");
                    mysql = new Conexion();
                    mysql.Comandos("drop database if exists sigi;");
                    mysql.Comandos("create database sigi;");
                    restoreDB(dbName, user, password, path);
                    clearBackUpFields();
                    mysql.Cerrar();
                }else{
                    JOptionPane.showMessageDialog(null, "Se cancelo la operación");
                    clearBackUpFields();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BackupBd.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BackupBd.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(BackupBd.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(BackupBd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_restaurarBdActionPerformed

    private void examinFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinFileActionPerformed
        JFileChooser select = new JFileChooser(System.getProperty("user.dir"));
        select.setDialogTitle("Seleccionar ruta");
        File f;
        int returnVal = select.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            f = select.getSelectedFile();
            String cad = f.getAbsolutePath();
            restoreRout.setText(cad);
        }
        
    }//GEN-LAST:event_examinFileActionPerformed

    private void selectFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFolderActionPerformed
        JFileChooser select = new JFileChooser(System.getProperty("user.dir"));
        select.setDialogTitle("Seleccionar ruta");
        File f;
        int returnVal = select.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            f = select.getSelectedFile();
            String cad = f.getAbsolutePath();
            saveRoute.setText(cad+"_"+fecha+".sql");
        }
    }//GEN-LAST:event_selectFolderActionPerformed
    private void createBackup () {
        Object[] options = {"Aceptar", "Cancelar"};
        int routeToSave = JOptionPane.showOptionDialog(null, "Confirmar ruta: "+saveRoute.getText(), "Respaldo de Base de Datos", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if(routeToSave == 0){
            try{
                con = new Conexion();
                Runtime runtime = Runtime.getRuntime();
                File backupFile = new File(saveRoute.getText());
                FileWriter fw = new FileWriter(backupFile);
                Process child = runtime.exec("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysqldump --opt --password=dedox132 --user=root --databases sigi -R");
                InputStreamReader irs = new InputStreamReader (child.getInputStream());
                BufferedReader br = new BufferedReader (irs);
                
                String line;
                while( (line = br.readLine()) != null) {
                    fw.write(line + "\n");
                }
                fw.close();
                irs.close();
                br.close();

            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException | IOException ex) {
                Logger.getLogger(ModuloVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Archivo "+saveRoute.getText()+" generado", "Verificar", JOptionPane.INFORMATION_MESSAGE);
            clearBackUpFields();
        }else{
            JOptionPane.showMessageDialog(null, "Se cancelo la operación");
            clearBackUpFields();
        }
    }
    public static boolean restoreDB(String dbName, String dbUserName, String dbPassword, String source) {
        String[] executeCmd = new String[]{"C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName,"-e", " source "+source};  
        Process runtimeProcess;  
        try { 
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);  
            int processComplete = runtimeProcess.waitFor();  
            if (processComplete == 0) {  
                JOptionPane.showMessageDialog(null, "Restauración correcta de la Base de Datos "+source);
                return true;  
            } else {  
                JOptionPane.showMessageDialog(null, "No se pudo realizar la restauración de la Base de Datos "+source);
            }  
        } catch (IOException | InterruptedException | HeadlessException ex) {
            ex.printStackTrace();
        }  
        return false;  
    }
    public void clearBackUpFields(){
        restoreRout.setText("");
        saveRoute.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton examinFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton respaldoBd;
    private javax.swing.JButton restaurarBd;
    private javax.swing.JTextField restoreRout;
    private javax.swing.JTextField saveRoute;
    private javax.swing.JButton selectFolder;
    // End of variables declaration//GEN-END:variables
}
