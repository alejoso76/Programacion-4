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
public class cliente extends construirPersona{
    String nombre1, nombre2, ape1, ape2, dir;
    int ced, tel;
    
    public cliente(String nombre1, String nombre2, String ape1, String ape2, String dir, int ced, int tel) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.dir = dir;
        this.ced = ced;
        this.tel = tel;
    }
    
    @Override
    public void construirDatosIdentidad() {
        datosIdentidad identidad=new datosIdentidad(nombre1, nombre2, ape1, ape2, ced);
         personita.setIdentidad(identidad);
    }

    @Override
    public void contruirDatosResidencia() {
        datosResidencia residencia=new datosResidencia(dir, tel);
         personita.setResidencia(residencia);    
    }

    public persona getPersonita() {
        return personita;
    }
    


    
}
