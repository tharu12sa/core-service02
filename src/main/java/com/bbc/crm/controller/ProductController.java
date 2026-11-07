package com.bbc.crm.controller;

import com.bbc.crm.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @PostMapping("/product/create")
    void createProduct(@RequestBody Product product){
        System.out.println(product);
    }

    @GetMapping("/product/all")
    List<Product> getProduct(){
        return null;
    }
}
