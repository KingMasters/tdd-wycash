package com.wycash;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five= new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
//    void testMultiplication() {
//        Dollar five = new Dollar(5);
//        Dollar product = five.times(2);
//        //assertEquals(10, product.amount);
//        assertEquals(new Dollar(10), product);
//
//        product = five.times(3);
//        //assertEquals(15, product.amount);
//        assertEquals(new Dollar(15), product);
//    }

    @Test
    void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

    }
}
