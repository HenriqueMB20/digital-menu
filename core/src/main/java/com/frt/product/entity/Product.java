package com.frt.product.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {

    private Long id;
    private String name;
    private String description;
    private String image;
    private Double price;
    private Double rating;

    public Product() {
    }

    public static Product from(String name, String description, String image, Double price, Double rating) {
        Product product = new Product();
        product.name = name;
        product.description = description;
        product.image = image == null ? "default":image;
        product.price = price;
        product.rating = rating;
        return product;
    }

}
