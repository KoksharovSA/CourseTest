package org.example.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculateDiscount() {
        assertThat(Calculator.calculateDiscount(10.0,20.0)).isEqualTo(8.0);
        assertThatThrownBy(()->{Calculator.calculateDiscount(10.0,120.0);}).isInstanceOf(ArithmeticException.class);
    }
}