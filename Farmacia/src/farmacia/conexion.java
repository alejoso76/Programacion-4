/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class conexion {
   Connection conexion;
    
    public Connection conectar(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia1","root","");
        System.out.println("Conexión exitosa.");
    }   catch (ClassNotFoundException | SQLException e) {
        System.out.print(e.getMessage());
    }      
        return conexion;   
    } 
}
