package org.example.hw6;

import java.util.List;

public final class Average implements IAverage {

    @Override
    public Double findAverage(final List<Number> listNumber) {
        return listNumber.stream().mapToDouble(y -> y.doubleValue()).average().getAsDouble();
    }
}
