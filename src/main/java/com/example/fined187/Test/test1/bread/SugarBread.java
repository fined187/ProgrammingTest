package com.example.fined187.Test.test1.bread;

import lombok.Getter;

@Getter
public class SugarBread extends Bread {

    private final String breadType = "sugar";
    private int sugar;

    public SugarBread(int flour, int getWater, int sugar) {
        super(flour, getWater);
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "breadType: " + breadType + "\n"
                + super.toString()
                + breadType + ": " + sugar + "\n";
    }
}
