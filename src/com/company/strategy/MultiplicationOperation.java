package com.company.strategy;

public class MultiplicationOperation implements Operation {
    @Override
    public int result(int a, int b) {
        if(a > 10 || b > 10) throw new RuntimeException("Числа выходят за диапазон");
        else if(a < 1 || b < 1) throw new RuntimeException("Числа выходят за диапазон");
        return a * b;
    }
}
