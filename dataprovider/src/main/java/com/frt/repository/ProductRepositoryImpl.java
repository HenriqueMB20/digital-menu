package com.frt.repository;

import com.frt.product.contract.ProductRepository;
import com.frt.product.entity.Product;
import com.frt.repository.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    ProductDao productDao;

    @Override
    public void save(Product product) {
        productDao.save(ProductEntity.parse(product));
    }

}
