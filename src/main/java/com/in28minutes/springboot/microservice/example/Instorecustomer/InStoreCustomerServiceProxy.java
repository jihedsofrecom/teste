package com.in28minutes.springboot.microservice.example.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="store-service")
@RibbonClient(name="store-service")
public interface InStoreCustomerServiceProxy {
  @GetMapping("/store/{name}")
  public Customer getstorebyname
    (@PathVariable("name") String name);
}