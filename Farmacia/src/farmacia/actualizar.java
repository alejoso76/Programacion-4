/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class actualizar implements modificarBD{

    @Override
    public void operacion(int id, String nombre, String descr, String lab, int prec, int cant, int form) {
           conexion nom=new conexion();
           Connection nombree= nom.conectar(); 
           //String nom, descri, lab, prec, cant, form, idi;
           //int precio, canti, formu, id;
           /*
                nom=nombre_med5.getText();
                descri=descripcion_med5.getText();
                lab=lab_med5.getText();
                prec=precio_med5.getText();
                precio=Integer.parseInt(prec);
                cant=cant_med5.getText();
                canti=Integer.parseInt(cant);
                form=form_med5.getText();
                formu=Integer.parseInt(form);
                */
           /*
                idi=id_med5.getText();
                id=Integer.parseInt(idi);
             */   
                String sql="UPDATE  productos(nombre, descripcion, laboratorio, precio, cantidad, formula_medica) VALUES(?,?,?,?,?,?) WHERE id_producto=id";
                String sSQL = "UPDATE productos SET nombre = ?, descripcion = ?, laboratorio = ?, precio = ?, cantidad = ?, formula_medica = ? WHERE id_producto = ?";
                
               try {
                   PreparedStatement pst=nombree.prepareStatement(sSQL);
                    pst.setString(1, nombre);
                    pst.setString(2, descr);
                    pst.setString(3, lab);
                    pst.setInt(4, prec);
                    pst.setInt(5, cant);
                    pst.setInt(6, form);
                    pst.setInt(7, id);
                   int n= pst.executeUpdate();
                   if (n>0){
                JOptionPane.showMessageDialog(null,"Medicamento actualizado correctamente.");
                       System.out.println("Medicamento actualizado correctamente.");
            }
                    
                   
               } catch (SQLException ex) {
                   Logger.getLogger(ventanaOpciones.class.getName()).log(Level.SEVERE, null, ex);
               }
    }

    
}
