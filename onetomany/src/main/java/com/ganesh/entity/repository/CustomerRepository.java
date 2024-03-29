package com.ganesh.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ganesh.dto.OrderResponse;
import com.ganesh.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("SELECT new com.ganesh.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinFormation();
}
