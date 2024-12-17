package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



//    @PostConstruct
//    public void initialize(){
//        this.model="Audi";
//    }

//    @PreDestroy
//    public void preDestroy(){
//        System.out.println("destroyed");
//    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}
