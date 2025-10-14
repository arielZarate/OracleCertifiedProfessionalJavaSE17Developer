package com.arielzarate.infraestructure.rest.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ProductRequest {
    private Long productId;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
}
