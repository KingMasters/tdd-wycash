package com.wycash;

class Franc extends Money{
    //private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Money franc = (Money) object;
        return this.amount == franc.amount;
    }
}
