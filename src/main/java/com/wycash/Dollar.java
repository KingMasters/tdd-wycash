package com.wycash;

class Dollar extends Money {
    //private int amount;
    private String currency;

    String currency() {
        return currency;
    }

    Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
