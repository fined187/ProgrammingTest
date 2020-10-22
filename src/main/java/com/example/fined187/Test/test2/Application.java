package com.example.fined187.Test.test2;

public class Application {
    public static void main(String[] args) {
        Calculation calculator = new Calculation();
        int out = calculator.add(4).add(5).subtract(3).out();
        System.out.println(out);
    }
}
