package com.example.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.springbatch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}

}
