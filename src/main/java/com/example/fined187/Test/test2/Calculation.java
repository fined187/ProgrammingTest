package com.example.fined187.Test.test2;

public class Calculation {

    private int value;

    public Calculation() {
        this.value = 0;
    }

    public Calculation add(int num) {
        this.value += num;
        return this;
    }

    public Calculation subtract(int num) {
        this.value -= num;
        return this;
    }

    public int out() {
        return this.value;
    }
}