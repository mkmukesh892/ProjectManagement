package com.rwp.pma.springExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {
    @Bean
    public Car buildCar(){
        Car car = new Car(new Engine(),new Door(),new Tyre());
        return car;
    }
}
