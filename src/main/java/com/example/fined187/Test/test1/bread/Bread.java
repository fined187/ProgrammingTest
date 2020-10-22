package com.example.fined187.Test.test1.bread;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Bread {

    private int flour;
    private int getWater;

    @Override
    public String toString() {
        return "recipe\n"
                + "flour: " + flour + "\n"
                + "water: " + getWater + "\n";
    }
}
