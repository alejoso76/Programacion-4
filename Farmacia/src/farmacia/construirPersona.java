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
public abstract class construirPersona {
    protected persona personita;
    
    public construirPersona() {
        personita = new persona();
    }

    public persona getPersonita() {
        return this.personita;
    }
    public abstract void construirDatosIdentidad();
    public abstract void contruirDatosResidencia();
}
