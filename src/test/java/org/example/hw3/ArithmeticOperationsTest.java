package org.example.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;




class ArithmeticOperationsTest {

    @Test
    @DisplayName("Проверка числа на чётность")
    void evenOddNumber() {
        assertThat(ArithmeticOperations.evenOddNumber(4)).isEqualTo(true);
        assertThat(ArithmeticOperations.evenOddNumber(-4)).isEqualTo(true);
        assertThat(ArithmeticOperations.evenOddNumber(5)).isEqualTo(false);
        assertThat(ArithmeticOperations.evenOddNumber(-5)).isEqualTo(false);
        assertThat(ArithmeticOperations.evenOddNumber(0)).isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка вхождения в диапазон от 25 до 100")
    void numberInInterval() {
        assertThat(ArithmeticOperations.numberInInterval(55)).isEqualTo(true);
        assertThat(ArithmeticOperations.numberInInterval(25)).isEqualTo(true);
        assertThat(ArithmeticOperations.numberInInterval(100)).isEqualTo(true);
        assertThat(ArithmeticOperations.numberInInterval(12)).isEqualTo(false);
        assertThat(ArithmeticOperations.numberInInterval(105)).isEqualTo(false);
    }
}