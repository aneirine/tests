package com.example.test.money_tests;

import lombok.Getter;

@Getter
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiply) {
        return new Dollar(amount * multiply);
    }


    @Override
    public String currency() {
        return "USD";
    }
}
