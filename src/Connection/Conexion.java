package Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private Connection con;
    private Statement  sentSQL;
    private ResultSet rst;
    PreparedStatement ps = null;


    public Conexion() throws ClassNotFoundException,SQLException,InstantiationException,IllegalAccessException{
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        conectar();
    }

    public void conectar() throws SQLException{
        String URL_bd="jdbc:mysql://localhost:3306/sigi?useUnicode=true&characterEncoding=utf-8";
        String user="root";
        String password="";
        con=DriverManager.getConnection(URL_bd,user,password);
        sentSQL=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
    
    public ResultSet ConectarBD(String usuario, String pass) throws SQLException{
       rst=sentSQL.executeQuery("select * from usuarios where usuario='root' AND password='dito@974';");
       return rst;
    }
  
    public String ejecutar(String sql) throws SQLException{
        sentSQL.executeUpdate(sql);
        return "";
    }
     
    public ResultSet Consulta(String sql) throws SQLException{ 
        rst=sentSQL.executeQuery(sql);
        return rst;
    }
     
    public ResultSet find (String sql, String s) throws SQLException{
        ps = con.prepareStatement(sql);
        ps.setString(1,s);
        rst = ps.executeQuery();
        return rst;
    }

    public ResultSet getDb() throws SQLException {
        ps = con.prepareStatement("show databases");
        rst = ps.executeQuery();
        System.out.println(rst);
        return rst;
    }
    
    public Connection getConextion() {
        return this.con;
    }
    
    public void Cerrar() throws SQLException {
        this.con.close();
    }
    public void Comandos(String com){
        try{
            sentSQL = (Statement) con.createStatement();
            sentSQL.execute(com);
            sentSQL.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

