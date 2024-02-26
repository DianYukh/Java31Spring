package org.example;

public class CarFabric {
    private Car car;

    public CarFabric(){

    }

    public CarFabric(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
