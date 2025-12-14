package com.wycash;

class Dollar extends Money {
    //private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount;
    }
}
