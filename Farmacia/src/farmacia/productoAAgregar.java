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
public class productoAAgregar extends facturaDecorator{
    private productos prod;
    String nombre;
    int precio, canti;

    public productoAAgregar(String nombre, int precio, int canti, productos prod) {
        super(prod);
        this.prod = prod;
        this.nombre = nombre;
        this.precio = precio;
        this.canti = canti;
    }
    




    @Override
    public String getNombre() {
        return prod.getNombre() + nombre;
    }

    @Override
    public int getPrecio() {
        return prod.getPrecio()+precio;
    }

    @Override
    public int getCantidad() {
        return prod.getCantidad()+canti;
    }
    
}
