package com.be.service;


import com.be.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    void save(Product product);
    void delete(int id);
    List<Product> getAll();
    Optional<Product> findOne(int id);

}
