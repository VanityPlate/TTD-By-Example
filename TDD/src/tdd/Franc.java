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
public class Franc extends Money{
       
    public Franc(int amount, String currency){
        super(amount, currency);
    }
    
    public Money times(int multiplier){
        return Money.franc(this.amount * multiplier);
    }
}