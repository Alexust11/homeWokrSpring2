package com.example.homewokrspring2.model;

public class Product {
    private final long id;


    public Product(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Продукт{" +
                "id=" + id +
                '}';
    }
}
