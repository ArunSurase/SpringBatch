package com.example.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbatch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
