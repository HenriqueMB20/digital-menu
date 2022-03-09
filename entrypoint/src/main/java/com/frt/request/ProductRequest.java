package com.frt.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ProductRequest {

    private String name;
    private String description;
    private String image;
    private Double price;
    private Double rating;

}
