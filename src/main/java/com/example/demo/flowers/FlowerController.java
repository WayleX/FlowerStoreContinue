package com.example.demo.flowers;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.flowers.Flower;
//import com.example.demo.flowers.FlowerColor;
//import com.example.demo.flowers.FlowerType;
//import com.example.demo.flowers.deliverstrategy.DHLDeliveryStrategy;

@RestController
@RequestMapping("api/flower/")
public class FlowerController {
    @GetMapping("/list/")
    public List<Flower> hello() {
        return List.of(new Flower(10, FlowerColor.BLUE, 30, FlowerType.CHAMOMILE));
    }

    @GetMapping("/payment/")
    public String payment() {
        return "Choose method";
    }

    @GetMapping("/payment/success/")
    public String pay_success() {
        return "Order confirmed";
    }

    @GetMapping("/payment/failed/")
    public String pay_failed() {
        return "Order declined";
    }

    @GetMapping("/deliver/")
    public String deliver() {
        return "Choose method of delivery";
    }

    @GetMapping("/deliver/success/")
    public String deliver_success() {
        return "Deliver confirmed";
    }

    @GetMapping("/deliver/failed/")
    public String deliver_failed() {
        return "Deliver declined";
    }
}
