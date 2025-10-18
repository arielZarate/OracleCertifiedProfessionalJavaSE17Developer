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
public class ProductDomainService   {

    private final ProductPersistencePort productPersistencePort;


    public List<Product> getAll() {
        return productPersistencePort.findAllProducts();
    }

    public Product getById(Long id) {
        return productPersistencePort.findProductById(id).orElseThrow(() -> new ApplicationErrorException(ApplicationError.notFound("id : " + id)));
    }


    public Product create(Product product) {
        return productPersistencePort.saveProduct(product);
    }

    public Product update(Long id, Product product) {
        Product prod = this.getById(id);
        prod.setName(product.getName());
        prod.setDescription(product.getDescription());
        prod.setPrice(product.getPrice());
        prod.setStock(product.getStock());
        return productPersistencePort.updateProduct(prod);

    }


    public void remove(Long id) {
        Product prod = this.getById(id);
        productPersistencePort.deleteProduct(prod.getId());
    }

}
