package Utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class ImprimirTicket {
    public static int printTicket (String ticket) {
        int result = 0;
        System.out.println(ticket);
        String ticketToByte;
        //Cogemos el servicio de impresion por defecto (impresora por defecto)
        PrintService service = PrintServiceLookup.lookupDefaultPrintService();
        //Le decimos el tipo de datos que vamos a enviar a la impresora
        //Tipo: bytes Subtipo: autodetectado
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        //Creamos un trabajo de impresion
        DocPrintJob pj = service.createPrintJob();
        //Nuestro trabajo de impresion envia una cadena de texto
        ticketToByte = new String(ticket);
        byte[] bytes;
        //Transformamos el texto a bytes que es lo que soporta la impresora
        bytes = ticketToByte.getBytes();
        //Creamos un documento (Como si fuese una hoja de Word para imprimir)
        Doc doc = new SimpleDoc(bytes,flavor,null);
        //PrintRequestAttributeSet aset = new HashPrintRequestHashAttributeSet();
        //aset.add(MediaSizeName.ISO_A4);
        //Obligado coger la excepcion PrintException
        //Mandamos a impremir el documento
        //PrintService[] pservices =PrintServiceLookup.lookupPrintServices(flavor, null);
        try {
            pj.print(doc, null);
        } catch (PrintException ex) {
            System.out.println("Error al imprimir: "+ex.getMessage());
            Logger.getLogger(ImprimirTicket.class.getName()).log(Level.SEVERE, null, ex);
            return result = 2;
        }
        return result = 1;
    }
}