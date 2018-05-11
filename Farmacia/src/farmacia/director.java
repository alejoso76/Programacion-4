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
public class director {
    private construirPersona construccionPersona;
    public void crearPersona(){
        construccionPersona.construirDatosIdentidad();
        construccionPersona.contruirDatosResidencia();
    }

    public void setConstruccionPersona(construirPersona cp) {
        this.construccionPersona = cp;
    }

    public persona getPersona() {
        return construccionPersona.getPersonita();
    }
    
}
