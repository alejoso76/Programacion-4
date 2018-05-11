/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class productoX implements drogueria{
    public int ID;
    public boolean agotado = false;
    private static ArrayList<IObserver> observadores = new ArrayList<>();

    public productoX(int ID) {
        this.ID = ID;
    }


    @Override
    public void attach(IObserver observador) {
        observadores.add(observador);
    }

    @Override
    public void dettach(IObserver observador) {
        observadores.remove(observador);
    }
    
    @Override
    public void notifyObserver() {
        for (IObserver ob: observadores){
            ob.update();
        }
    }

    
    public void setAgotado(boolean valor) {
        
        this.agotado=valor;
    }

    
    public boolean isAgotado() {
        return agotado;
    }

    
    public int getID() {
        return ID;    
    }
    
}
