/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.toppings;

import classes.IceCreamVarieties;
import classes.ToppingVarieties;

/**
 *
 * @author PATHUMI
 */
public class Sprinkles extends ToppingVarieties{
    
    IceCreamVarieties iceCreamVarieties; 

    public Sprinkles(IceCreamVarieties iceCreamVarieties) {
        this.iceCreamVarieties = iceCreamVarieties;
    }

    @Override
    public String getDescription() {
        return iceCreamVarieties.getDescription()+ " Sprinkles";
    }

    @Override
    public Double iceCreamPrice() {
        return iceCreamVarieties.iceCreamPrice()+ 200.00;
    }
    
}
