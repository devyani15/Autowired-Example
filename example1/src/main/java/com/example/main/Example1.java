package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.VehicleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        //Vehicle veh = context.getBean(Vehicle.class);
        Person per= context.getBean(Person.class);
        System.out.println("Person name is : "+per.getName());
        System.out.println("Person vehicle is :"+ per.getVehicle());

//        Vehicle veh2 = context.getBean("AudiBean", Vehicle.class);
//        System.out.println(veh2.getModel());
//
//        String str = context.getBean(String.class);
//        System.out.println(str);
    }
}
