package com.example.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dollar {

    private int amount;

    public void times(int multiply) {
        this.amount = amount * multiply;
    }
}
