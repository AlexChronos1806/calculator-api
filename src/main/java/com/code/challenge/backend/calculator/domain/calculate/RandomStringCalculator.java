package com.code.challenge.backend.calculator.domain.calculate;

import com.code.challenge.backend.calculator.domain.operation.OperationOptions;

public class RandomStringCalculator implements Calculable, Operable {
    @Override
    public double calculate() {
        return 0;
    }

    @Override
    public OperationOptions getType() {
        return OperationOptions.RANDOM_STRING;
    }
}
