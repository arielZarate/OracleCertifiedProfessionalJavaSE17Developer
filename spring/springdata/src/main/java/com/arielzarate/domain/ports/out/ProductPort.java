package com.arielzarate.domain.ports.out;

import com.arielzarate.domain.model.Product;

import java.util.List;

public interface ProductPort {

    // Definición de los métodos para la persistencia de productos
    Product saveProduct(Product product);
    Product findProductById(Long productId);
    void deleteProduct(Long productId);
    // Otros métodos relacionados con la persistencia de productos
    List<Product> findAllProducts();
    void updateProduct(Product product);





}
