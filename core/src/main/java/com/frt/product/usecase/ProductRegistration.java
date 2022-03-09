package com.frt.product.usecase;

import com.frt.product.contract.ProductRegistrationBorder;
import com.frt.product.contract.ProductRepository;
import com.frt.product.entity.Product;


public class ProductRegistration implements ProductRegistrationBorder {

    ProductRepository productRepository;

    public ProductRegistration(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void save(Product product){
        productRepository.save(product);
    }
}
