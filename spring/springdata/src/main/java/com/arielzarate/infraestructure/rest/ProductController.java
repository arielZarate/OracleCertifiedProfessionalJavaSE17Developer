package com.arielzarate.infraestructure.rest;


import com.arielzarate.domain.model.Product;
import com.arielzarate.domain.ports.in.ProductService;
import com.arielzarate.infraestructure.rest.dto.ProductDTO;
import com.arielzarate.infraestructure.rest.dto.ProductRequest;
import com.arielzarate.infraestructure.rest.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        log.info("GET /products - Fetching all products");
        List<ProductDTO> productList = productMapper.mapToDTOList(productService.getAllProducts());

        log.info("Response GET /products");
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductRequest productRequest) {
        log.info("POST /products - Creating a new product with body: {}", productRequest);
        Product product = productService.createProduct(productMapper.mapToDomain(productRequest));
        log.info("Response POST /products - Created product with ID: {}", product.getProductId()); //tambien puedo loguear el product mapeado a DTO
        return ResponseEntity.status(HttpStatus.CREATED).body(productMapper.mapToDTO(product));
    }


}
