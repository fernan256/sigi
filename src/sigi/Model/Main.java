/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sigi.Model;

import sigi.Principal1;
import sigi.inicio;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author AkaMM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 //  Principal1 prin = new Principal1();
                 inicio prin = new inicio();   
                Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
                    //obtenemos el tamaño de la ventana  
                    Dimension ventana = prin.getSize();  
                    //para centrar la ventana lo hacemos con el siguiente calculo  
                    prin.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
                    prin.setVisible(true);
                    
            }
        });
    }

}
