package org.example.hw6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CompareListNumberTest {
    static IAverage average;
    static List<Number> list1;
    static List<Number> list2;
    static List<Number> list3;
    static List<Number> list4;

    @BeforeAll
    static void setData() {
        average = new Average();
        list1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list3 = Arrays.asList(1.0, 2, 3, 4, 5, 6, 7.8);
        list4 = null;
    }

    @Test
    @DisplayName("Первое значение больше второго")
    void compare1() {
        assertThat(new CompareListNumber(list1, list3, new Average()).compare())
                .isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    @DisplayName("Второе значение больше первого")
    void compare2() {
        assertThat(new CompareListNumber(list3, list1, new Average()).compare())
                .isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    @DisplayName("Средние значения равны")
    void compare3() {
        assertThat(new CompareListNumber(list1, list2, new Average()).compare())
                .isEqualTo("Средние значения равны");
    }

    @Test
    @DisplayName("Один массив равен null")
    void compare4() {
        assertThatThrownBy(() -> {
            new CompareListNumber(list4, list2, new Average()).compare();
        }).isInstanceOf(NullPointerException.class);
    }
}