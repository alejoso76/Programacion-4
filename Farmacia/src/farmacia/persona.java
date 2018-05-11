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
public class persona {
    public datosIdentidad identidad;
    public datosResidencia residencia;

    public datosIdentidad getIdentidad() {
        return identidad;
    }

    public datosResidencia getResidencia() {
        return residencia;
    }

    public void setIdentidad(datosIdentidad identidad) {
        this.identidad = identidad;
    }

    public void setResidencia(datosResidencia residencia) {
        this.residencia = residencia;
    }
    
    
}
