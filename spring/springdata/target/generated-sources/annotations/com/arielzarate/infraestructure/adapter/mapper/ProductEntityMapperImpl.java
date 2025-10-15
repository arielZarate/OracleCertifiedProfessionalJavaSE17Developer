package com.arielzarate.infraestructure.adapter.mapper;

import com.arielzarate.domain.model.Product;
import com.arielzarate.infraestructure.persistence.model.ProductEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-14T21:32:02-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ProductEntityMapperImpl implements ProductEntityMapper {

    @Override
    public ProductEntity toEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setId( product.getId() );
        productEntity.setProductId( product.getProductId() );
        productEntity.setName( product.getName() );
        productEntity.setDescription( product.getDescription() );
        productEntity.setPrice( product.getPrice() );
        productEntity.setStock( product.getStock() );

        return productEntity;
    }

    @Override
    public Product toDomain(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productEntity.getId() );
        product.setProductId( productEntity.getProductId() );
        product.setName( productEntity.getName() );
        product.setDescription( productEntity.getDescription() );
        product.setPrice( productEntity.getPrice() );
        product.setStock( productEntity.getStock() );

        return product;
    }
}
