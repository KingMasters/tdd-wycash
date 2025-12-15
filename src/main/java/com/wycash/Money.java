package com.wycash;

abstract class Money {
    protected int amount;

    abstract Money times(int multiplier);
    abstract String currency();

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && this.getClass() == money.getClass();
    }

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }
}
