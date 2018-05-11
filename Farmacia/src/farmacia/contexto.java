/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author mac
 */
public class contexto {
    public void operacion(int idp, String nomp, String descp, String labp, int precp, int cantp, int formp, int operacion){
        modificarBD modBD=null;
        if(operacion==1)
        {
            //Ingreso
            modBD=new ingresar();
        }
        
       /* return modDB.operacion(idp, nomp, descp, labp, precp, cantp, formp);*/
    }
}
