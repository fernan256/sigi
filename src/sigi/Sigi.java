package sigi;
import javax.swing.*;

public class Sigi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
	    e.printStackTrace();
	}
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
	        new PantallaPrincipal().setVisible(true);
	    }
	});
    }   
}