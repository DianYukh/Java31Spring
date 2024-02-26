package org.example;

import java.util.List;

public class MersedesCar implements Car {

    private Integer idCar;
    private  String vendor;
    private String model;
    private String color;

    private List<String>complectation;

    public MersedesCar() {
    }

    public MersedesCar(Integer idCar, String vendor, String model, String color, List<String> complectation) {
        this.idCar = idCar;
        this.vendor = vendor;
        this.model = model;
        this.color = color;
        this.complectation = complectation;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getComplectation() {
        return complectation;
    }

    public void setComplectation(List<String> complectation) {
        this.complectation = complectation;
    }

    @Override
    public String carInfo() {
        return this.vendor + " " + this.model + " " + this.color + complectation;
    }
}
