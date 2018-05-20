package com.practice.spring.boot.controller;

import com.practice.spring.boot.Product;
import com.practice.spring.boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

   @RequestMapping("/{productId}")
    public Product getProduct(@PathVariable int productId) {
       Product product = new Product(1,"chocolate");
       Product product1 = new Product(2,"icecream");
       productService.save(product);
       productService.save(product1);
       Product product2 = productService.findById(productId);
       product2.setName("changed name");
       return productService.findById(productId);

   }
}
