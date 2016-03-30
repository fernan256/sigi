/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigi;

/**
 *
 * @author Gustavo
 */
import Connection.Conexion;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;


public class fotoclass {
    //conectate con;
    private Image data;
    Conexion con,query;
    ResultSet rs;
  public fotoclass (){
   // con = new conectar();
  } 
      
public void guardarfoto(String nombre, String foto) {
        {
            FileInputStream fis = null;
            try {
                File file = new File(foto);
                fis = new FileInputStream(file);

                PreparedStatement pstm = con.ConectarBD(foto, foto).prepareStatement("insert into " + 
                        " fotos(nombre, foto) " + " values(?,?)");
                pstm.setString(1, nombre);                
                pstm.setBinaryStream(2, fis,(int) file.length());
                pstm.execute();
                pstm.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(fotoclass.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException e) {
                System.out.println(e);
            } finally {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(fotoclass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
   }

//metodo  que dado un parametro "id" realiza una consulta y devuelve como resultado
// una imagen
 public Image getfoto(String id){         
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " foto " +
            " FROM fotos " +
            " where id = ? ");
         pstm.setString(1, id);
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            //se lee la cadena de bytes de la base de datos
            byte[] b = res.getBytes("foto");
            // esta cadena de bytes sera convertida en una imagen
            data = ConvertirImagen(b);            
            i++;
         }
         res.close();
          } catch (IOException ex) {
            Logger.getLogger(fotoclass.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException e){
         System.out.println(e);
    }        
    return data;     
 }
 
 //metodo que dada una cadena de bytes la convierte en una imagen con extension jpeg
 private Image ConvertirImagen(byte[] bytes) throws IOException {
    ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
    Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
    ImageReader reader = (ImageReader) readers.next();
    Object source = bis; // File or InputStream
    ImageInputStream iis = ImageIO.createImageInputStream(source);
    reader.setInput(iis, true);
    ImageReadParam param = reader.getDefaultReadParam();
    return reader.read(0, param);
 } 
}
