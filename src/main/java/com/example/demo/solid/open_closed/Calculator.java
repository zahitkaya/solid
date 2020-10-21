package com.example.demo.solid.open_closed;

import java.security.InvalidParameterException;

public class Calculator {
    public void applyCalculation(CalculationOperator calculationOperator) {
        if (calculationOperator == null) throw new InvalidParameterException("Hesaplama yapılamadı");
        else System.out.println(calculationOperator.calculate());
    }//Abstract classs sayesinde yeni bir işlem eklemek istediğimizde yeni bir metoda gerek kalmayacak.
}
