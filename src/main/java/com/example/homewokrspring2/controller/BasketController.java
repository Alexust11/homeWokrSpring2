package com.example.homewokrspring2.controller;

import com.example.homewokrspring2.model.Product;
import com.example.homewokrspring2.record.ProductRequest;
import com.example.homewokrspring2.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BasketController {

    private final ProductService productService;

    public BasketController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/store/order/get")
    public Collection<Product> getAllProduct() {
        return this.productService.getAllProduct();
    }

    @PostMapping("/store/order/add")
    public Product creatProduct(@RequestBody ProductRequest productRequest) {
        return this.productService.addProduct(productRequest);
    }
}
