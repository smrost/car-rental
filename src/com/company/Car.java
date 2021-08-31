package com.company;

public class Car {
    private carBrands brand;
    private int carID;
    private double rentPrice;
    private boolean rented;

    public Car(carBrands brand, int carID, double rentPrice, boolean rented) {
        this.brand = brand;
        this.carID = carID;
        this.rentPrice = rentPrice;
        this.rented = rented;
    }


    public carBrands getBrand() {
        return brand;
    }

    public void setCarBrands(carBrands brand) {
        this.brand = brand;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean isRented() {
        return rented;
    }

    public boolean setRented(boolean rented) {
        this.rented = rented;
        return rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", carID=" + carID +
                ", rentPrice=" + rentPrice +
                ", rented=" + rented +
                '}';
    }
}
