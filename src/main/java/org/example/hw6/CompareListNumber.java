package org.example.hw6;

import java.util.List;

public final class CompareListNumber {
    private List<Number> numberList1;
    private List<Number> numberList2;
    private IAverage average;

    public CompareListNumber(final List<Number> numberList1, final List<Number> numberList2, final IAverage average) {
        this.numberList1 = numberList1;
        this.numberList2 = numberList2;
        this.average = average;
    }

    String compare() {
        if (average.findAverage(numberList1) > average.findAverage(numberList2)) {
            return "Первый список имеет большее среднее значение";
        } else if (average.findAverage(numberList1) < average.findAverage(numberList2)) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
