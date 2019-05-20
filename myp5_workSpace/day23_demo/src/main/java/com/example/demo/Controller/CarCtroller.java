package com.example.demo.Controller;

import com.example.demo.domain.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarCtroller {

    @RequestMapping("/findOne")
    public Car findOneCar(){
        Car car = new Car(1, "sdf", 23434.77F);
        return car;
    }



public Car getCarById(@RequestParam(name="id") Integer id,@RequestParam(name="name") String name) {
    Car car = new Car();
    car.setId(id);
    car.setName(name);
    car.setPrice(198999.99F);
    return car;


}
}
