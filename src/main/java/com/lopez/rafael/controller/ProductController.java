package com.lopez.rafael.controller;

import com.lopez.rafael.model.Product;
import com.lopez.rafael.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.findAllProducts();
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}
