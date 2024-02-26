package org.example;

import java.util.Map;

public class NissanCar implements Car {
    private Integer idNissan;
    private String country;
    private String name;
    private  String weight;

    Map<String,Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public NissanCar() {
    }

    public NissanCar(Integer idNissan, String country, String name, String weight) {
        this.idNissan = idNissan;
        this.country = country;
        this.name = name;
        this.weight = weight;
    }

    public Integer getIdNissan() {
        return idNissan;
    }

    public void setIdNissan(Integer idNissan) {
        this.idNissan = idNissan;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String carInfo() {
        return this.country + " " +  this.name + " " + this.weight;
    }
}
