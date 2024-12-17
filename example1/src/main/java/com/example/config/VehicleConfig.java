package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class VehicleConfig {

    @Primary
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setModel("Range Rover");
        return veh;
    }

//    @Bean
//    public Person person(Vehicle vehicle){
//        Person per = new Person();
//        per.setName("Devyani");
//        per.setVehicle(vehicle);
//
//        return per;
//    }
//    @Primary
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setModel("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setModel("Tata");
        return veh;
    }
//    @Bean
//    String hello(){
//        return "Devyani";
//    }
}
