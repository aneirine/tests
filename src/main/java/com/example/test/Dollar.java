package com.example.test;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Dollar {

    private int amount;

    public Dollar times(int multiply) {
        return new Dollar(amount * multiply);
    }
}
