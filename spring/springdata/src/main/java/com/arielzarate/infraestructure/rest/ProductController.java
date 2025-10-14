package com.arielzarate.infraestructure.rest;


import com.arielzarate.domain.model.Product;
import com.arielzarate.domain.ports.in.ProductService;
import com.arielzarate.infraestructure.rest.dto.ProductRequest;
import com.arielzarate.infraestructure.rest.dto.ProductResponse;
import com.arielzarate.infraestructure.rest.mapper.ProductMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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


    @Operation(
            summary = "Get all products",
            description = "Retrieve a list of all products",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully retrieved list of products"
                    )
            }
    )
    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> productList = productMapper.mapToDTOList(productService.getAllProducts());
        log.info("Response GET - /api/products {}", productList);
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }


    @Operation(
            summary = "Create a new product",
            description = "Create a new product with the provided details",
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "Product created successfully"
                    )
            }
    )
    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        log.info("Request POST api/products - Creating a new product with body: {}", productRequest);
        Product product = productService.createProduct(productMapper.mapToDomain(productRequest));
        ProductResponse productResponse = productMapper.mapToDTO(product);
        log.info("Response POST api/products - Created product : {}", productResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponse);
    }


}
