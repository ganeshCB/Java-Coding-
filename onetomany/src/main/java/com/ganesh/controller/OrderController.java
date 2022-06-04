package com.ganesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.dto.OrderRequest;
import com.ganesh.dto.OrderResponse;
import com.ganesh.entity.Customer;
import com.ganesh.entity.repository.CustomerRepository;
import com.ganesh.entity.repository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ProductRepository productRepository;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());
	}

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return customerRepository.findAll();
	}
	
	@GetMapping("/orderInfo")
	public List<OrderResponse> getJoinInformation() {
		return customerRepository.getJoinFormation();
	}
}
