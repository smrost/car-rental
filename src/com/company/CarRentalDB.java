package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static com.company.carBrands.*;

public class CarRentalDB {
    //This is the full list of cars on system database
    private final ArrayList<Car> cars = new ArrayList<>();

    public CarRentalDB() {
        Car car1 = new Car(HONDA, 1, 60, false);
        Car car2 = new Car(TOYOTA, 2, 70, false);
        Car car3 = new Car(MERCEDES, 3, 150, false);
        Car car4 = new Car(RANGEROVER, 4, 350, false);
        Car car5 = new Car(FIAT, 5, 50, false);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    // Add cars to list
    public void rent(Car car) {
        car.setRented(true);
    }

    // Shows the number of cars available
    public int getNumberOfAvailableCars(){
        int counter = 0;
        for (Car car : cars) {
            if (!car.isRented()) {
                counter++;
            }
        }
        return counter;
    }

    public List<Car> getOfAvailableCars(){
        List<Car> available = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isRented()) {
                available.add(car);
            }
        }
        return available;
    }

    // Shows the number of cars available
    public int getNumberOfRentedCars(){
        int counter = 0;
        for (Car car : cars) {
            if (car.isRented()) {
                counter++;
            }
        }
        return counter;
    }

    //List of cars both in the rented and available
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "CarRentalDB{" +
                "cars=" + cars +
                '}';
    }
}




