/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.toppings;

import classes.IceCreamVarieties;
import classes.ToppingVarieties;
import gui.Toppings;

/**
 *
 * @author PATHUMI
 */
public class Oreos extends ToppingVarieties{
    
    IceCreamVarieties iceCreamVarieties; 

    public Oreos(IceCreamVarieties iceCreamVarieties) {
        this.iceCreamVarieties = iceCreamVarieties;
    }
    
    

    @Override
    public String getDescription() {
        return iceCreamVarieties.getDescription()+ " Oreo";
    }

    @Override
    public Double iceCreamPrice() {
        return iceCreamVarieties.iceCreamPrice()+ 300.00;
    }
    
}
