package com.assingment.EncompassesHandling.Controller;

import com.assingment.EncompassesHandling.Model.Address;
import com.assingment.EncompassesHandling.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public String addAddresses(@RequestBody Address newAddress) {
        return addressService.addAddresses(newAddress);
    }

    @GetMapping("Address/{addressId}")
    public Optional<Address> getAddress(@PathVariable Long addressId) {
        return addressService.getAddress(addressId);
    }

    @GetMapping("Addresses")
    public List<Address> getAddresses() {
        return addressService.getAddresses();
    }
}
