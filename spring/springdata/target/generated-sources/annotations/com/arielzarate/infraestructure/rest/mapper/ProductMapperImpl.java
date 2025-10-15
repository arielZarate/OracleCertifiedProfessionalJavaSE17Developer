package com.arielzarate.infraestructure.rest.mapper;

import com.arielzarate.domain.model.Product;
import com.arielzarate.infraestructure.rest.dto.ProductRequest;
import com.arielzarate.infraestructure.rest.dto.ProductResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-14T21:32:02-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponse mapToDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        if ( product.getId() != null ) {
            productResponse.setId( product.getId().toString() );
        }
        productResponse.setProductId( product.getProductId() );
        productResponse.setName( product.getName() );
        productResponse.setDescription( product.getDescription() );
        productResponse.setPrice( product.getPrice() );
        productResponse.setStock( product.getStock() );

        return productResponse;
    }

    @Override
    public List<ProductResponse> mapToDTOList(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductResponse> list = new ArrayList<ProductResponse>( products.size() );
        for ( Product product : products ) {
            list.add( mapToDTO( product ) );
        }

        return list;
    }

    @Override
    public Product mapToDomain(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productRequest.getProductId() );
        product.setName( productRequest.getName() );
        product.setDescription( productRequest.getDescription() );
        product.setPrice( productRequest.getPrice() );
        product.setStock( productRequest.getStock() );

        return product;
    }
}
