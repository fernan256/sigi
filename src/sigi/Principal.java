package sigi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Principal extends javax.swing.JFrame {

    HiloProgreso hilo;

    public Principal() {
        //Método por defecto
        initComponents();
        iniciarSplash();
        //Creamos un objeto HiloProgreso al cual
        //le pasamos por parámetro la barra de progreso
        hilo = new HiloProgreso(progreso);
        //Iniciamos el Hilo
        hilo.start();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
                    //obtenemos el tamaño de la ventana  
                    Dimension ventana = this.getSize();  
                    //para centrar la ventana lo hacemos con el siguiente calculo  
                    this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2); 
        //Le damos tamaño y posición a nuestro Frame
//        this.setLocation(400, 200);
        this.setSize(291, 230);
     
        //Liberamos recursos
        hilo = null;
         
                    
    }

    public void iniciarSplash() {
        this.getjProgressBar1().setBorderPainted(true);
        this.getjProgressBar1().setForeground(new Color(50, 50, 153, 100));
        this.getjProgressBar1().setStringPainted(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        progreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(291, 211));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/View/logocor.png"))); // NOI18N

        jPanel1.setLayout(new java.awt.BorderLayout());

        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        jPanel1.add(progreso, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(213, 213, 213)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
if (progreso.getValue()==100){
    this.dispose();
//Aqui llamamos al JFrame que queremos que aparezca despues
    inicio ini = new inicio();
    
    Dimension pantall = Toolkit.getDefaultToolkit().getScreenSize();  
    //obtenemos el tamaño de la ventana  
    Dimension ventan = ini.getSize();  
    //para centrar la ventana lo hacemos con el siguiente calculo  
    ini.setLocation((pantall.width - ventan.width) / 2, (pantall.height - ventan.height) / 2);
    ini.setVisible(true);
}// TODO add your handling code here:
}//GEN-LAST:event_progresoStateChanged

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                
//                Principal prin = new Principal();
//                        prin.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JProgressBar getjProgressBar1() {
        return progreso;
    }
}
