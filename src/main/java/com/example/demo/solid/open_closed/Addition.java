package com.example.demo.solid.open_closed;

public class Addition implements CalculationOperator {
    private final int number1;
    private final int number2;


    public Addition(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    @Override
    public int calculate() {
        return number1 + number2;
    }
}
