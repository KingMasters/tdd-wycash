package com.wycash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

  @Test
    void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }
    @Test
    void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    void testArrayEquals() {
        assertArrayEquals(new Object[] {"abc"}, new Object[] {"abc"});
    }

    @Test
    void testReduceSum() {
        Expression sum= new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank= new Bank();
        Money result= bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    void testPlusReturnsSum() {
        Money five= Money.dollar(5);
        Expression result= five.plus(five);
        Sum sum= (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum  = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.franc(1).currency);
    }

    @Test
    void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));

    }


}
