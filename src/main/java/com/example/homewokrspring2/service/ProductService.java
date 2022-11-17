package com.example.homewokrspring2.service;

import com.example.homewokrspring2.model.Product;
import com.example.homewokrspring2.record.ProductRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {


    private List<Product> basket=new ArrayList<>();

    public Collection<Product> getAllProduct () {
        return this.basket;
    }

    public Product addProduct(ProductRequest productRequest) {
        Product product = new Product(productRequest.getId());
        this.basket.add(product);
        return product;
    }
}
