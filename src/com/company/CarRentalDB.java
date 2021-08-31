package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.Scanner;

import static com.company.carBrands.*;

public class CarRentalDB {
    //This is the full list of cars on system database
    private final ArrayList<Car> cars = new ArrayList<>();

    public CarRentalDB() {
        Car car1 = new Car(HONDA, 1,60, false);
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

    //Remove cars from list
    public void returnCar (Car car) {car.setRented(false);}

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

    public List<Car> getAvailableCars(){
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

    public List<Car> getRentedCars(){
        List<Car> rented = new ArrayList<>();
        for (Car car : cars) {
            if (car.isRented()) {
                rented.add(car);
                }
        }
        return rented;
    }

    public void returnRentedCar(){
        getRentedCars();
//           We are trying to return the rented cars for the switch statement in the main
        System.out.println("\nWould you like to return your car? If so, please type in:" +
                "\n'1'");
        //Throw error if 1 isn't pressed - invalid option


        Scanner scanner = new Scanner(System.in);
        int userInput2 = scanner.nextInt();

        switch (userInput2) {
            case 1:
                for (Car car : getRentedCars()) {
                    System.out.println(car);
                }
                System.out.println("\nEnter car id");
                userInput2 = scanner.nextInt();
                for (Car car : getRentedCars()) {
                    if (car.getCarID() == userInput2) {
                        returnCar(car);
                        System.out.println("\nCar has now been returned successfully \n ");
                    }
                }
                System.out.println("\nThese are the remaining cars:\n ");
                for (Car car : getAvailableCars()) {
                    System.out.println(car.getBrand());
                }
                break;

            default:
                System.out.println("\nThanks for visiting our site!");
                System.exit(0);
        }

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




