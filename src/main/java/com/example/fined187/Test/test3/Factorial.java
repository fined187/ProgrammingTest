package com.example.fined187.Test.test3;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(100);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n<=1) {
            return 1;
        }
        return factorial(n-1) * n;
    }
}