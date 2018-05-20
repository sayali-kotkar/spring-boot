package com.practice.spring.boot.repository;

import com.practice.spring.boot.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
