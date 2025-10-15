package com.arielzarate.domain.ports.in;

import com.arielzarate.domain.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    // Definición de los métodos del servicio de productos
    List<Product> getAllProducts();

    Product getProductById(UUID id);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long productId);


}
