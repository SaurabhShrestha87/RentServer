package com.ftechiz.rentserver.repository;


import com.ftechiz.rentserver.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

