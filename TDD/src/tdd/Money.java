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
public abstract class Money {
    protected int amount;
    protected String currency;
    
    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    
    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount 
                && this.getClass().equals(money.getClass());
    }
    
    static public Dollar dollar(int amount){
        return new Dollar(amount, "USD");
    }
    
    static public Franc franc(int amount){
        return new Franc(amount, "CHF");
    }
    
    public String currency(){
        return this.currency;
    }
    
    //ABSTRACT METHOD
    abstract public Money times(int multiplier);
}
