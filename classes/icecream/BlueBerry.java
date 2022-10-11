/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.icecream;

import classes.IceCreamVarieties;

/**
 *
 * @author PATHUMI
 */
public class BlueBerry extends IceCreamVarieties{

    public BlueBerry() {
        description = "BlueBerry Ice Cream";
    }

    
    @Override
    public Double iceCreamPrice() {
       return 350.00;
    }
    
}
