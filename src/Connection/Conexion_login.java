package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion_login {
    private Connection con;
    private Statement sentSQL;
    private ResultSet rst;
    public Conexion_login() throws ClassNotFoundException,SQLException,InstantiationException,IllegalAccessException{
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        conectar();
    }
    public void conectar() throws SQLException{
        String URL_bd="jdbc:mysql://localhost:3306/sigi_users?useUnicode=true&characterEncoding=utf-8";
        String user="root";
        String password = "dedox132";
        con=DriverManager.getConnection(URL_bd,user,password);
        sentSQL=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
    public ResultSet Consulta(String sql) throws SQLException{ 
        rst=sentSQL.executeQuery(sql);
        return rst;
    }
    public String ejecutar(String sql) throws SQLException{
        sentSQL.executeUpdate(sql);
        return "";
    }
    public void Cerrar() throws SQLException {
        this.con.close();
    }
}
