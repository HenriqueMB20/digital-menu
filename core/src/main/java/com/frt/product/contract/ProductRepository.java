package com.frt.product.contract;

import com.frt.product.entity.Product;

public interface ProductRepository {
    void save(Product product);
}
