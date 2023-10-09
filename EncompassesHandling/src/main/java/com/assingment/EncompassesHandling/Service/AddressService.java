package com.assingment.EncompassesHandling.Service;

import com.assingment.EncompassesHandling.Model.Address;
import com.assingment.EncompassesHandling.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;


    public String addAddresses(Address newAddress) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(newAddress);
        addressRepo.saveAll(addresses);
        return addresses.size() +" are addresses added!!";
    }

    public Optional<Address> getAddress(Long addressId) {
        return addressRepo.findById(addressId);
    }

    public List<Address> getAddresses() {
        return addressRepo.findAll();
    }
}
