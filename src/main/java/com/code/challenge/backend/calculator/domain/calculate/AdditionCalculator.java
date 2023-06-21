package com.code.challenge.backend.calculator.domain.calculate;

import com.code.challenge.backend.calculator.domain.operation.OperationOptions;

public class AdditionCalculator implements Operable, Calculable {

    private final double x;
    private final double y;

    public AdditionCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculate() {
        return x + y;
    }

    @Override
    public OperationOptions getType() {
        return OperationOptions.ADDITION;
    }
}
