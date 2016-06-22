/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author Alex
 */
public class Dollar {
    
    private int amount;
    
    public Dollar(int amount){
        this.amount = amount;
    }
    
    public Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }
    
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }
}
