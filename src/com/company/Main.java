package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.carBrands.*;

public class Main {

    public static void main(String[] args) {


        CarRentalDB db = new CarRentalDB();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Car Rental Company! Please type in:" +
                "\n'1' If you would like to view the cars in store" +
                "\n'2' If you would like to rent a car" +
                "\nOr" +
                "\n'3' If you would like to leave the terminal");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("We have received new models this week! They are:");
                //for loop that goes through arraylist and retrieves each carBrand

                for (Car car : db.getCars()) {
                    System.out.println(car.getBrand());
                }
                break;

            case 2:
                for (Car car : db.getAvailableCars()) {
                    System.out.println(car);
                }
                System.out.println("Enter car id");
                userInput = scanner.nextInt();
                for (Car car : db.getAvailableCars()) {
                    if (car.getCarID() == userInput) {
                        db.rent(car);
                        System.out.println("Car is now rented\n ");
//                        db.returnRentedCar();
                        break;
                    }

                }
                System.out.println("These are the remaining cars:\n ");
                for (Car car : db.getAvailableCars()) {
                    System.out.println(car.getBrand());
                }
                db.returnRentedCar();
                    break;
//                }

            case 3:
                System.out.println("Thanks for visiting our site!");
                System.exit(0);
            default:
                System.out.println("Option not available");

        }


//               System.out.println("\n This is the car you rented:\n ");
//                for (Car car : db.getRentedCars()) {
//                    System.out.println(car.getBrand());

//        System.out.println(database.getCars());
//        System.out.println(database.car1.getRentPrice());
//        database.rent();


        }
    }


