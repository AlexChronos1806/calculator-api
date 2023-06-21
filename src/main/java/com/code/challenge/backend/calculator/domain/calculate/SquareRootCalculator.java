package com.code.challenge.backend.calculator.domain.calculate;

import com.code.challenge.backend.calculator.domain.operation.OperationOptions;

public class SquareRootCalculator implements Calculable, Operable {

    private final double x;

    public SquareRootCalculator(double x) {
        this.x = x;
    }

    @Override
    public double calculate() {
        return Math.sqrt(x);
    }

    @Override
    public OperationOptions getType() {
        return OperationOptions.SQUARE_ROOT;
    }
}
