package com.frt.repository.entity;

import com.frt.product.entity.Product;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String image;
    private Double price;
    private Double rating;

    public ProductEntity() {
    }


    public ProductEntity(String name, String description, String image, Double price, Double rating) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.rating = rating;
    }

    public static ProductEntity parse(Product product) {
        return new ProductEntity(product.getName(), product.getDescription(), product.getImage(), product.getPrice(), product.getRating());
    }
}
