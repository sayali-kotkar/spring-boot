package com.practice.spring.boot;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
public class Product {
    @Id
   private int id;
    private String name;

    }

