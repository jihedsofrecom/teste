package com.in28minutes.springboot.microservice.example.currencyconversion;

import org.springframework.boot.json.JsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InstoreCustomerRepo  extends JpaRepository<Customer, Long > {
Customer findById(long id);
}
