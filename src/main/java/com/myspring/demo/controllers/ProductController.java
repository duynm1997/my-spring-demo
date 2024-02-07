package com.myspring.demo.controllers;

import com.myspring.demo.model.ProductModel;
import com.myspring.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping("")
    public List<ProductModel> getAllProducts() {
        return repository.findAll();
    }
    @PostMapping("add")
    public void addProduct(@RequestBody ProductModel model){
        repository.save(model);
    }
}
