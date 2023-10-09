package com.assingment.EncompassesHandling.Service;

import com.assingment.EncompassesHandling.Model.Laptop;
import com.assingment.EncompassesHandling.Repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptops(Laptop laptops) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptops);
        laptopRepo.saveAll(laptopList);
        return laptopList.size() + " laptop/s are added!!";
    }

    public Laptop getALaptop(Integer id) {
        return laptopRepo.findById(id).orElse(null);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }
}
