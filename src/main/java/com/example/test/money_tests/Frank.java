package com.example.test.money_tests;

import lombok.Getter;

@Getter
public class Frank extends Money {

    public Frank(int amount) {
        this.amount = amount;
    }

    public Frank times(int multiply) {
        return new Frank(amount * multiply);
    }


    @Override
    protected String currency() {
        return "CHF";
    }
}
