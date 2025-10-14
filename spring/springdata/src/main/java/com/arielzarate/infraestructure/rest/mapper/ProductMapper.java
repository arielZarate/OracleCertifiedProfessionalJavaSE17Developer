package com.arielzarate.infraestructure.rest.mapper;


import com.arielzarate.domain.model.Product;
import com.arielzarate.infraestructure.rest.dto.ProductDTO;
import com.arielzarate.infraestructure.rest.dto.ProductRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO mapToDTO(Product product);

    List<ProductDTO> mapToDTOList(List<Product> products);

    Product mapToDomain(ProductRequest productRequest);

}
