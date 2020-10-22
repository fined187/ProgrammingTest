package com.example.fined187.Test.test1.bread;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ButterBread extends Bread {

    private final String breadType = "butter";
    private int butter;

    @Builder
    public ButterBread(int flour, int getWater, int butter) {
        super(flour, getWater);
        this.butter = butter;
    }

    @Override
    public String toString() {
        return "breadType: " + breadType + "\n"
                + super.toString()
                + breadType + ": " + butter + "\n";
    }
}
