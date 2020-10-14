package com.example.test.money_tests;

import lombok.Getter;

@Getter
public abstract class Money {

    protected int amount;

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Frank(amount);
    }

    public abstract String currency();

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(obj.getClass());
    }
}
