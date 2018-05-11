/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class administrador {
    private String Usuario, Clave;//se crea una objeto de la misma clase
    private static administrador admin;
    administrador() { }

    public String getUsuario() { return Usuario;}

    public void setUsuario(String Usuario) { this.Usuario = Usuario; }

    public String getClave() {return Clave;   }

    public void setClave(String Clave) { this.Clave = Clave; }
    
    //constructor privado, evita que se genere un constructor por defecto
    private administrador(String Usuario, String clave){
        this.Usuario=Usuario;
        this.Clave=Clave;
          }
    //creo el 
    public  boolean getSingletonInstance(String nombre,String Clave) throws SQLException, ClassNotFoundException{
        boolean v=false;
        if(admin==null){
            admin = new administrador(nombre, Clave); 
            ventanaPrincipal admi=new ventanaPrincipal();
            v=true;
              }
        else{
           
            System.out.println("No se puede crear otro administradorcon con nombre "+nombre+"\nporque ya existe un administrador.");
            v=false;
            
        }
        return v;
    }

    @Override
    public String toString() {
        return "administrador{" + "Usuario=" + Usuario + ", Clave=" + Clave + '}';
    }
}
