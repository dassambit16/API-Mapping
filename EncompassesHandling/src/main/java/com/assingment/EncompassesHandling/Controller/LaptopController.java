package com.assingment.EncompassesHandling.Controller;

import com.assingment.EncompassesHandling.Model.Laptop;
import com.assingment.EncompassesHandling.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("laptops")
    public String addLaptops(@RequestBody Laptop laptops) {
        return laptopService.addLaptops(laptops);
    }

    @GetMapping("laptop/{id}")
    public Laptop getALaptop(@PathVariable Integer id) {
        return laptopService.getALaptop(id);
    }
    @GetMapping("laptops")
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }
}
