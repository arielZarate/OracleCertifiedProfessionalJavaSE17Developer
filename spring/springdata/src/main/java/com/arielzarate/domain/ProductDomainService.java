package com.arielzarate.domain;


import com.arielzarate.domain.model.Product;
import com.arielzarate.domain.ports.in.ProductService;
import com.arielzarate.domain.ports.out.ProductPersistencePort;
import com.arielzarate.error.model.ApplicationError;
import com.arielzarate.error.model.exception.ApplicationErrorException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductDomainService implements ProductService {

    private final ProductPersistencePort productPersistencePort;

    @Override
    public List<Product> getAllProducts() {
        return productPersistencePort.findAllProducts();
    }

    @Override
    public Product getProductById(UUID id) {
        return productPersistencePort.findProductById(id).orElseThrow(() -> new ApplicationErrorException(ApplicationError.notFound("id : " + id.toString())));
    }

    @Override
    public Product createProduct(Product product) {
        return productPersistencePort.saveProduct(product);
    }

    @Override
    public Product updateProduct(UUID id, Product product) {
        Product prod = this.getProductById(id);
        prod.setName(product.getName());
        prod.setDescription(product.getDescription());
        prod.setPrice(product.getPrice());
        prod.setStock(product.getStock());
        return productPersistencePort.updateProduct(prod);

    }

    @Override
    public void deleteProduct(UUID id) {
        Product prod = this.getProductById(id);
        productPersistencePort.deleteProduct(prod.getId());
    }

}
