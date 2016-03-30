/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigi;
import com.sun.awt.AWTUtilities;

import java.awt.Shape;

import java.awt.geom.RoundRectangle2D; 
import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
/**
 *
 * @author Gustavo
 */
public class SIGI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Construccion del arbol
       /* DefaultMutableTreeNode abuelo = new DefaultMutableTreeNode("abuelo");
        DefaultTreeModel modelo = new DefaultTreeModel(abuelo);
        JTree tree = new JTree(modelo);

        // Cambiamos los iconos
        DefaultTreeCellRenderer render= (DefaultTreeCellRenderer)tree.getCellRenderer();
        render.setLeafIcon(new ImageIcon("C:/Users/Gustavo/Desktop/Java/iconos/chat_32x32-32.ico"));
        //render.setOpenIcon(new ImageIcon("d:/hombre.gif"));
        //render.setClosedIcon(new ImageIcon("d:/viejo.gif"));
        
        // Construccion de los datos del arbol
        DefaultMutableTreeNode padre = new DefaultMutableTreeNode("padre");
        DefaultMutableTreeNode tio = new DefaultMutableTreeNode("tio");
        modelo.insertNodeInto(padre, abuelo, 0);
        modelo.insertNodeInto(tio, abuelo, 1);

        DefaultMutableTreeNode hijo = new DefaultMutableTreeNode("hijo");
        DefaultMutableTreeNode hija = new DefaultMutableTreeNode("hija");
        modelo.insertNodeInto(hijo, padre, 0);
        modelo.insertNodeInto(hija, padre, 1);

        // Construccion y visualizacion de la ventana
        JFrame v = new JFrame();
        JScrollPane scroll = new JScrollPane(tree);
        v.getContentPane().add(scroll);
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        */
         try {

	            JFrame.setDefaultLookAndFeelDecorated(true);

	            JDialog.setDefaultLookAndFeelDecorated(true);

	         //   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                     UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

	        } catch (Exception e) {

	            e.printStackTrace();

	        }

	        java.awt.EventQueue.invokeLater(new Runnable() {

	 

	            public void run() {

	                new ppal().setVisible(true);

	            }


	        });
    }
    
}
