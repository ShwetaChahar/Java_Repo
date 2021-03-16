package com.org.prj.mod.myservice.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.prj.mod.myservice.entity.Customer;
import com.org.prj.mod.myservice.repository.CustomerRepo;
import com.sun.istack.NotNull;

@RestController

@RequestMapping("api/customer")
public class Customercontroller {
	@Autowired
	CustomerRepo repo;

	@GetMapping("/{cust_id}")
	public Customer fetchbyCustId(@PathVariable long cust_id) {
		Customer c = repo.findById(cust_id).orElse(null);
		System.out.println(c);
		// convert c.tranx string to list
		dosum(c);
		return c;
	}
//Method dosum>>> I coded to find the sum of transactions.
	private int dosum(Customer c) {
		List<String> ls = Arrays.asList(c.getCust_trans().split(","));
		int sum = 0;
		for (String s : ls) {
			sum = sum+ Integer.parseInt(s);
		}
		c.setCust_sum(sum);
		return sum;
	}

	@GetMapping("/all")
	public List<Customer> fetchCustAll() {

		List<Customer> ls = repo.findAll();
		ls.stream()
		.forEach(c->dosum(c));
		return ls;
	}

	@PostMapping("/insert")
		public Customer insertCust(Customer c) {
		dosum(c);
		repo.save(c);
		System.out.println(c);
		return c;
	}
	
	@DeleteMapping("/delete/{cust_id}")
	public String deleteCust(@PathVariable long cust_id) {
		Customer c = repo.getOne(cust_id);
		repo.delete(c);
		return "Customer row deleted";
	}
	
	@PutMapping("/put")
	public Customer putCust(Customer c) {
	dosum(c);
	repo.save(c);
	
	System.out.println(c);
	
	return c;
}
	

}
