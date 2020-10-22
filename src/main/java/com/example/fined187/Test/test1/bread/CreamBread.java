package com.example.fined187.Test.test1.bread;

import lombok.Getter;

@Getter
public class CreamBread extends Bread{

    private final String breadType = "cream";
    private int cream;

    public CreamBread(int flour, int getWater, int cream) {
        super(flour, getWater);
        this.cream = cream;
    }

    @Override
    public String toString() {
        return "breadType: " + breadType + "\n"
                + super.toString()
                + breadType + ": " + cream + "\n";
    }
}
