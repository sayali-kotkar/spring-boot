package com.practice.spring.boot.service;

import com.practice.spring.boot.Product;
import com.practice.spring.boot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product findById(int id){
        return productRepository.findById(id).get();
    }

    public void save(Product product) {
        productRepository.save(product);
    }
}
