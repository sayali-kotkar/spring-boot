package com.practice.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

   @RequestMapping("/")
    public Product getProduct() {

       Product product = new Product(1,"chocolate");
       return product;
   }
}
