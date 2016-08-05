package Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sigi.CierreZ;
import sigi.Login;

public class ImprimirCierre {
    public static String printClosingDay(String ticketFrom, String ticketTo, String closeNumber, String ticketTotal, String cashTotal, String ctaTotal, String discountsTotal, String cancelTotal, String returnTotal, String cashWithdrawalTotal, String systemTotal, String totalEndDay, String difference, int adjustmentNumber, String totalAdjustment, String adjustmentMotive, String adjustmentDate, String providerPayment){
        String salto = System.getProperty("line.separator");
        String returnValue = "0";
        String ticketHeader = ""+Login.companyName+
                                salto+"C.U.I.T.: "+Login.companyCuilCuit+
                                salto+"Ing. Brutos: "+Login.companyIg+
                                salto+Login.companyAddress+" N° "+Login.companyAddressNumber+
                                salto+Login.companyDepartment+" - "+Login.companyProvince+" - "+Login.companyCp+
                                salto+"Inicio Actividades: "+Utils.formatDateOnly(Login.companyInitActivities)+
                                salto+"--------------------------------"+
                                salto+"Cierre Nro: "+closeNumber+
                                salto+"Fecha: "+Utils.currentDateFormated()+
                                salto+"--------------------------------";
        String adjustmentTicket = salto+"--------------------------------"+
                            salto+"\t"+"AJUSTE"+
                            salto+salto+"  Nro Ajuste:\t\t"+adjustmentNumber+""+
                            salto+"  Fecha: "+adjustmentDate+
                            salto+"  Valor Ajustado:\t\t"+totalAdjustment+""+
                            salto+"  Motivo Ajuste:\t\t"+adjustmentMotive+""+
                            salto+"--------------------------------";
        String closeTicketBody = ticketHeader+salto+"Usuario: "+Login.userName+
                              salto+"--------------------------------"+
                              salto+"\t"+"TICKETS EMITIDOS"+
                              salto+"  Desde:\t\t"+ticketFrom+
                              salto+"  Hasta:\t\t"+ticketTo+
                              salto+salto+"  TOTAL TICKETS:\t"+ticketTotal+
                              salto+"--------------------------------"+
                              salto+"\t"+"MOVIMIENTOS DE CAJA"+
                              salto+salto+"  Efectivo:\t\t"+cashTotal+
                              salto+"  Cuentas Corrientes:\t"+ctaTotal+
                              salto+"  Descuentos:\t\t"+discountsTotal+
                              salto+"  Anulaciones:\t\t"+cancelTotal+
                              salto+"  Devoluciones:\t\t"+returnTotal+
                              salto+"  Retiro Efectivo:\t"+cashWithdrawalTotal+
                              salto+"  Pago Prov Caja:\t"+providerPayment+
                              salto+"--------------------------------"+
                              salto+"\t"+"TOTALES"+
                              salto+salto+"  Total del sistema:\t"+systemTotal+
                              salto+"  Recuento de Caja:\t"+totalEndDay+
                              salto+"  Diferencia:\t\t"+difference+""+
                              salto+"--------------------------------";
        String closeTicket = "";
        if(adjustmentNumber != 0) {
            closeTicket = closeTicketBody + adjustmentTicket;
        } else {
            closeTicket = closeTicketBody;
        }
        Object[] printOption = {"Imprimir", "Guardar"};
        int printCloseData = JOptionPane.showOptionDialog(null, closeTicket, "Cierre Z", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE, null, printOption, printOption[0]);
        if(printCloseData == 0){
            int print = ImprimirTicket.printTicket(closeTicket);
            if(print == 1){
                closeTicket = "";
                JOptionPane.showMessageDialog(null, "Impresión correcta del Cierre Z");
            } else {
                System.out.println(print);
            }
        } else {
            JFileChooser dialog = new JFileChooser();
            int save = dialog.showSaveDialog(dialog);
            String savedDirection = "";
            if (save == JFileChooser.APPROVE_OPTION) {
                File dir = dialog.getSelectedFile().getAbsoluteFile();
                savedDirection = dir.toString();
                try{
                    FileWriter saveFile = new FileWriter(dir+".txt");
                    BufferedWriter bw = new BufferedWriter(saveFile);
                    PrintWriter wr = new PrintWriter(bw);  
                    wr.write(closeTicket);
                    wr.close();
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(CierreZ.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Se guardo el Cierre Z en: " + savedDirection +".txt");
            } else {
                JOptionPane.showMessageDialog(null, "Se cancelo la operación.");
            }
        }
        return returnValue;
    }
}
