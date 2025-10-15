package com.arielzarate.application;


import com.arielzarate.domain.model.Product;
import com.arielzarate.domain.ports.in.ProductService;
import com.arielzarate.domain.ports.out.ProductPort;
import com.arielzarate.error.model.ApplicationError;
import com.arielzarate.error.model.exception.ApplicationErrorException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductUseCase implements ProductService {


    private final ProductPort productPort;

    @Override
    public List<Product> getAllProducts() {
        return productPort.findAllProducts();
    }

    @Override
    public Product getProductById(UUID id) {
        return productPort.findProductById(id).orElseThrow(() -> new ApplicationErrorException(ApplicationError.notFound("id : " + id.toString())));
    }

    @Override
    public Product createProduct(Product product) {
        return productPort.saveProduct(product);
    }

    @Override
    public Product updateProduct(UUID id, Product product) {
        Product prod = this.getProductById(id);
        return productPort.updateProduct(prod);

    }

    @Override
    public void deleteProduct(UUID id) {
        Product prod = this.getProductById(id);
        productPort.deleteProduct(prod.getId());
    }
}


/**
 * Seimpre validar que los métodos de la capa de aplicación (use case) no tengan lógica de negocio.
 * la logica de negocio debe estar en la capa de dominio (servicios de dominio o entidades).
 * si deseo agregar validaciones, debo crear un servicio de dominio que se encargue de esa lógica.
 */