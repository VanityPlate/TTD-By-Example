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
public class Sum implements Expression{
    
    public Money augend;
    public Money addend;
    
    public Sum(Money augend, Money addend){
        this.augend = augend;
        this.addend = addend;
    }
    
    public Money reduce(String to){
        return new Money(this.addend.amount + this.augend.amount, to);
    }
    
}
