package com.arielzarate.domain.ports.in;

import com.arielzarate.domain.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);


}
