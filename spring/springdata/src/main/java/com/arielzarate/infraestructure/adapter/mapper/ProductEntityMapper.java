package com.arielzarate.infraestructure.adapter.mapper;


import com.arielzarate.domain.model.Product;
import com.arielzarate.infraestructure.persistence.model.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

    public ProductEntity toEntity(Product product);
    public Product toDomain(ProductEntity productEntity);


}
