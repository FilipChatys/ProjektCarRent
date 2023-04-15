package pl.car.it.rent.model;

import Pojazdy.Vehicle;

public class Car extends Vehicle {

    public Car(String brand, String model, int year,
               double price, String plate) {
        super(brand, model, year, price, plate);
    }

    public Car() {
    }
}
