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
public class Bank {
    
    public Money reduce(Expression source, String to){
        return source.reduce(to);
    }
    
}
