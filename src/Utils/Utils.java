package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {
    public static String currentDateFormated () {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd'/'MM'/'yy HH:mm:ss");
        Date fechaform = new Date();
        String fecha = formatDate.format(fechaform);
        return fecha;
    }
    public static String currentDateWithMonth () {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd 'de' MMMM yyyy", new Locale("ES"));
        Date fechaform = new Date();
        String fecha = formatDate.format(fechaform);
        return fecha;
    }
    public static String formatDate(Date thisDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy'-'MM'-'dd HH:mm:ss");
        String fecha = formatDate.format(thisDate);
        return fecha; 
    }
    public static String formatLastMinute(Date thisDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy'-'MM'-'dd 23:59:59");
        String fecha = formatDate.format(thisDate);
        return fecha; 
    }
    public static String formatToTimestamp(Date thisDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy'-'MM'-'dd HH:mm:ss.S");
        String fecha = formatDate.format(thisDate);
        return fecha; 
    }
    public static String formatDateOnly(Date thisDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd'/'MM'/'yyyy");
        String fecha = formatDate.format(thisDate);
        return fecha; 
    }
    public static String formatDateForConfig(Date thisDate) {
        if(thisDate == null) {
            Date getDate = new Date();
            thisDate = getDate;
        } 
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy'-'MM'-'dd 00:00:00");
        String fecha = formatDate.format(thisDate);
        return fecha; 
    }
    public static String formatDateWithMonths(Date thisDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd' 'MMMM' 'yyyy HH:mm:ss");
        String fecha = formatDate.format(thisDate);
        return fecha; 
    }
    public static String objectToString(Object o) {
        String st;
        st = (String) o;
        return st;
    }
    public static String formatCurrency(int currencyLength, String value){
        String result = null;
        switch (currencyLength) {
            case 3:
                {
                    String afterComma = value.substring(1);
                    String beforeComma = value.substring(0,1);
                    result = beforeComma+"."+afterComma;
                    break;
                }
            case 4:
                {
                    String afterComma = value.substring(2);
                    String beforeComma = value.substring(0,2);
                    result = beforeComma+"."+afterComma;
                    break;
                }
            case 5:
                {
                    String afterComma = value.substring(3);
                    String beforeComma = value.substring(0,3);
                    result = beforeComma+"."+afterComma;
                    break;
                }
            case 6:
                {
                    String afterComma = value.substring(4);
                    String beforeComma = value.substring(0,4);
                    result = beforeComma+"."+afterComma;
                    break;
                }
            case 7:
                {
                    String afterComma = value.substring(5);
                    String beforeComma = value.substring(0,5);
                    result = beforeComma+"."+afterComma;
                    break;
                }
            case 8:
            {
                String afterComma = value.substring(6);
                String beforeComma = value.substring(0,6);
                result = beforeComma+"."+afterComma;
                break;
            }
            default:
                break;
        }
        return result;
    }
    
}
