package com.arielzarate.domain.ports.in;

import com.arielzarate.domain.model.Product;

import java.util.List;

public interface ProductService {

    // Definición de los métodos del servicio de productos
    List<Product> getAllProducts();

    Product getProductById(Long productId);

    Product createProduct(Product product);

    Product updateProduct(Long productId, Product product);

    void deleteProduct(Long productId);


}
