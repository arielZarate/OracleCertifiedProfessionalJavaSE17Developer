package com.arielzarate.application;


import com.arielzarate.domain.ProductDomainService;
import com.arielzarate.domain.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductUseCase {
    private final ProductDomainService productDomainService;

    public List<Product> getAllProducts() {
        return productDomainService.getAllProducts();
    }

    public Product getProductById(UUID id) {
        return productDomainService.getProductById(id);
    }

    public Product createProduct(Product product) {
        return productDomainService.createProduct(product);
    }

    public Product updateProduct(UUID id, Product product) {
        return productDomainService.updateProduct(id, product);
    }

    public void deleteProduct(UUID id) {
        productDomainService.deleteProduct(id);
    }

}


/**
 * Seimpre validar que los métodos de la capa de aplicación (use case) no tengan lógica de negocio.
 * la logica de negocio debe estar en la capa de dominio (servicios de dominio o entidades).
 * si deseo agregar validaciones, debo crear un servicio de dominio que se encargue de esa lógica.
 */