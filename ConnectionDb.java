/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiGaji;

//import com.mysql.jdbc.Connection;

//import com.mysql.jdbc.Driver;
//import com.mysql.cj.xdevapi.Statement;
//import com.mysql.jdbc.Statement;
//import com.sun.jdi.connect.spi.Connection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;

//import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author USER
 */
public class ConnectionDb {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3307/data_karyawan";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    static PreparedStatement pst;
    
    public static Connection connectDatabase(){
        try{
            Class.forName(JDBC_DRIVER);
        } catch(ClassNotFoundException cnf) {
            
        } try {
            conn = (Connection) DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Koneksi database berhasil");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Koneksi database gagal");
        } catch(HeadlessException e) {
            
        }
        return conn;
    }
}