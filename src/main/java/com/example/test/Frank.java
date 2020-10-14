package com.example.test;

import lombok.Getter;

@Getter
public class Frank extends Money {

    public Frank(int amount) {
        this.amount = amount;
    }

    public Frank times(int multiply) {
        return new Frank(amount * multiply);
    }


}
