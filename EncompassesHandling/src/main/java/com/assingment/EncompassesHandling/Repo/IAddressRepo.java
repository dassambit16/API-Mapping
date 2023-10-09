package com.assingment.EncompassesHandling.Repo;

import com.assingment.EncompassesHandling.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {
}
