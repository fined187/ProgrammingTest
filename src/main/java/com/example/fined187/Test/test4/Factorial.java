package com.example.fined187.Test.test4;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial {

    public static Map<Integer, BigInteger> preprocess(int n) {

        Map<Integer, BigInteger> factorials = new HashMap<>();
        factorials.put(0, new BigInteger("1"));

        for(int i=1; i <= n; ++i) {
            BigInteger fact = new BigInteger(String.valueOf(i)).multiply(factorials.get(i-1));
            factorials.put(i, fact);
        }

        return factorials;
    }

    public static void main(String [] args) {
        Map<Integer, BigInteger> computedFactorials = preprocess(1000);
        System.out.println("Factorial of 1000 is " + computedFactorials.get(1000));
    }
}
