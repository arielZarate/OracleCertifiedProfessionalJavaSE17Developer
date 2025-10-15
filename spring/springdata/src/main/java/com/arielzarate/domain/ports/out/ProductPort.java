package com.arielzarate.domain.ports.out;

import com.arielzarate.domain.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductPort {

    // Definición de los métodos para la persistencia de productos
    Product saveProduct(Product product);

    Optional<Product> findProductById(UUID id);

    void deleteProduct(UUID id);

    // Otros métodos relacionados con la persistencia de productos
    List<Product> findAllProducts();

    Product updateProduct(Product product);


}
