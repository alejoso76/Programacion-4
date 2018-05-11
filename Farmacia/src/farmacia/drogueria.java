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
public interface drogueria {
    public void attach(IObserver observador);
    public void dettach(IObserver observador);
    public void notifyObserver();
    public void setAgotado(boolean valor);
    public boolean isAgotado();
    public int getID();

}
