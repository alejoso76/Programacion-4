/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class EstaAgotado implements IObserver{
    private static ArrayList<drogueria> drogas = new ArrayList<>();

    @Override
    public void update() {
        for(drogueria dro:drogas){
            if (dro.isAgotado()){
                System.out.println("El producto con ID "+dro.getID()+" tiene existencias bajas.");
                JOptionPane.showMessageDialog(null, "El producto con ID "+dro.getID()+" tiene existencias bajas.");
            }
            else{
                System.out.println("El producto con ID "+dro.getID()+" no tiene existencias bajas.");
                JOptionPane.showMessageDialog(null, "El producto con ID "+dro.getID()+" no tiene existencias bajas.");
            }
        }
    }

    @Override
    public void agregarDro(drogueria dro) {
        drogas.add(dro);
    }
    
}
