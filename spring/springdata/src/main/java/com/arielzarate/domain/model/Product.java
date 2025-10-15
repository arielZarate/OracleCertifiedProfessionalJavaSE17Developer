package com.arielzarate.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private UUID id;
    private Long productId;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
}
