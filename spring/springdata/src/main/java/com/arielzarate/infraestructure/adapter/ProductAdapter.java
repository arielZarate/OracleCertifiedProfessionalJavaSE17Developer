package com.arielzarate.infraestructure.adapter;

import com.arielzarate.domain.model.Product;
import com.arielzarate.domain.ports.out.ProductPort;
import com.arielzarate.infraestructure.adapter.mapper.ProductEntityMapper;
import com.arielzarate.infraestructure.persistence.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@AllArgsConstructor
public class ProductAdapter implements ProductPort {

    private final ProductRepository productRepository;
    private final ProductEntityMapper mapper;

    @Override
    public Product saveProduct(Product product) {
        var productEntity = mapper.toEntity(product);
        var savedEntity = productRepository.save(productEntity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public Product findProductById(Long productId) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());

    }

    @Override
    public void updateProduct(Product product) {

    }
}
