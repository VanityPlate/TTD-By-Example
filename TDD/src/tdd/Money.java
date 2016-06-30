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
public class Money implements Expression{
    protected int amount;
    protected String currency;
    
    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    
    public String toString(){
        return amount +  " " + currency;
    }
      
    public Money reduce(String to){
        return this;
    }
    
    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount 
                && this.currency.equals(money.currency);
    }
    
    public Expression plus(Money append){
        return new Sum(this, append);
    }
    
    static public Money dollar(int amount){
        return new Money(amount, "USD");
    }
    
    static public Money franc(int amount){
        return new Money(amount, "CHF");
    }
    
    public String currency(){
        return this.currency;
    }
    
    //ABSTRACT METHOD
    public Money times(int multiplier){
        return new Money(this.amount * multiplier, this.currency);
    }
}
