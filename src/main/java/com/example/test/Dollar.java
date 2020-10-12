package com.example.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dollar {

    private int amount;

    public Dollar times(int multiply) {
        return new Dollar(amount * multiply);
    }
}
