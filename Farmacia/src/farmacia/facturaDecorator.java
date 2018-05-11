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
public abstract class facturaDecorator implements productos{
        private productos prod;
        
    public facturaDecorator(productos prod) {
        this.prod = prod;
    }
    
    public productos getProductos(){
        return this.prod;
    }

}
