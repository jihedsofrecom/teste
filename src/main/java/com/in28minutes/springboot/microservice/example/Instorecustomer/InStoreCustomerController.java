package com.in28minutes.springboot.microservice.example.currencyconversion;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class InStoreCustomerController {

	

	@Autowired
	private InStoreCustomerServiceProxy proxy;

	@Autowired InstoreCustomerRepo repos;
	
	
	
	@GetMapping("/customer/{id}")
	  public Customer retrieveExchangeValue
	    (@PathVariable long id){
	    
		Customer customerValue = 
				repos.findById(id);
	    
	    
	    
	    return customerValue;
	  }
	@GetMapping("/teste/{storename}")
	public Customer convertCurrency(@PathVariable String storename) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("name", storename);
		

		ResponseEntity<Customer> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/store/{name}", Customer.class,
				uriVariables);

		Customer response = responseEntity.getBody();

		return new Customer(response.getId(), response.getName(),response.isSkillenabled()
				,response.isPriorityenabled(), response.getAdvcode(),response.getTimezone(),response.getCodecdr()
				,response.getDateofdisabled(), response.getPort());
	}

	@GetMapping("/teste2/{storename}")
	public Customer convertCurrencyFeign(@PathVariable String storename ) {

		Customer response = proxy.getstorebyname(storename);

		

		return new Customer(response.getId(), response.getName(),response.isSkillenabled()
				,response.isPriorityenabled(), response.getAdvcode(),response.getTimezone(),response.getCodecdr()
				,response.getDateofdisabled(), response.getPort());
	}

}