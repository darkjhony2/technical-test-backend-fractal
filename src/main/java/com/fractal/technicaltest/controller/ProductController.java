package com.fractal.technicaltest.controller;

import com.fractal.technicaltest.models.Product;
import com.fractal.technicaltest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/orders")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> fetchAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteOrder(@RequestParam Long id){
        return productService.deleteById(id);
    }

    @PutMapping
    public ResponseEntity<?> editOrder(@RequestBody Product product){
        return productService.editProduct(product);
    }

}
