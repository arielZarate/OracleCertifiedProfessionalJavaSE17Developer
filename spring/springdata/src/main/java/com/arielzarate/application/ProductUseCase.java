package com.arielzarate.application;


import com.arielzarate.domain.model.Product;
import com.arielzarate.domain.ports.in.ProductService;
import com.arielzarate.domain.ports.out.ProductPort;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductUseCase implements ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductUseCase.class);
    private final ProductPort productPort;

    @Override
    public List<Product> getAllProducts() {
        return productPort.findAllProducts();
    }

    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        log.info("Creating product: {}", product);
        return productPort.saveProduct(product);
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }
}
