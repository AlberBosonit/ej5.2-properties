package com.example.ej5.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Properties {

    @Value("${greeting}")
    private String greeting;
    @Value("${my.number}")
    private int myNumber;

    @Value("${new.property}")
    private String newProperty;

    public String getGreeting() {
        return greeting;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public String getNewProperty() {
        return newProperty;
    }
}
