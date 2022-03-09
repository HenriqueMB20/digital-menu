package com.frt.request.parser;

import com.frt.product.entity.Product;
import com.frt.request.ProductRequest;
import org.springframework.stereotype.Component;

@Component
public class ProductRequestParser {

    public Product toProduct(ProductRequest request){
        return Product.from(request.getName(), request.getDescription(), request.getImage(), request.getPrice(), request.getRating());
    }

}
