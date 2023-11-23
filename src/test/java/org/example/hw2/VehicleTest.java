package org.example.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {
    Car testCar = new Car("BMW", "m5", 2005);
    Motorcycle testMotorcycle = new Motorcycle("Yamaha", "R1", 2020);
    @Test
    @DisplayName("Проверка принадлежности к классу Vehicle")
    void classCar(){
        assertThat(testCar).isInstanceOf(Vehicle.class);
    }
    @Test
    @DisplayName("Проверка колёс автомобиля")
    void wheelsCar(){
        assertThat(testCar.getNumWheels()).isEqualTo(4);
    }
    @Test
    @DisplayName("Проверка скорости автомобиля")
    void speedCar(){
        testCar.testDrive();
        assertThat(testCar.getSpeed()).isEqualTo(60);
        testCar.park();
    }
    @Test
    @DisplayName("Проверка остановки автомобиля")
    void parkCar(){
        testCar.testDrive();
        testCar.park();
        assertThat(testCar.getSpeed()).isEqualTo(0);
    }
    @Test
    @DisplayName("Проверка колёс мотоцикла")
    void wheelsMotorcycle(){
        assertThat(testMotorcycle.getNumWheels()).isEqualTo(2);
    }
    @Test
    @DisplayName("Проверка скорости мотоцикла")
    void speedMotorcycle(){
        testMotorcycle.testDrive();
        assertThat(testMotorcycle.getSpeed()).isEqualTo(75);
        testMotorcycle.park();
    }
    @Test
    @DisplayName("Проверка остановки мотоцикла")
    void parkMotorcycle(){
        testMotorcycle.testDrive();
        testMotorcycle.park();
        assertThat(testMotorcycle.getSpeed()).isEqualTo(0);
    }
}