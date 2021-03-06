/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tdd.Money;
import tdd.Expression;
import tdd.Bank;
import tdd.Sum;


/**
 *
 * @author Alex
 */
public class basic {
    
    public basic() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testReduceMoney(){
        System.out.println("* TDDJUnit4Test: testReduceMoney()");
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }
    
    @Test
    public void testPlusReturnsSum(){
        System.out.println("* TDDJUnit4Test: testPlusReturnsSum()");
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(sum.augend, five);
        assertEquals(sum.addend, five);
    }
    
    @Test
    public void testMultiplication(){
        System.out.println("* TDDJUnit4Test: testMultiplication()");
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test
    public void testEquality(){
        System.out.println("* TDDJUnit4Test: testEquality()");
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
    }
    
    @Test
    public void testFrancMultipliation(){
        System.out.println("* TDDJUnit4Test: testFrancMultiplication()");
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));        
    }
    
    @Test
    public void testReducedSum(){
        System.out.println("* TDDJUnit4Test: testReducedSum()");
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }
    
    @Test
    public void testSimpleAddition(){
        System.out.println("* TDDJUnit4Test: testSimpleAddition");
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }
    
    @Test
    public void testCurrency(){
        System.out.println("* TDDJUnit4Test: testCurrency()");
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
