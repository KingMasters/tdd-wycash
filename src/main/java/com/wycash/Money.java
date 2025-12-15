package com.wycash;

class Money implements Expression{
    int amount;
    String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && currency.equals(money.currency);
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }
}
