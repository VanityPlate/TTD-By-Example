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
public class Money {
    protected int amount;
    
    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount;
    }
}
