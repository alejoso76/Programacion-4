/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author mac
 */
public class ingresar implements modificarBD{

    

    @Override
    public void operacion(int id, String nombre, String descr, String lab, int prec, int cant, int form) {
        conexion nom=new conexion();
        Connection nombrec= nom.conectar();
        String sql;
            
            sql="INSERT INTO productos(nombre, descripcion, laboratorio, precio, cantidad, formula_medica) VALUES(?,?,?,?,?,?)";
        
        /*Statement ingreso;*/
        try {
          //PATRON STRATEGY
          // contexto ingre = new contexto();
           //ingre.operacion(0, nombre, descri, lab, precio, canti, formu, 1);
           
            PreparedStatement pst=nombrec.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, descr);
            pst.setString(3, lab);
            pst.setInt(4, prec);
            pst.setInt(5, cant);
            pst.setInt(6, form);
            
            int n=pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Medicamento ingresado correctamente."); 
                System.out.println("Medicamento ingresado correctamente.");
            }
               
            /*
            ingreso = nombrec.createStatement();
            ingreso.executeUpdate("INSERT INTO productos(nombre, descripcion, laboratorio, precio, cantidad, formula_medica) " + "VALUES (nombre, descr, lab, prec, cant, form)"); 
*/
        } catch (SQLException ex) {
            Logger.getLogger(ingresar.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
}
