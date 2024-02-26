package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
    //==== 1 variant====

//        Car mersedes = new MersedesCar(1,"mersedes-bens","SL300", "black",
//                new ArrayList<>(List.of("climat-control", "front-camera", "skin-saloon")));
//        Car nissan = new NissanCar(1, "Japan", "Nissan gtr", "1500");
//        CarFabric fabricMers = new CarFabric();
//        fabricMers.setCar(nissan);
//        System.out.println(fabricMers.getCar().carInfo());


    // ==== 2 variant ====

//        CarMenuInit.carInit(); // mersedes
//        CarFabric fabric = CarMenuInit.carFabricInit();
//        System.out.println(fabric.getCar().carInfo());

    // ==== 3 variant SPRING ====

        ApplicationContext context = new ClassPathXmlApplicationContext("car-context.xml");
       CarFabric carFabric =  context.getBean("carFabric", CarFabric.class);
        System.out.println(carFabric.getCar().carInfo());
        





    }
}
